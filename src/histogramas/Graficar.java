package histogramas;

import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.IntervalCategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class Graficar extends JFrame{

    public Graficar(String Intervalos [], int Frecuencias []) {
        
        // Propiedades necesarias para la grafica
        CategoryDataset dataset = createDataset(Intervalos, Frecuencias);
      
        JFreeChart chart = ChartFactory.createBarChart("Poligono de Frecuencias", 
                "INTERVALOS", 
                "FRECUENCIA", 
                dataset,
                PlotOrientation.VERTICAL,
                true, true, false
        );
        
        ChartPanel panel = new ChartPanel(chart);
        setContentPane(panel);
    }

    // Datos a mostrar en la grafica
    private CategoryDataset createDataset(String Intervalos [], int Frecuencias []) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        for(int i = 0; i<Intervalos.length; i++){
            dataset.addValue( Frecuencias[i], "1", Intervalos[i]);
        }    
        return dataset;
    } 
}

package kata3;

import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame {

    public HistogramDisplay() {
        super("HISTOGRAMA");
        this.setContentPane(createPanel());
        pack();
    }
    
    public void execute() {
        this.setVisible(true);
    }

    private JPanel createPanel() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500, 400));
        return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataset) {
        JFreeChart chart = ChartFactory.createBarChart("Histograma",
                                          "Dominios Email", 
                                          "Nº Emails", 
                                          dataset,
                                          PlotOrientation.VERTICAL, 
                                          false, 
                                          false,
                                          rootPaneCheckingEnabled);
        return chart;
    }
    
    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(5, "", "ulpgc.es");
        dataset.addValue(7, "", "dis.ulpgc.es");
        dataset.addValue(1, "", "gmail.com");
        dataset.addValue(3, "", "eii.ulpgc.es");
        dataset.addValue(9, "", "yahoo.es");
        dataset.addValue(2, "", "hotmail.es");
        return dataset;
    }
}

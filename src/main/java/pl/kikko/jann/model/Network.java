package pl.kikko.jann.model;

public class Network {

	private Layer inputLayer;
	private Layer outputLayer;

	private Layer[] hiddLayers;

	public Layer getInputLayer() {
		return inputLayer;
	}

	public void setInputLayer(Layer inputLayer) {
		this.inputLayer = inputLayer;
	}

	public Layer getOutputLayer() {
		return outputLayer;
	}

	public void setOutputLayer(Layer outputLayer) {
		this.outputLayer = outputLayer;
	}

	public Layer[] getHiddLayers() {
		return hiddLayers;
	}

	public void setHiddLayers(Layer[] hiddLayers) {
		this.hiddLayers = hiddLayers;
	}

}

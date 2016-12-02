package org.cern.charts.dataviewer.api.trace;

import org.cern.charts.dataviewer.utils.TraceType;
import org.cern.charts.dataviewer.utils.TraceVisibility;

public class HistogramTrace <T> extends GenericTrace<T> {

	public HistogramTrace() {
		setTraceName("Histogram");
		setTraceType(TraceType.HISTOGRAM);
		setTraceVisibility(TraceVisibility.TRUE);
	}

	public HistogramTrace(String traceName) {
		setTraceName(traceName);
		setTraceType(TraceType.HISTOGRAM);
		setTraceVisibility(TraceVisibility.TRUE);
	}

	@Override
	public void setConfiguration(TraceConfiguration config) {
		this.traceConfig = config;
		this.traceConfig.setTraceType(TraceType.HISTOGRAM);
	}

}

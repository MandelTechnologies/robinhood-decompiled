package io.bitdrift.capture.reports;

import io.bitdrift.capture.providers.FieldProvider4;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: IFatalIssueReporter.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lio/bitdrift/capture/reports/IFatalIssueReporter;", "", "Lio/bitdrift/capture/reports/FatalIssueMechanism;", "getReportingMechanism", "()Lio/bitdrift/capture/reports/FatalIssueMechanism;", "", "", "Lio/bitdrift/capture/providers/FieldValue;", "getLogStatusFieldsMap", "()Ljava/util/Map;", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public interface IFatalIssueReporter {
    Map<String, FieldProvider4> getLogStatusFieldsMap();

    FatalIssueMechanism getReportingMechanism();
}

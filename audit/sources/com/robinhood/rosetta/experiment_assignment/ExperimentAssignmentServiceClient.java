package com.robinhood.rosetta.experiment_assignment;

import com.squareup.wire.GrpcCall;
import com.squareup.wire.Service;
import kotlin.Metadata;

/* compiled from: ExperimentAssignmentServiceClient.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H&J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0003H&J\u0014\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0003H&J\u0014\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u0003H&J\u0014\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u0003H&J\u0014\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u0003H&¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/ExperimentAssignmentServiceClient;", "Lcom/squareup/wire/Service;", "BatchAssign", "Lcom/squareup/wire/GrpcCall;", "Lcom/robinhood/rosetta/experiment_assignment/BatchAssignRequest;", "Lcom/robinhood/rosetta/experiment_assignment/BatchAssignResponse;", "Assign", "Lcom/robinhood/rosetta/experiment_assignment/AssignRequest;", "Lcom/robinhood/rosetta/experiment_assignment/AssignResponse;", "DiagnosticAssign", "Lcom/robinhood/rosetta/experiment_assignment/DiagnosticAssignRequest;", "Lcom/robinhood/rosetta/experiment_assignment/DiagnosticAssignResponse;", "HTTPAssign", "Lcom/robinhood/rosetta/experiment_assignment/HTTPAssignRequest;", "Lcom/robinhood/rosetta/experiment_assignment/HTTPAssignResponse;", "HTTPAssignExternal", "HTTPAssignExternalVegeta", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface ExperimentAssignmentServiceClient extends Service {
    GrpcCall<AssignRequest, AssignResponse> Assign();

    GrpcCall<BatchAssignRequest, BatchAssignResponse> BatchAssign();

    GrpcCall<DiagnosticAssignRequest, DiagnosticAssignResponse> DiagnosticAssign();

    GrpcCall<HTTPAssignRequest, HTTPAssignResponse> HTTPAssign();

    GrpcCall<HTTPAssignRequest, HTTPAssignResponse> HTTPAssignExternal();

    GrpcCall<HTTPAssignRequest, HTTPAssignResponse> HTTPAssignExternalVegeta();
}

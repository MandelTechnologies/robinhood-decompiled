package com.robinhood.rosetta.experiment_assignment;

import com.squareup.wire.GrpcCall;
import com.squareup.wire.GrpcClient;
import com.squareup.wire.GrpcMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GrpcExperimentAssignmentServiceClient.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0016J\u0014\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0007H\u0016J\u0014\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u0007H\u0016J\u0014\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0007H\u0016J\u0014\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0007H\u0016J\u0014\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/GrpcExperimentAssignmentServiceClient;", "Lcom/robinhood/rosetta/experiment_assignment/ExperimentAssignmentServiceClient;", "client", "Lcom/squareup/wire/GrpcClient;", "<init>", "(Lcom/squareup/wire/GrpcClient;)V", "BatchAssign", "Lcom/squareup/wire/GrpcCall;", "Lcom/robinhood/rosetta/experiment_assignment/BatchAssignRequest;", "Lcom/robinhood/rosetta/experiment_assignment/BatchAssignResponse;", "Assign", "Lcom/robinhood/rosetta/experiment_assignment/AssignRequest;", "Lcom/robinhood/rosetta/experiment_assignment/AssignResponse;", "DiagnosticAssign", "Lcom/robinhood/rosetta/experiment_assignment/DiagnosticAssignRequest;", "Lcom/robinhood/rosetta/experiment_assignment/DiagnosticAssignResponse;", "HTTPAssign", "Lcom/robinhood/rosetta/experiment_assignment/HTTPAssignRequest;", "Lcom/robinhood/rosetta/experiment_assignment/HTTPAssignResponse;", "HTTPAssignExternal", "HTTPAssignExternalVegeta", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class GrpcExperimentAssignmentServiceClient implements ExperimentAssignmentServiceClient {
    private final GrpcClient client;

    public GrpcExperimentAssignmentServiceClient(GrpcClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.client = client;
    }

    @Override // com.robinhood.rosetta.experiment_assignment.ExperimentAssignmentServiceClient
    public GrpcCall<BatchAssignRequest, BatchAssignResponse> BatchAssign() {
        return this.client.newCall(new GrpcMethod("/rosetta.experiment_assignment.service.ExperimentAssignmentService/BatchAssign", BatchAssignRequest.ADAPTER, BatchAssignResponse.ADAPTER));
    }

    @Override // com.robinhood.rosetta.experiment_assignment.ExperimentAssignmentServiceClient
    public GrpcCall<AssignRequest, AssignResponse> Assign() {
        return this.client.newCall(new GrpcMethod("/rosetta.experiment_assignment.service.ExperimentAssignmentService/Assign", AssignRequest.ADAPTER, AssignResponse.ADAPTER));
    }

    @Override // com.robinhood.rosetta.experiment_assignment.ExperimentAssignmentServiceClient
    public GrpcCall<DiagnosticAssignRequest, DiagnosticAssignResponse> DiagnosticAssign() {
        return this.client.newCall(new GrpcMethod("/rosetta.experiment_assignment.service.ExperimentAssignmentService/DiagnosticAssign", DiagnosticAssignRequest.ADAPTER, DiagnosticAssignResponse.ADAPTER));
    }

    @Override // com.robinhood.rosetta.experiment_assignment.ExperimentAssignmentServiceClient
    public GrpcCall<HTTPAssignRequest, HTTPAssignResponse> HTTPAssign() {
        return this.client.newCall(new GrpcMethod("/rosetta.experiment_assignment.service.ExperimentAssignmentService/HTTPAssign", HTTPAssignRequest.ADAPTER, HTTPAssignResponse.ADAPTER));
    }

    @Override // com.robinhood.rosetta.experiment_assignment.ExperimentAssignmentServiceClient
    public GrpcCall<HTTPAssignRequest, HTTPAssignResponse> HTTPAssignExternal() {
        return this.client.newCall(new GrpcMethod("/rosetta.experiment_assignment.service.ExperimentAssignmentService/HTTPAssignExternal", HTTPAssignRequest.ADAPTER, HTTPAssignResponse.ADAPTER));
    }

    @Override // com.robinhood.rosetta.experiment_assignment.ExperimentAssignmentServiceClient
    public GrpcCall<HTTPAssignRequest, HTTPAssignResponse> HTTPAssignExternalVegeta() {
        return this.client.newCall(new GrpcMethod("/rosetta.experiment_assignment.service.ExperimentAssignmentService/HTTPAssignExternalVegeta", HTTPAssignRequest.ADAPTER, HTTPAssignResponse.ADAPTER));
    }
}

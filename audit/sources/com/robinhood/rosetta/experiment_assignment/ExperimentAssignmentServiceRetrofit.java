package com.robinhood.rosetta.experiment_assignment;

import com.robinhood.android.idl.common.RhGenerated;
import com.robinhood.android.idl.common.httpoption.IdlField;
import com.robinhood.android.instant.p160ui.InstantCashConstants;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmSuppressWildcards;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: ExperimentAssignmentServiceRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\bg\u0018\u00002\u00020\u0001J¾\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\u00072\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\r2\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0002\u0010\u0016J¾\u0001\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\u00072\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\r2\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0002\u0010\u0016¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/ExperimentAssignmentServiceRetrofit;", "", "HTTPAssignExternal", "Lretrofit2/Response;", "Lcom/robinhood/rosetta/experiment_assignment/HTTPAssignResponseDto;", "headers", "", "", "entity_id", "names", "", "entity_type", "trigger", "", "userleap", "platform", "app_version", "os_version", "user_origin", "assignment_logging", InstantCashConstants.ACCOUNT_TYPE_KEY, "application", "(Ljava/util/Map;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "HTTPAssignExternalVegeta", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes26.dex */
public interface ExperimentAssignmentServiceRetrofit {
    @GET("kaizen/experiments/{entity_id}")
    Object HTTPAssignExternal(@HeaderMap Map<String, String> map, @Path("entity_id") @IdlField(protoType = "string") String str, @IdlField(protoType = "string") @Query("names") List<String> list, @IdlField(protoType = "string") @Query("entityType") String str2, @IdlField(protoType = "google.protobuf.BoolValue") @Query("trigger") Boolean bool, @IdlField(protoType = "google.protobuf.BoolValue") @Query("userleap") Boolean bool2, @IdlField(protoType = "string") @Query("platform") String str3, @IdlField(protoType = "string") @Query("appVersion") String str4, @IdlField(protoType = "string") @Query("osVersion") String str5, @IdlField(protoType = "string") @Query("userOrigin") String str6, @IdlField(protoType = "google.protobuf.BoolValue") @Query("assignmentLogging") Boolean bool3, @IdlField(protoType = "string") @Query("accountType") String str7, @IdlField(protoType = "string") @Query("application") String str8, Continuation<Response<HTTPAssignResponseDto>> continuation);

    @GET("vegeta/experiments/{entity_id}")
    Object HTTPAssignExternalVegeta(@HeaderMap Map<String, String> map, @Path("entity_id") @IdlField(protoType = "string") String str, @IdlField(protoType = "string") @Query("names") List<String> list, @IdlField(protoType = "string") @Query("entityType") String str2, @IdlField(protoType = "google.protobuf.BoolValue") @Query("trigger") Boolean bool, @IdlField(protoType = "google.protobuf.BoolValue") @Query("userleap") Boolean bool2, @IdlField(protoType = "string") @Query("platform") String str3, @IdlField(protoType = "string") @Query("appVersion") String str4, @IdlField(protoType = "string") @Query("osVersion") String str5, @IdlField(protoType = "string") @Query("userOrigin") String str6, @IdlField(protoType = "google.protobuf.BoolValue") @Query("assignmentLogging") Boolean bool3, @IdlField(protoType = "string") @Query("accountType") String str7, @IdlField(protoType = "string") @Query("application") String str8, Continuation<Response<HTTPAssignResponseDto>> continuation);
}

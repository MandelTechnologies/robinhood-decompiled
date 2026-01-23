package com.robinhood.android.advisory.onboarding.marketing;

import com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsScreenViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.advisory.p304db.onboarding.StrategiesValuePropsData;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StrategiesValuePropsDataState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB/\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/marketing/StrategiesValuePropsDataState;", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/models/advisory/db/onboarding/StrategiesValuePropsData;", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "source", "", "<init>", "(Lcom/robinhood/models/advisory/db/onboarding/StrategiesValuePropsData;Ljava/lang/Exception;Ljava/lang/String;)V", "getData", "()Lcom/robinhood/models/advisory/db/onboarding/StrategiesValuePropsData;", "getError", "()Ljava/lang/Exception;", "getSource", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class StrategiesValuePropsDataState {
    private final StrategiesValuePropsData data;
    private final Exception error;
    private final String source;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public StrategiesValuePropsDataState() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ StrategiesValuePropsDataState copy$default(StrategiesValuePropsDataState strategiesValuePropsDataState, StrategiesValuePropsData strategiesValuePropsData, Exception exc, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            strategiesValuePropsData = strategiesValuePropsDataState.data;
        }
        if ((i & 2) != 0) {
            exc = strategiesValuePropsDataState.error;
        }
        if ((i & 4) != 0) {
            str = strategiesValuePropsDataState.source;
        }
        return strategiesValuePropsDataState.copy(strategiesValuePropsData, exc, str);
    }

    /* renamed from: component1, reason: from getter */
    public final StrategiesValuePropsData getData() {
        return this.data;
    }

    /* renamed from: component2, reason: from getter */
    public final Exception getError() {
        return this.error;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final StrategiesValuePropsDataState copy(StrategiesValuePropsData data, Exception error, String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new StrategiesValuePropsDataState(data, error, source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrategiesValuePropsDataState)) {
            return false;
        }
        StrategiesValuePropsDataState strategiesValuePropsDataState = (StrategiesValuePropsDataState) other;
        return Intrinsics.areEqual(this.data, strategiesValuePropsDataState.data) && Intrinsics.areEqual(this.error, strategiesValuePropsDataState.error) && Intrinsics.areEqual(this.source, strategiesValuePropsDataState.source);
    }

    public int hashCode() {
        StrategiesValuePropsData strategiesValuePropsData = this.data;
        int iHashCode = (strategiesValuePropsData == null ? 0 : strategiesValuePropsData.hashCode()) * 31;
        Exception exc = this.error;
        return ((iHashCode + (exc != null ? exc.hashCode() : 0)) * 31) + this.source.hashCode();
    }

    public String toString() {
        return "StrategiesValuePropsDataState(data=" + this.data + ", error=" + this.error + ", source=" + this.source + ")";
    }

    public StrategiesValuePropsDataState(StrategiesValuePropsData strategiesValuePropsData, Exception exc, String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.data = strategiesValuePropsData;
        this.error = exc;
        this.source = source;
    }

    public final StrategiesValuePropsData getData() {
        return this.data;
    }

    public final Exception getError() {
        return this.error;
    }

    public /* synthetic */ StrategiesValuePropsDataState(StrategiesValuePropsData strategiesValuePropsData, Exception exc, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : strategiesValuePropsData, (i & 2) != 0 ? null : exc, (i & 4) != 0 ? "" : str);
    }

    public final String getSource() {
        return this.source;
    }

    /* compiled from: StrategiesValuePropsDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/marketing/StrategiesValuePropsDataState$Companion;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/advisory/onboarding/marketing/StrategiesValuePropsDataState;", "Lcom/robinhood/android/advisory/onboarding/marketing/StrategiesValuePropsScreenViewState;", "<init>", "()V", "reduce", "dataState", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements StateProvider<StrategiesValuePropsDataState, StrategiesValuePropsScreenViewState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.StateProvider
        public StrategiesValuePropsScreenViewState reduce(StrategiesValuePropsDataState dataState) {
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            return dataState.getData() != null ? new StrategiesValuePropsScreenViewState.Loaded(dataState.getData(), dataState.getSource()) : dataState.getError() != null ? StrategiesValuePropsScreenViewState.Error.INSTANCE : StrategiesValuePropsScreenViewState.Loading.INSTANCE;
        }
    }
}

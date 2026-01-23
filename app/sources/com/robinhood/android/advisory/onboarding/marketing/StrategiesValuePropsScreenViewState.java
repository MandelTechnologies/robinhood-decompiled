package com.robinhood.android.advisory.onboarding.marketing;

import com.robinhood.models.advisory.p304db.onboarding.StrategiesValuePropsData;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StrategiesValuePropsScreenViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/marketing/StrategiesValuePropsScreenViewState;", "", "Loading", "Error", "Loaded", "Lcom/robinhood/android/advisory/onboarding/marketing/StrategiesValuePropsScreenViewState$Error;", "Lcom/robinhood/android/advisory/onboarding/marketing/StrategiesValuePropsScreenViewState$Loaded;", "Lcom/robinhood/android/advisory/onboarding/marketing/StrategiesValuePropsScreenViewState$Loading;", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface StrategiesValuePropsScreenViewState {

    /* compiled from: StrategiesValuePropsScreenViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/marketing/StrategiesValuePropsScreenViewState$Loading;", "Lcom/robinhood/android/advisory/onboarding/marketing/StrategiesValuePropsScreenViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements StrategiesValuePropsScreenViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -1428169340;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: StrategiesValuePropsScreenViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/marketing/StrategiesValuePropsScreenViewState$Error;", "Lcom/robinhood/android/advisory/onboarding/marketing/StrategiesValuePropsScreenViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements StrategiesValuePropsScreenViewState {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        public boolean equals(Object other) {
            return this == other || (other instanceof Error);
        }

        public int hashCode() {
            return 859193424;
        }

        public String toString() {
            return "Error";
        }

        private Error() {
        }
    }

    /* compiled from: StrategiesValuePropsScreenViewState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/marketing/StrategiesValuePropsScreenViewState$Loaded;", "Lcom/robinhood/android/advisory/onboarding/marketing/StrategiesValuePropsScreenViewState;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/models/advisory/db/onboarding/StrategiesValuePropsData;", "source", "", "<init>", "(Lcom/robinhood/models/advisory/db/onboarding/StrategiesValuePropsData;Ljava/lang/String;)V", "getData", "()Lcom/robinhood/models/advisory/db/onboarding/StrategiesValuePropsData;", "getSource", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements StrategiesValuePropsScreenViewState {
        public static final int $stable = 8;
        private final StrategiesValuePropsData data;
        private final String source;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, StrategiesValuePropsData strategiesValuePropsData, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                strategiesValuePropsData = loaded.data;
            }
            if ((i & 2) != 0) {
                str = loaded.source;
            }
            return loaded.copy(strategiesValuePropsData, str);
        }

        /* renamed from: component1, reason: from getter */
        public final StrategiesValuePropsData getData() {
            return this.data;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public final Loaded copy(StrategiesValuePropsData data, String source) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(source, "source");
            return new Loaded(data, source);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.data, loaded.data) && Intrinsics.areEqual(this.source, loaded.source);
        }

        public int hashCode() {
            return (this.data.hashCode() * 31) + this.source.hashCode();
        }

        public String toString() {
            return "Loaded(data=" + this.data + ", source=" + this.source + ")";
        }

        public Loaded(StrategiesValuePropsData data, String source) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(source, "source");
            this.data = data;
            this.source = source;
        }

        public final StrategiesValuePropsData getData() {
            return this.data;
        }

        public final String getSource() {
            return this.source;
        }
    }
}

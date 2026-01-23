package com.robinhood.shared.common.etpcomposition;

import com.robinhood.models.p320db.bonfire.etp.EtpHolding;
import com.robinhood.shared.crypto.contracts.CryptoDetailSource;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EtpCompositionV2Duxo.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/common/etpcomposition/EtpCompositionV2ViewState;", "", "Loading", "LoadedNoDetails", "Loaded", "Lcom/robinhood/shared/common/etpcomposition/EtpCompositionV2ViewState$Loaded;", "Lcom/robinhood/shared/common/etpcomposition/EtpCompositionV2ViewState$LoadedNoDetails;", "Lcom/robinhood/shared/common/etpcomposition/EtpCompositionV2ViewState$Loading;", "lib-etp-composition_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.common.etpcomposition.EtpCompositionV2ViewState, reason: use source file name */
/* loaded from: classes26.dex */
public interface EtpCompositionV2Duxo5 {

    /* compiled from: EtpCompositionV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/common/etpcomposition/EtpCompositionV2ViewState$Loading;", "Lcom/robinhood/shared/common/etpcomposition/EtpCompositionV2ViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-etp-composition_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.common.etpcomposition.EtpCompositionV2ViewState$Loading */
    public static final /* data */ class Loading implements EtpCompositionV2Duxo5 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -1147820641;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: EtpCompositionV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/common/etpcomposition/EtpCompositionV2ViewState$LoadedNoDetails;", "Lcom/robinhood/shared/common/etpcomposition/EtpCompositionV2ViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-etp-composition_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.common.etpcomposition.EtpCompositionV2ViewState$LoadedNoDetails */
    public static final /* data */ class LoadedNoDetails implements EtpCompositionV2Duxo5 {
        public static final int $stable = 0;
        public static final LoadedNoDetails INSTANCE = new LoadedNoDetails();

        public boolean equals(Object other) {
            return this == other || (other instanceof LoadedNoDetails);
        }

        public int hashCode() {
            return -97155041;
        }

        public String toString() {
            return "LoadedNoDetails";
        }

        private LoadedNoDetails() {
        }
    }

    /* compiled from: EtpCompositionV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/common/etpcomposition/EtpCompositionV2ViewState$Loaded;", "Lcom/robinhood/shared/common/etpcomposition/EtpCompositionV2ViewState;", "lastUpdatedString", "Lcom/robinhood/utils/resource/StringResource;", "getLastUpdatedString", "()Lcom/robinhood/utils/resource/StringResource;", "StandardEtp", "RhvCef", "Lcom/robinhood/shared/common/etpcomposition/EtpCompositionV2ViewState$Loaded$RhvCef;", "Lcom/robinhood/shared/common/etpcomposition/EtpCompositionV2ViewState$Loaded$StandardEtp;", "lib-etp-composition_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.common.etpcomposition.EtpCompositionV2ViewState$Loaded */
    public interface Loaded extends EtpCompositionV2Duxo5 {
        StringResource getLastUpdatedString();

        /* compiled from: EtpCompositionV2Duxo.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/common/etpcomposition/EtpCompositionV2ViewState$Loaded$StandardEtp;", "Lcom/robinhood/shared/common/etpcomposition/EtpCompositionV2ViewState$Loaded;", "lastUpdatedString", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;)V", "getLastUpdatedString", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-etp-composition_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.common.etpcomposition.EtpCompositionV2ViewState$Loaded$StandardEtp, reason: from toString */
        public static final /* data */ class StandardEtp implements Loaded {
            public static final int $stable = StringResource.$stable;
            private final StringResource lastUpdatedString;

            public static /* synthetic */ StandardEtp copy$default(StandardEtp standardEtp, StringResource stringResource, int i, Object obj) {
                if ((i & 1) != 0) {
                    stringResource = standardEtp.lastUpdatedString;
                }
                return standardEtp.copy(stringResource);
            }

            /* renamed from: component1, reason: from getter */
            public final StringResource getLastUpdatedString() {
                return this.lastUpdatedString;
            }

            public final StandardEtp copy(StringResource lastUpdatedString) {
                return new StandardEtp(lastUpdatedString);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof StandardEtp) && Intrinsics.areEqual(this.lastUpdatedString, ((StandardEtp) other).lastUpdatedString);
            }

            public int hashCode() {
                StringResource stringResource = this.lastUpdatedString;
                if (stringResource == null) {
                    return 0;
                }
                return stringResource.hashCode();
            }

            public String toString() {
                return "StandardEtp(lastUpdatedString=" + this.lastUpdatedString + ")";
            }

            public StandardEtp(StringResource stringResource) {
                this.lastUpdatedString = stringResource;
            }

            @Override // com.robinhood.shared.common.etpcomposition.EtpCompositionV2Duxo5.Loaded
            public StringResource getLastUpdatedString() {
                return this.lastUpdatedString;
            }
        }

        /* compiled from: EtpCompositionV2Duxo.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/common/etpcomposition/EtpCompositionV2ViewState$Loaded$RhvCef;", "Lcom/robinhood/shared/common/etpcomposition/EtpCompositionV2ViewState$Loaded;", "lastUpdatedString", "Lcom/robinhood/utils/resource/StringResource;", CryptoDetailSource.HOLDINGS, "", "Lcom/robinhood/models/db/bonfire/etp/EtpHolding;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Ljava/util/List;)V", "getLastUpdatedString", "()Lcom/robinhood/utils/resource/StringResource;", "getHoldings", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-etp-composition_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.common.etpcomposition.EtpCompositionV2ViewState$Loaded$RhvCef, reason: from toString */
        public static final /* data */ class RhvCef implements Loaded {
            public static final int $stable = 8;
            private final List<EtpHolding> holdings;
            private final StringResource lastUpdatedString;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ RhvCef copy$default(RhvCef rhvCef, StringResource stringResource, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    stringResource = rhvCef.lastUpdatedString;
                }
                if ((i & 2) != 0) {
                    list = rhvCef.holdings;
                }
                return rhvCef.copy(stringResource, list);
            }

            /* renamed from: component1, reason: from getter */
            public final StringResource getLastUpdatedString() {
                return this.lastUpdatedString;
            }

            public final List<EtpHolding> component2() {
                return this.holdings;
            }

            public final RhvCef copy(StringResource lastUpdatedString, List<EtpHolding> holdings) {
                Intrinsics.checkNotNullParameter(holdings, "holdings");
                return new RhvCef(lastUpdatedString, holdings);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RhvCef)) {
                    return false;
                }
                RhvCef rhvCef = (RhvCef) other;
                return Intrinsics.areEqual(this.lastUpdatedString, rhvCef.lastUpdatedString) && Intrinsics.areEqual(this.holdings, rhvCef.holdings);
            }

            public int hashCode() {
                StringResource stringResource = this.lastUpdatedString;
                return ((stringResource == null ? 0 : stringResource.hashCode()) * 31) + this.holdings.hashCode();
            }

            public String toString() {
                return "RhvCef(lastUpdatedString=" + this.lastUpdatedString + ", holdings=" + this.holdings + ")";
            }

            public RhvCef(StringResource stringResource, List<EtpHolding> holdings) {
                Intrinsics.checkNotNullParameter(holdings, "holdings");
                this.lastUpdatedString = stringResource;
                this.holdings = holdings;
            }

            @Override // com.robinhood.shared.common.etpcomposition.EtpCompositionV2Duxo5.Loaded
            public StringResource getLastUpdatedString() {
                return this.lastUpdatedString;
            }

            public final List<EtpHolding> getHoldings() {
                return this.holdings;
            }
        }
    }
}

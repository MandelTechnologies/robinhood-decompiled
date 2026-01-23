package com.robinhood.android.crypto.p094ui.detail.p095v2;

import bff_crypto_trading.service.p018v1.CryptoDetailPageState;
import bff_crypto_trading.service.p018v1.CryptoDetailPageStateDto;
import com.robinhood.android.crypto.p094ui.detail.p095v2.CryptoDetailViewState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÂ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÂ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\bHÂ\u0003J\u000e\u0010!\u001a\u00020\u0006HÀ\u0003¢\u0006\u0002\b\"J\u000e\u0010#\u001a\u00020\u0006HÀ\u0003¢\u0006\u0002\b$JE\u0010%\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\u0013\u0010&\u001a\u00020\u00062\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u0016\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u00020\u00068AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\n\u001a\u00020\u00068AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000eR\u0011\u0010\u001b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000eR\u0011\u0010\u001c\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000e¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/v2/CryptoDetailDataState;", "", "cdpStateDtoList", "", "Lbff_crypto_trading/service/v1/CryptoDetailPageStateDto;", "isLoggedIn", "", "stateError", "", "isCryptoSduiChartsExperimentEnabled", "isBitstampUkUpsellRegionGateEnabled", "<init>", "(Ljava/util/List;ZLjava/lang/Throwable;ZZ)V", "isCryptoSduiChartsExperimentEnabled$feature_crypto_externalDebug", "()Z", "isBitstampUkUpsellRegionGateEnabled$feature_crypto_externalDebug", "contentState", "Lcom/robinhood/android/crypto/ui/detail/v2/CryptoDetailViewState$ContentState;", "getContentState", "()Lcom/robinhood/android/crypto/ui/detail/v2/CryptoDetailViewState$ContentState;", "components", "Lkotlinx/collections/immutable/ImmutableList;", "Lbff_crypto_trading/service/v1/CryptoDetailPageState;", "getComponents", "()Lkotlinx/collections/immutable/ImmutableList;", "loggedOutCtaVisible", "getLoggedOutCtaVisible", "isCryptoSduiChartsEnabled", "showBitstampUkBanner", "getShowBitstampUkBanner", "component1", "component2", "component3", "component4", "component4$feature_crypto_externalDebug", "component5", "component5$feature_crypto_externalDebug", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class CryptoDetailDataState {
    public static final int $stable = 8;
    private final List<CryptoDetailPageStateDto> cdpStateDtoList;
    private final boolean isBitstampUkUpsellRegionGateEnabled;
    private final boolean isCryptoSduiChartsExperimentEnabled;
    private final boolean isLoggedIn;
    private final Throwable stateError;

    public CryptoDetailDataState() {
        this(null, false, null, false, false, 31, null);
    }

    private final List<CryptoDetailPageStateDto> component1() {
        return this.cdpStateDtoList;
    }

    /* renamed from: component2, reason: from getter */
    private final boolean getIsLoggedIn() {
        return this.isLoggedIn;
    }

    /* renamed from: component3, reason: from getter */
    private final Throwable getStateError() {
        return this.stateError;
    }

    public static /* synthetic */ CryptoDetailDataState copy$default(CryptoDetailDataState cryptoDetailDataState, List list, boolean z, Throwable th, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = cryptoDetailDataState.cdpStateDtoList;
        }
        if ((i & 2) != 0) {
            z = cryptoDetailDataState.isLoggedIn;
        }
        if ((i & 4) != 0) {
            th = cryptoDetailDataState.stateError;
        }
        if ((i & 8) != 0) {
            z2 = cryptoDetailDataState.isCryptoSduiChartsExperimentEnabled;
        }
        if ((i & 16) != 0) {
            z3 = cryptoDetailDataState.isBitstampUkUpsellRegionGateEnabled;
        }
        boolean z4 = z3;
        Throwable th2 = th;
        return cryptoDetailDataState.copy(list, z, th2, z2, z4);
    }

    /* renamed from: component4$feature_crypto_externalDebug, reason: from getter */
    public final boolean getIsCryptoSduiChartsExperimentEnabled() {
        return this.isCryptoSduiChartsExperimentEnabled;
    }

    /* renamed from: component5$feature_crypto_externalDebug, reason: from getter */
    public final boolean getIsBitstampUkUpsellRegionGateEnabled() {
        return this.isBitstampUkUpsellRegionGateEnabled;
    }

    public final CryptoDetailDataState copy(List<? extends CryptoDetailPageStateDto> cdpStateDtoList, boolean isLoggedIn, Throwable stateError, boolean isCryptoSduiChartsExperimentEnabled, boolean isBitstampUkUpsellRegionGateEnabled) {
        return new CryptoDetailDataState(cdpStateDtoList, isLoggedIn, stateError, isCryptoSduiChartsExperimentEnabled, isBitstampUkUpsellRegionGateEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoDetailDataState)) {
            return false;
        }
        CryptoDetailDataState cryptoDetailDataState = (CryptoDetailDataState) other;
        return Intrinsics.areEqual(this.cdpStateDtoList, cryptoDetailDataState.cdpStateDtoList) && this.isLoggedIn == cryptoDetailDataState.isLoggedIn && Intrinsics.areEqual(this.stateError, cryptoDetailDataState.stateError) && this.isCryptoSduiChartsExperimentEnabled == cryptoDetailDataState.isCryptoSduiChartsExperimentEnabled && this.isBitstampUkUpsellRegionGateEnabled == cryptoDetailDataState.isBitstampUkUpsellRegionGateEnabled;
    }

    public int hashCode() {
        List<CryptoDetailPageStateDto> list = this.cdpStateDtoList;
        int iHashCode = (((list == null ? 0 : list.hashCode()) * 31) + Boolean.hashCode(this.isLoggedIn)) * 31;
        Throwable th = this.stateError;
        return ((((iHashCode + (th != null ? th.hashCode() : 0)) * 31) + Boolean.hashCode(this.isCryptoSduiChartsExperimentEnabled)) * 31) + Boolean.hashCode(this.isBitstampUkUpsellRegionGateEnabled);
    }

    public String toString() {
        return "CryptoDetailDataState(cdpStateDtoList=" + this.cdpStateDtoList + ", isLoggedIn=" + this.isLoggedIn + ", stateError=" + this.stateError + ", isCryptoSduiChartsExperimentEnabled=" + this.isCryptoSduiChartsExperimentEnabled + ", isBitstampUkUpsellRegionGateEnabled=" + this.isBitstampUkUpsellRegionGateEnabled + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoDetailDataState(List<? extends CryptoDetailPageStateDto> list, boolean z, Throwable th, boolean z2, boolean z3) {
        this.cdpStateDtoList = list;
        this.isLoggedIn = z;
        this.stateError = th;
        this.isCryptoSduiChartsExperimentEnabled = z2;
        this.isBitstampUkUpsellRegionGateEnabled = z3;
    }

    public /* synthetic */ CryptoDetailDataState(List list, boolean z, Throwable th, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : th, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3);
    }

    public final boolean isCryptoSduiChartsExperimentEnabled$feature_crypto_externalDebug() {
        return this.isCryptoSduiChartsExperimentEnabled;
    }

    public final boolean isBitstampUkUpsellRegionGateEnabled$feature_crypto_externalDebug() {
        return this.isBitstampUkUpsellRegionGateEnabled;
    }

    public final CryptoDetailViewState.ContentState getContentState() {
        if (this.stateError != null) {
            return CryptoDetailViewState.ContentState.ERROR;
        }
        if (this.cdpStateDtoList == null) {
            return CryptoDetailViewState.ContentState.LOADING;
        }
        return CryptoDetailViewState.ContentState.CONTENT;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ImmutableList<CryptoDetailPageState> getComponents() {
        List<CryptoDetailPageStateDto> list = this.cdpStateDtoList;
        if (list != null) {
            List<CryptoDetailPageStateDto> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add((CryptoDetailPageState) ((CryptoDetailPageStateDto) it.next()).toProto());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                CryptoDetailPageState cryptoDetailPageState = (CryptoDetailPageState) obj;
                if (this.isLoggedIn || cryptoDetailPageState != CryptoDetailPageState.CRYPTO_DETAIL_PAGE_STATE_TOP_LEVEL_BANNER) {
                    arrayList2.add(obj);
                }
            }
            ImmutableList<CryptoDetailPageState> immutableList = extensions2.toImmutableList(arrayList2);
            if (immutableList != null) {
                return immutableList;
            }
        }
        return extensions2.persistentListOf();
    }

    public final boolean getLoggedOutCtaVisible() {
        return (this.isLoggedIn || this.cdpStateDtoList == null) ? false : true;
    }

    public final boolean isCryptoSduiChartsEnabled() {
        return !this.isLoggedIn || this.isCryptoSduiChartsExperimentEnabled || this.isBitstampUkUpsellRegionGateEnabled;
    }

    public final boolean getShowBitstampUkBanner() {
        return this.isLoggedIn && this.isBitstampUkUpsellRegionGateEnabled;
    }
}

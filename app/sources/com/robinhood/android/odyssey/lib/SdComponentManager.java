package com.robinhood.android.odyssey.lib;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.common.util.InternationalInfo;
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery3;
import io.reactivex.Observable;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SdComponentManager.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0006J\u0010\u0010\u0019\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR)\u0010\r\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u00060\u00060\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/SdComponentManager;", "", "<init>", "()V", "informationalInfoList", "", "Lcom/robinhood/android/common/util/InternationalInfo;", "getInformationalInfoList", "()Ljava/util/List;", "defaultInternationalInfo", "selectedInformationalInfo", "getSelectedInformationalInfo", "()Lcom/robinhood/android/common/util/InternationalInfo;", "selectedInformationalInfoRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "kotlin.jvm.PlatformType", "getSelectedInformationalInfoRelay", "()Lcom/jakewharton/rxrelay2/BehaviorRelay;", "selectedInformationalInfoRelay$delegate", "Lkotlin/Lazy;", "streamSelectedInformationalInfo", "Lio/reactivex/Observable;", "setSelectedInformationalInfo", "", SduiFeatureDiscovery3.INFO_TAG, "setDefaultCountryCode", "defaultCountryCode", "", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class SdComponentManager {
    public static final int $stable = 8;
    private InternationalInfo defaultInternationalInfo;
    private final List<InternationalInfo> informationalInfoList = InternationalInfo.INSTANCE.getInternationalInfos();

    /* renamed from: selectedInformationalInfoRelay$delegate, reason: from kotlin metadata */
    private final Lazy selectedInformationalInfoRelay = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.odyssey.lib.SdComponentManager$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SdComponentManager.selectedInformationalInfoRelay_delegate$lambda$0(this.f$0);
        }
    });

    public final List<InternationalInfo> getInformationalInfoList() {
        return this.informationalInfoList;
    }

    public final InternationalInfo getSelectedInformationalInfo() {
        InternationalInfo value = getSelectedInformationalInfoRelay().getValue();
        Intrinsics.checkNotNull(value);
        return value;
    }

    private final BehaviorRelay<InternationalInfo> getSelectedInformationalInfoRelay() {
        return (BehaviorRelay) this.selectedInformationalInfoRelay.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BehaviorRelay selectedInformationalInfoRelay_delegate$lambda$0(SdComponentManager sdComponentManager) {
        InternationalInfo internationalInfo = sdComponentManager.defaultInternationalInfo;
        if (internationalInfo == null) {
            internationalInfo = (InternationalInfo) CollectionsKt.first((List) sdComponentManager.informationalInfoList);
        }
        return BehaviorRelay.createDefault(internationalInfo);
    }

    public final Observable<InternationalInfo> streamSelectedInformationalInfo() {
        Observable<InternationalInfo> observableHide = getSelectedInformationalInfoRelay().hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        return observableHide;
    }

    public final void setSelectedInformationalInfo(InternationalInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        getSelectedInformationalInfoRelay().accept(info);
    }

    public final void setDefaultCountryCode(String defaultCountryCode) {
        for (InternationalInfo internationalInfo : this.informationalInfoList) {
            if (Intrinsics.areEqual(internationalInfo.getCountryCode().getIso3166CountryCode(), defaultCountryCode)) {
                this.defaultInternationalInfo = internationalInfo;
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}

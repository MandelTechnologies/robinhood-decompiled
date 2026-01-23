package com.robinhood.shared.phone;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.identi.PhoneProhibitedCountryCodesStore;
import com.robinhood.models.p355ui.identi.PhoneProhibitedCountryCodes;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.common.contracts.SelectCountryCodeFragmentKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SelectCountryCodeBottomSheetDuxo.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0015B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/phone/SelectCountryCodeBottomSheetDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/shared/phone/SelectCountryCodeBottomSheetDataState;", "Lcom/robinhood/shared/phone/SelectCountryCodeBottomSheetViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "phoneProhibitedCountryCodesStore", "Lcom/robinhood/librobinhood/data/store/identi/PhoneProhibitedCountryCodesStore;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "stateProvider", "Lcom/robinhood/shared/phone/SelectCountryCodeBottomSheetStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/identi/PhoneProhibitedCountryCodesStore;Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/shared/phone/SelectCountryCodeBottomSheetStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "Companion", "feature-phone_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class SelectCountryCodeBottomSheetDuxo extends BaseDuxo<SelectCountryCodeBottomSheetDataState, SelectCountryCodeBottomSheetViewState> implements HasSavedState {
    private final AppType appType;
    private final PhoneProhibitedCountryCodesStore phoneProhibitedCountryCodesStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SelectCountryCodeBottomSheetDuxo(PhoneProhibitedCountryCodesStore phoneProhibitedCountryCodesStore, AppType appType, SelectCountryCodeBottomSheetStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(phoneProhibitedCountryCodesStore, "phoneProhibitedCountryCodesStore");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        super(new SelectCountryCodeBottomSheetDataState(((SelectCountryCodeFragmentKey) companion.getArgs(savedStateHandle)).getCountryCodes(), null, ((SelectCountryCodeFragmentKey) companion.getArgs(savedStateHandle)).getShowCallingCode(), appType == AppType.RHC, 2, null), stateProvider, duxoBundle);
        this.phoneProhibitedCountryCodesStore = phoneProhibitedCountryCodesStore;
        this.appType = appType;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        if (this.appType == AppType.RHC) {
            this.phoneProhibitedCountryCodesStore.refresh(true);
            LifecycleHost.DefaultImpls.bind$default(this, this.phoneProhibitedCountryCodesStore.stream(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.phone.SelectCountryCodeBottomSheetDuxo$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelectCountryCodeBottomSheetDuxo.onStart$lambda$0(this.f$0, (PhoneProhibitedCountryCodes) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(SelectCountryCodeBottomSheetDuxo selectCountryCodeBottomSheetDuxo, PhoneProhibitedCountryCodes it) {
        Intrinsics.checkNotNullParameter(it, "it");
        selectCountryCodeBottomSheetDuxo.applyMutation(new SelectCountryCodeBottomSheetDuxo2(it, null));
        return Unit.INSTANCE;
    }

    /* compiled from: SelectCountryCodeBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/phone/SelectCountryCodeBottomSheetDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/phone/SelectCountryCodeBottomSheetDuxo;", "Lcom/robinhood/shared/common/contracts/SelectCountryCodeFragmentKey;", "<init>", "()V", "feature-phone_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<SelectCountryCodeBottomSheetDuxo, SelectCountryCodeFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public SelectCountryCodeFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (SelectCountryCodeFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public SelectCountryCodeFragmentKey getArgs(SelectCountryCodeBottomSheetDuxo selectCountryCodeBottomSheetDuxo) {
            return (SelectCountryCodeFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, selectCountryCodeBottomSheetDuxo);
        }
    }
}

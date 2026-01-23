package com.robinhood.android.verification.phone;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.verification.phone.PhoneInitialLoadingFragment;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.sheriff.UserVerifyPhoneInfoStore;
import com.robinhood.models.api.sheriff.ApiUserVerifyPhoneInfo;
import com.robinhood.p370rx.delay.SingleDelay2;
import com.robinhood.utils.extensions.SinglesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: PhoneInitialLoadingFragment.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0002\u0014\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0010\u001a\u00020\u0011H\u0017¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0011H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/verification/phone/PhoneInitialLoadingFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "userVerifyPhoneInfoStore", "Lcom/robinhood/librobinhood/data/store/sheriff/UserVerifyPhoneInfoStore;", "getUserVerifyPhoneInfoStore", "()Lcom/robinhood/librobinhood/data/store/sheriff/UserVerifyPhoneInfoStore;", "setUserVerifyPhoneInfoStore", "(Lcom/robinhood/librobinhood/data/store/sheriff/UserVerifyPhoneInfoStore;)V", "callbacks", "Lcom/robinhood/android/verification/phone/PhoneInitialLoadingFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/verification/phone/PhoneInitialLoadingFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onStart", "Callbacks", "Companion", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class PhoneInitialLoadingFragment extends GenericComposeFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.verification.phone.PhoneInitialLoadingFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof PhoneInitialLoadingFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    public UserVerifyPhoneInfoStore userVerifyPhoneInfoStore;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(PhoneInitialLoadingFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/verification/phone/PhoneInitialLoadingFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: PhoneInitialLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/verification/phone/PhoneInitialLoadingFragment$Callbacks;", "", "onInitialLoadingFinished", "", "userPhone", "", "verificationType", "Lcom/robinhood/android/verification/phone/PhoneVerificationType;", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onInitialLoadingFinished(String userPhone, PhoneVerificationType verificationType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(PhoneInitialLoadingFragment phoneInitialLoadingFragment, int i, Composer composer, int i2) {
        phoneInitialLoadingFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public final UserVerifyPhoneInfoStore getUserVerifyPhoneInfoStore() {
        UserVerifyPhoneInfoStore userVerifyPhoneInfoStore = this.userVerifyPhoneInfoStore;
        if (userVerifyPhoneInfoStore != null) {
            return userVerifyPhoneInfoStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userVerifyPhoneInfoStore");
        return null;
    }

    public final void setUserVerifyPhoneInfoStore(UserVerifyPhoneInfoStore userVerifyPhoneInfoStore) {
        Intrinsics.checkNotNullParameter(userVerifyPhoneInfoStore, "<set-?>");
        this.userVerifyPhoneInfoStore = userVerifyPhoneInfoStore;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-571535594);
        if ((i & 1) != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-571535594, i, -1, "com.robinhood.android.verification.phone.PhoneInitialLoadingFragment.ComposeContent (PhoneInitialLoadingFragment.kt:26)");
            }
            LoadingScreenComposablesKt.GenericLoadingScreenComposable(null, false, composerStartRestartGroup, 0, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.verification.phone.PhoneInitialLoadingFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PhoneInitialLoadingFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, SinglesAndroid.observeOnMainThread(SingleDelay2.minTimeInFlight$default(getUserVerifyPhoneInfoStore().getUserVerifyPhoneInfoForced(), 1000L, null, 2, null)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.verification.phone.PhoneInitialLoadingFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PhoneInitialLoadingFragment.onStart$lambda$1(this.f$0, (ApiUserVerifyPhoneInfo) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(PhoneInitialLoadingFragment phoneInitialLoadingFragment, ApiUserVerifyPhoneInfo info) {
        PhoneVerificationType phoneVerificationType;
        Intrinsics.checkNotNullParameter(info, "info");
        Callbacks callbacks = phoneInitialLoadingFragment.getCallbacks();
        String phone_number = info.getPhone_number();
        if (info.getVerified()) {
            phoneVerificationType = PhoneVerificationType.REVERIFICATION;
        } else {
            phoneVerificationType = PhoneVerificationType.VERIFICATION;
        }
        callbacks.onInitialLoadingFinished(phone_number, phoneVerificationType);
        return Unit.INSTANCE;
    }

    /* compiled from: PhoneInitialLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/verification/phone/PhoneInitialLoadingFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/robinhood/android/verification/phone/PhoneInitialLoadingFragment;", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PhoneInitialLoadingFragment newInstance() {
            return new PhoneInitialLoadingFragment();
        }
    }
}

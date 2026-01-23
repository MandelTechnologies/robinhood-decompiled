package com.robinhood.shared.unverifiedaccountrecovery.phone;

import android.view.KeyEvent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.rxjava2.RxJava2Adapter;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.InternationalInfo;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.duxo.ComposeUiEvent;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.api.pathfinder.contexts.CtaAction;
import com.robinhood.models.p355ui.pathfinder.contexts.SmsMfaEnrollPhoneInputContext;
import com.robinhood.models.p355ui.pathfinder.contexts.UserViewStatePageContext;
import com.robinhood.shared.common.contracts.SelectCountryCodeFragmentKey;
import com.robinhood.shared.unverifiedaccountrecovery.phone.UarSmsMfaEnrollPhoneInputFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: UarSmsMfaEnrollPhoneInputFragment.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00112\u00020\u00012\u00020\u0002:\u0001\u0011B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u000b\u001a\u00020\fH\u0017¢\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/phone/UarSmsMfaEnrollPhoneInputFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/shared/common/contracts/SelectCountryCodeFragmentKey$Callbacks;", "<init>", "()V", "duxo", "Lcom/robinhood/shared/unverifiedaccountrecovery/phone/UarSmsMfaEnrollPhoneInputDuxo;", "getDuxo", "()Lcom/robinhood/shared/unverifiedaccountrecovery/phone/UarSmsMfaEnrollPhoneInputDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onCountryCodeSelected", "countryCode", "Lcom/robinhood/iso/countrycode/CountryCode;", "Companion", "feature-unverified-account-recovery_externalDebug", "viewState", "Lcom/robinhood/shared/unverifiedaccountrecovery/phone/UarSmsMfaEnrollPhoneInputViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class UarSmsMfaEnrollPhoneInputFragment extends GenericComposeFragment implements SelectCountryCodeFragmentKey.Callbacks {
    private static final String SELECT_COUNTRY_CODE_BOTTOM_SHEET_TAG = "selectCountryCodeBottomSheetTag";

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = OldDuxos.oldDuxo(this, UarSmsMfaEnrollPhoneInputDuxo.class);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2(UarSmsMfaEnrollPhoneInputFragment uarSmsMfaEnrollPhoneInputFragment, int i, Composer composer, int i2) throws Throwable {
        uarSmsMfaEnrollPhoneInputFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UarSmsMfaEnrollPhoneInputDuxo getDuxo() {
        return (UarSmsMfaEnrollPhoneInputDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) throws Throwable {
        int i2;
        Throwable thConsume;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1827959246);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1827959246, i2, -1, "com.robinhood.shared.unverifiedaccountrecovery.phone.UarSmsMfaEnrollPhoneInputFragment.ComposeContent (UarSmsMfaEnrollPhoneInputFragment.kt:22)");
            }
            SnapshotState4 snapshotState4SubscribeAsState = RxJava2Adapter.subscribeAsState(getDuxo().getStates(), new UarSmsMfaEnrollPhoneInputViewState(null, false, null, 7, null), composerStartRestartGroup, (InternationalInfo.$stable | ComposeUiEvent.$stable) << 3);
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(850315837, true, new C412081(snapshotState4SubscribeAsState), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            ComposeUiEvent<Throwable> sendInputErrorEvent = ComposeContent$lambda$0(snapshotState4SubscribeAsState).getSendInputErrorEvent();
            if (sendInputErrorEvent == null || (thConsume = sendInputErrorEvent.consume()) == null || AbsErrorHandler.handleError$default(getActivityErrorHandler(), thConsume, false, 2, null)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                throw thConsume;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.unverifiedaccountrecovery.phone.UarSmsMfaEnrollPhoneInputFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UarSmsMfaEnrollPhoneInputFragment.ComposeContent$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: UarSmsMfaEnrollPhoneInputFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.unverifiedaccountrecovery.phone.UarSmsMfaEnrollPhoneInputFragment$ComposeContent$1 */
    static final class C412081 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<UarSmsMfaEnrollPhoneInputViewState> $viewState$delegate;

        C412081(SnapshotState4<UarSmsMfaEnrollPhoneInputViewState> snapshotState4) {
            this.$viewState$delegate = snapshotState4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(850315837, i, -1, "com.robinhood.shared.unverifiedaccountrecovery.phone.UarSmsMfaEnrollPhoneInputFragment.ComposeContent.<anonymous> (UarSmsMfaEnrollPhoneInputFragment.kt:25)");
            }
            SmsMfaEnrollPhoneInputContext context = ((UserViewStatePageContext.SmsMfaEnrollPhoneInput) ((LegacyFragmentKey.PathfinderSmsMfaEnrollPhoneInput) UarSmsMfaEnrollPhoneInputFragment.INSTANCE.getArgs((Fragment) UarSmsMfaEnrollPhoneInputFragment.this)).getUserViewState().getTypeContext()).getContext();
            InternationalInfo internationalInfo = UarSmsMfaEnrollPhoneInputFragment.ComposeContent$lambda$0(this.$viewState$delegate).getInternationalInfo();
            boolean sendingInput = UarSmsMfaEnrollPhoneInputFragment.ComposeContent$lambda$0(this.$viewState$delegate).getSendingInput();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(UarSmsMfaEnrollPhoneInputFragment.this);
            final UarSmsMfaEnrollPhoneInputFragment uarSmsMfaEnrollPhoneInputFragment = UarSmsMfaEnrollPhoneInputFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.unverifiedaccountrecovery.phone.UarSmsMfaEnrollPhoneInputFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UarSmsMfaEnrollPhoneInputFragment.C412081.invoke$lambda$2$lambda$1(uarSmsMfaEnrollPhoneInputFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(UarSmsMfaEnrollPhoneInputFragment.this);
            final UarSmsMfaEnrollPhoneInputFragment uarSmsMfaEnrollPhoneInputFragment2 = UarSmsMfaEnrollPhoneInputFragment.this;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function2() { // from class: com.robinhood.shared.unverifiedaccountrecovery.phone.UarSmsMfaEnrollPhoneInputFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return UarSmsMfaEnrollPhoneInputFragment.C412081.invoke$lambda$4$lambda$3(uarSmsMfaEnrollPhoneInputFragment2, (String) obj, (CtaAction) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function2 function2 = (Function2) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composer.changedInstance(UarSmsMfaEnrollPhoneInputFragment.this);
            final UarSmsMfaEnrollPhoneInputFragment uarSmsMfaEnrollPhoneInputFragment3 = UarSmsMfaEnrollPhoneInputFragment.this;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.unverifiedaccountrecovery.phone.UarSmsMfaEnrollPhoneInputFragment$ComposeContent$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UarSmsMfaEnrollPhoneInputFragment.C412081.invoke$lambda$6$lambda$5(uarSmsMfaEnrollPhoneInputFragment3, (KeyEvent) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            UarSmsMfaEnrollPhoneInputComposable2.UarSmsMfaEnrollPhoneInputComposable(context, internationalInfo, sendingInput, function0, function2, (Function1) objRememberedValue3, composer, InternationalInfo.$stable << 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(UarSmsMfaEnrollPhoneInputFragment uarSmsMfaEnrollPhoneInputFragment) {
            Navigator navigator = uarSmsMfaEnrollPhoneInputFragment.getNavigator();
            List<InternationalInfo> sortedInternationalInfos = InternationalInfo.INSTANCE.getSortedInternationalInfos();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sortedInternationalInfos, 10));
            Iterator<T> it = sortedInternationalInfos.iterator();
            while (it.hasNext()) {
                arrayList.add(((InternationalInfo) it.next()).getCountryCode());
            }
            Navigator.DefaultImpls.createDialogFragment$default(navigator, new SelectCountryCodeFragmentKey(arrayList, false, 2, null), null, 2, null).show(uarSmsMfaEnrollPhoneInputFragment.getChildFragmentManager(), UarSmsMfaEnrollPhoneInputFragment.SELECT_COUNTRY_CODE_BOTTOM_SHEET_TAG);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3(UarSmsMfaEnrollPhoneInputFragment uarSmsMfaEnrollPhoneInputFragment, String phoneNumber, CtaAction action) {
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            Intrinsics.checkNotNullParameter(action, "action");
            uarSmsMfaEnrollPhoneInputFragment.getDuxo().sendInput(phoneNumber, action);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$5(UarSmsMfaEnrollPhoneInputFragment uarSmsMfaEnrollPhoneInputFragment, KeyEvent keyEvent) {
            Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
            uarSmsMfaEnrollPhoneInputFragment.requireView().dispatchKeyEvent(keyEvent);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.shared.common.contracts.SelectCountryCodeFragmentKey.Callbacks
    public void onCountryCodeSelected(CountryCode countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        getDuxo().setInternationalInfo(InternationalInfo.Companion.fromCountryCode$default(InternationalInfo.INSTANCE, null, countryCode, 1, null));
    }

    /* compiled from: UarSmsMfaEnrollPhoneInputFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/phone/UarSmsMfaEnrollPhoneInputFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/shared/unverifiedaccountrecovery/phone/UarSmsMfaEnrollPhoneInputFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PathfinderSmsMfaEnrollPhoneInput;", "<init>", "()V", "SELECT_COUNTRY_CODE_BOTTOM_SHEET_TAG", "", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<UarSmsMfaEnrollPhoneInputFragment, LegacyFragmentKey.PathfinderSmsMfaEnrollPhoneInput> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.PathfinderSmsMfaEnrollPhoneInput pathfinderSmsMfaEnrollPhoneInput) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, pathfinderSmsMfaEnrollPhoneInput);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.PathfinderSmsMfaEnrollPhoneInput getArgs(UarSmsMfaEnrollPhoneInputFragment uarSmsMfaEnrollPhoneInputFragment) {
            return (LegacyFragmentKey.PathfinderSmsMfaEnrollPhoneInput) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, uarSmsMfaEnrollPhoneInputFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public UarSmsMfaEnrollPhoneInputFragment newInstance(LegacyFragmentKey.PathfinderSmsMfaEnrollPhoneInput pathfinderSmsMfaEnrollPhoneInput) {
            return (UarSmsMfaEnrollPhoneInputFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, pathfinderSmsMfaEnrollPhoneInput);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(UarSmsMfaEnrollPhoneInputFragment uarSmsMfaEnrollPhoneInputFragment, LegacyFragmentKey.PathfinderSmsMfaEnrollPhoneInput pathfinderSmsMfaEnrollPhoneInput) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, uarSmsMfaEnrollPhoneInputFragment, pathfinderSmsMfaEnrollPhoneInput);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UarSmsMfaEnrollPhoneInputViewState ComposeContent$lambda$0(SnapshotState4<UarSmsMfaEnrollPhoneInputViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}

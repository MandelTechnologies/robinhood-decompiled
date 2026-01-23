package com.robinhood.android.portfolio.curatedlist.createScreenerOrList;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.robinhood.android.home.contracts.CreateScreenerOrListContract;
import com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion;
import com.robinhood.android.portfolio.curatedlist.createScreenerOrList.CreateScreenerOrListBottomSheetFragment;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: CreateScreenerOrListBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\n\u001a\u00020\u000bH\u0017¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/portfolio/curatedlist/createScreenerOrList/CreateScreenerOrListBottomSheetFragment;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/home/contracts/CreateScreenerOrListContract$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/home/contracts/CreateScreenerOrListContract$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onAttach", "context", "Landroid/content/Context;", "Companion", "lib-curated-list_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class CreateScreenerOrListBottomSheetFragment extends GenericComposeBottomSheetDialogFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(CreateScreenerOrListContract.Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.portfolio.curatedlist.createScreenerOrList.CreateScreenerOrListBottomSheetFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CreateScreenerOrListBottomSheetFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/home/contracts/CreateScreenerOrListContract$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(CreateScreenerOrListBottomSheetFragment createScreenerOrListBottomSheetFragment, int i, Composer composer, int i2) {
        createScreenerOrListBottomSheetFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public final CreateScreenerOrListContract.Callbacks getCallbacks() {
        return (CreateScreenerOrListContract.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* compiled from: CreateScreenerOrListBottomSheetFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.portfolio.curatedlist.createScreenerOrList.CreateScreenerOrListBottomSheetFragment$ComposeContent$1 */
    static final class C256371 implements Function2<Composer, Integer, Unit> {
        C256371() {
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
                ComposerKt.traceEventStart(-1366867536, i, -1, "com.robinhood.android.portfolio.curatedlist.createScreenerOrList.CreateScreenerOrListBottomSheetFragment.ComposeContent.<anonymous> (CreateScreenerOrListBottomSheetFragment.kt:23)");
            }
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(CreateScreenerOrListBottomSheetFragment.this);
            final CreateScreenerOrListBottomSheetFragment createScreenerOrListBottomSheetFragment = CreateScreenerOrListBottomSheetFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.portfolio.curatedlist.createScreenerOrList.CreateScreenerOrListBottomSheetFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CreateScreenerOrListBottomSheetFragment.C256371.invoke$lambda$1$lambda$0(createScreenerOrListBottomSheetFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(CreateScreenerOrListBottomSheetFragment.this);
            final CreateScreenerOrListBottomSheetFragment createScreenerOrListBottomSheetFragment2 = CreateScreenerOrListBottomSheetFragment.this;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.portfolio.curatedlist.createScreenerOrList.CreateScreenerOrListBottomSheetFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CreateScreenerOrListBottomSheetFragment.C256371.invoke$lambda$3$lambda$2(createScreenerOrListBottomSheetFragment2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function0 function02 = (Function0) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composer.changedInstance(CreateScreenerOrListBottomSheetFragment.this);
            final CreateScreenerOrListBottomSheetFragment createScreenerOrListBottomSheetFragment3 = CreateScreenerOrListBottomSheetFragment.this;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.portfolio.curatedlist.createScreenerOrList.CreateScreenerOrListBottomSheetFragment$ComposeContent$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CreateScreenerOrListBottomSheetFragment.C256371.invoke$lambda$5$lambda$4(createScreenerOrListBottomSheetFragment3);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            CreateScreenerOrListComposable3.CreateScreenerOrListComposable(function0, function02, (Function0) objRememberedValue3, null, composer, 0, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(CreateScreenerOrListBottomSheetFragment createScreenerOrListBottomSheetFragment) {
            createScreenerOrListBottomSheetFragment.getCallbacks().onStartCreateScreener();
            createScreenerOrListBottomSheetFragment.dismiss();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(CreateScreenerOrListBottomSheetFragment createScreenerOrListBottomSheetFragment) {
            createScreenerOrListBottomSheetFragment.getCallbacks().createNewList();
            createScreenerOrListBottomSheetFragment.dismiss();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(CreateScreenerOrListBottomSheetFragment createScreenerOrListBottomSheetFragment) {
            createScreenerOrListBottomSheetFragment.dismiss();
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(130332325);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(130332325, i2, -1, "com.robinhood.android.portfolio.curatedlist.createScreenerOrList.CreateScreenerOrListBottomSheetFragment.ComposeContent (CreateScreenerOrListBottomSheetFragment.kt:21)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1366867536, true, new C256371(), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.curatedlist.createScreenerOrList.CreateScreenerOrListBottomSheetFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CreateScreenerOrListBottomSheetFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    /* compiled from: CreateScreenerOrListBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/portfolio/curatedlist/createScreenerOrList/CreateScreenerOrListBottomSheetFragment$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/portfolio/curatedlist/createScreenerOrList/CreateScreenerOrListBottomSheetFragment;", "Lcom/robinhood/android/home/contracts/CreateScreenerOrListContract$Key;", "<init>", "()V", "lib-curated-list_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentResolverWithArgsCompanion<CreateScreenerOrListBottomSheetFragment, CreateScreenerOrListContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion, com.robinhood.android.navigation.DialogFragmentResolver
        public CreateScreenerOrListBottomSheetFragment createDialogFragment(CreateScreenerOrListContract.Key key) {
            return (CreateScreenerOrListBottomSheetFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.createDialogFragment(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public CreateScreenerOrListContract.Key getArgs(CreateScreenerOrListBottomSheetFragment createScreenerOrListBottomSheetFragment) {
            return (CreateScreenerOrListContract.Key) DialogFragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, createScreenerOrListBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CreateScreenerOrListBottomSheetFragment newInstance(CreateScreenerOrListContract.Key key) {
            return (CreateScreenerOrListBottomSheetFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CreateScreenerOrListBottomSheetFragment createScreenerOrListBottomSheetFragment, CreateScreenerOrListContract.Key key) {
            DialogFragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, createScreenerOrListBottomSheetFragment, key);
        }
    }
}

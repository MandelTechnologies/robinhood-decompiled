package com.robinhood.android.equities.equityscreener.crud.create;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.view.result.ActivityResultCaller;
import com.robinhood.android.equities.contracts.screeners.CreateScreenerContract;
import com.robinhood.android.equities.equityscreener.crud.create.CreateScreenerBottomSheetFragment;
import com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.equityscreener.models.api.ScreenerOrder;
import com.robinhood.equityscreener.models.p294db.Screener;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.NoSuchElementException;
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

/* compiled from: CreateScreenerBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\r\u001a\u00020\u000eH\u0017¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/equities/equityscreener/crud/create/CreateScreenerBottomSheetFragment;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/equities/contracts/screeners/CreateScreenerContract$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/equities/contracts/screeners/CreateScreenerContract$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "created", "Landroidx/compose/runtime/MutableState;", "", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onDismiss", "activity", "Landroid/app/Activity;", "dialog", "Landroid/content/DialogInterface;", "Companion", "lib-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CreateScreenerBottomSheetFragment extends GenericComposeBottomSheetDialogFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(CreateScreenerContract.Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.equities.equityscreener.crud.create.CreateScreenerBottomSheetFragment$special$$inlined$parentFragmentThenActivityHostCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            ActivityResultCaller parentFragment = CallbacksProperty.getParentFragment();
            if (!(parentFragment instanceof CreateScreenerContract.Callbacks)) {
                parentFragment = null;
            }
            CreateScreenerContract.Callbacks callbacks = (CreateScreenerContract.Callbacks) parentFragment;
            if (callbacks != null) {
                return callbacks;
            }
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof CreateScreenerContract.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    private final SnapshotState<Boolean> created = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CreateScreenerBottomSheetFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/equities/contracts/screeners/CreateScreenerContract$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(CreateScreenerBottomSheetFragment createScreenerBottomSheetFragment, int i, Composer composer, int i2) {
        createScreenerBottomSheetFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CreateScreenerContract.Callbacks getCallbacks() {
        return (CreateScreenerContract.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* compiled from: CreateScreenerBottomSheetFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equities.equityscreener.crud.create.CreateScreenerBottomSheetFragment$ComposeContent$1 */
    static final class C146751 implements Function2<Composer, Integer, Unit> {
        C146751() {
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
                ComposerKt.traceEventStart(-2001706489, i, -1, "com.robinhood.android.equities.equityscreener.crud.create.CreateScreenerBottomSheetFragment.ComposeContent.<anonymous> (CreateScreenerBottomSheetFragment.kt:28)");
            }
            ScreenerOrder screenerOrder = ((CreateScreenerContract.Key) CreateScreenerBottomSheetFragment.INSTANCE.getArgs((Fragment) CreateScreenerBottomSheetFragment.this)).getScreenerOrder();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(CreateScreenerBottomSheetFragment.this);
            final CreateScreenerBottomSheetFragment createScreenerBottomSheetFragment = CreateScreenerBottomSheetFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.equities.equityscreener.crud.create.CreateScreenerBottomSheetFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CreateScreenerBottomSheetFragment.C146751.invoke$lambda$1$lambda$0(createScreenerBottomSheetFragment, (Screener) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(CreateScreenerBottomSheetFragment.this);
            final CreateScreenerBottomSheetFragment createScreenerBottomSheetFragment2 = CreateScreenerBottomSheetFragment.this;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equities.equityscreener.crud.create.CreateScreenerBottomSheetFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CreateScreenerBottomSheetFragment.C146751.invoke$lambda$3$lambda$2(createScreenerBottomSheetFragment2, (Screener) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function1 function12 = (Function1) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composer.changedInstance(CreateScreenerBottomSheetFragment.this);
            final CreateScreenerBottomSheetFragment createScreenerBottomSheetFragment3 = CreateScreenerBottomSheetFragment.this;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.equities.equityscreener.crud.create.CreateScreenerBottomSheetFragment$ComposeContent$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CreateScreenerBottomSheetFragment.C146751.invoke$lambda$5$lambda$4(createScreenerBottomSheetFragment3);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            CreateScreenerComposable3.CreateScreenerComposable(screenerOrder, function1, function12, (Function0) objRememberedValue3, null, composer, 0, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(CreateScreenerBottomSheetFragment createScreenerBottomSheetFragment, Screener it) {
            Intrinsics.checkNotNullParameter(it, "it");
            createScreenerBottomSheetFragment.getCallbacks().onPresetSelected(it.getId());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(CreateScreenerBottomSheetFragment createScreenerBottomSheetFragment, Screener it) {
            Intrinsics.checkNotNullParameter(it, "it");
            createScreenerBottomSheetFragment.getCallbacks().onCreateScreenerFromPreset(it.getId());
            createScreenerBottomSheetFragment.created.setValue(Boolean.TRUE);
            createScreenerBottomSheetFragment.dismiss();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(CreateScreenerBottomSheetFragment createScreenerBottomSheetFragment) {
            createScreenerBottomSheetFragment.getCallbacks().onPresetBack();
            createScreenerBottomSheetFragment.dismiss();
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1692978994);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1692978994, i2, -1, "com.robinhood.android.equities.equityscreener.crud.create.CreateScreenerBottomSheetFragment.ComposeContent (CreateScreenerBottomSheetFragment.kt:26)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-2001706489, true, new C146751(), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.equityscreener.crud.create.CreateScreenerBottomSheetFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CreateScreenerBottomSheetFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment
    protected void onDismiss(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!this.created.getValue().booleanValue()) {
            getCallbacks().onCreateCanceled();
        }
        super.onDismiss(activity);
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        if (!this.created.getValue().booleanValue()) {
            getCallbacks().onCreateCanceled();
        }
        super.onDismiss(dialog);
    }

    /* compiled from: CreateScreenerBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equities/equityscreener/crud/create/CreateScreenerBottomSheetFragment$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/equities/equityscreener/crud/create/CreateScreenerBottomSheetFragment;", "Lcom/robinhood/android/equities/contracts/screeners/CreateScreenerContract$Key;", "<init>", "()V", "lib-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentResolverWithArgsCompanion<CreateScreenerBottomSheetFragment, CreateScreenerContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion, com.robinhood.android.navigation.DialogFragmentResolver
        public CreateScreenerBottomSheetFragment createDialogFragment(CreateScreenerContract.Key key) {
            return (CreateScreenerBottomSheetFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.createDialogFragment(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public CreateScreenerContract.Key getArgs(CreateScreenerBottomSheetFragment createScreenerBottomSheetFragment) {
            return (CreateScreenerContract.Key) DialogFragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, createScreenerBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CreateScreenerBottomSheetFragment newInstance(CreateScreenerContract.Key key) {
            return (CreateScreenerBottomSheetFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CreateScreenerBottomSheetFragment createScreenerBottomSheetFragment, CreateScreenerContract.Key key) {
            DialogFragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, createScreenerBottomSheetFragment, key);
        }
    }
}

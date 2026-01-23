package com.robinhood.android.microgramsdui;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert;
import com.robinhood.android.microgramsdui.control.UiController;
import com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion;
import com.robinhood.android.shared.serverui.utils.UiObject;
import com.robinhood.compose.app.GenericComposeDialogFragment;
import com.robinhood.microgram.sdui.MicrogramAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.shared.common.contracts.MicrogramAlertDialogFragmentKey;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import rh_server_driven_ui.p531v1.AlertDto;

/* compiled from: MicrogramAlertDialogFragment.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\r\u0010\u0010\u001a\u00020\rH\u0017¢\u0006\u0002\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0082@¢\u0006\u0002\u0010\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/microgramsdui/MicrogramAlertDialogFragment;", "Lcom/robinhood/compose/app/GenericComposeDialogFragment;", "<init>", "()V", "microgramManager", "Lcom/robinhood/android/microgramsdui/RealMicrogramManager;", "getMicrogramManager", "()Lcom/robinhood/android/microgramsdui/RealMicrogramManager;", "setMicrogramManager", "(Lcom/robinhood/android/microgramsdui/RealMicrogramManager;)V", "instance", "Lcom/robinhood/android/microgramsdui/MicrogramInstance;", "onAttach", "", "context", "Landroid/content/Context;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "action", "Lcom/robinhood/microgram/sdui/MicrogramAction;", "(Lcom/robinhood/microgram/sdui/MicrogramAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "lib-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MicrogramAlertDialogFragment extends GenericComposeDialogFragment {
    private MicrogramManager2 instance;
    public MicrogramManager4 microgramManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: MicrogramAlertDialogFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.MicrogramAlertDialogFragment", m3645f = "MicrogramAlertDialogFragment.kt", m3646l = {61, 61}, m3647m = "action")
    /* renamed from: com.robinhood.android.microgramsdui.MicrogramAlertDialogFragment$action$1 */
    static final class C218551 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C218551(Continuation<? super C218551> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MicrogramAlertDialogFragment.this.action(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$13(MicrogramAlertDialogFragment microgramAlertDialogFragment, int i, Composer composer, int i2) {
        microgramAlertDialogFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public final MicrogramManager4 getMicrogramManager() {
        MicrogramManager4 microgramManager4 = this.microgramManager;
        if (microgramManager4 != null) {
            return microgramManager4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("microgramManager");
        return null;
    }

    public final void setMicrogramManager(MicrogramManager4 microgramManager4) {
        Intrinsics.checkNotNullParameter(microgramManager4, "<set-?>");
        this.microgramManager = microgramManager4;
    }

    @Override // com.robinhood.compose.app.GenericComposeDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        MicrogramManager2 instanceOrNull = getMicrogramManager().getInstanceOrNull(((MicrogramAlertDialogFragmentKey) INSTANCE.getArgs((Fragment) this)).getId());
        if (instanceOrNull != null) {
            this.instance = instanceOrNull;
        } else {
            dismiss();
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(364912797);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(364912797, i2, -1, "com.robinhood.android.microgramsdui.MicrogramAlertDialogFragment.ComposeContent (MicrogramAlertDialogFragment.kt:33)");
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.microgramsdui.MicrogramAlertDialogFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(MicrogramAlertDialogFragment.ComposeContent$lambda$1$lambda$0(this.f$0, (MicrogramAction) obj));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final Function1 function1 = (Function1) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            UiObject<GenericAlertContent<MicrogramAction>, AlertDto> alert = ((MicrogramAlertDialogFragmentKey) INSTANCE.getArgs((Fragment) this)).getAlert();
            if (alert instanceof UiObject.Legacy) {
                composerStartRestartGroup.startReplaceGroup(-1506109950);
                SduiAlert sduiAlert = SduiAlert.INSTANCE;
                GenericAlertContent genericAlertContent = (GenericAlertContent) ((UiObject.Legacy) alert).getValue();
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChanged = composerStartRestartGroup.changed(function1);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new SduiActionHandler() { // from class: com.robinhood.android.microgramsdui.MicrogramAlertDialogFragment$ComposeContent$1$1
                        @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                        /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                        public final boolean mo15941handle(MicrogramAction it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return function1.invoke(new MicrogramAction(it.getIdentifier())).booleanValue();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                SduiActionHandler sduiActionHandler = (SduiActionHandler) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChanged2 = composerStartRestartGroup.changed(function1);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.microgramsdui.MicrogramAlertDialogFragment$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MicrogramAlertDialogFragment.ComposeContent$lambda$4$lambda$3(function1, (String) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                Function1<? super String, Unit> function12 = (Function1) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.microgramsdui.MicrogramAlertDialogFragment$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MicrogramAlertDialogFragment.ComposeContent$lambda$6$lambda$5(this.f$0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                sduiAlert.Dialog(genericAlertContent, sduiActionHandler, function12, (Function0) objRememberedValue4, composerStartRestartGroup, SduiAlert.$stable << 12, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(alert instanceof UiObject.Idl)) {
                    composerStartRestartGroup.startReplaceGroup(-1506111931);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-1506100161);
                SduiAlert sduiAlert2 = SduiAlert.INSTANCE;
                AlertDto alertDto = (AlertDto) ((UiObject.Idl) alert).getValue();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = MicrogramAlertDialogFragment3.INSTANCE;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceGroup();
                Function1 function13 = (Function1) ((KFunction) objRememberedValue5);
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChanged3 = composerStartRestartGroup.changed(function1);
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChanged3 || objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new SduiActionHandler() { // from class: com.robinhood.android.microgramsdui.MicrogramAlertDialogFragment$ComposeContent$5$1
                        @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                        /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                        public final boolean mo15941handle(MicrogramAction it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return function1.invoke(new MicrogramAction(it.getIdentifier())).booleanValue();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                SduiActionHandler sduiActionHandler2 = (SduiActionHandler) objRememberedValue6;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChanged4 = composerStartRestartGroup.changed(function1);
                Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (zChanged4 || objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = new Function1() { // from class: com.robinhood.android.microgramsdui.MicrogramAlertDialogFragment$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MicrogramAlertDialogFragment.ComposeContent$lambda$10$lambda$9(function1, (String) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                Function1<? super String, Unit> function14 = objRememberedValue7;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(this);
                Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance3 || objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = new Function0() { // from class: com.robinhood.android.microgramsdui.MicrogramAlertDialogFragment$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MicrogramAlertDialogFragment.ComposeContent$lambda$12$lambda$11(this.f$0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                composerStartRestartGroup.endReplaceGroup();
                sduiAlert2.Dialog(alertDto, function13, sduiActionHandler2, function14, (Function0<Unit>) objRememberedValue8, composerStartRestartGroup, (SduiAlert.$stable << 15) | 48, 0);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.microgramsdui.MicrogramAlertDialogFragment$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MicrogramAlertDialogFragment.ComposeContent$lambda$13(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ComposeContent$lambda$1$lambda$0(MicrogramAlertDialogFragment microgramAlertDialogFragment, MicrogramAction it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BuildersKt__Builders_commonKt.launch$default(microgramAlertDialogFragment.getLifecycleScope(), null, null, new MicrogramAlertDialogFragment5(microgramAlertDialogFragment, it, null), 3, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$4$lambda$3(Function1 function1, String uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        function1.invoke(new MicrogramAction(uri));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$6$lambda$5(MicrogramAlertDialogFragment microgramAlertDialogFragment) {
        microgramAlertDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$10$lambda$9(Function1 function1, String uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        function1.invoke(new MicrogramAction(uri));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$12$lambda$11(MicrogramAlertDialogFragment microgramAlertDialogFragment) {
        microgramAlertDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        if (((com.robinhood.android.microgramsdui.control.UiController) r8).notifyRouterAlertActionTriggered(r2, r7, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object action(MicrogramAction microgramAction, Continuation<? super Unit> continuation) {
        C218551 c218551;
        if (continuation instanceof C218551) {
            c218551 = (C218551) continuation;
            int i = c218551.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c218551.label = i - Integer.MIN_VALUE;
            } else {
                c218551 = new C218551(continuation);
            }
        }
        Object objUiController = c218551.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c218551.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUiController);
            UiController.Companion companion = UiController.INSTANCE;
            MicrogramManager2 microgramManager2 = this.instance;
            if (microgramManager2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("instance");
                microgramManager2 = null;
            }
            c218551.L$0 = microgramAction;
            c218551.label = 1;
            objUiController = companion.uiController(microgramManager2, c218551);
            if (objUiController != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUiController);
            return Unit.INSTANCE;
        }
        microgramAction = (MicrogramAction) c218551.L$0;
        ResultKt.throwOnFailure(objUiController);
        String routerIdentifier = ((MicrogramAlertDialogFragmentKey) INSTANCE.getArgs((Fragment) this)).getRouterIdentifier();
        String identifier = microgramAction.getIdentifier();
        c218551.L$0 = null;
        c218551.label = 2;
    }

    /* compiled from: MicrogramAlertDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/microgramsdui/MicrogramAlertDialogFragment$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/microgramsdui/MicrogramAlertDialogFragment;", "Lcom/robinhood/shared/common/contracts/MicrogramAlertDialogFragmentKey;", "<init>", "()V", "lib-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentResolverWithArgsCompanion<MicrogramAlertDialogFragment, MicrogramAlertDialogFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion, com.robinhood.android.navigation.DialogFragmentResolver
        public MicrogramAlertDialogFragment createDialogFragment(MicrogramAlertDialogFragmentKey microgramAlertDialogFragmentKey) {
            return (MicrogramAlertDialogFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.createDialogFragment(this, microgramAlertDialogFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public MicrogramAlertDialogFragmentKey getArgs(MicrogramAlertDialogFragment microgramAlertDialogFragment) {
            return (MicrogramAlertDialogFragmentKey) DialogFragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, microgramAlertDialogFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MicrogramAlertDialogFragment newInstance(MicrogramAlertDialogFragmentKey microgramAlertDialogFragmentKey) {
            return (MicrogramAlertDialogFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, microgramAlertDialogFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MicrogramAlertDialogFragment microgramAlertDialogFragment, MicrogramAlertDialogFragmentKey microgramAlertDialogFragmentKey) {
            DialogFragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, microgramAlertDialogFragment, microgramAlertDialogFragmentKey);
        }
    }
}

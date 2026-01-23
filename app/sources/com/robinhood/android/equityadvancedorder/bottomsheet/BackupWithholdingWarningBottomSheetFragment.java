package com.robinhood.android.equityadvancedorder.bottomsheet;

import android.os.Bundle;
import android.view.View;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.FragmentActivity;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.equityadvancedorder.C15237R;
import com.robinhood.android.equityadvancedorder.databinding.FragmentTaxWarningBottomSheetBinding;
import com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.models.p320db.bonfire.WithholdingInfoSheet;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.ServerDrivenButton;
import com.robinhood.store.base.BackupWithholdingStore;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import io.noties.markwon.Markwon;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: BackupWithholdingWarningBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\r\u0010!\u001a\u00020\u001cH\u0003¢\u0006\u0002\u0010\"J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/equityadvancedorder/bottomsheet/BackupWithholdingWarningBottomSheetFragment;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "Lcom/robinhood/android/serverclientcomponents/actionbutton/ClientComponentButtonView$Callbacks;", "<init>", "()V", "binding", "Lcom/robinhood/android/equityadvancedorder/databinding/FragmentTaxWarningBottomSheetBinding;", "getBinding", "()Lcom/robinhood/android/equityadvancedorder/databinding/FragmentTaxWarningBottomSheetBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "backupWithholdingStore", "Lcom/robinhood/store/base/BackupWithholdingStore;", "getBackupWithholdingStore", "()Lcom/robinhood/store/base/BackupWithholdingStore;", "setBackupWithholdingStore", "(Lcom/robinhood/store/base/BackupWithholdingStore;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "buttonAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/serverclientcomponents/actionbutton/ClientComponentButtonView;", "Lcom/robinhood/models/serverdriven/db/ServerDrivenButton;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Loading", "(Landroidx/compose/runtime/Composer;I)V", "onActionClicked", "", "button", "lib-equity-advanced-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class BackupWithholdingWarningBottomSheetFragment extends BaseBottomSheetDialogFragment implements ClientComponentButtonView.Callbacks {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(BackupWithholdingWarningBottomSheetFragment.class, "binding", "getBinding()Lcom/robinhood/android/equityadvancedorder/databinding/FragmentTaxWarningBottomSheetBinding;", 0))};
    public static final int $stable = 8;
    public BackupWithholdingStore backupWithholdingStore;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final GenericListAdapter<ClientComponentButtonView, ServerDrivenButton> buttonAdapter;
    public Markwon markwon;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Loading$lambda$4(BackupWithholdingWarningBottomSheetFragment backupWithholdingWarningBottomSheetFragment, int i, Composer composer, int i2) {
        backupWithholdingWarningBottomSheetFragment.Loading(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public BackupWithholdingWarningBottomSheetFragment() {
        super(C15237R.layout.fragment_tax_warning_bottom_sheet);
        this.binding = ViewBinding5.viewBinding(this, BackupWithholdingWarningBottomSheetFragment2.INSTANCE);
        GenericListAdapter.Companion companion = GenericListAdapter.INSTANCE;
        ClientComponentButtonView.Companion companion2 = ClientComponentButtonView.INSTANCE;
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        this.buttonAdapter = companion.m2987of(companion2, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.equityadvancedorder.bottomsheet.BackupWithholdingWarningBottomSheetFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BackupWithholdingWarningBottomSheetFragment.buttonAdapter$lambda$0(this.f$0, (ClientComponentButtonView) obj, (ServerDrivenButton) obj2);
            }
        });
    }

    private final FragmentTaxWarningBottomSheetBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentTaxWarningBottomSheetBinding) value;
    }

    public final BackupWithholdingStore getBackupWithholdingStore() {
        BackupWithholdingStore backupWithholdingStore = this.backupWithholdingStore;
        if (backupWithholdingStore != null) {
            return backupWithholdingStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("backupWithholdingStore");
        return null;
    }

    public final void setBackupWithholdingStore(BackupWithholdingStore backupWithholdingStore) {
        Intrinsics.checkNotNullParameter(backupWithholdingStore, "<set-?>");
        this.backupWithholdingStore = backupWithholdingStore;
    }

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buttonAdapter$lambda$0(BackupWithholdingWarningBottomSheetFragment backupWithholdingWarningBottomSheetFragment, ClientComponentButtonView of, ServerDrivenButton serverButton) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(serverButton, "serverButton");
        of.bind(serverButton);
        of.setCallbacks(backupWithholdingWarningBottomSheetFragment);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ComposeView loadingView = getBinding().loadingView;
        Intrinsics.checkNotNullExpressionValue(loadingView, "loadingView");
        loadingView.setVisibility(0);
        getBinding().loadingView.setContent(ComposableLambda3.composableLambdaInstance(-518263120, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equityadvancedorder.bottomsheet.BackupWithholdingWarningBottomSheetFragment.onViewCreated.1
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
                    ComposerKt.traceEventStart(-518263120, i, -1, "com.robinhood.android.equityadvancedorder.bottomsheet.BackupWithholdingWarningBottomSheetFragment.onViewCreated.<anonymous> (BackupWithholdingWarningBottomSheetFragment.kt:55)");
                }
                Boolean bool = Boolean.TRUE;
                final BackupWithholdingWarningBottomSheetFragment backupWithholdingWarningBottomSheetFragment = BackupWithholdingWarningBottomSheetFragment.this;
                BentoTheme2.BentoTheme(null, null, null, null, null, bool, null, null, ComposableLambda3.rememberComposableLambda(1756349944, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equityadvancedorder.bottomsheet.BackupWithholdingWarningBottomSheetFragment.onViewCreated.1.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1756349944, i2, -1, "com.robinhood.android.equityadvancedorder.bottomsheet.BackupWithholdingWarningBottomSheetFragment.onViewCreated.<anonymous>.<anonymous> (BackupWithholdingWarningBottomSheetFragment.kt:56)");
                        }
                        backupWithholdingWarningBottomSheetFragment.Loading(composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getBackupWithholdingStore().getTaxWithholdingInfoSheet()), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.equityadvancedorder.bottomsheet.BackupWithholdingWarningBottomSheetFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BackupWithholdingWarningBottomSheetFragment.onViewCreated$lambda$2(this.f$0, (WithholdingInfoSheet) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.equityadvancedorder.bottomsheet.BackupWithholdingWarningBottomSheetFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BackupWithholdingWarningBottomSheetFragment.onViewCreated$lambda$3(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(BackupWithholdingWarningBottomSheetFragment backupWithholdingWarningBottomSheetFragment, WithholdingInfoSheet infoSheetState) {
        Intrinsics.checkNotNullParameter(infoSheetState, "infoSheetState");
        FragmentTaxWarningBottomSheetBinding binding = backupWithholdingWarningBottomSheetFragment.getBinding();
        binding.loadingView.setVisibility(8);
        binding.bottomSheetTitleTxt.setText(infoSheetState.getTitle());
        binding.bottomSheetDescriptionTxt.setText(backupWithholdingWarningBottomSheetFragment.getMarkwon().toMarkdown(infoSheetState.getDescriptionMarkdown()));
        binding.bottomSheetButtonRecyclerview.setAdapter(backupWithholdingWarningBottomSheetFragment.buttonAdapter);
        backupWithholdingWarningBottomSheetFragment.buttonAdapter.submitList(infoSheetState.getFooterButtons());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(BackupWithholdingWarningBottomSheetFragment backupWithholdingWarningBottomSheetFragment, Throwable throwable) throws Throwable {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = backupWithholdingWarningBottomSheetFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, throwable, true, false, 0, null, 56, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Loading(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-987791695);
        if ((i & 1) != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-987791695, i, -1, "com.robinhood.android.equityadvancedorder.bottomsheet.BackupWithholdingWarningBottomSheetFragment.Loading (BackupWithholdingWarningBottomSheetFragment.kt:85)");
            }
            LocalShowPlaceholder.Loadable(true, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, BackupWithholdingWarningBottomSheetFragment3.INSTANCE.getLambda$1269083201$lib_equity_advanced_order_externalDebug(), composerStartRestartGroup, 3126, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equityadvancedorder.bottomsheet.BackupWithholdingWarningBottomSheetFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BackupWithholdingWarningBottomSheetFragment.Loading$lambda$4(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView.Callbacks
    public boolean onActionClicked(ServerDrivenButton button) {
        Intrinsics.checkNotNullParameter(button, "button");
        if (!Intrinsics.areEqual(button.getTypedAction(), GenericAction.DismissAction.INSTANCE)) {
            return false;
        }
        dismiss();
        return true;
    }
}

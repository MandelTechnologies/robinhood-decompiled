package com.robinhood.android.pathfinder.sdui.p212ui;

import android.net.Uri;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.Spanned;
import android.widget.TextView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.FragmentManager;
import coil.compose.LocalImageLoader;
import coil.compose.LocalImageLoader2;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragmentHost;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiPageTemplate;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiStateHandler2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiStateHandler3;
import com.robinhood.android.pathfinder.sdui.p212ui.PathfinderSduiComposable;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.CoilUtils2;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.models.serverdriven.experimental.api.AlertAction;
import com.robinhood.models.serverdriven.experimental.api.DataRowStacked;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertMobilePresentationStyle;
import com.robinhood.models.serverdriven.experimental.api.PageTemplate;
import com.robinhood.models.serverdriven.experimental.api.PathfinderAction;
import com.robinhood.models.serverdriven.experimental.api.RichText;
import com.robinhood.models.serverdriven.experimental.api.SimplePageTemplate;
import com.robinhood.models.serverdriven.experimental.api.Text;
import io.noties.markwon.Markwon;
import io.noties.markwon.MarkwonConfiguration;
import io.noties.markwon.MarkwonPlugin;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Standard2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.commonmark.node.Node;

/* compiled from: PathfinderSduiComposable.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001a\u0095\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\t2$\u0010\u000f\u001a \u0012\u0004\u0012\u00020\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012\u0012\u0004\u0012\u00020\u00010\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\tH\u0001¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0018\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0019¨\u0006\u001a²\u0006\u0012\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cX\u008a\u008e\u0002"}, m3636d2 = {"PathfinderSduiComposable", "", "viewState", "Lcom/robinhood/android/pathfinder/sdui/ui/PathfinderSduiViewState;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "markwon", "Lio/noties/markwon/Markwon;", "onDeeplink", "Lkotlin/Function1;", "Landroid/net/Uri;", "onDismiss", "Lkotlin/Function0;", "onUpdateBackend", "Lcom/robinhood/models/serverdriven/experimental/api/PathfinderAction$UpdateBackend;", "onSubmitForm", "Lkotlin/Function2;", "Lcom/robinhood/models/serverdriven/experimental/api/PathfinderAction$SubmitForm;", "", "", "", "onBottomSheet", "Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragmentHost$SheetListener;", "(Lcom/robinhood/android/pathfinder/sdui/ui/PathfinderSduiViewState;Landroidx/fragment/app/FragmentManager;Lio/noties/markwon/Markwon;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "PathfinderSduiComposablePreview", "(Landroidx/compose/runtime/Composer;I)V", "feature-pathfinder-sdui_externalRelease", "alertState", "Lcom/robinhood/models/serverdriven/experimental/api/AlertAction;", "Lcom/robinhood/models/serverdriven/experimental/api/PathfinderAction;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class PathfinderSduiComposable {

    /* compiled from: PathfinderSduiComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GenericAlertMobilePresentationStyle.values().length];
            try {
                iArr[GenericAlertMobilePresentationStyle.MODAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GenericAlertMobilePresentationStyle.BOTTOM_SHEET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PathfinderSduiComposable$lambda$10(PathfinderSduiViewState pathfinderSduiViewState, FragmentManager fragmentManager, Markwon markwon, Function1 function1, Function0 function0, Function1 function12, Function2 function2, Function1 function13, int i, Composer composer, int i2) {
        PathfinderSduiComposable(pathfinderSduiViewState, fragmentManager, markwon, function1, function0, function12, function2, function13, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PathfinderSduiComposablePreview$lambda$11(int i, Composer composer, int i2) {
        PathfinderSduiComposablePreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void PathfinderSduiComposable(final PathfinderSduiViewState viewState, final FragmentManager fragmentManager, final Markwon markwon, final Function1<? super Uri, Unit> onDeeplink, final Function0<Unit> onDismiss, final Function1<? super PathfinderAction.UpdateBackend, Unit> onUpdateBackend, final Function2<? super PathfinderAction.SubmitForm, ? super Map<String, ? extends Object>, Unit> onSubmitForm, final Function1<? super RhBottomSheetDialogFragmentHost.SheetListener, Unit> onBottomSheet, Composer composer, final int i) {
        int i2;
        final SduiStateHandler3 sduiStateHandler3;
        Composer composer2;
        int i3;
        int i4;
        Composer composer3;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(onDeeplink, "onDeeplink");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onUpdateBackend, "onUpdateBackend");
        Intrinsics.checkNotNullParameter(onSubmitForm, "onSubmitForm");
        Intrinsics.checkNotNullParameter(onBottomSheet, "onBottomSheet");
        Composer composerStartRestartGroup = composer.startRestartGroup(2001929369);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(fragmentManager) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(markwon) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDeeplink) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDismiss) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onUpdateBackend) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSubmitForm) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onBottomSheet) ? 8388608 : 4194304;
        }
        if ((4793491 & i2) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer3 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2001929369, i2, -1, "com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiComposable (PathfinderSduiComposable.kt:47)");
            }
            SduiStateHandler3 sduiStateHandler3RememberStateHandler = SduiStateHandler2.rememberStateHandler(composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance = ((i2 & 3670016) == 1048576) | ((i2 & 7168) == 2048) | ((57344 & i2) == 16384) | ((458752 & i2) == 131072) | composerStartRestartGroup.changedInstance(sduiStateHandler3RememberStateHandler);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                sduiStateHandler3 = sduiStateHandler3RememberStateHandler;
                Function1 function1 = new Function1() { // from class: com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(PathfinderSduiComposable.PathfinderSduiComposable$lambda$4$lambda$3(onDeeplink, onDismiss, onUpdateBackend, sduiStateHandler3, onSubmitForm, snapshotState, (PathfinderAction) obj));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function1);
                objRememberedValue2 = function1;
            } else {
                sduiStateHandler3 = sduiStateHandler3RememberStateHandler;
            }
            final Function1 function12 = (Function1) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            PageTemplate<PathfinderAction> pageTemplate = viewState.getPageTemplate();
            if (viewState.getShowLoading()) {
                composerStartRestartGroup.startReplaceGroup(-436583623);
                LoadingScreenComposablesKt.GenericLoadingScreenComposable(null, false, composerStartRestartGroup, 0, 3);
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                i3 = 2;
                i4 = 1;
            } else if (pageTemplate != null) {
                composerStartRestartGroup.startReplaceGroup(-436500078);
                i3 = 2;
                i4 = 1;
                composer2 = composerStartRestartGroup;
                CompositionLocal3.CompositionLocalProvider(LocalImageLoader.m9117providesimpl(LocalImageLoader2.getLocalImageLoader(), CoilUtils2.rememberImageLoader(0.0d, null, composerStartRestartGroup, 0, 3)), ComposableLambda3.rememberComposableLambda(-73218851, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiComposableKt.PathfinderSduiComposable.1
                    public final void invoke(Composer composer4, int i5) {
                        if ((i5 & 3) == 2 && composer4.getSkipping()) {
                            composer4.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-73218851, i5, -1, "com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiComposable.<anonymous> (PathfinderSduiComposable.kt:79)");
                        }
                        PageTemplate<PathfinderAction> pageTemplate2 = viewState.getPageTemplate();
                        SduiStateHandler3 sduiStateHandler32 = sduiStateHandler3;
                        PathfinderSduiComposable4 pathfinderSduiComposable4 = new PathfinderSduiComposable4(function12);
                        int i6 = SduiStateHandler3.$stable << 3;
                        composer4.startReplaceGroup(-971110865);
                        SduiPageTemplate.SduiPageTemplate(pageTemplate2, sduiStateHandler32, pathfinderSduiComposable4, PathfinderAction.class, composer4, i6 & 1022, 0);
                        composer4.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                        invoke(composer4, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composer2, 54), composer2, ProvidedValue.$stable | 48);
                composer2.endReplaceGroup();
            } else {
                composer2 = composerStartRestartGroup;
                i3 = 2;
                i4 = 1;
                composer2.startReplaceGroup(-436201207);
                composer2.endReplaceGroup();
            }
            AlertAction<PathfinderAction> alertActionPathfinderSduiComposable$lambda$1 = PathfinderSduiComposable$lambda$1(snapshotState);
            if (alertActionPathfinderSduiComposable$lambda$1 == null) {
                composer3 = composer2;
            } else {
                int i5 = WhenMappings.$EnumSwitchMapping$0[alertActionPathfinderSduiComposable$lambda$1.getMobile_presentation_style().ordinal()];
                if (i5 == i4) {
                    composer3 = composer2;
                    composer3.startReplaceGroup(822139615);
                    SduiAlert sduiAlert = SduiAlert.INSTANCE;
                    Parcelable alert = alertActionPathfinderSduiComposable$lambda$1.getAlert();
                    PathfinderSduiComposable4 pathfinderSduiComposable4 = new PathfinderSduiComposable4(function12);
                    composer3.startReplaceGroup(5004770);
                    Object objRememberedValue3 = composer3.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return PathfinderSduiComposable.PathfinderSduiComposable$lambda$9$lambda$6$lambda$5(snapshotState);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue3);
                    }
                    composer3.endReplaceGroup();
                    sduiAlert.Dialog(alert, pathfinderSduiComposable4, null, (Function0) objRememberedValue3, composer3, (SduiAlert.$stable << 12) | 3072, 4);
                    composer3.endReplaceGroup();
                } else {
                    if (i5 != i3) {
                        Composer composer4 = composer2;
                        composer4.startReplaceGroup(-1774597447);
                        composer4.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer2.startReplaceGroup(822398682);
                    SduiAlert sduiAlert2 = SduiAlert.INSTANCE;
                    GenericAlertContent<ActionT> alert2 = alertActionPathfinderSduiComposable$lambda$1.getAlert();
                    PathfinderSduiComposable4 pathfinderSduiComposable42 = new PathfinderSduiComposable4(function12);
                    composer2.startReplaceGroup(5004770);
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiComposableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return PathfinderSduiComposable.PathfinderSduiComposable$lambda$9$lambda$8$lambda$7(snapshotState);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    Function0 function0 = (Function0) objRememberedValue4;
                    composer2.endReplaceGroup();
                    Composer composer5 = composer2;
                    onBottomSheet.invoke(sduiAlert2.sheetListener(fragmentManager, markwon, alert2, pathfinderSduiComposable42, (Function0<Unit>) function0, (Function1<? super String, Unit>) ((2016 & 32) != 0 ? new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return SduiAlert.sheetListener$lambda$16((String) obj2);
                        }
                    } : null), (Function1<? super String, Unit>) ((2016 & 64) != 0 ? new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return SduiAlert.sheetListener$lambda$17((String) obj2);
                        }
                    } : null), (2016 & 128) != 0 ? false : false, (2016 & 256) != 0 ? false : false, (2016 & 512) != 0, (2016 & 1024) != 0 ? null : null));
                    composer5.endReplaceGroup();
                    composer3 = composer5;
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PathfinderSduiComposable.PathfinderSduiComposable$lambda$10(viewState, fragmentManager, markwon, onDeeplink, onDismiss, onUpdateBackend, onSubmitForm, onBottomSheet, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean PathfinderSduiComposable$lambda$4$lambda$3(Function1 function1, Function0 function0, Function1 function12, SduiStateHandler3 sduiStateHandler3, Function2 function2, SnapshotState snapshotState, PathfinderAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        snapshotState.setValue(null);
        if (action instanceof PathfinderAction.Deeplink) {
            function1.invoke(Uri.parse(((PathfinderAction.Deeplink) action).getValue2().getUri()));
        } else if (action instanceof PathfinderAction.Dismiss) {
            function0.invoke();
        } else if (!(action instanceof PathfinderAction.InfoAlert)) {
            if (action instanceof PathfinderAction.UpdateBackend) {
                function12.invoke(action);
            } else {
                if (!(action instanceof PathfinderAction.SubmitForm)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (sduiStateHandler3.validateComponents(((PathfinderAction.SubmitForm) action).getValue2().getValidate_on_submit(), true)) {
                    function2.invoke(action, sduiStateHandler3.serverValueStates());
                }
            }
        } else {
            snapshotState.setValue(((PathfinderAction.InfoAlert) action).getValue2());
        }
        return true;
    }

    private static final AlertAction<PathfinderAction> PathfinderSduiComposable$lambda$1(SnapshotState<AlertAction<PathfinderAction>> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PathfinderSduiComposable$lambda$9$lambda$6$lambda$5(SnapshotState snapshotState) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PathfinderSduiComposable$lambda$9$lambda$8$lambda$7(SnapshotState snapshotState) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiComposableKt$PathfinderSduiComposablePreview$mockMarkwon$1] */
    /* JADX WARN: Type inference failed for: r13v2, types: [com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiComposableKt$PathfinderSduiComposablePreview$mockFragmentManager$1] */
    private static final void PathfinderSduiComposablePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-295044740);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-295044740, i, -1, "com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiComposablePreview (PathfinderSduiComposable.kt:115)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(473125684, true, new C254171(new FragmentManager() { // from class: com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiComposableKt$PathfinderSduiComposablePreview$mockFragmentManager$1
            }, new Markwon() { // from class: com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiComposableKt$PathfinderSduiComposablePreview$mockMarkwon$1
                @Override // io.noties.markwon.Markwon
                public /* bridge */ /* synthetic */ MarkwonConfiguration configuration() {
                    return (MarkwonConfiguration) m17573configuration();
                }

                @Override // io.noties.markwon.Markwon
                public /* bridge */ /* synthetic */ MarkwonPlugin getPlugin(Class cls) {
                    return (MarkwonPlugin) m17574getPlugin(cls);
                }

                @Override // io.noties.markwon.Markwon
                /* renamed from: getPlugins, reason: collision with other method in class */
                public /* bridge */ /* synthetic */ List mo17575getPlugins() {
                    return (List) getPlugins();
                }

                @Override // io.noties.markwon.Markwon
                /* renamed from: hasPlugin, reason: collision with other method in class */
                public /* bridge */ /* synthetic */ boolean mo17576hasPlugin(Class cls) {
                    return ((Boolean) hasPlugin((Class<? extends MarkwonPlugin>) cls)).booleanValue();
                }

                @Override // io.noties.markwon.Markwon
                /* renamed from: parse, reason: collision with other method in class */
                public /* bridge */ /* synthetic */ Node mo17577parse(String str) {
                    return (Node) parse(str);
                }

                @Override // io.noties.markwon.Markwon
                public /* bridge */ /* synthetic */ Spanned render(Node node) {
                    return (Spanned) m17578render(node);
                }

                @Override // io.noties.markwon.Markwon
                public /* bridge */ /* synthetic */ MarkwonPlugin requirePlugin(Class cls) {
                    return (MarkwonPlugin) m17579requirePlugin(cls);
                }

                @Override // io.noties.markwon.Markwon
                public Spanned toMarkdown(String input) {
                    Intrinsics.checkNotNullParameter(input, "input");
                    return new SpannableString(input);
                }

                public Void parse(String input) {
                    Intrinsics.checkNotNullParameter(input, "input");
                    throw new Standard2("This is a fake");
                }

                /* renamed from: render, reason: collision with other method in class */
                public Void m17578render(Node node) {
                    Intrinsics.checkNotNullParameter(node, "node");
                    throw new Standard2("This is a fake");
                }

                @Override // io.noties.markwon.Markwon
                /* renamed from: setMarkdown, reason: merged with bridge method [inline-methods] */
                public Void mo17580setMarkdown(TextView textView, String markdown) {
                    Intrinsics.checkNotNullParameter(textView, "textView");
                    Intrinsics.checkNotNullParameter(markdown, "markdown");
                    throw new Standard2("This is a fake");
                }

                @Override // io.noties.markwon.Markwon
                public void setParsedMarkdown(TextView textView, Spanned markdown) {
                    Intrinsics.checkNotNullParameter(textView, "textView");
                    Intrinsics.checkNotNullParameter(markdown, "markdown");
                    throw new Standard2("This is a fake");
                }

                public Void hasPlugin(Class<? extends MarkwonPlugin> plugin) {
                    Intrinsics.checkNotNullParameter(plugin, "plugin");
                    throw new Standard2("This is a fake");
                }

                /* renamed from: getPlugin, reason: collision with other method in class */
                public <P extends MarkwonPlugin> Void m17574getPlugin(Class<P> type2) {
                    Intrinsics.checkNotNullParameter(type2, "type");
                    throw new Standard2("This is a fake");
                }

                /* renamed from: requirePlugin, reason: collision with other method in class */
                public <P extends MarkwonPlugin> Void m17579requirePlugin(Class<P> type2) {
                    Intrinsics.checkNotNullParameter(type2, "type");
                    throw new Standard2("This is a fake");
                }

                public Void getPlugins() {
                    throw new Standard2("This is a fake");
                }

                /* renamed from: configuration, reason: collision with other method in class */
                public Void m17573configuration() {
                    throw new Standard2("This is a fake");
                }
            }), composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PathfinderSduiComposable.PathfinderSduiComposablePreview$lambda$11(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: PathfinderSduiComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiComposableKt$PathfinderSduiComposablePreview$1 */
    static final class C254171 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ PathfinderSduiComposable2 $mockFragmentManager;
        final /* synthetic */ PathfinderSduiComposable3 $mockMarkwon;

        C254171(PathfinderSduiComposable2 pathfinderSduiComposable2, PathfinderSduiComposable3 pathfinderSduiComposable3) {
            this.$mockFragmentManager = pathfinderSduiComposable2;
            this.$mockMarkwon = pathfinderSduiComposable3;
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
                ComposerKt.traceEventStart(473125684, i, -1, "com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiComposablePreview.<anonymous> (PathfinderSduiComposable.kt:158)");
            }
            PathfinderSduiViewState pathfinderSduiViewState = new PathfinderSduiViewState(new SimplePageTemplate("My Page", CollectionsKt.listOf(new Text(new RichText("A header", CollectionsKt.emptyList()), null, null, null, null, 30, null)), null, CollectionsKt.listOf(new DataRowStacked("An Item", null, null, "Some detail", null, null, 54, null))), true, null, 4, null);
            PathfinderSduiComposable2 pathfinderSduiComposable2 = this.$mockFragmentManager;
            PathfinderSduiComposable3 pathfinderSduiComposable3 = this.$mockMarkwon;
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiComposableKt$PathfinderSduiComposablePreview$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PathfinderSduiComposable.C254171.invoke$lambda$1$lambda$0((Uri) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiComposableKt$PathfinderSduiComposablePreview$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function0 function0 = (Function0) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiComposableKt$PathfinderSduiComposablePreview$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PathfinderSduiComposable.C254171.invoke$lambda$5$lambda$4((PathfinderAction.UpdateBackend) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            Function1 function12 = (Function1) objRememberedValue3;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function2() { // from class: com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiComposableKt$PathfinderSduiComposablePreview$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PathfinderSduiComposable.C254171.invoke$lambda$7$lambda$6((PathfinderAction.SubmitForm) obj, (Map) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            Function2 function2 = (Function2) objRememberedValue4;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue5 = composer.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new Function1() { // from class: com.robinhood.android.pathfinder.sdui.ui.PathfinderSduiComposableKt$PathfinderSduiComposablePreview$1$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PathfinderSduiComposable.C254171.invoke$lambda$9$lambda$8((RhBottomSheetDialogFragmentHost.SheetListener) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceGroup();
            PathfinderSduiComposable.PathfinderSduiComposable(pathfinderSduiViewState, pathfinderSduiComposable2, pathfinderSduiComposable3, function1, function0, function12, function2, (Function1) objRememberedValue5, composer, 14380032);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Uri it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(PathfinderAction.UpdateBackend it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$6(PathfinderAction.SubmitForm submitForm, Map map) {
            Intrinsics.checkNotNullParameter(submitForm, "<unused var>");
            Intrinsics.checkNotNullParameter(map, "<unused var>");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$9$lambda$8(RhBottomSheetDialogFragmentHost.SheetListener it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }
}

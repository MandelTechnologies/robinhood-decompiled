package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragmentHost;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import io.noties.markwon.Markwon;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SduiChunk.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a%\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0001\u0018\u00010\u00030\u000b\"\b\b\u0000\u0010\u0001*\u00020\fH\u0007¢\u0006\u0002\u0010\r\u001a\u008a\u0001\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112L\u0010\u0012\u001aH\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00130\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00130\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0002j\b\u0012\u0004\u0012\u00020\u0013`\u00142%\b\u0002\u0010\u0015\u001a\u001f\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016H\u0007¢\u0006\u0002\u0010\u0019\u001a!\u0010\u000e\u001a\u00020\u000f*\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cH\u0007¢\u0006\u0002\u0010\u001d\u001al\u0010\u001e\u001aH\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002H\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002H\u00010\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0002j\b\u0012\u0004\u0012\u0002H\u0001`\u0014\"\b\b\u0000\u0010\u0001*\u00020\f*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020 *\u0088\u0001\u0010\u0000\u001a\u0004\b\u0000\u0010\u0001\">\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002H\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002H\u00010\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u00022>\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002H\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002H\u00010\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0002¨\u0006!²\u0006\u0012\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0003X\u008a\u008e\u0002"}, m3636d2 = {"BottomSheetPresenterFn", "ActionT", "Lkotlin/Function2;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lkotlin/ParameterName;", "name", "alert", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/SduiCallbacks;", "callbacks", "", "rememberGenericAlert", "Landroidx/compose/runtime/MutableState;", "Landroid/os/Parcelable;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/MutableState;", "rememberDefaultSduiChunkCallbacks", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/GenericActionSduiCallbacks;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "presentBottomSheetFn", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/BottomSheetPresenterFn;", "onLaunchHttpLink", "Lkotlin/Function1;", "Landroid/net/Uri;", "link", "(Lcom/robinhood/android/navigation/Navigator;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/GenericActionSduiCallbacks;", "Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragmentHost;", "markwon", "Lio/noties/markwon/Markwon;", "(Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragmentHost;Lcom/robinhood/android/navigation/Navigator;Lio/noties/markwon/Markwon;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/GenericActionSduiCallbacks;", "makeOnPresentBottomSheetFn", "forCrypto", "", "lib-sdui_externalRelease", "dialogState"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiChunkKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiChunk2 {
    public static final SduiActionHandler2 rememberDefaultSduiChunkCallbacks(Navigator navigator, Function2<? super GenericAlertContent<? extends GenericAction>, ? super SduiActionHandler6<GenericAction>, Unit> presentBottomSheetFn, Function1<? super Uri, Unit> function1, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(presentBottomSheetFn, "presentBottomSheetFn");
        composer.startReplaceGroup(-1494111197);
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        Function1<? super Uri, Unit> function12 = function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1494111197, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.rememberDefaultSduiChunkCallbacks (SduiChunk.kt:61)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        final SnapshotState snapshotStateRememberGenericAlert = rememberGenericAlert(composer, 0);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            SduiChunk sduiChunk = new SduiChunk(navigator, context, new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiChunkKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SduiChunk2.rememberDefaultSduiChunkCallbacks$lambda$4$lambda$3(snapshotStateRememberGenericAlert, (GenericAlertContent) obj);
                }
            }, presentBottomSheetFn, function12);
            composer.updateRememberedValue(sduiChunk);
            objRememberedValue = sduiChunk;
        }
        SduiChunk sduiChunk2 = (SduiChunk) objRememberedValue;
        composer.endReplaceGroup();
        GenericAlertContent<GenericAction> genericAlertContentRememberDefaultSduiChunkCallbacks$lambda$1 = rememberDefaultSduiChunkCallbacks$lambda$1(snapshotStateRememberGenericAlert);
        if (genericAlertContentRememberDefaultSduiChunkCallbacks$lambda$1 != null) {
            SduiAlert.INSTANCE.Dialog(genericAlertContentRememberDefaultSduiChunkCallbacks$lambda$1, sduiChunk2, composer, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return sduiChunk2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rememberDefaultSduiChunkCallbacks$lambda$4$lambda$3(SnapshotState snapshotState, GenericAlertContent genericAlertContent) {
        snapshotState.setValue(genericAlertContent);
        return Unit.INSTANCE;
    }

    private static final GenericAlertContent<GenericAction> rememberDefaultSduiChunkCallbacks$lambda$1(SnapshotState<GenericAlertContent<GenericAction>> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rememberDefaultSduiChunkCallbacks$lambda$7$lambda$6(RhBottomSheetDialogFragmentHost rhBottomSheetDialogFragmentHost, Markwon markwon, GenericAlertContent alert, SduiActionHandler6 callbacks) {
        Intrinsics.checkNotNullParameter(alert, "alert");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        SduiAlertKt.presentSduiAlertSheet(rhBottomSheetDialogFragmentHost, markwon, alert, callbacks, (1016 & 8) != 0 ? new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SduiAlertKt.presentSduiAlertSheet$lambda$0((String) obj);
            }
        } : null, (1016 & 16) != 0 ? new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SduiAlertKt.presentSduiAlertSheet$lambda$1((String) obj);
            }
        } : null, (1016 & 32) != 0 ? new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        } : null, (1016 & 64) != 0 ? false : false, (1016 & 128) != 0 ? false : false, (1016 & 256) != 0, (1016 & 512) != 0 ? null : null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Function2 makeOnPresentBottomSheetFn$default(RhBottomSheetDialogFragmentHost rhBottomSheetDialogFragmentHost, Markwon markwon, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return makeOnPresentBottomSheetFn(rhBottomSheetDialogFragmentHost, markwon, z);
    }

    public static final <ActionT extends Parcelable> Function2<GenericAlertContent<? extends ActionT>, SduiActionHandler6<ActionT>, Unit> makeOnPresentBottomSheetFn(final RhBottomSheetDialogFragmentHost rhBottomSheetDialogFragmentHost, final Markwon markwon, final boolean z) {
        Intrinsics.checkNotNullParameter(rhBottomSheetDialogFragmentHost, "<this>");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        return new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiChunkKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SduiChunk2.makeOnPresentBottomSheetFn$lambda$9(rhBottomSheetDialogFragmentHost, markwon, z, (GenericAlertContent) obj, (SduiActionHandler6) obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeOnPresentBottomSheetFn$lambda$9(RhBottomSheetDialogFragmentHost rhBottomSheetDialogFragmentHost, Markwon markwon, boolean z, GenericAlertContent alert, SduiActionHandler6 callbacks) {
        Intrinsics.checkNotNullParameter(alert, "alert");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        rhBottomSheetDialogFragmentHost.setSheetListener(SduiAlert.INSTANCE.sheetListener(rhBottomSheetDialogFragmentHost.getChildFragmentManager(), markwon, alert, callbacks, (Function0<Unit>) new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiChunkKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        }, (Function1<? super String, Unit>) ((2016 & 32) != 0 ? new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return SduiAlert.sheetListener$lambda$16((String) obj2);
            }
        } : null), (Function1<? super String, Unit>) ((2016 & 64) != 0 ? new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return SduiAlert.sheetListener$lambda$17((String) obj2);
            }
        } : null), (2016 & 128) != 0 ? false : z, (2016 & 256) != 0 ? false : false, (2016 & 512) != 0, (2016 & 1024) != 0 ? null : null));
        return Unit.INSTANCE;
    }

    public static final SduiActionHandler2 rememberDefaultSduiChunkCallbacks(final RhBottomSheetDialogFragmentHost rhBottomSheetDialogFragmentHost, Navigator navigator, final Markwon markwon, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rhBottomSheetDialogFragmentHost, "<this>");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        composer.startReplaceGroup(-952015951);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-952015951, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.rememberDefaultSduiChunkCallbacks (SduiChunk.kt:88)");
        }
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(rhBottomSheetDialogFragmentHost) | composer.changedInstance(markwon);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiChunkKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiChunk2.rememberDefaultSduiChunkCallbacks$lambda$7$lambda$6(rhBottomSheetDialogFragmentHost, markwon, (GenericAlertContent) obj, (SduiActionHandler6) obj2);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        SduiActionHandler2 sduiActionHandler2RememberDefaultSduiChunkCallbacks = rememberDefaultSduiChunkCallbacks(navigator, (Function2) objRememberedValue, null, composer, (i >> 3) & 14, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return sduiActionHandler2RememberDefaultSduiChunkCallbacks;
    }

    public static final <ActionT extends Parcelable> SnapshotState<GenericAlertContent<ActionT>> rememberGenericAlert(Composer composer, int i) {
        composer.startReplaceGroup(1369740384);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1369740384, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.rememberGenericAlert (SduiChunk.kt:54)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        SnapshotState<GenericAlertContent<ActionT>> snapshotState = (SnapshotState) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return snapshotState;
    }
}

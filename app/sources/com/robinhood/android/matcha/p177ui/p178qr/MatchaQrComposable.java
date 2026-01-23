package com.robinhood.android.matcha.p177ui.p178qr;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material.IconButton2;
import androidx.compose.material.IconKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.Close2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.CornerRadius;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect2;
import androidx.compose.p011ui.geometry.RoundRect2;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.p011ui.graphics.AndroidPath_androidKt;
import androidx.compose.p011ui.graphics.ClipOp;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.graphics.drawscope.DrawContext;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.Stroke;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.PrimitiveResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.google.accompanist.permissions.PermissionState;
import com.google.accompanist.permissions.PermissionState2;
import com.google.accompanist.permissions.PermissionsUtil2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.camera.CameraPreviewComposable;
import com.robinhood.android.camera.analyzer.QrCodeImageAnalyzer;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.C11917R;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.matcha.C21284R;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoPogContent;
import com.robinhood.compose.bento.component.BentoPogDefaults;
import com.robinhood.compose.bento.component.BentoPogKt;
import com.robinhood.compose.bento.component.BentoPogState;
import com.robinhood.compose.bento.component.BentoSegmentedControl2;
import com.robinhood.compose.bento.component.BentoSegmentedControl3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextWithLink;
import com.robinhood.compose.bento.component.Segment;
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MatchaQrComposable.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\u001a©\u0001\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\r28\u0010\u000f\u001a4\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00040\u00102\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0018H\u0007¢\u0006\u0002\u0010\u001b\u001aM\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00012\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u001f\u001a\u00020\n2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0018H\u0003¢\u0006\u0002\u0010 \u001a!\u0010!\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\"\u001a\u0004\u0018\u00010\bH\u0003¢\u0006\u0002\u0010#\u001aG\u0010$\u001a\u00020\u000428\u0010\u000f\u001a4\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00040\u0010H\u0003¢\u0006\u0002\u0010%\u001a!\u0010&\u001a\u00020\u00042\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\rH\u0003¢\u0006\u0002\u0010(\u001a\r\u0010)\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010*\u001a#\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\n2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040\u0018H\u0003¢\u0006\u0002\u0010.\u001a\u001b\u0010/\u001a\u00020\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0018H\u0003¢\u0006\u0002\u00100\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u00061²\u0006\n\u0010\u001d\u001a\u00020\u0001X\u008a\u008e\u0002"}, m3636d2 = {"REQUEST_MONEY", "", "SCAN_CODE", "QrCodeSegmentedScreen", "", "user", "Lcom/robinhood/models/db/sheriff/User;", "qrCodeBitmap", "Landroid/graphics/Bitmap;", "isDiscoverabilityEnabled", "", "initialTab", "onTabSelected", "Lkotlin/Function1;", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "onCodeScanned", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "userId", "Ljava/math/BigDecimal;", "amount", "onMenuClick", "Lkotlin/Function0;", "onUpdateSettingsClick", "onCloseClick", "(Lcom/robinhood/models/db/sheriff/User;Landroid/graphics/Bitmap;ZILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "QrCodeSegmentedControl", "selectedIndex", "onIndexSelected", "showMenu", "(ILkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "RequestMoney", "qrBitmap", "(Lcom/robinhood/models/db/sheriff/User;Landroid/graphics/Bitmap;Landroidx/compose/runtime/Composer;I)V", "ScanCode", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "CameraPreviewScanner", "onQrCodeScanned", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "CameraPreviewOverlay", "(Landroidx/compose/runtime/Composer;I)V", "RequestPermission", "shouldShowRationale", "onRequestPermission", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "QrCodeDisabled", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-p2p_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.matcha.ui.qr.MatchaQrComposableKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class MatchaQrComposable {
    public static final int REQUEST_MONEY = 0;
    public static final int SCAN_CODE = 1;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CameraPreviewOverlay$lambda$26(int i, Composer composer, int i2) {
        CameraPreviewOverlay(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CameraPreviewScanner$lambda$20(Function1 function1, int i, Composer composer, int i2) {
        CameraPreviewScanner(function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QrCodeDisabled$lambda$30(Function0 function0, int i, Composer composer, int i2) {
        QrCodeDisabled(function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QrCodeSegmentedControl$lambda$9(int i, Function1 function1, boolean z, Function0 function0, Function0 function02, int i2, Composer composer, int i3) {
        QrCodeSegmentedControl(i, function1, z, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QrCodeSegmentedScreen$lambda$6(User user, Bitmap bitmap, boolean z, int i, Function1 function1, Function2 function2, Function0 function0, Function0 function02, Function0 function03, int i2, Composer composer, int i3) {
        QrCodeSegmentedScreen(user, bitmap, z, i, function1, function2, function0, function02, function03, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RequestMoney$lambda$11(User user, Bitmap bitmap, int i, Composer composer, int i2) {
        RequestMoney(user, bitmap, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RequestPermission$lambda$29(boolean z, Function0 function0, int i, Composer composer, int i2) {
        RequestPermission(z, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScanCode$lambda$17(Function2 function2, int i, Composer composer, int i2) {
        ScanCode(function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void QrCodeSegmentedScreen(final User user, final Bitmap bitmap, final boolean z, final int i, final Function1<? super UserInteractionEventData.Action, Unit> onTabSelected, final Function2<? super String, ? super BigDecimal, Unit> onCodeScanned, final Function0<Unit> onMenuClick, final Function0<Unit> onUpdateSettingsClick, final Function0<Unit> onCloseClick, Composer composer, final int i2) {
        int i3;
        boolean z2;
        Intrinsics.checkNotNullParameter(onTabSelected, "onTabSelected");
        Intrinsics.checkNotNullParameter(onCodeScanned, "onCodeScanned");
        Intrinsics.checkNotNullParameter(onMenuClick, "onMenuClick");
        Intrinsics.checkNotNullParameter(onUpdateSettingsClick, "onUpdateSettingsClick");
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(886456707);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(user) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(bitmap) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onTabSelected) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCodeScanned) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onMenuClick) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onUpdateSettingsClick) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCloseClick) ? 67108864 : 33554432;
        }
        if ((38347923 & i3) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(886456707, i3, -1, "com.robinhood.android.matcha.ui.qr.QrCodeSegmentedScreen (MatchaQrComposable.kt:96)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = SnapshotIntState3.mutableIntStateOf(i);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            int intValue = snapshotIntState2.getIntValue();
            if (intValue != 0) {
                z2 = true;
                if (intValue == 1) {
                    composerStartRestartGroup.startReplaceGroup(2040115422);
                    ScanCode(onCodeScanned, composerStartRestartGroup, (i3 >> 15) & 14);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(2040193573);
                    composerStartRestartGroup.endReplaceGroup();
                }
            } else {
                z2 = true;
                composerStartRestartGroup.startReplaceGroup(2039769307);
                if (z) {
                    composerStartRestartGroup.startReplaceGroup(2039811684);
                    RequestMoney(user, bitmap, composerStartRestartGroup, i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(2039975488);
                    QrCodeDisabled(onUpdateSettingsClick, composerStartRestartGroup, (i3 >> 21) & 14);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            int intValue2 = snapshotIntState2.getIntValue();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z3 = (i3 & 57344) == 16384 ? z2 : false;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.matcha.ui.qr.MatchaQrComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MatchaQrComposable.QrCodeSegmentedScreen$lambda$5$lambda$4$lambda$3(onTabSelected, snapshotIntState2, ((Integer) obj).intValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function1 function1 = (Function1) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            if (snapshotIntState2.getIntValue() != 0 || bitmap == null || !z) {
                z2 = false;
            }
            QrCodeSegmentedControl(intValue2, function1, z2, onMenuClick, onCloseClick, composerStartRestartGroup, ((i3 >> 9) & 7168) | ((i3 >> 12) & 57344));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.qr.MatchaQrComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MatchaQrComposable.QrCodeSegmentedScreen$lambda$6(user, bitmap, z, i, onTabSelected, onCodeScanned, onMenuClick, onUpdateSettingsClick, onCloseClick, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QrCodeSegmentedScreen$lambda$5$lambda$4$lambda$3(Function1 function1, SnapshotIntState2 snapshotIntState2, int i) {
        UserInteractionEventData.Action action;
        snapshotIntState2.setIntValue(i);
        int intValue = snapshotIntState2.getIntValue();
        if (intValue == 0) {
            action = UserInteractionEventData.Action.REQUEST;
        } else if (intValue == 1) {
            action = UserInteractionEventData.Action.PAY;
        } else {
            throw new IllegalStateException("unexpected index");
        }
        function1.invoke(action);
        return Unit.INSTANCE;
    }

    private static final void QrCodeSegmentedControl(final int i, final Function1<? super Integer, Unit> function1, final boolean z, final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i2) {
        int i3;
        Function0<Unit> function03;
        final long jM21425getFg0d7_KjU;
        Modifier.Companion companion;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1845747268);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            function03 = function0;
            i3 |= composerStartRestartGroup.changedInstance(function03) ? 2048 : 1024;
        } else {
            function03 = function0;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
        }
        if ((i3 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1845747268, i3, -1, "com.robinhood.android.matcha.ui.qr.QrCodeSegmentedControl (MatchaQrComposable.kt:142)");
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion2);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            int i4 = i3;
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            PermissionState permissionStateRememberPermissionState = PermissionState2.rememberPermissionState("android.permission.CAMERA", null, composerStartRestartGroup, 6, 2);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion3.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1956563604);
            if (i == 1 && PermissionsUtil2.isGranted(permissionStateRememberPermissionState.getStatus())) {
                jM21425getFg0d7_KjU = BentoColor.INSTANCE.m21235getDayNova0d7_KjU();
            } else {
                jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
            }
            composerStartRestartGroup.endReplaceGroup();
            Color.Companion companion5 = Color.INSTANCE;
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(companion2, companion5.m6725getTransparent0d7_KjU(), null, 2, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            IconButton2.IconButton(function02, PaddingKt.m5142padding3ABfNKs(modifierM4872backgroundbw27NRU$default, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM()), false, null, ComposableLambda3.rememberComposableLambda(-1853727822, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.qr.MatchaQrComposableKt$QrCodeSegmentedControl$1$1$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    if ((i6 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1853727822, i6, -1, "com.robinhood.android.matcha.ui.qr.QrCodeSegmentedControl.<anonymous>.<anonymous>.<anonymous> (MatchaQrComposable.kt:157)");
                    }
                    IconKt.m5603Iconww6aTOc(Close2.getClose(Icons.Filled.INSTANCE), StringResources_androidKt.stringResource(C11917R.string.app_bar_navigate_back, composer2, 0), (Modifier) null, jM21425getFg0d7_KjU, composer2, 0, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 >> 12) & 14) | 24576, 12);
            composerStartRestartGroup.startReplaceGroup(-1956541182);
            if (z) {
                Spacer2.Spacer(Row5.weight$default(row6, companion2, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                Function0<Unit> function04 = function03;
                companion = companion2;
                IconButton2.IconButton(function04, PaddingKt.m5142padding3ABfNKs(Background3.m4872backgroundbw27NRU$default(companion2, companion5.m6725getTransparent0d7_KjU(), null, 2, null), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM()), false, null, ComposableLambda3.rememberComposableLambda(622314509, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.qr.MatchaQrComposableKt$QrCodeSegmentedControl$1$1$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(622314509, i6, -1, "com.robinhood.android.matcha.ui.qr.QrCodeSegmentedControl.<anonymous>.<anonymous>.<anonymous> (MatchaQrComposable.kt:171)");
                        }
                        IconKt.m5602Iconww6aTOc(PainterResources_androidKt.painterResource(C20690R.drawable.ic_rds_dots_android_24dp, composer2, 0), StringResources_androidKt.stringResource(C11048R.string.general_label_more, composer2, 0), (Modifier) null, jM21425getFg0d7_KjU, composer2, 0, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 >> 9) & 14) | 24576, 12);
            } else {
                companion = companion2;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            int i6 = i4 << 3;
            BentoSegmentedControl2.BentoSegmentedControl(CollectionsKt.listOf((Object[]) new Segment[]{new Segment(new BentoSegmentedControl3.Icon.Size16(ServerToBentoAssetMapper2.QR_24), StringResources_androidKt.stringResource(C21284R.string.matcha_qr_tab_title, composerStartRestartGroup, 0), null, 4, null), new Segment(new BentoSegmentedControl3.Icon.Size16(ServerToBentoAssetMapper2.QR_SCAN_24), StringResources_androidKt.stringResource(C21284R.string.matcha_qr_scan_tab_title, composerStartRestartGroup, 0), null, 4, null)}), i, function1, PaddingKt.m5143paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM()), false, composerStartRestartGroup, Segment.$stable | (i6 & 112) | (i6 & 896), 16);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.qr.MatchaQrComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MatchaQrComposable.QrCodeSegmentedControl$lambda$9(i, function1, z, function0, function02, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void RequestMoney(final User user, final Bitmap bitmap, Composer composer, final int i) {
        int i2;
        int i3;
        Modifier.Companion companion;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1030462684);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(user) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(bitmap) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1030462684, i2, -1, "com.robinhood.android.matcha.ui.qr.RequestMoney (MatchaQrComposable.kt:206)");
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Spacer2.Spacer(Column5.weight$default(column6, companion2, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            if (bitmap != null) {
                composerStartRestartGroup.startReplaceGroup(1632778462);
                i3 = 0;
                ImageKt.m4912Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmap), null, null, null, null, 0.0f, null, 0, composerStartRestartGroup, 48, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                i3 = 0;
                composerStartRestartGroup.startReplaceGroup(1632926704);
                BoxKt.Box(SizeKt.m5169size3ABfNKs(ModifiersKt.bentoPlaceholder(companion2, true, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8))), PrimitiveResources_androidKt.dimensionResource(C21284R.dimen.matcha_qr_code_size, composerStartRestartGroup, 0)), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, i3);
            composerStartRestartGroup.startReplaceGroup(-917144044);
            if (user != null) {
                companion = companion2;
                BentoText2.m20747BentoText38GnDrw(user.getFullName(), null, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8126);
                BentoText2.m20747BentoText38GnDrw(user.getUsername(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getTextM(), composerStartRestartGroup, 0, 0, 8190);
                composerStartRestartGroup = composerStartRestartGroup;
            } else {
                companion = companion2;
            }
            composerStartRestartGroup.endReplaceGroup();
            Spacer2.Spacer(Column5.weight$default(column6, companion, 0.8f, false, 2, null), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.qr.MatchaQrComposableKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MatchaQrComposable.RequestMoney$lambda$11(user, bitmap, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void ScanCode(final Function2<? super String, ? super BigDecimal, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(548234401);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(548234401, i2, -1, "com.robinhood.android.matcha.ui.qr.ScanCode (MatchaQrComposable.kt:248)");
            }
            final PermissionState permissionStateRememberPermissionState = PermissionState2.rememberPermissionState("android.permission.CAMERA", null, composerStartRestartGroup, 6, 2);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            if (!PermissionsUtil2.isGranted(permissionStateRememberPermissionState.getStatus())) {
                composerStartRestartGroup.startReplaceGroup(-1724266052);
                boolean shouldShowRationale = PermissionsUtil2.getShouldShowRationale(permissionStateRememberPermissionState.getStatus());
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChanged = composerStartRestartGroup.changed(permissionStateRememberPermissionState);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.matcha.ui.qr.MatchaQrComposableKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MatchaQrComposable.ScanCode$lambda$16$lambda$15$lambda$14(permissionStateRememberPermissionState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                RequestPermission(shouldShowRationale, (Function0) objRememberedValue, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1724688830);
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean z = (i2 & 14) == 4;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.matcha.ui.qr.MatchaQrComposableKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MatchaQrComposable.ScanCode$lambda$16$lambda$13$lambda$12(function2, (String) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                CameraPreviewScanner((Function1) objRememberedValue2, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.qr.MatchaQrComposableKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MatchaQrComposable.ScanCode$lambda$17(function2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScanCode$lambda$16$lambda$13$lambda$12(Function2 function2, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Uri uri = Uri.parse(it);
        String queryParameter = uri.getQueryParameter(MatchaQrCodeDuxo6.USER_ID_KEY);
        String queryParameter2 = uri.getQueryParameter("amount");
        BigDecimal bigDecimal = queryParameter2 != null ? new BigDecimal(queryParameter2) : null;
        if (queryParameter != null) {
            function2.invoke(queryParameter, bigDecimal);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScanCode$lambda$16$lambda$15$lambda$14(PermissionState permissionState) {
        permissionState.launchPermissionRequest();
        return Unit.INSTANCE;
    }

    private static final void CameraPreviewScanner(final Function1<? super String, Unit> function1, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2141273937);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2141273937, i2, -1, "com.robinhood.android.matcha.ui.qr.CameraPreviewScanner (MatchaQrComposable.kt:277)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
            QrCodeImageAnalyzer qrCodeImageAnalyzer = new QrCodeImageAnalyzer(null, null, 3, null);
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance = ((i2 & 14) == 4) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(qrCodeImageAnalyzer);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new MatchaQrComposable2(coroutineScope, qrCodeImageAnalyzer, function1, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            CameraPreviewComposable.CameraPreviewForAnalyzer(companion2, qrCodeImageAnalyzer, 1, composerStartRestartGroup, (QrCodeImageAnalyzer.$stable << 3) | 390, 0);
            CameraPreviewOverlay(composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.qr.MatchaQrComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MatchaQrComposable.CameraPreviewScanner$lambda$20(function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void CameraPreviewOverlay(Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1958013470);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1958013470, i, -1, "com.robinhood.android.matcha.ui.qr.CameraPreviewOverlay (MatchaQrComposable.kt:307)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.matcha.ui.qr.MatchaQrComposableKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MatchaQrComposable.CameraPreviewOverlay$lambda$25$lambda$24$lambda$23((DrawScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Canvas2.Canvas(modifierFillMaxSize$default, (Function1) objRememberedValue, composerStartRestartGroup, 54);
            String strStringResource = StringResources_androidKt.stringResource(C21284R.string.matcha_qr_scan_tab_detail, composerStartRestartGroup, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m5146paddingqDBjuR0$default(boxScopeInstance.align(companion, companion2.getBottomCenter()), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i2).m21596getXxlargeD9Ej5fM(), 7, null), Color.m6701boximpl(BentoColor.INSTANCE.m21235getDayNova0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i2).getDisplayCapsuleSmall(), composer2, 0, 0, 8184);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.qr.MatchaQrComposableKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MatchaQrComposable.CameraPreviewOverlay$lambda$26(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CameraPreviewOverlay$lambda$25$lambda$24$lambda$23(DrawScope Canvas) throws Throwable {
        long j;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float fM6582getMinDimensionimpl = Size.m6582getMinDimensionimpl(Canvas.mo6963getSizeNHjbRc()) * 0.8f;
        float fM6582getMinDimensionimpl2 = Size.m6582getMinDimensionimpl(Canvas.mo6963getSizeNHjbRc()) * 0.8f;
        long jM6575constructorimpl = Size.m6575constructorimpl((Float.floatToRawIntBits(fM6582getMinDimensionimpl2) & 4294967295L) | (Float.floatToRawIntBits(fM6582getMinDimensionimpl) << 32));
        float f = 2;
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() >> 32)) / f) - (Float.intBitsToFloat((int) (jM6575constructorimpl >> 32)) / f);
        float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() & 4294967295L)) / f) - (Float.intBitsToFloat((int) (jM6575constructorimpl & 4294967295L)) / f);
        long jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
        long jM6528constructorimpl = CornerRadius.m6528constructorimpl((4294967295L & Float.floatToRawIntBits(48.0f)) | (Float.floatToRawIntBits(48.0f) << 32));
        int iM6699getDifferencertfAjoo = ClipOp.INSTANCE.m6699getDifferencertfAjoo();
        Path Path = AndroidPath_androidKt.Path();
        Path.addRoundRect$default(Path, RoundRect2.m6573RoundRectsniSvfs(Rect2.m6565Recttz77jQw(jM6535constructorimpl, jM6575constructorimpl), jM6528constructorimpl), null, 2, null);
        DrawContext drawContext = Canvas.getDrawContext();
        long jMo6936getSizeNHjbRc = drawContext.mo6936getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo6938clipPathmtrdDE(Path, iM6699getDifferencertfAjoo);
            Color.Companion companion = Color.INSTANCE;
            j = jMo6936getSizeNHjbRc;
            try {
                DrawScope.m6957drawRectAsUm42w$default(Canvas, new SolidColor(Color.m6705copywmQWz5c$default(companion.m6716getBlack0d7_KjU(), 0.65f, 0.0f, 0.0f, 0.0f, 14, null), null), 0L, 0L, 0.0f, null, null, 0, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
                drawContext.getCanvas().restore();
                drawContext.mo6937setSizeuvyYCjk(j);
                DrawScope.m6960drawRoundRectuAw5IA$default(Canvas, companion.m6727getWhite0d7_KjU(), jM6535constructorimpl, jM6575constructorimpl, jM6528constructorimpl, new Stroke(6.0f, 0.0f, 0, 0, null, 30, null), 0.0f, null, 0, 224, null);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                th = th;
                drawContext.getCanvas().restore();
                drawContext.mo6937setSizeuvyYCjk(j);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            j = jMo6936getSizeNHjbRc;
        }
    }

    private static final void RequestPermission(final boolean z, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1104663313);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1104663313, i2, -1, "com.robinhood.android.matcha.ui.qr.RequestPermission (MatchaQrComposable.kt:360)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxSize$default, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-1939939097);
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C21284R.string.matcha_qr_camera_permission_denied, composerStartRestartGroup, 0), null, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 0, 0, 16318);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1939729568);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM()), companion2.getCenterHorizontally(), composerStartRestartGroup, 48);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                BentoPogKt.BentoPog(new BentoPogState(new BentoPogContent.Pictogram(C20690R.drawable.pict_mono_rds_unlock, null, null, 4, null), BentoPogDefaults.INSTANCE.getDefaultColors(composerStartRestartGroup, BentoPogDefaults.$stable), null, false, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), null, composerStartRestartGroup, BentoPogState.$stable, 2);
                BentoTextWithLink.m20752BentoTextWithLinkXkG1Q0A(StringResources_androidKt.stringResource(C21284R.string.matcha_qr_camera_permission, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C21284R.string.matcha_qr_camera_permission_allow, composerStartRestartGroup, 0), function0, null, bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU(), 0L, TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m7919getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), 0, composerStartRestartGroup, (i2 << 3) & 896, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.qr.MatchaQrComposableKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MatchaQrComposable.RequestPermission$lambda$29(z, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void QrCodeDisabled(final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2091006173);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2091006173, i2, -1, "com.robinhood.android.matcha.ui.qr.QrCodeDisabled (MatchaQrComposable.kt:399)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1637426386, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.qr.MatchaQrComposableKt.QrCodeDisabled.1
                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1637426386, i3, -1, "com.robinhood.android.matcha.ui.qr.QrCodeDisabled.<anonymous> (MatchaQrComposable.kt:401)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), 0.0f, composer2, 6, 1);
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    Function0<Unit> function02 = function0;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composer2, 0);
                    ImageKt.Image(PainterResources_androidKt.painterResource(C21284R.drawable.svg_broken_profile, composer2, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 48, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                    String strStringResource = StringResources_androidKt.stringResource(C21284R.string.matcha_qr_discoverability_not_enabled_title, composer2, 0);
                    TextAlign.Companion companion3 = TextAlign.INSTANCE;
                    int iM7919getCentere0LSkKk = companion3.m7919getCentere0LSkKk();
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer2, i4).m21594getXlargeD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer2, i4).m21593getSmallD9Ej5fM(), 5, null), null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i4).getDisplayCapsuleMedium(), composer2, 0, 0, 8124);
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C21284R.string.matcha_qr_discoverability_not_enabled_detail, composer2, 0), null, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i4).getTextM(), composer2, 0, 0, 8126);
                    Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composer2, 0);
                    BentoButtonKt.m20586BentoButtonEikTQX8(function02, StringResources_androidKt.stringResource(C21284R.string.matcha_qr_discoverability_not_enabled_action, composer2, 0), PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer2, i4).m21590getDefaultD9Ej5fM(), 1, null), null, null, false, false, null, null, null, null, false, null, composer2, 0, 0, 8184);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.qr.MatchaQrComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MatchaQrComposable.QrCodeDisabled$lambda$30(function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}

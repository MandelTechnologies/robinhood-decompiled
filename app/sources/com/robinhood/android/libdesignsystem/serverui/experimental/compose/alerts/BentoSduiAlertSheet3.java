package com.robinhood.android.libdesignsystem.serverui.experimental.compose.alerts;

import android.os.Parcelable;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.wires.p278ui.WiresInvalidAccountContentComposable;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlerts2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: BentoSduiAlertSheet.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001al\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\t\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"BentoSduiAlertSheet", "", "ActionT", "Landroid/os/Parcelable;", "title", "", CarResultComposable2.BODY, "bodyComponents", "", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", WiresInvalidAccountContentComposable.PrimaryButtonTag, "Lcom/robinhood/compose/bento/component/alerts/BentoAlertButton;", WiresInvalidAccountContentComposable.SecondaryButtonTag, "pictogram", "Lcom/robinhood/android/libdesignsystem/serverui/PictogramAsset;", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "BentoSduiAlertSheet-G_u8Q3M", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/compose/bento/component/alerts/BentoAlertButton;Lcom/robinhood/compose/bento/component/alerts/BentoAlertButton;Lcom/robinhood/android/libdesignsystem/serverui/PictogramAsset;ILandroidx/compose/runtime/Composer;II)V", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.alerts.BentoSduiAlertSheetKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class BentoSduiAlertSheet3 {
    /* renamed from: BentoSduiAlertSheet-G_u8Q3M, reason: not valid java name */
    public static final /* synthetic */ <ActionT extends Parcelable> void m16051BentoSduiAlertSheetG_u8Q3M(String title, final String body, final List<? extends UIComponent<? extends ActionT>> list, BentoAlertButton primaryButton, BentoAlertButton bentoAlertButton, ServerToBentoAssetMapper3 serverToBentoAssetMapper3, int i, Composer composer, int i2, int i3) {
        long jM21372getBg20d7_KjU;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        composer.startReplaceGroup(221388998);
        BentoAlertButton bentoAlertButton2 = (i3 & 16) != 0 ? null : bentoAlertButton;
        ServerToBentoAssetMapper3 serverToBentoAssetMapper32 = (i3 & 32) != 0 ? null : serverToBentoAssetMapper3;
        final int iM7919getCentere0LSkKk = (i3 & 64) != 0 ? TextAlign.INSTANCE.m7919getCentere0LSkKk() : i;
        Intrinsics.needClassReification();
        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1694075195, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.alerts.BentoSduiAlertSheetKt$BentoSduiAlertSheet$bodyContent$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i4) {
                if ((i4 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1694075195, i4, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.alerts.BentoSduiAlertSheet.<anonymous> (BentoSduiAlertSheet.kt:38)");
                }
                Alignment.Companion companion = Alignment.INSTANCE;
                Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                String str = body;
                int i5 = iM7919getCentere0LSkKk;
                List list2 = list;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer2, 48);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion2);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                composer2.startReplaceGroup(1390346787);
                if (str.length() > 0) {
                    BentoAlerts2.m20854AlertBodyText5stqomU(str, i5, composer2, 0, 0);
                }
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(1390351170);
                if (list2 != null) {
                    ImmutableList3 persistentList = extensions2.toPersistentList(list2);
                    HorizontalPadding horizontalPadding = HorizontalPadding.None;
                    composer2.startReplaceGroup(-1772220517);
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Horizontal start = companion.getStart();
                    Intrinsics.reifiedOperationMarker(4, "ActionT");
                    SduiColumns.SduiColumn(persistentList, Parcelable.class, companion2, null, null, horizontalPadding, top, start, true, composer2, 100859904, 0);
                    composer2.endReplaceGroup();
                }
                composer2.endReplaceGroup();
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54);
        Modifier.Companion companion = Modifier.INSTANCE;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i4 = BentoTheme.$stable;
        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composer, i4).m21371getBg0d7_KjU(), null, 2, null);
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM4872backgroundbw27NRU$default);
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        if (composer.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(1)), 0.0f, 1, null);
        if (bentoTheme.getColors(composer, i4).getIsDay()) {
            composer.startReplaceGroup(-2071673393);
            jM21372getBg20d7_KjU = bentoTheme.getColors(composer, i4).getJet();
        } else {
            composer.startReplaceGroup(-2071672529);
            jM21372getBg20d7_KjU = bentoTheme.getColors(composer, i4).m21372getBg20d7_KjU();
        }
        composer.endReplaceGroup();
        BoxKt.Box(Background3.m4872backgroundbw27NRU$default(modifierFillMaxWidth$default, jM21372getBg20d7_KjU, null, 2, null), composer, 0);
        BentoAlerts2.AlertContent(null, serverToBentoAssetMapper32, title, null, CollectionsKt.listOfNotNull((Object[]) new BentoAlertButton[]{primaryButton, bentoAlertButton2}), false, composableLambdaRememberComposableLambda, composer, ((i2 >> 12) & 112) | 1572864 | ((i2 << 6) & 896) | (BentoAlertButton.$stable << 12), 41);
        composer.endNode();
        composer.endReplaceGroup();
    }
}

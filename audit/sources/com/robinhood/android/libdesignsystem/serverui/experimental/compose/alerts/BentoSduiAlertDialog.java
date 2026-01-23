package com.robinhood.android.libdesignsystem.serverui.experimental.compose.alerts;

import android.os.Parcelable;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.window.AndroidDialog_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.wires.p278ui.WiresInvalidAccountContentComposable;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.component.alerts.BentoAlerts2;
import com.robinhood.compose.bento.component.text.BentoMarkdownSpannedText2;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: BentoSduiAlertDialog.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001as\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\t\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u000e\b\b\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, m3636d2 = {"BentoSduiAlertDialog", "", "ActionT", "Landroid/os/Parcelable;", "title", "", "bodyMarkdown", "bodyComponents", "", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", WiresInvalidAccountContentComposable.PrimaryButtonTag, "Lcom/robinhood/compose/bento/component/alerts/BentoAlertButton;", WiresInvalidAccountContentComposable.SecondaryButtonTag, "pictogram", "Lcom/robinhood/android/libdesignsystem/serverui/PictogramAsset;", "onDismissRequest", "Lkotlin/Function0;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/compose/bento/component/alerts/BentoAlertButton;Lcom/robinhood/compose/bento/component/alerts/BentoAlertButton;Lcom/robinhood/android/libdesignsystem/serverui/PictogramAsset;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.alerts.BentoSduiAlertDialogKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class BentoSduiAlertDialog {
    public static final /* synthetic */ <ActionT extends Parcelable> void BentoSduiAlertDialog(final String title, final String bodyMarkdown, final List<? extends UIComponent<? extends ActionT>> list, final BentoAlertButton primaryButton, BentoAlertButton bentoAlertButton, ServerToBentoAssetMapper3 serverToBentoAssetMapper3, Function0<Unit> onDismissRequest, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(bodyMarkdown, "bodyMarkdown");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        composer.startReplaceGroup(1528852666);
        if ((i2 & 16) != 0) {
            bentoAlertButton = null;
        }
        if ((i2 & 32) != 0) {
            serverToBentoAssetMapper3 = null;
        }
        Intrinsics.needClassReification();
        final ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-986234119, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.alerts.BentoSduiAlertDialogKt$BentoSduiAlertDialog$bodyContent$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i3) {
                if ((i3 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-986234119, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.alerts.BentoSduiAlertDialog.<anonymous> (BentoSduiAlertDialog.kt:36)");
                }
                String str = bodyMarkdown;
                List list2 = list;
                Modifier.Companion companion = Modifier.INSTANCE;
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer2, 0);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion);
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
                composer2.startReplaceGroup(970837003);
                if (str.length() > 0) {
                    BentoMarkdownSpannedText2.m21101BentoMarkdownSpannedTextTHkziT8(str, null, null, null, 0, 1, 0, 0, null, composer2, 196608, 478);
                }
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(970842998);
                if (list2 != null) {
                    ImmutableList3 persistentList = extensions2.toPersistentList(list2);
                    HorizontalPadding horizontalPadding = HorizontalPadding.None;
                    composer2.startReplaceGroup(-1772220517);
                    Arrangement.Vertical top2 = arrangement.getTop();
                    Alignment.Horizontal start = companion2.getStart();
                    Intrinsics.reifiedOperationMarker(4, "ActionT");
                    SduiColumns.SduiColumn(persistentList, Parcelable.class, companion, null, null, horizontalPadding, top2, start, true, composer2, 100859904, 0);
                    composer2.endReplaceGroup();
                }
                composer2.endReplaceGroup();
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54);
        final BentoAlertButton bentoAlertButton2 = bentoAlertButton;
        final ServerToBentoAssetMapper3 serverToBentoAssetMapper32 = serverToBentoAssetMapper3;
        AndroidDialog_androidKt.Dialog(onDismissRequest, null, ComposableLambda3.rememberComposableLambda(1779118225, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.alerts.BentoSduiAlertDialogKt.BentoSduiAlertDialog.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i3) {
                if ((i3 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1779118225, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.alerts.BentoSduiAlertDialog.<anonymous> (BentoSduiAlertDialog.kt:52)");
                }
                Modifier modifierClip = Clip.clip(Modifier.INSTANCE, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(BentoAlertDialog2.INSTANCE.m20850getCornerRadiusD9Ej5fM()));
                BentoAlertButton bentoAlertButton3 = primaryButton;
                BentoAlertButton bentoAlertButton4 = bentoAlertButton2;
                ServerToBentoAssetMapper3 serverToBentoAssetMapper33 = serverToBentoAssetMapper32;
                String str = title;
                Function2<Composer, Integer, Unit> function2 = composableLambdaRememberComposableLambda;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierClip);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                BentoAlerts2.AlertContent(null, serverToBentoAssetMapper33, str, null, CollectionsKt.listOfNotNull((Object[]) new BentoAlertButton[]{bentoAlertButton3, bentoAlertButton4}), false, function2, composer2, (BentoAlertButton.$stable << 12) | 1572864, 41);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), composer, ((i >> 18) & 14) | 384, 2);
        composer.endReplaceGroup();
    }
}

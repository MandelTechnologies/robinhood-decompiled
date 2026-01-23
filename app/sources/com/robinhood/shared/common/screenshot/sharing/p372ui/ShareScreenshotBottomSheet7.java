package com.robinhood.shared.common.screenshot.sharing.p372ui;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Updater;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.utils.compose.ClipboardUtil;
import com.robinhood.utils.compose.ClipboardUtil2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ShareScreenshotBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.common.screenshot.sharing.ui.ShareScreenshotBottomSheetKt$ShareScreenshotBottomSheet$1$1$1, reason: use source file name */
/* loaded from: classes26.dex */
final class ShareScreenshotBottomSheet7 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Bitmap $bitmap;
    final /* synthetic */ String $message;
    final /* synthetic */ ImmutableList<ShareOption> $shareOptions;
    final /* synthetic */ String $shareTitle;

    ShareScreenshotBottomSheet7(ImmutableList<ShareOption> immutableList, Bitmap bitmap, String str, String str2) {
        this.$shareOptions = immutableList;
        this.$bitmap = bitmap;
        this.$shareTitle = str;
        this.$message = str2;
    }

    public final void invoke(Composer composer, int i) {
        BentoTheme bentoTheme;
        Object obj;
        final Context context;
        final ClipboardUtil clipboardUtil;
        final Bitmap bitmap;
        final String str;
        final String str2;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1194002725, i, -1, "com.robinhood.shared.common.screenshot.sharing.ui.ShareScreenshotBottomSheet.<anonymous>.<anonymous>.<anonymous> (ShareScreenshotBottomSheet.kt:115)");
        }
        boolean z = true;
        boolean z2 = false;
        Modifier modifierHorizontalScroll$default = ScrollKt.horizontalScroll$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        Modifier modifierM21620defaultFillMaxWidthPaddingVpY3zN4 = PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(modifierHorizontalScroll$default, bentoTheme2.getSpacing(composer, i2).m21594getXlargeD9Ej5fM(), bentoTheme2.getSpacing(composer, i2).m21592getMediumD9Ej5fM());
        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
        ImmutableList<ShareOption> immutableList = this.$shareOptions;
        Bitmap bitmap2 = this.$bitmap;
        String str3 = this.$shareTitle;
        String str4 = this.$message;
        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(center, Alignment.INSTANCE.getTop(), composer, 6);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM21620defaultFillMaxWidthPaddingVpY3zN4);
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
        Row6 row6 = Row6.INSTANCE;
        Context context2 = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composer);
            composer.updateRememberedValue(objRememberedValue);
        }
        final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
        ClipboardUtil clipboardUtil2 = ClipboardUtil2.clipboardUtil(composer, 0);
        composer.startReplaceGroup(-1819371191);
        int i3 = 0;
        for (ShareOption shareOption : immutableList) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final ShareOption shareOption2 = shareOption;
            ShareScreenshotBottomSheet5 icon = shareOption2.getIcon();
            String text = shareOption2.getText();
            BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
            boolean z3 = z;
            int i5 = BentoTheme.$stable;
            long jM21371getBg0d7_KjU = bentoTheme3.getColors(composer, i5).m21371getBg0d7_KjU();
            String loggingIdentifier = shareOption2.getLoggingIdentifier();
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composer.changedInstance(coroutineScope) | composer.changed(shareOption2) | composer.changedInstance(context2) | composer.changedInstance(bitmap2) | composer.changed(str3) | composer.changed(str4) | composer.changedInstance(clipboardUtil2);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                bentoTheme = bentoTheme3;
                context = context2;
                clipboardUtil = clipboardUtil2;
                bitmap = bitmap2;
                str = str3;
                str2 = str4;
                obj = new Function0() { // from class: com.robinhood.shared.common.screenshot.sharing.ui.ShareScreenshotBottomSheetKt$ShareScreenshotBottomSheet$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ShareScreenshotBottomSheet7.invoke$lambda$3$lambda$2$lambda$1$lambda$0(coroutineScope, shareOption2, context, bitmap, str, str2, clipboardUtil);
                    }
                };
                composer.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue2;
                bentoTheme = bentoTheme3;
                context = context2;
                clipboardUtil = clipboardUtil2;
                bitmap = bitmap2;
                str = str3;
                str2 = str4;
            }
            Function0 function0 = (Function0) obj;
            composer.endReplaceGroup();
            int i6 = i3;
            ShareScreenshotBottomSheet6.m24858ShareOptionComposableFHprtrg(icon, text, loggingIdentifier, null, jM21371getBg0d7_KjU, function0, composer, 0, 8);
            composer.startReplaceGroup(-1819341329);
            if (i6 != immutableList.size() - 1) {
                Spacer2.Spacer(SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, bentoTheme.getSpacing(composer, i5).m21590getDefaultD9Ej5fM()), composer, 0);
            }
            composer.endReplaceGroup();
            z = z3;
            z2 = false;
            context2 = context;
            bitmap2 = bitmap;
            str3 = str;
            str4 = str2;
            clipboardUtil2 = clipboardUtil;
            i3 = i4;
        }
        composer.endReplaceGroup();
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2$lambda$1$lambda$0(CoroutineScope coroutineScope, ShareOption shareOption, Context context, Bitmap bitmap, String str, String str2, ClipboardUtil clipboardUtil) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ShareScreenshotBottomSheet8(shareOption, context, bitmap, str, str2, clipboardUtil, null), 3, null);
        return Unit.INSTANCE;
    }
}

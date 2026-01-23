package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.os.Parcelable;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAccordionRow2;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.rows.BentoAccordionRow;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.api.AccordionRow;
import com.robinhood.models.serverdriven.experimental.api.MarkdownText;
import com.robinhood.models.serverdriven.experimental.api.Text;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SduiAccordionRow.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\u001a9\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a+\u0010\u000b\u001a\u00020\f\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u008e\u0002"}, m3636d2 = {"SduiAccordionRow", "", "ActionT", "Landroid/os/Parcelable;", "component", "Lcom/robinhood/models/serverdriven/experimental/api/AccordionRow;", "modifier", "Landroidx/compose/ui/Modifier;", "horizontalPadding", "Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;", "(Lcom/robinhood/models/serverdriven/experimental/api/AccordionRow;Landroidx/compose/ui/Modifier;Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;Landroidx/compose/runtime/Composer;II)V", "toTextMarkdown", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Text$Markdown;", "Lcom/robinhood/models/serverdriven/experimental/api/MarkdownText;", "fallbackColor", "Landroidx/compose/ui/graphics/Color;", "toTextMarkdown-RPmYEkk", "(Lcom/robinhood/models/serverdriven/experimental/api/MarkdownText;JLandroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Text$Markdown;", "lib-sdui_externalRelease", "expanded", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAccordionRowKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiAccordionRow2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiAccordionRow$lambda$3(AccordionRow accordionRow, Modifier modifier, HorizontalPadding horizontalPadding, int i, int i2, Composer composer, int i3) {
        SduiAccordionRow(accordionRow, modifier, horizontalPadding, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final <ActionT extends Parcelable> void SduiAccordionRow(final AccordionRow<? extends ActionT> component, Modifier modifier, HorizontalPadding horizontalPadding, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(1096204509);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(horizontalPadding == null ? -1 : horizontalPadding.ordinal()) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i5 != 0) {
                horizontalPadding = HorizontalPadding.Default;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1096204509, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAccordionRow (SduiAccordionRow.kt:23)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            BentoBaseRowState.Meta singleLine = null;
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.valueOf(component.is_open()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Text<ActionT> metadata_title = component.getMetadata_title();
            composerStartRestartGroup.startReplaceGroup(1185556240);
            AnnotatedString annotatedString = metadata_title == null ? null : SduiText2.toAnnotatedString(metadata_title, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceGroup();
            Text<ActionT> metadata_subtitle = component.getMetadata_subtitle();
            composerStartRestartGroup.startReplaceGroup(1185558672);
            AnnotatedString annotatedString2 = metadata_subtitle == null ? null : SduiText2.toAnnotatedString(metadata_subtitle, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceGroup();
            if (annotatedString != null) {
                if (annotatedString2 != null) {
                    singleLine = new BentoBaseRowState.Meta.TwoLine(annotatedString, annotatedString2);
                } else {
                    singleLine = new BentoBaseRowState.Meta.SingleLine(annotatedString);
                }
            }
            UtilKt.SduiHorizontalPadding(horizontalPadding, ComposableLambda3.rememberComposableLambda(-921258751, true, new C207111(modifier, component, singleLine, snapshotState), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 6) & 14) | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        final HorizontalPadding horizontalPadding2 = horizontalPadding;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAccordionRowKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiAccordionRow2.SduiAccordionRow$lambda$3(component, modifier2, horizontalPadding2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SduiAccordionRow$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: SduiAccordionRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAccordionRowKt$SduiAccordionRow$1 */
    static final class C207111 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ AccordionRow<ActionT> $component;
        final /* synthetic */ SnapshotState<Boolean> $expanded$delegate;
        final /* synthetic */ BentoBaseRowState.Meta $meta;
        final /* synthetic */ Modifier $modifier;

        /* JADX WARN: Multi-variable type inference failed */
        C207111(Modifier modifier, AccordionRow<? extends ActionT> accordionRow, BentoBaseRowState.Meta meta, SnapshotState<Boolean> snapshotState) {
            this.$modifier = modifier;
            this.$component = accordionRow;
            this.$meta = meta;
            this.$expanded$delegate = snapshotState;
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
                ComposerKt.traceEventStart(-921258751, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAccordionRow.<anonymous> (SduiAccordionRow.kt:42)");
            }
            Modifier modifier = this.$modifier;
            boolean zSduiAccordionRow$lambda$1 = SduiAccordionRow2.SduiAccordionRow$lambda$1(this.$expanded$delegate);
            MarkdownText title = this.$component.getTitle();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoBaseRowState.Text.Markdown markdownM15962toTextMarkdownRPmYEkk = SduiAccordionRow2.m15962toTextMarkdownRPmYEkk(title, bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), composer, 0);
            MarkdownText subtitle = this.$component.getSubtitle();
            composer.startReplaceGroup(-566387834);
            BentoBaseRowState.Text.Markdown markdownM15962toTextMarkdownRPmYEkk2 = subtitle == null ? null : SduiAccordionRow2.m15962toTextMarkdownRPmYEkk(subtitle, bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), composer, 0);
            composer.endReplaceGroup();
            BentoBaseRowState bentoBaseRowState = new BentoBaseRowState(null, markdownM15962toTextMarkdownRPmYEkk, markdownM15962toTextMarkdownRPmYEkk2, this.$meta, null, false, false, 113, null);
            composer.startReplaceGroup(5004770);
            final SnapshotState<Boolean> snapshotState = this.$expanded$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAccordionRowKt$SduiAccordionRow$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SduiAccordionRow2.C207111.invoke$lambda$1$lambda$0(snapshotState, ((Boolean) obj).booleanValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            final AccordionRow<ActionT> accordionRow = this.$component;
            BentoAccordionRow.BentoAccordionRow(modifier, zSduiAccordionRow$lambda$1, bentoBaseRowState, (Function1) objRememberedValue, ComposableLambda3.rememberComposableLambda(-1494180374, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAccordionRowKt.SduiAccordionRow.1.2
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
                        ComposerKt.traceEventStart(-1494180374, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAccordionRow.<anonymous>.<anonymous> (SduiAccordionRow.kt:52)");
                    }
                    SduiComponent3.SduiComponent(accordionRow.getContent(), null, null, composer2, 0, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), composer, (BentoBaseRowState.$stable << 6) | 27648, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState, boolean z) {
            SduiAccordionRow2.SduiAccordionRow$lambda$2(snapshotState, z);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toTextMarkdown-RPmYEkk, reason: not valid java name */
    public static final <ActionT extends Parcelable> BentoBaseRowState.Text.Markdown m15962toTextMarkdownRPmYEkk(MarkdownText<? extends ActionT> markdownText, long j, Composer composer, int i) {
        composer.startReplaceGroup(-342544135);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-342544135, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.toTextMarkdown (SduiAccordionRow.kt:60)");
        }
        String text = markdownText.getText();
        int resourceId = UtilKt.toResourceId(markdownText.getStyle());
        Color composeColor = SduiColors2.toComposeColor(markdownText.getColor(), composer, 0);
        if (composeColor != null) {
            j = composeColor.getValue();
        }
        Color colorM6701boximpl = Color.m6701boximpl(j);
        ThemedColor link_color_override = markdownText.getLink_color_override();
        BentoBaseRowState.Text.Markdown markdown = new BentoBaseRowState.Text.Markdown(text, resourceId, colorM6701boximpl, link_color_override == null ? null : SduiColors2.toComposeColor(link_color_override, composer, 0), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return markdown;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SduiAccordionRow$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }
}

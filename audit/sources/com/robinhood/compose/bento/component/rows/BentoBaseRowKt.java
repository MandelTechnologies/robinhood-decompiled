package com.robinhood.compose.bento.component.rows;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.RippleKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyKey;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.compose.AsyncImagePainter;
import coil.compose.SingletonAsyncImagePainter;
import com.adjust.sdk.Constants;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.compose.bento.component.BentoFlagIcon;
import com.robinhood.compose.bento.component.BentoPogKt;
import com.robinhood.compose.bento.component.BentoProgressIndicator2;
import com.robinhood.compose.bento.component.BentoProgressIndicator3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.text.BentoMarkdownSpannedText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.extensions2;

/* compiled from: BentoBaseRow.kt */
@Metadata(m3635d1 = {"\u0000\u0086\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0099\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0015H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a«\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00182\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0019\u001a\u00020\u000f2\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0015H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a[\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0019\u001a\u00020\u000f2\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0015H\u0007¢\u0006\u0004\b\u001f\u0010 \u001a)\u0010!\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\"\u001a?\u0010#\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u00132\u0014\b\u0002\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020'0&H\u0001¢\u0006\u0004\b(\u0010)\u001a;\u0010#\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020*2\u0006\u0010$\u001a\u00020\u00132\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0015H\u0001¢\u0006\u0004\b(\u0010+\u001a=\u0010,\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010*2\u0006\u0010$\u001a\u00020\u00132\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0015H\u0001¢\u0006\u0004\b-\u0010+\u001aC\u0010.\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010/\u001a\u0004\u0018\u00010*2\u0006\u00100\u001a\u0002012\u0006\u0010$\u001a\u00020\u00132\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0015H\u0003¢\u0006\u0004\b2\u00103\u001a!\u00104\u001a\u00020\u00012\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u00105\u001a\u0015\u00106\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0002\u00107\u001a\u0019\u00108\u001a\u00020\u00132\b\u00109\u001a\u0004\u0018\u00010\u0013H\u0003¢\u0006\u0004\b:\u0010;\u001a\r\u0010?\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010@\u001a\r\u0010A\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010@\u001a\u0015\u0010B\u001a\u00020\u00012\u0006\u0010C\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010D\"\u0014\u0010<\u001a\b\u0012\u0004\u0012\u00020>0=X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0017\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001e0F¢\u0006\b\n\u0000\u001a\u0004\bG\u0010H\"/\u0010J\u001a\u00020\u001e*\u00020K2\u0006\u0010I\u001a\u00020\u001e8B@BX\u0082\u008e\u0002¢\u0006\u0012\u001a\u0004\bN\u0010O\"\u0004\bP\u0010Q*\u0004\bL\u0010M¨\u0006R²\u0006\n\u0010S\u001a\u00020\u000fX\u008a\u008e\u0002"}, m3636d2 = {"BentoBaseRow", "", "modifier", "Landroidx/compose/ui/Modifier;", "start", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start;", "primaryText", "", "secondaryText", "markdownSecondaryText", Constants.REFERRER_API_META, "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Meta;", "end", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$End;", "showBottomDivider", "", "enabled", "loading", "onClickIndicationColor", "Landroidx/compose/ui/graphics/Color;", "onClick", "Lkotlin/Function0;", "BentoBaseRow-ygcbOzY", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Meta;Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$End;ZZZJLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/text/AnnotatedString;", "removeVerticalPadding", "removeHorizontalPadding", "BentoBaseRow-bcLT7KE", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/AnnotatedString;Ljava/lang/String;Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Meta;Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$End;ZZZZZJLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "state", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState;", "BentoBaseRow-cd68TDI", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState;ZZZJLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "RowStartElement", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start;ZLandroidx/compose/runtime/Composer;II)V", "RowPrimaryElement", ResourceTypes.COLOR, "inlineContent", "Lkotlinx/collections/immutable/ImmutableMap;", "Landroidx/compose/foundation/text/InlineTextContent;", "RowPrimaryElement-cf5BqRc", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/AnnotatedString;JLkotlinx/collections/immutable/ImmutableMap;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Text;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Text;JLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "RowSecondaryElement", "RowSecondaryElement-cf5BqRc", "RowTextElement", "text", ResourceTypes.STYLE, "Landroidx/compose/ui/text/TextStyle;", "RowTextElement-uDo3WH8", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Text;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "RowMetaElement", "(Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Meta;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "RowEndElement", "(Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$End;Landroidx/compose/runtime/Composer;I)V", "maybeOverrideForegroundColor", "override", "maybeOverrideForegroundColor-oJZG2nU", "(Landroidx/compose/ui/graphics/Color;Landroidx/compose/runtime/Composer;I)J", "LocalRowColorState", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/robinhood/compose/bento/component/rows/RowColorState;", "PreviewBaseRowsDay", "(Landroidx/compose/runtime/Composer;I)V", "PreviewBaseRowsNight", "BaseRows", "isDay", "(ZLandroidx/compose/runtime/Composer;I)V", "BentoBaseRowSemanticKey", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getBentoBaseRowSemanticKey", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "<set-?>", "bentoBaseRowState", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "getBentoBaseRowState$delegate", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/Object;", "getBentoBaseRowState", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState;", "setBentoBaseRowState", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState;)V", "lib-compose-bento_externalRelease", "showBackupText"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class BentoBaseRowKt {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(BentoBaseRowKt.class, "bentoBaseRowState", "getBentoBaseRowState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState;", 1))};
    private static final CompositionLocal6<RowColorState> LocalRowColorState = CompositionLocal3.compositionLocalOf$default(null, new Function0() { // from class: com.robinhood.compose.bento.component.rows.BentoBaseRowKt$$ExternalSyntheticLambda13
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BentoBaseRowKt.LocalRowColorState$lambda$27();
        }
    }, 1, null);
    private static final SemanticsPropertyKey<BentoBaseRowState> BentoBaseRowSemanticKey = new SemanticsPropertyKey<>("BentoBaseRowStateKey", null, 2, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BaseRows$lambda$30(boolean z, int i, Composer composer, int i2) {
        BaseRows(z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoBaseRow_bcLT7KE$lambda$2(Modifier modifier, BentoBaseRowState.Start start, AnnotatedString annotatedString, AnnotatedString annotatedString2, String str, BentoBaseRowState.Meta meta, BentoBaseRowState.End end, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, long j, Function0 function0, int i, int i2, int i3, Composer composer, int i4) {
        m20914BentoBaseRowbcLT7KE(modifier, start, annotatedString, annotatedString2, str, meta, end, z, z2, z3, z4, z5, j, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoBaseRow_cd68TDI$lambda$8(Modifier modifier, BentoBaseRowState bentoBaseRowState, boolean z, boolean z2, boolean z3, long j, Function0 function0, int i, int i2, Composer composer, int i3) {
        m20915BentoBaseRowcd68TDI(modifier, bentoBaseRowState, z, z2, z3, j, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoBaseRow_ygcbOzY$lambda$1(Modifier modifier, BentoBaseRowState.Start start, String str, String str2, String str3, BentoBaseRowState.Meta meta, BentoBaseRowState.End end, boolean z, boolean z2, boolean z3, long j, Function0 function0, int i, int i2, int i3, Composer composer, int i4) {
        m20916BentoBaseRowygcbOzY(modifier, start, str, str2, str3, meta, end, z, z2, z3, j, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewBaseRowsDay$lambda$28(int i, Composer composer, int i2) {
        PreviewBaseRowsDay(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewBaseRowsNight$lambda$29(int i, Composer composer, int i2) {
        PreviewBaseRowsNight(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RowEndElement$lambda$26(BentoBaseRowState.End end, int i, Composer composer, int i2) {
        RowEndElement(end, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RowMetaElement$lambda$25(BentoBaseRowState.Meta meta, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RowMetaElement(meta, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RowPrimaryElement_cf5BqRc$lambda$21(Modifier modifier, AnnotatedString annotatedString, long j, ImmutableMap immutableMap, int i, int i2, Composer composer, int i3) {
        m20917RowPrimaryElementcf5BqRc(modifier, annotatedString, j, (ImmutableMap<String, InlineTextContent>) immutableMap, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RowPrimaryElement_cf5BqRc$lambda$22(Modifier modifier, BentoBaseRowState.Text text, long j, Function0 function0, int i, int i2, Composer composer, int i3) {
        m20918RowPrimaryElementcf5BqRc(modifier, text, j, (Function0<Unit>) function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RowSecondaryElement_cf5BqRc$lambda$23(Modifier modifier, BentoBaseRowState.Text text, long j, Function0 function0, int i, int i2, Composer composer, int i3) {
        m20919RowSecondaryElementcf5BqRc(modifier, text, j, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RowStartElement$lambda$20(Modifier modifier, BentoBaseRowState.Start start, boolean z, int i, int i2, Composer composer, int i3) {
        RowStartElement(modifier, start, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RowTextElement_uDo3WH8$lambda$24(Modifier modifier, BentoBaseRowState.Text text, TextStyle textStyle, long j, Function0 function0, int i, int i2, Composer composer, int i3) {
        m20920RowTextElementuDo3WH8(modifier, text, textStyle, j, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    private static final boolean RowStartElement$lambda$18$lambda$13(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0104  */
    /* renamed from: BentoBaseRow-ygcbOzY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m20916BentoBaseRowygcbOzY(Modifier modifier, BentoBaseRowState.Start start, String str, String str2, String str3, BentoBaseRowState.Meta meta, BentoBaseRowState.End end, boolean z, boolean z2, boolean z3, long j, Function0<Unit> function0, Composer composer, final int i, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        BentoBaseRowState.Start start2;
        int i5;
        String str4;
        int i6;
        int i7;
        String str5;
        int i8;
        BentoBaseRowState.Meta meta2;
        int i9;
        BentoBaseRowState.End end2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        long jM6726getUnspecified0d7_KjU;
        int i18;
        int i19;
        int i20;
        final String str6;
        final String str7;
        final Modifier modifier3;
        final BentoBaseRowState.Start start3;
        final String str8;
        final BentoBaseRowState.Meta meta3;
        final BentoBaseRowState.End end3;
        final boolean z4;
        final boolean z5;
        final boolean z6;
        final long j2;
        final Function0<Unit> function02;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1346594510);
        int i21 = i3 & 1;
        if (i21 != 0) {
            i4 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i4 = i;
        }
        int i22 = i3 & 2;
        if (i22 != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                start2 = start;
                i4 |= composerStartRestartGroup.changed(start2) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else {
                if ((i & 384) == 0) {
                    str4 = str;
                    i4 |= composerStartRestartGroup.changed(str4) ? 256 : 128;
                }
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        i4 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
                    }
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            str5 = str3;
                            i4 |= composerStartRestartGroup.changed(str5) ? 16384 : 8192;
                        }
                        i8 = i3 & 32;
                        if (i8 != 0) {
                            i4 |= 196608;
                            meta2 = meta;
                        } else {
                            meta2 = meta;
                            if ((i & 196608) == 0) {
                                i4 |= composerStartRestartGroup.changed(meta2) ? 131072 : 65536;
                            }
                        }
                        i9 = i3 & 64;
                        if (i9 != 0) {
                            i4 |= 1572864;
                            end2 = end;
                        } else {
                            end2 = end;
                            if ((i & 1572864) == 0) {
                                i4 |= composerStartRestartGroup.changed(end2) ? 1048576 : 524288;
                            }
                        }
                        i10 = i3 & 128;
                        if (i10 != 0) {
                            i4 |= 12582912;
                        } else {
                            if ((i & 12582912) == 0) {
                                i11 = i10;
                                i4 |= composerStartRestartGroup.changed(z) ? 8388608 : 4194304;
                            }
                            i12 = i3 & 256;
                            if (i12 == 0) {
                                i4 |= 100663296;
                            } else {
                                if ((i & 100663296) == 0) {
                                    i13 = i12;
                                    i4 |= composerStartRestartGroup.changed(z2) ? 67108864 : 33554432;
                                }
                                i14 = i3 & 512;
                                if (i14 == 0) {
                                    if ((i & 805306368) == 0) {
                                        i15 = i14;
                                        i4 |= composerStartRestartGroup.changed(z3) ? 536870912 : 268435456;
                                    }
                                    i16 = i3 & 1024;
                                    if (i16 == 0) {
                                        i18 = i2 | 6;
                                        i17 = i21;
                                        jM6726getUnspecified0d7_KjU = j;
                                    } else if ((i2 & 6) == 0) {
                                        i17 = i21;
                                        jM6726getUnspecified0d7_KjU = j;
                                        i18 = i2 | (composerStartRestartGroup.changed(jM6726getUnspecified0d7_KjU) ? 4 : 2);
                                    } else {
                                        i17 = i21;
                                        jM6726getUnspecified0d7_KjU = j;
                                        i18 = i2;
                                    }
                                    i19 = i3 & 2048;
                                    if (i19 == 0) {
                                        i18 |= 48;
                                    } else if ((i2 & 48) == 0) {
                                        i18 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
                                    }
                                    i20 = i18;
                                    if ((i4 & 306783379) != 306783378 && (i20 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        z4 = z;
                                        end3 = end2;
                                        modifier3 = modifier2;
                                        str8 = str5;
                                        meta3 = meta2;
                                        start3 = start2;
                                        z5 = z2;
                                        z6 = z3;
                                        j2 = jM6726getUnspecified0d7_KjU;
                                        str6 = str4;
                                        str7 = str2;
                                        function02 = function0;
                                    } else {
                                        Modifier modifier4 = i17 == 0 ? Modifier.INSTANCE : modifier2;
                                        if (i22 != 0) {
                                            start2 = null;
                                        }
                                        String str9 = i5 == 0 ? "" : str4;
                                        String str10 = i6 == 0 ? null : str2;
                                        if (i7 != 0) {
                                            str5 = null;
                                        }
                                        if (i8 != 0) {
                                            meta2 = null;
                                        }
                                        if (i9 != 0) {
                                            end2 = null;
                                        }
                                        boolean z7 = i11 == 0 ? true : z;
                                        boolean z8 = i13 == 0 ? z2 : true;
                                        boolean z9 = i15 == 0 ? false : z3;
                                        if (i16 != 0) {
                                            jM6726getUnspecified0d7_KjU = Color.INSTANCE.m6726getUnspecified0d7_KjU();
                                        }
                                        long j3 = jM6726getUnspecified0d7_KjU;
                                        Function0<Unit> function03 = i19 == 0 ? null : function0;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1346594510, i4, i20, "com.robinhood.compose.bento.component.rows.BentoBaseRow (BentoBaseRow.kt:104)");
                                        }
                                        int i23 = i20 << 6;
                                        Modifier modifier5 = modifier4;
                                        BentoBaseRowState.End end4 = end2;
                                        String str11 = str5;
                                        BentoBaseRowState.Meta meta4 = meta2;
                                        BentoBaseRowState.Start start4 = start2;
                                        boolean z10 = z8;
                                        boolean z11 = z7;
                                        m20914BentoBaseRowbcLT7KE(modifier5, start4, new AnnotatedString(str9, null, 2, null), str10 == null ? new AnnotatedString(str10, null, 2, null) : null, str11, meta4, end4, z11, false, false, z10, z9, j3, function03, composerStartRestartGroup, i4 & 33546366, ((i4 >> 24) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | (i23 & 896) | (i23 & 7168), 768);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        str6 = str9;
                                        str7 = str10;
                                        modifier3 = modifier5;
                                        start3 = start4;
                                        str8 = str11;
                                        meta3 = meta4;
                                        end3 = end4;
                                        z4 = z11;
                                        z5 = z10;
                                        z6 = z9;
                                        j2 = j3;
                                        function02 = function03;
                                    }
                                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup == null) {
                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoBaseRowKt$$ExternalSyntheticLambda6
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                return BentoBaseRowKt.BentoBaseRow_ygcbOzY$lambda$1(modifier3, start3, str6, str7, str8, meta3, end3, z4, z5, z6, j2, function02, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i4 |= 805306368;
                                i15 = i14;
                                i16 = i3 & 1024;
                                if (i16 == 0) {
                                }
                                i19 = i3 & 2048;
                                if (i19 == 0) {
                                }
                                i20 = i18;
                                if ((i4 & 306783379) != 306783378) {
                                    if (i17 == 0) {
                                    }
                                    if (i22 != 0) {
                                    }
                                    if (i5 == 0) {
                                    }
                                    if (i6 == 0) {
                                    }
                                    if (i7 != 0) {
                                    }
                                    if (i8 != 0) {
                                    }
                                    if (i9 != 0) {
                                    }
                                    if (i11 == 0) {
                                    }
                                    if (i13 == 0) {
                                    }
                                    if (i15 == 0) {
                                    }
                                    if (i16 != 0) {
                                    }
                                    long j32 = jM6726getUnspecified0d7_KjU;
                                    if (i19 == 0) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    int i232 = i20 << 6;
                                    Modifier modifier52 = modifier4;
                                    BentoBaseRowState.End end42 = end2;
                                    String str112 = str5;
                                    BentoBaseRowState.Meta meta42 = meta2;
                                    BentoBaseRowState.Start start42 = start2;
                                    boolean z102 = z8;
                                    boolean z112 = z7;
                                    m20914BentoBaseRowbcLT7KE(modifier52, start42, new AnnotatedString(str9, null, 2, null), str10 == null ? new AnnotatedString(str10, null, 2, null) : null, str112, meta42, end42, z112, false, false, z102, z9, j32, function03, composerStartRestartGroup, i4 & 33546366, ((i4 >> 24) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | (i232 & 896) | (i232 & 7168), 768);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    str6 = str9;
                                    str7 = str10;
                                    modifier3 = modifier52;
                                    start3 = start42;
                                    str8 = str112;
                                    meta3 = meta42;
                                    end3 = end42;
                                    z4 = z112;
                                    z5 = z102;
                                    z6 = z9;
                                    j2 = j32;
                                    function02 = function03;
                                }
                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                }
                            }
                            i13 = i12;
                            i14 = i3 & 512;
                            if (i14 == 0) {
                            }
                            i15 = i14;
                            i16 = i3 & 1024;
                            if (i16 == 0) {
                            }
                            i19 = i3 & 2048;
                            if (i19 == 0) {
                            }
                            i20 = i18;
                            if ((i4 & 306783379) != 306783378) {
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                            }
                        }
                        i11 = i10;
                        i12 = i3 & 256;
                        if (i12 == 0) {
                        }
                        i13 = i12;
                        i14 = i3 & 512;
                        if (i14 == 0) {
                        }
                        i15 = i14;
                        i16 = i3 & 1024;
                        if (i16 == 0) {
                        }
                        i19 = i3 & 2048;
                        if (i19 == 0) {
                        }
                        i20 = i18;
                        if ((i4 & 306783379) != 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    str5 = str3;
                    i8 = i3 & 32;
                    if (i8 != 0) {
                    }
                    i9 = i3 & 64;
                    if (i9 != 0) {
                    }
                    i10 = i3 & 128;
                    if (i10 != 0) {
                    }
                    i11 = i10;
                    i12 = i3 & 256;
                    if (i12 == 0) {
                    }
                    i13 = i12;
                    i14 = i3 & 512;
                    if (i14 == 0) {
                    }
                    i15 = i14;
                    i16 = i3 & 1024;
                    if (i16 == 0) {
                    }
                    i19 = i3 & 2048;
                    if (i19 == 0) {
                    }
                    i20 = i18;
                    if ((i4 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                str5 = str3;
                i8 = i3 & 32;
                if (i8 != 0) {
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                }
                i10 = i3 & 128;
                if (i10 != 0) {
                }
                i11 = i10;
                i12 = i3 & 256;
                if (i12 == 0) {
                }
                i13 = i12;
                i14 = i3 & 512;
                if (i14 == 0) {
                }
                i15 = i14;
                i16 = i3 & 1024;
                if (i16 == 0) {
                }
                i19 = i3 & 2048;
                if (i19 == 0) {
                }
                i20 = i18;
                if ((i4 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            str4 = str;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            str5 = str3;
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            i9 = i3 & 64;
            if (i9 != 0) {
            }
            i10 = i3 & 128;
            if (i10 != 0) {
            }
            i11 = i10;
            i12 = i3 & 256;
            if (i12 == 0) {
            }
            i13 = i12;
            i14 = i3 & 512;
            if (i14 == 0) {
            }
            i15 = i14;
            i16 = i3 & 1024;
            if (i16 == 0) {
            }
            i19 = i3 & 2048;
            if (i19 == 0) {
            }
            i20 = i18;
            if ((i4 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        start2 = start;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        str4 = str;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        str5 = str3;
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        i9 = i3 & 64;
        if (i9 != 0) {
        }
        i10 = i3 & 128;
        if (i10 != 0) {
        }
        i11 = i10;
        i12 = i3 & 256;
        if (i12 == 0) {
        }
        i13 = i12;
        i14 = i3 & 512;
        if (i14 == 0) {
        }
        i15 = i14;
        i16 = i3 & 1024;
        if (i16 == 0) {
        }
        i19 = i3 & 2048;
        if (i19 == 0) {
        }
        i20 = i18;
        if ((i4 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:208:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0128  */
    /* renamed from: BentoBaseRow-bcLT7KE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m20914BentoBaseRowbcLT7KE(Modifier modifier, BentoBaseRowState.Start start, final AnnotatedString primaryText, AnnotatedString annotatedString, String str, BentoBaseRowState.Meta meta, BentoBaseRowState.End end, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, long j, Function0<Unit> function0, Composer composer, final int i, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        BentoBaseRowState.Start start2;
        int i5;
        int i6;
        String str2;
        int i7;
        BentoBaseRowState.Meta meta2;
        int i8;
        BentoBaseRowState.End end2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        long jM6726getUnspecified0d7_KjU;
        int i21;
        int i22;
        int i23;
        final boolean z6;
        Modifier modifier3;
        final Modifier modifier4;
        Composer composer2;
        final Function0<Unit> function02;
        final BentoBaseRowState.End end3;
        final boolean z7;
        final AnnotatedString annotatedString2;
        final BentoBaseRowState.Start start3;
        final boolean z8;
        final boolean z9;
        final String str3;
        final BentoBaseRowState.Meta meta3;
        final boolean z10;
        final long j2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1158860612);
        int i24 = i3 & 1;
        if (i24 != 0) {
            i4 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i4 = i;
        }
        int i25 = i3 & 2;
        if (i25 != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                start2 = start;
                i4 |= composerStartRestartGroup.changed(start2) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                i4 |= composerStartRestartGroup.changed(primaryText) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    i4 |= composerStartRestartGroup.changed(annotatedString) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        str2 = str;
                        i4 |= composerStartRestartGroup.changed(str2) ? 16384 : 8192;
                    }
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= 196608;
                        meta2 = meta;
                    } else {
                        meta2 = meta;
                        if ((i & 196608) == 0) {
                            i4 |= composerStartRestartGroup.changed(meta2) ? 131072 : 65536;
                        }
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                        end2 = end;
                    } else {
                        end2 = end;
                        if ((i & 1572864) == 0) {
                            i4 |= composerStartRestartGroup.changed(end2) ? 1048576 : 524288;
                        }
                    }
                    i9 = i3 & 128;
                    if (i9 == 0) {
                        i4 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i4 |= composerStartRestartGroup.changed(z) ? 8388608 : 4194304;
                    }
                    i10 = i3 & 256;
                    if (i10 == 0) {
                        i4 |= 100663296;
                    } else {
                        if ((i & 100663296) == 0) {
                            i11 = i10;
                            i4 |= composerStartRestartGroup.changed(z2) ? 67108864 : 33554432;
                        }
                        i12 = i3 & 512;
                        if (i12 == 0) {
                            if ((i & 805306368) == 0) {
                                i13 = i12;
                                i4 |= composerStartRestartGroup.changed(z3) ? 536870912 : 268435456;
                            }
                            i14 = i3 & 1024;
                            if (i14 == 0) {
                                i16 = i2 | 6;
                                i15 = i14;
                            } else if ((i2 & 6) == 0) {
                                i15 = i14;
                                i16 = i2 | (composerStartRestartGroup.changed(z4) ? 4 : 2);
                            } else {
                                i15 = i14;
                                i16 = i2;
                            }
                            i17 = i3 & 2048;
                            if (i17 == 0) {
                                i16 |= 48;
                                i18 = i17;
                            } else if ((i2 & 48) == 0) {
                                i18 = i17;
                                i16 |= composerStartRestartGroup.changed(z5) ? 32 : 16;
                            } else {
                                i18 = i17;
                            }
                            int i26 = i16;
                            i19 = i3 & 4096;
                            if (i19 == 0) {
                                i21 = i26 | 384;
                                i20 = i24;
                                jM6726getUnspecified0d7_KjU = j;
                            } else {
                                i20 = i24;
                                jM6726getUnspecified0d7_KjU = j;
                                if ((i2 & 384) == 0) {
                                    i21 = i26 | (composerStartRestartGroup.changed(jM6726getUnspecified0d7_KjU) ? 256 : 128);
                                } else {
                                    i21 = i26;
                                }
                            }
                            i22 = i3 & 8192;
                            if (i22 == 0) {
                                i23 = i21 | 3072;
                            } else {
                                int i27 = i21;
                                if ((i2 & 3072) == 0) {
                                    i27 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
                                }
                                i23 = i27;
                            }
                            if ((i4 & 306783379) != 306783378 && (i23 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.skipToGroupEnd();
                                annotatedString2 = annotatedString;
                                z9 = z3;
                                z6 = z4;
                                function02 = function0;
                                composer2 = composerStartRestartGroup;
                                modifier4 = modifier2;
                                str3 = str2;
                                start3 = start2;
                                z8 = z2;
                                z10 = z5;
                                BentoBaseRowState.End end4 = end2;
                                z7 = z;
                                long j3 = jM6726getUnspecified0d7_KjU;
                                end3 = end4;
                                meta3 = meta2;
                                j2 = j3;
                            } else {
                                Modifier modifier5 = i20 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i25 != 0) {
                                    start2 = null;
                                }
                                AnnotatedString annotatedString3 = i5 == 0 ? null : annotatedString;
                                if (i6 != 0) {
                                    str2 = null;
                                }
                                if (i7 != 0) {
                                    meta2 = null;
                                }
                                if (i8 != 0) {
                                    end2 = null;
                                }
                                boolean z11 = i9 == 0 ? true : z;
                                boolean z12 = i11 == 0 ? false : z2;
                                boolean z13 = i13 == 0 ? false : z3;
                                z6 = i15 == 0 ? z4 : true;
                                boolean z14 = i18 == 0 ? z5 : false;
                                if (i19 != 0) {
                                    jM6726getUnspecified0d7_KjU = Color.INSTANCE.m6726getUnspecified0d7_KjU();
                                }
                                Function0<Unit> function03 = i22 == 0 ? null : function0;
                                if (ComposerKt.isTraceInProgress()) {
                                    modifier3 = modifier5;
                                } else {
                                    modifier3 = modifier5;
                                    ComposerKt.traceEventStart(-1158860612, i4, i23, "com.robinhood.compose.bento.component.rows.BentoBaseRow (BentoBaseRow.kt:152)");
                                }
                                AnnotatedString annotatedString4 = annotatedString3;
                                int i28 = i4 >> 15;
                                int i29 = (i4 & 14) | (i28 & 896) | (i28 & 7168) | (i28 & 57344);
                                int i30 = i23 << 9;
                                Modifier modifier6 = modifier3;
                                Function0<Unit> function04 = function03;
                                long j4 = jM6726getUnspecified0d7_KjU;
                                boolean z15 = z11;
                                boolean z16 = z12;
                                boolean z17 = z13;
                                m20915BentoBaseRowcd68TDI(modifier6, new BentoBaseRowState(start2, new BentoBaseRowState.Text.Annotated(primaryText, null, 2, null), annotatedString4, str2, meta2, end2, z6, z14), z15, z16, z17, j4, function04, composerStartRestartGroup, i29 | (458752 & i30) | (i30 & 3670016), 0);
                                modifier4 = modifier6;
                                composer2 = composerStartRestartGroup;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                function02 = function04;
                                end3 = end2;
                                z7 = z15;
                                annotatedString2 = annotatedString4;
                                start3 = start2;
                                z8 = z16;
                                z9 = z17;
                                str3 = str2;
                                meta3 = meta2;
                                z10 = z14;
                                j2 = j4;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoBaseRowKt$$ExternalSyntheticLambda7
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return BentoBaseRowKt.BentoBaseRow_bcLT7KE$lambda$2(modifier4, start3, primaryText, annotatedString2, str3, meta3, end3, z7, z8, z9, z6, z10, j2, function02, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i4 |= 805306368;
                        i13 = i12;
                        i14 = i3 & 1024;
                        if (i14 == 0) {
                        }
                        i17 = i3 & 2048;
                        if (i17 == 0) {
                        }
                        int i262 = i16;
                        i19 = i3 & 4096;
                        if (i19 == 0) {
                        }
                        i22 = i3 & 8192;
                        if (i22 == 0) {
                        }
                        if ((i4 & 306783379) != 306783378) {
                            if (i20 == 0) {
                            }
                            if (i25 != 0) {
                            }
                            if (i5 == 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i11 == 0) {
                            }
                            if (i13 == 0) {
                            }
                            if (i15 == 0) {
                            }
                            if (i18 == 0) {
                            }
                            if (i19 != 0) {
                            }
                            if (i22 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            AnnotatedString annotatedString42 = annotatedString3;
                            int i282 = i4 >> 15;
                            int i292 = (i4 & 14) | (i282 & 896) | (i282 & 7168) | (i282 & 57344);
                            int i302 = i23 << 9;
                            Modifier modifier62 = modifier3;
                            Function0<Unit> function042 = function03;
                            long j42 = jM6726getUnspecified0d7_KjU;
                            boolean z152 = z11;
                            boolean z162 = z12;
                            boolean z172 = z13;
                            m20915BentoBaseRowcd68TDI(modifier62, new BentoBaseRowState(start2, new BentoBaseRowState.Text.Annotated(primaryText, null, 2, null), annotatedString42, str2, meta2, end2, z6, z14), z152, z162, z172, j42, function042, composerStartRestartGroup, i292 | (458752 & i302) | (i302 & 3670016), 0);
                            modifier4 = modifier62;
                            composer2 = composerStartRestartGroup;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            function02 = function042;
                            end3 = end2;
                            z7 = z152;
                            annotatedString2 = annotatedString42;
                            start3 = start2;
                            z8 = z162;
                            z9 = z172;
                            str3 = str2;
                            meta3 = meta2;
                            z10 = z14;
                            j2 = j42;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i11 = i10;
                    i12 = i3 & 512;
                    if (i12 == 0) {
                    }
                    i13 = i12;
                    i14 = i3 & 1024;
                    if (i14 == 0) {
                    }
                    i17 = i3 & 2048;
                    if (i17 == 0) {
                    }
                    int i2622 = i16;
                    i19 = i3 & 4096;
                    if (i19 == 0) {
                    }
                    i22 = i3 & 8192;
                    if (i22 == 0) {
                    }
                    if ((i4 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                str2 = str;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                i9 = i3 & 128;
                if (i9 == 0) {
                }
                i10 = i3 & 256;
                if (i10 == 0) {
                }
                i11 = i10;
                i12 = i3 & 512;
                if (i12 == 0) {
                }
                i13 = i12;
                i14 = i3 & 1024;
                if (i14 == 0) {
                }
                i17 = i3 & 2048;
                if (i17 == 0) {
                }
                int i26222 = i16;
                i19 = i3 & 4096;
                if (i19 == 0) {
                }
                i22 = i3 & 8192;
                if (i22 == 0) {
                }
                if ((i4 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            str2 = str;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            i9 = i3 & 128;
            if (i9 == 0) {
            }
            i10 = i3 & 256;
            if (i10 == 0) {
            }
            i11 = i10;
            i12 = i3 & 512;
            if (i12 == 0) {
            }
            i13 = i12;
            i14 = i3 & 1024;
            if (i14 == 0) {
            }
            i17 = i3 & 2048;
            if (i17 == 0) {
            }
            int i262222 = i16;
            i19 = i3 & 4096;
            if (i19 == 0) {
            }
            i22 = i3 & 8192;
            if (i22 == 0) {
            }
            if ((i4 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        start2 = start;
        if ((i3 & 4) == 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        str2 = str;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        i9 = i3 & 128;
        if (i9 == 0) {
        }
        i10 = i3 & 256;
        if (i10 == 0) {
        }
        i11 = i10;
        i12 = i3 & 512;
        if (i12 == 0) {
        }
        i13 = i12;
        i14 = i3 & 1024;
        if (i14 == 0) {
        }
        i17 = i3 & 2048;
        if (i17 == 0) {
        }
        int i2622222 = i16;
        i19 = i3 & 4096;
        if (i19 == 0) {
        }
        i22 = i3 & 8192;
        if (i22 == 0) {
        }
        if ((i4 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0115  */
    /* renamed from: BentoBaseRow-cd68TDI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m20915BentoBaseRowcd68TDI(Modifier modifier, final BentoBaseRowState state, boolean z, boolean z2, boolean z3, long j, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        final long jM6726getUnspecified0d7_KjU;
        int i7;
        final Function0<Unit> function02;
        Modifier modifierM4891clickableO2vRcR0$default;
        boolean z6;
        Object objRememberedValue;
        final boolean z7;
        Composer composer2;
        final Modifier modifier3;
        final boolean z8;
        final Function0<Unit> function03;
        final boolean z9;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(849725861);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(state) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    z4 = z2;
                    i3 |= composerStartRestartGroup.changed(z4) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 == 0) {
                    if ((i & 24576) == 0) {
                        z5 = z3;
                        i3 |= composerStartRestartGroup.changed(z5) ? 16384 : 8192;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                        jM6726getUnspecified0d7_KjU = j;
                    } else {
                        jM6726getUnspecified0d7_KjU = j;
                        if ((196608 & i) == 0) {
                            i3 |= composerStartRestartGroup.changed(jM6726getUnspecified0d7_KjU) ? 131072 : 65536;
                        }
                    }
                    i7 = i2 & 64;
                    if (i7 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function0) ? 1048576 : 524288;
                    }
                    if ((i3 & 599187) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                        final boolean z10 = i9 == 0 ? true : z;
                        if (i4 != 0) {
                            z4 = false;
                        }
                        final boolean z11 = i5 == 0 ? false : z5;
                        if (i6 != 0) {
                            jM6726getUnspecified0d7_KjU = Color.INSTANCE.m6726getUnspecified0d7_KjU();
                        }
                        function02 = i7 == 0 ? null : function0;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(849725861, i3, -1, "com.robinhood.compose.bento.component.rows.BentoBaseRow (BentoBaseRow.kt:185)");
                        }
                        long j2 = jM6726getUnspecified0d7_KjU;
                        final RowColorState rowColorState = new RowColorState(BentoRowColors.INSTANCE.m20986default(composerStartRestartGroup, 6), state.getEnabled());
                        composerStartRestartGroup.startReplaceGroup(542779953);
                        if (function02 == null) {
                            boolean enabled = state.getEnabled();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            Composer.Companion companion = Composer.INSTANCE;
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = InteractionSource2.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue2;
                            composerStartRestartGroup.endReplaceGroup();
                            IndicationNodeFactory indicationNodeFactoryM5937rippleH2RKhps$default = RippleKt.m5937rippleH2RKhps$default(false, 0.0f, j2, 3, null);
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            boolean z12 = ((i3 & 112) == 32) | ((3670016 & i3) == 1048576);
                            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (z12 || objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = new Function0() { // from class: com.robinhood.compose.bento.component.rows.BentoBaseRowKt$$ExternalSyntheticLambda14
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return BentoBaseRowKt.BentoBaseRow_cd68TDI$lambda$5$lambda$4(state, function02);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(modifier4, interactionSource3, indicationNodeFactoryM5937rippleH2RKhps$default, enabled, null, null, (Function0) objRememberedValue3, 24, null);
                        } else {
                            modifierM4891clickableO2vRcR0$default = modifier4;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        z6 = (i3 & 112) != 32;
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z6 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.compose.bento.component.rows.BentoBaseRowKt$$ExternalSyntheticLambda15
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return BentoBaseRowKt.BentoBaseRow_cd68TDI$lambda$7$lambda$6(state, (SemanticsPropertyReceiver) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        final Modifier modifierThen = modifierM4891clickableO2vRcR0$default.then(SemanticsModifier6.semantics$default(companion2, false, (Function1) objRememberedValue, 1, null));
                        final boolean z13 = z4;
                        final Function0<Unit> function04 = function02;
                        CompositionLocal3.CompositionLocalProvider(LocalRowColorState.provides(rowColorState), ComposableLambda3.rememberComposableLambda(-124085019, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoBaseRowKt$BentoBaseRow$4
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i10) {
                                if ((i10 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-124085019, i10, -1, "com.robinhood.compose.bento.component.rows.BentoBaseRow.<anonymous> (BentoBaseRow.kt:204)");
                                }
                                Modifier modifier5 = modifierThen;
                                final BentoBaseRowState bentoBaseRowState = state;
                                final RowColorState rowColorState2 = rowColorState;
                                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-396099671, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoBaseRowKt$BentoBaseRow$4.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i11) {
                                        if ((i11 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-396099671, i11, -1, "com.robinhood.compose.bento.component.rows.BentoBaseRow.<anonymous>.<anonymous> (BentoBaseRow.kt:207)");
                                        }
                                        BentoBaseRowKt.RowStartElement(LocalShowPlaceholder.withBentoCirclePlaceholder$default(Modifier.INSTANCE, false, 1, null), bentoBaseRowState.getStart(), rowColorState2.getEnabled(), composer4, 0, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54);
                                final BentoBaseRowState bentoBaseRowState2 = state;
                                final RowColorState rowColorState3 = rowColorState;
                                final Function0<Unit> function05 = function04;
                                ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(775109000, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoBaseRowKt$BentoBaseRow$4.2
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i11) {
                                        if ((i11 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(775109000, i11, -1, "com.robinhood.compose.bento.component.rows.BentoBaseRow.<anonymous>.<anonymous> (BentoBaseRow.kt:214)");
                                        }
                                        BentoBaseRowKt.m20918RowPrimaryElementcf5BqRc(LocalShowPlaceholder.withBentoPlaceholder$default(Modifier.INSTANCE, false, null, 3, null), bentoBaseRowState2.getPrimaryText(), rowColorState3.m21048getFg0d7_KjU(), function05, composer4, 0, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54);
                                final BentoBaseRowState bentoBaseRowState3 = state;
                                final RowColorState rowColorState4 = rowColorState;
                                final Function0<Unit> function06 = function04;
                                ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambda3.rememberComposableLambda(1946317671, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoBaseRowKt$BentoBaseRow$4.3
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i11) {
                                        if ((i11 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1946317671, i11, -1, "com.robinhood.compose.bento.component.rows.BentoBaseRow.<anonymous>.<anonymous> (BentoBaseRow.kt:222)");
                                        }
                                        BentoBaseRowKt.m20919RowSecondaryElementcf5BqRc(LocalShowPlaceholder.withBentoPlaceholder$default(Modifier.INSTANCE, false, null, 3, null), bentoBaseRowState3.getSecondaryText(), rowColorState4.m21049getFgSecondary0d7_KjU(), function06, composer4, 0, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54);
                                final BentoBaseRowState bentoBaseRowState4 = state;
                                ComposableLambda composableLambdaRememberComposableLambda4 = ComposableLambda3.rememberComposableLambda(-1177440954, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoBaseRowKt$BentoBaseRow$4.4
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i11) {
                                        if ((i11 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1177440954, i11, -1, "com.robinhood.compose.bento.component.rows.BentoBaseRow.<anonymous>.<anonymous> (BentoBaseRow.kt:230)");
                                        }
                                        BentoBaseRowKt.RowMetaElement(bentoBaseRowState4.getMeta(), bentoBaseRowState4.getMetaModifier$lib_compose_bento_externalRelease(), composer4, 0, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54);
                                final BentoBaseRowState bentoBaseRowState5 = state;
                                BentoBaseRowLayout.BentoBaseRowLayout(modifier5, null, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, composableLambdaRememberComposableLambda3, composableLambdaRememberComposableLambda4, ComposableLambda3.rememberComposableLambda(-6232283, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoBaseRowKt$BentoBaseRow$4.5
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i11) {
                                        if ((i11 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-6232283, i11, -1, "com.robinhood.compose.bento.component.rows.BentoBaseRow.<anonymous>.<anonymous> (BentoBaseRow.kt:236)");
                                        }
                                        if (bentoBaseRowState5.getLoading()) {
                                            composer4.startReplaceGroup(-982303088);
                                            BentoProgressIndicator2.m20700BentoCircularProgressIndicatorFNF3uiM(SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(16)), BentoProgressIndicator3.f5153XS, ((Styles) composer4.consume(Styles2.getLocalStyles())).getRow(composer4, 0).getColors().m21925getCaretColor0d7_KjU(), composer4, 54, 0);
                                            composer4.endReplaceGroup();
                                        } else if (bentoBaseRowState5.getEnd() != null) {
                                            composer4.startReplaceGroup(-981981432);
                                            BentoBaseRowKt.RowEndElement(bentoBaseRowState5.getEnd(), composer4, 0);
                                            composer4.endReplaceGroup();
                                        } else {
                                            composer4.startReplaceGroup(-981868995);
                                            composer4.endReplaceGroup();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), z10, z13, z11, null, composer3, 1797504, 0, 1026);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z7 = z11;
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier4;
                        z8 = z13;
                        function03 = function04;
                        jM6726getUnspecified0d7_KjU = j2;
                        z9 = z10;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        z9 = z;
                        modifier3 = modifier2;
                        composer2 = composerStartRestartGroup;
                        z8 = z4;
                        z7 = z5;
                        function03 = function0;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoBaseRowKt$$ExternalSyntheticLambda16
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return BentoBaseRowKt.BentoBaseRow_cd68TDI$lambda$8(modifier3, state, z9, z8, z7, jM6726getUnspecified0d7_KjU, function03, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                z5 = z3;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                i7 = i2 & 64;
                if (i7 == 0) {
                }
                if ((i3 & 599187) == 599186) {
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    long j22 = jM6726getUnspecified0d7_KjU;
                    final RowColorState rowColorState2 = new RowColorState(BentoRowColors.INSTANCE.m20986default(composerStartRestartGroup, 6), state.getEnabled());
                    composerStartRestartGroup.startReplaceGroup(542779953);
                    if (function02 == null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier.Companion companion22 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    if ((i3 & 112) != 32) {
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z6) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.compose.bento.component.rows.BentoBaseRowKt$$ExternalSyntheticLambda15
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return BentoBaseRowKt.BentoBaseRow_cd68TDI$lambda$7$lambda$6(state, (SemanticsPropertyReceiver) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        final Modifier modifierThen2 = modifierM4891clickableO2vRcR0$default.then(SemanticsModifier6.semantics$default(companion22, false, (Function1) objRememberedValue, 1, null));
                        final boolean z132 = z4;
                        final Function0<Unit> function042 = function02;
                        CompositionLocal3.CompositionLocalProvider(LocalRowColorState.provides(rowColorState2), ComposableLambda3.rememberComposableLambda(-124085019, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoBaseRowKt$BentoBaseRow$4
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i10) {
                                if ((i10 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-124085019, i10, -1, "com.robinhood.compose.bento.component.rows.BentoBaseRow.<anonymous> (BentoBaseRow.kt:204)");
                                }
                                Modifier modifier5 = modifierThen2;
                                final BentoBaseRowState bentoBaseRowState = state;
                                final RowColorState rowColorState22 = rowColorState2;
                                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-396099671, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoBaseRowKt$BentoBaseRow$4.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i11) {
                                        if ((i11 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-396099671, i11, -1, "com.robinhood.compose.bento.component.rows.BentoBaseRow.<anonymous>.<anonymous> (BentoBaseRow.kt:207)");
                                        }
                                        BentoBaseRowKt.RowStartElement(LocalShowPlaceholder.withBentoCirclePlaceholder$default(Modifier.INSTANCE, false, 1, null), bentoBaseRowState.getStart(), rowColorState22.getEnabled(), composer4, 0, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54);
                                final BentoBaseRowState bentoBaseRowState2 = state;
                                final RowColorState rowColorState3 = rowColorState2;
                                final Function0<Unit> function05 = function042;
                                ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(775109000, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoBaseRowKt$BentoBaseRow$4.2
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i11) {
                                        if ((i11 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(775109000, i11, -1, "com.robinhood.compose.bento.component.rows.BentoBaseRow.<anonymous>.<anonymous> (BentoBaseRow.kt:214)");
                                        }
                                        BentoBaseRowKt.m20918RowPrimaryElementcf5BqRc(LocalShowPlaceholder.withBentoPlaceholder$default(Modifier.INSTANCE, false, null, 3, null), bentoBaseRowState2.getPrimaryText(), rowColorState3.m21048getFg0d7_KjU(), function05, composer4, 0, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54);
                                final BentoBaseRowState bentoBaseRowState3 = state;
                                final RowColorState rowColorState4 = rowColorState2;
                                final Function0<Unit> function06 = function042;
                                ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambda3.rememberComposableLambda(1946317671, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoBaseRowKt$BentoBaseRow$4.3
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i11) {
                                        if ((i11 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1946317671, i11, -1, "com.robinhood.compose.bento.component.rows.BentoBaseRow.<anonymous>.<anonymous> (BentoBaseRow.kt:222)");
                                        }
                                        BentoBaseRowKt.m20919RowSecondaryElementcf5BqRc(LocalShowPlaceholder.withBentoPlaceholder$default(Modifier.INSTANCE, false, null, 3, null), bentoBaseRowState3.getSecondaryText(), rowColorState4.m21049getFgSecondary0d7_KjU(), function06, composer4, 0, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54);
                                final BentoBaseRowState bentoBaseRowState4 = state;
                                ComposableLambda composableLambdaRememberComposableLambda4 = ComposableLambda3.rememberComposableLambda(-1177440954, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoBaseRowKt$BentoBaseRow$4.4
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i11) {
                                        if ((i11 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1177440954, i11, -1, "com.robinhood.compose.bento.component.rows.BentoBaseRow.<anonymous>.<anonymous> (BentoBaseRow.kt:230)");
                                        }
                                        BentoBaseRowKt.RowMetaElement(bentoBaseRowState4.getMeta(), bentoBaseRowState4.getMetaModifier$lib_compose_bento_externalRelease(), composer4, 0, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54);
                                final BentoBaseRowState bentoBaseRowState5 = state;
                                BentoBaseRowLayout.BentoBaseRowLayout(modifier5, null, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, composableLambdaRememberComposableLambda3, composableLambdaRememberComposableLambda4, ComposableLambda3.rememberComposableLambda(-6232283, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoBaseRowKt$BentoBaseRow$4.5
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i11) {
                                        if ((i11 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-6232283, i11, -1, "com.robinhood.compose.bento.component.rows.BentoBaseRow.<anonymous>.<anonymous> (BentoBaseRow.kt:236)");
                                        }
                                        if (bentoBaseRowState5.getLoading()) {
                                            composer4.startReplaceGroup(-982303088);
                                            BentoProgressIndicator2.m20700BentoCircularProgressIndicatorFNF3uiM(SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(16)), BentoProgressIndicator3.f5153XS, ((Styles) composer4.consume(Styles2.getLocalStyles())).getRow(composer4, 0).getColors().m21925getCaretColor0d7_KjU(), composer4, 54, 0);
                                            composer4.endReplaceGroup();
                                        } else if (bentoBaseRowState5.getEnd() != null) {
                                            composer4.startReplaceGroup(-981981432);
                                            BentoBaseRowKt.RowEndElement(bentoBaseRowState5.getEnd(), composer4, 0);
                                            composer4.endReplaceGroup();
                                        } else {
                                            composer4.startReplaceGroup(-981868995);
                                            composer4.endReplaceGroup();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), z10, z132, z11, null, composer3, 1797504, 0, 1026);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        z7 = z11;
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier4;
                        z8 = z132;
                        function03 = function042;
                        jM6726getUnspecified0d7_KjU = j22;
                        z9 = z10;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z4 = z2;
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            z5 = z3;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            i7 = i2 & 64;
            if (i7 == 0) {
            }
            if ((i3 & 599187) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z4 = z2;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        z5 = z3;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        i7 = i2 & 64;
        if (i7 == 0) {
        }
        if ((i3 & 599187) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoBaseRow_cd68TDI$lambda$5$lambda$4(BentoBaseRowState bentoBaseRowState, Function0 function0) {
        if (!bentoBaseRowState.getLoading()) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoBaseRow_cd68TDI$lambda$7$lambda$6(BentoBaseRowState bentoBaseRowState, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        setBentoBaseRowState(semantics, bentoBaseRowState);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RowStartElement(Modifier modifier, final BentoBaseRowState.Start start, final boolean z, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1464378207);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(start) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1464378207, i3, -1, "com.robinhood.compose.bento.component.rows.RowStartElement (BentoBaseRow.kt:263)");
            }
            if (start == null) {
                composerStartRestartGroup.startReplaceGroup(1481821733);
                composerStartRestartGroup.endReplaceGroup();
            } else if (start instanceof BentoBaseRowState.Start.Icon) {
                composerStartRestartGroup.startReplaceGroup(-1308037292);
                BentoBaseRowState.Start.Icon icon = (BentoBaseRowState.Start.Icon) start;
                if (icon.getLayeredAsset() == null) {
                    composerStartRestartGroup.startReplaceGroup(-1308063518);
                    IconKt.m5871Iconww6aTOc(PainterResources_androidKt.painterResource(icon.getAsset24dp().getResourceId(), composerStartRestartGroup, 0), "Start", LocalShowPlaceholder.withBentoCirclePlaceholder$default(modifier3, false, 1, null), m20922maybeOverrideForegroundColoroJZG2nU(icon.m20944getTintQN2ZGVo(), composerStartRestartGroup, 0), composerStartRestartGroup, 48, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1307681071);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.compose.bento.component.rows.BentoBaseRowKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return BentoBaseRowKt.RowStartElement$lambda$10$lambda$9((SemanticsPropertyReceiver) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierSemantics = SemanticsModifier6.semantics(modifier3, true, (Function1) objRememberedValue);
                    Alignment.Companion companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierSemantics);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Alignment alignment = icon.getLayeredAsset().getAlignment();
                    IconKt.m5871Iconww6aTOc(PainterResources_androidKt.painterResource(icon.getAsset24dp().getResourceId(), composerStartRestartGroup, 0), (String) null, LocalShowPlaceholder.withBentoCirclePlaceholder$default(Intrinsics.areEqual(alignment, companion.getTopStart()) ? PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(2), C2002Dp.m7995constructorimpl(4), 0.0f, 0.0f, 12, null) : Intrinsics.areEqual(alignment, companion.getTopEnd()) ? PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, C2002Dp.m7995constructorimpl(4), C2002Dp.m7995constructorimpl(2), 0.0f, 9, null) : Intrinsics.areEqual(alignment, companion.getBottomStart()) ? PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(2), 0.0f, 0.0f, C2002Dp.m7995constructorimpl(4), 6, null) : Intrinsics.areEqual(alignment, companion.getBottomEnd()) ? PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(2), C2002Dp.m7995constructorimpl(4), 3, null) : Modifier.INSTANCE, false, 1, null), m20922maybeOverrideForegroundColoroJZG2nU(icon.m20944getTintQN2ZGVo(), composerStartRestartGroup, 0), composerStartRestartGroup, 48, 0);
                    IconKt.m5871Iconww6aTOc(PainterResources_androidKt.painterResource(icon.getLayeredAsset().getAsset12dp().getResourceId(), composerStartRestartGroup, 0), (String) null, boxScopeInstance.align(LocalShowPlaceholder.withBentoCirclePlaceholder$default(Modifier.INSTANCE, false, 1, null), icon.getLayeredAsset().getAlignment()), m20922maybeOverrideForegroundColoroJZG2nU(icon.m20944getTintQN2ZGVo(), composerStartRestartGroup, 0), composerStartRestartGroup, 48, 0);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
            } else if (start instanceof BentoBaseRowState.Start.Image) {
                composerStartRestartGroup.startReplaceGroup(-1305418722);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                Composer.Companion companion4 = Composer.INSTANCE;
                if (objRememberedValue2 == companion4.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.valueOf(StringsKt.isBlank(((BentoBaseRowState.Start.Image) start).getImageUrl())), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1679105433);
                BentoBaseRowState.Start.Image image = (BentoBaseRowState.Start.Image) start;
                String backupText = image.getBackupText();
                if (backupText != null && !StringsKt.isBlank(backupText) && RowStartElement$lambda$18$lambda$13(snapshotState)) {
                    BentoPogKt.m20686BentoTextPogTYpPzmw(image.getBackupText(), null, z, false, null, null, null, null, composerStartRestartGroup, i3 & 896, 250);
                    composerStartRestartGroup = composerStartRestartGroup;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1679097078);
                if (!StringsKt.isBlank(image.getImageUrl())) {
                    Modifier modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, image.getSize().getValue());
                    if (image.getClipShape() != null) {
                        modifierM5169size3ABfNKs = Clip.clip(modifierM5169size3ABfNKs, image.getClipShape());
                    }
                    Modifier modifier4 = modifierM5169size3ABfNKs;
                    String imageUrl = image.getImageUrl();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion4.getEmpty()) {
                        objRememberedValue3 = new Function1() { // from class: com.robinhood.compose.bento.component.rows.BentoBaseRowKt$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return BentoBaseRowKt.RowStartElement$lambda$18$lambda$17$lambda$16(snapshotState, (AsyncImagePainter.State.Error) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Composer composer2 = composerStartRestartGroup;
                    ImageKt.Image(SingletonAsyncImagePainter.m9121rememberAsyncImagePainterHtA5bXE(imageUrl, null, null, null, null, null, (Function1) objRememberedValue3, null, 0, null, composer2, 1572864, 958), image.getContentDescription(), modifier4, (Alignment) null, image.getContentScale(), 0.0f, (ColorFilter) null, composer2, 0, 104);
                    composerStartRestartGroup = composer2;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            } else if (start instanceof BentoBaseRowState.Start.Drawable) {
                composerStartRestartGroup.startReplaceGroup(-1304150791);
                BentoBaseRowState.Start.Drawable drawable = (BentoBaseRowState.Start.Drawable) start;
                Modifier modifierM5169size3ABfNKs2 = SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, drawable.getSize().getValue());
                if (drawable.getClipShape() != null) {
                    modifierM5169size3ABfNKs2 = Clip.clip(modifierM5169size3ABfNKs2, drawable.getClipShape());
                }
                ImageKt.Image(PainterResources_androidKt.painterResource(drawable.getDrawableRes(), composerStartRestartGroup, 0), drawable.getContentDescription(), modifierM5169size3ABfNKs2, (Alignment) null, drawable.getContentScale(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 0, 104);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (start instanceof BentoBaseRowState.Start.NumberPog) {
                    composerStartRestartGroup.startReplaceGroup(-1303566875);
                    modifier2 = modifier3;
                    BentoPogKt.m20683BentoNumberPogxqIIw2o(((BentoBaseRowState.Start.NumberPog) start).getNumber(), modifier2, z, null, composerStartRestartGroup, ((i3 << 3) & 112) | (i3 & 896), 8);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    modifier2 = modifier3;
                    if (start instanceof BentoBaseRowState.Start.PictogramPog) {
                        composerStartRestartGroup.startReplaceGroup(-1303386548);
                        BentoBaseRowState.Start.PictogramPog pictogramPog = (BentoBaseRowState.Start.PictogramPog) start;
                        BentoPogKt.m20684BentoPictogramPogRhg8lNc(pictogramPog.getAsset().getResourceId(), modifier2, z, null, null, pictogramPog.m20951getForegroundColorOverrideQN2ZGVo(), pictogramPog.m20950getBackgroundColorOverrideQN2ZGVo(), composerStartRestartGroup, ((i3 << 3) & 112) | (i3 & 896), 24);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceGroup();
                    } else if (start instanceof BentoBaseRowState.Start.TextPog) {
                        composerStartRestartGroup.startReplaceGroup(-1303064148);
                        BentoBaseRowState.Start.TextPog textPog = (BentoBaseRowState.Start.TextPog) start;
                        BentoPogKt.m20685BentoTextPogErYXqs8(textPog.getText(), modifier2, z, false, null, textPog.getSize(), textPog.getBackgroundOverride(), textPog.m20955getForegroundColorOverrideQN2ZGVo(), composerStartRestartGroup, ((i3 << 3) & 112) | (i3 & 896), 24);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        if (!(start instanceof BentoBaseRowState.Start.FlagIcon)) {
                            composerStartRestartGroup.startReplaceGroup(1481826337);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(-1302746181);
                        BentoFlagIcon.BentoFlagIcon(((BentoBaseRowState.Start.FlagIcon) start).getCountryCode(), modifier2, composerStartRestartGroup, (i3 << 3) & 112, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            modifier2 = modifier3;
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        final Modifier modifier5 = modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoBaseRowKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoBaseRowKt.RowStartElement$lambda$20(modifier5, start, z, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RowStartElement$lambda$10$lambda$9(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        return Unit.INSTANCE;
    }

    private static final void RowStartElement$lambda$18$lambda$14(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RowStartElement$lambda$18$lambda$17$lambda$16(SnapshotState snapshotState, AsyncImagePainter.State.Error it) {
        Intrinsics.checkNotNullParameter(it, "it");
        RowStartElement$lambda$18$lambda$14(snapshotState, true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* renamed from: RowPrimaryElement-cf5BqRc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m20917RowPrimaryElementcf5BqRc(Modifier modifier, final AnnotatedString primaryText, final long j, ImmutableMap<String, InlineTextContent> immutableMap, Composer composer, final int i, final int i2) {
        int i3;
        long j2;
        final ImmutableMap<String, InlineTextContent> immutableMap2;
        final Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Composer composerStartRestartGroup = composer.startRestartGroup(-601938797);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(primaryText) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            j2 = j;
        } else {
            j2 = j;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(j2) ? 256 : 128;
            }
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                immutableMap2 = immutableMap;
                i3 |= composerStartRestartGroup.changed(immutableMap2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                Modifier modifier3 = modifier;
                ImmutableMap<String, InlineTextContent> immutableMapPersistentMapOf = i5 == 0 ? extensions2.persistentMapOf() : immutableMap2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-601938797, i3, -1, "com.robinhood.compose.bento.component.rows.RowPrimaryElement (BentoBaseRow.kt:421)");
                }
                m20918RowPrimaryElementcf5BqRc(modifier3, new BentoBaseRowState.Text.Annotated(primaryText, immutableMapPersistentMapOf), j2, (Function0<Unit>) null, composerStartRestartGroup, i3 & 910, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                immutableMap2 = immutableMapPersistentMapOf;
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier2 = modifier;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoBaseRowKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BentoBaseRowKt.RowPrimaryElement_cf5BqRc$lambda$21(modifier2, primaryText, j, immutableMap2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        immutableMap2 = immutableMap;
        if ((i3 & 1171) == 1170) {
            if (i4 != 0) {
            }
            Modifier modifier32 = modifier;
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            m20918RowPrimaryElementcf5BqRc(modifier32, new BentoBaseRowState.Text.Annotated(primaryText, immutableMapPersistentMapOf), j2, (Function0<Unit>) null, composerStartRestartGroup, i3 & 910, 8);
            if (ComposerKt.isTraceInProgress()) {
            }
            immutableMap2 = immutableMapPersistentMapOf;
            modifier2 = modifier32;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* renamed from: RowPrimaryElement-cf5BqRc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m20918RowPrimaryElementcf5BqRc(Modifier modifier, final BentoBaseRowState.Text primaryText, final long j, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function02;
        final Function0<Unit> function03;
        final Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Composer composerStartRestartGroup = composer.startRestartGroup(488620329);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(primaryText) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(j) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                function02 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier;
                function03 = i5 == 0 ? null : function02;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(488620329, i3, -1, "com.robinhood.compose.bento.component.rows.RowPrimaryElement (BentoBaseRow.kt:441)");
                }
                TextStyle primaryTextStyle = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getRow(composerStartRestartGroup, 0).getTypography().getPrimaryTextStyle();
                int i6 = i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE;
                int i7 = i3 << 3;
                Modifier modifier4 = modifier3;
                m20920RowTextElementuDo3WH8(modifier4, primaryText, primaryTextStyle, j, function03, composerStartRestartGroup, i6 | (i7 & 7168) | (i7 & 57344), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier2 = modifier;
                function03 = function02;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoBaseRowKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BentoBaseRowKt.RowPrimaryElement_cf5BqRc$lambda$22(modifier2, primaryText, j, function03, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        function02 = function0;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            TextStyle primaryTextStyle2 = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getRow(composerStartRestartGroup, 0).getTypography().getPrimaryTextStyle();
            int i62 = i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE;
            int i72 = i3 << 3;
            Modifier modifier42 = modifier3;
            m20920RowTextElementuDo3WH8(modifier42, primaryText, primaryTextStyle2, j, function03, composerStartRestartGroup, i62 | (i72 & 7168) | (i72 & 57344), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier42;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* renamed from: RowSecondaryElement-cf5BqRc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m20919RowSecondaryElementcf5BqRc(Modifier modifier, final BentoBaseRowState.Text text, final long j, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        BentoBaseRowState.Text text2;
        long j2;
        final Function0<Unit> function02;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(625897499);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            text2 = text;
        } else {
            text2 = text;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(text2) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            j2 = j;
        } else {
            j2 = j;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(j2) ? 256 : 128;
            }
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                function02 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                Function0<Unit> function03 = i5 == 0 ? null : function02;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(625897499, i3, -1, "com.robinhood.compose.bento.component.rows.RowSecondaryElement (BentoBaseRow.kt:454)");
                }
                int i6 = i3 << 3;
                m20920RowTextElementuDo3WH8(modifier4, text2, ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getRow(composerStartRestartGroup, 0).getTypography().getSecondaryTextStyle(), j2, function03, composerStartRestartGroup, (i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | (i6 & 7168) | (i6 & 57344), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
                function02 = function03;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoBaseRowKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BentoBaseRowKt.RowSecondaryElement_cf5BqRc$lambda$23(modifier3, text, j, function02, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        function02 = function0;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i62 = i3 << 3;
            m20920RowTextElementuDo3WH8(modifier4, text2, ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getRow(composerStartRestartGroup, 0).getTypography().getSecondaryTextStyle(), j2, function03, composerStartRestartGroup, (i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | (i62 & 7168) | (i62 & 57344), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
            function02 = function03;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e0  */
    /* renamed from: RowTextElement-uDo3WH8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m20920RowTextElementuDo3WH8(final Modifier modifier, final BentoBaseRowState.Text text, final TextStyle textStyle, long j, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        TextStyle textStyle2;
        final long j2;
        int i4;
        Function0<Unit> function02;
        Function0<Unit> function03;
        final Function0<Unit> function04;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1933929164);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(text) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                textStyle2 = textStyle;
                i3 |= composerStartRestartGroup.changed(textStyle2) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    j2 = j;
                    i3 |= composerStartRestartGroup.changed(j2) ? 2048 : 1024;
                }
                i4 = i2 & 16;
                if (i4 == 0) {
                    if ((i & 24576) == 0) {
                        function02 = function0;
                        i3 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
                    }
                    if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                        Function0<Unit> function05 = i4 == 0 ? null : function02;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1933929164, i3, -1, "com.robinhood.compose.bento.component.rows.RowTextElement (BentoBaseRow.kt:466)");
                        }
                        if (!(text instanceof BentoBaseRowState.Text.Plain)) {
                            composerStartRestartGroup.startReplaceGroup(-992146199);
                            BentoBaseRowState.Text.Plain plain = (BentoBaseRowState.Text.Plain) text;
                            if (!StringsKt.isBlank(plain.getText())) {
                                int i5 = i3 << 3;
                                BentoText2.m20747BentoText38GnDrw(plain.getText(), modifier2, Color.m6701boximpl(j2), null, null, null, null, 0, false, 0, 0, null, 0, textStyle2, composerStartRestartGroup, (i5 & 112) | ((i3 >> 3) & 896), i5 & 7168, 8184);
                                composerStartRestartGroup = composerStartRestartGroup;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                        } else if (text instanceof BentoBaseRowState.Text.Annotated) {
                            composerStartRestartGroup.startReplaceGroup(-991836261);
                            BentoBaseRowState.Text.Annotated annotated = (BentoBaseRowState.Text.Annotated) text;
                            if (!StringsKt.isBlank(annotated.getAnnotatedString())) {
                                AnnotatedString annotatedString = annotated.getAnnotatedString();
                                ImmutableMap<String, InlineTextContent> inlineContent = annotated.getInlineContent();
                                int i6 = i3 << 3;
                                BentoText2.m20748BentoTextQnj7Zds(annotatedString, modifier, Color.m6701boximpl(j2), null, null, null, null, 0, false, 0, 0, inlineContent, null, textStyle, composerStartRestartGroup, (i6 & 112) | ((i3 >> 3) & 896), i6 & 7168, 6136);
                                composerStartRestartGroup = composerStartRestartGroup;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            if (text instanceof BentoBaseRowState.Text.Markdown) {
                                composerStartRestartGroup.startReplaceGroup(-991452512);
                                BentoBaseRowState.Text.Markdown markdown = (BentoBaseRowState.Text.Markdown) text;
                                String rawMarkdownText = markdown.getRawMarkdownText();
                                Color colorM20960getColorQN2ZGVo = markdown.m20960getColorQN2ZGVo();
                                Function0<Unit> function06 = function05;
                                BentoMarkdownSpannedText2.m21101BentoMarkdownSpannedTextTHkziT8(rawMarkdownText, modifier, Color.m6701boximpl(colorM20960getColorQN2ZGVo != null ? colorM20960getColorQN2ZGVo.getValue() : j2), markdown.m20961getLinkColorQN2ZGVo(), markdown.getTextAppearance(), null, 0, 0, function06, composerStartRestartGroup, ((i3 << 3) & 112) | ((i3 << 12) & 234881024), 224);
                                function03 = function06;
                                composerStartRestartGroup = composerStartRestartGroup;
                                composerStartRestartGroup.endReplaceGroup();
                            } else {
                                function03 = function05;
                                if (text instanceof BentoBaseRowState.Text.MarkdownV2) {
                                    composerStartRestartGroup.startReplaceGroup(-991076327);
                                    BentoMarkdownText2.BentoMarkdownText(((BentoBaseRowState.Text.MarkdownV2) text).getRawMarkdownText(), modifier, (MarkdownStyle) null, function03, (Function1<? super String, Unit>) null, composerStartRestartGroup, ((i3 << 3) & 112) | ((i3 >> 3) & 7168), 20);
                                    composerStartRestartGroup.endReplaceGroup();
                                } else {
                                    if (text != null) {
                                        composerStartRestartGroup.startReplaceGroup(1214920533);
                                        composerStartRestartGroup.endReplaceGroup();
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    composerStartRestartGroup.startReplaceGroup(-990884468);
                                    composerStartRestartGroup.endReplaceGroup();
                                }
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function04 = function03;
                        }
                        function03 = function05;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function04 = function03;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        function04 = function02;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoBaseRowKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return BentoBaseRowKt.RowTextElement_uDo3WH8$lambda$24(modifier, text, textStyle, j2, function04, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                function02 = function0;
                if ((i3 & 9363) == 9362) {
                    if (i4 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (!(text instanceof BentoBaseRowState.Text.Plain)) {
                    }
                    function03 = function05;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    function04 = function03;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            j2 = j;
            i4 = i2 & 16;
            if (i4 == 0) {
            }
            function02 = function0;
            if ((i3 & 9363) == 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        textStyle2 = textStyle;
        if ((i2 & 8) == 0) {
        }
        j2 = j;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function02 = function0;
        if ((i3 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RowMetaElement(final BentoBaseRowState.Meta meta, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1112640693);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(meta) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1112640693, i3, -1, "com.robinhood.compose.bento.component.rows.RowMetaElement (BentoBaseRow.kt:521)");
                }
                if (meta != null) {
                    composerStartRestartGroup.startReplaceGroup(199155487);
                    BentoText2.m20747BentoText38GnDrw("", null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 6, 0, 16382);
                    composer2 = composerStartRestartGroup;
                    composer2.endReplaceGroup();
                    modifier3 = modifier4;
                } else {
                    composer2 = composerStartRestartGroup;
                    if (meta instanceof BentoBaseRowState.Meta.SingleLine) {
                        composer2.startReplaceGroup(199158463);
                        modifier3 = modifier4;
                        RowMetaElementFactory.INSTANCE.SingleLine(modifier3, ((BentoBaseRowState.Meta.SingleLine) meta).getText(), composer2, ((i3 >> 3) & 14) | 384, 0);
                        composer2.endReplaceGroup();
                    } else {
                        int i5 = i3;
                        modifier3 = modifier4;
                        if (meta instanceof BentoBaseRowState.Meta.TwoLine) {
                            composer2.startReplaceGroup(199163390);
                            BentoBaseRowState.Meta.TwoLine twoLine = (BentoBaseRowState.Meta.TwoLine) meta;
                            RowMetaElementFactory.INSTANCE.TwoLine(modifier3, twoLine.getText1(), twoLine.getText2(), composer2, ((i5 >> 3) & 14) | 3072, 0);
                            composer2 = composer2;
                            composer2.endReplaceGroup();
                        } else if (meta instanceof BentoBaseRowState.Meta.CallToAction) {
                            composer2.startReplaceGroup(199169440);
                            BentoBaseRowState.Meta.CallToAction callToAction = (BentoBaseRowState.Meta.CallToAction) meta;
                            RowMetaElementFactory.INSTANCE.m21054CallToActiongKt5lHk(modifier3, callToAction.getText(), callToAction.m20927getTintQN2ZGVo(), composer2, ((i5 >> 3) & 14) | 3072, 0);
                            composer2 = composer2;
                            composer2.endReplaceGroup();
                        } else if (meta instanceof BentoBaseRowState.Meta.TwoLineAndIcon) {
                            composer2.startReplaceGroup(1879482041);
                            BentoBaseRowState.Meta.TwoLineAndIcon twoLineAndIcon = (BentoBaseRowState.Meta.TwoLineAndIcon) meta;
                            RowMetaElementFactory.INSTANCE.m21057TwoTextAndIconyZUFuyM(twoLineAndIcon.getText1(), twoLineAndIcon.getText2(), twoLineAndIcon.getAsset16dp(), twoLineAndIcon.getContentDescription(), modifier3, twoLineAndIcon.m20939getTintQN2ZGVo(), twoLineAndIcon.getOnClick(), composer2, 12582912 | ((i5 << 9) & 57344), 0);
                            modifier3 = modifier3;
                            composer2 = composer2;
                            composer2.endReplaceGroup();
                        } else if (meta instanceof BentoBaseRowState.Meta.Icon) {
                            composer2.startReplaceGroup(199186975);
                            BentoBaseRowState.Meta.Icon icon = (BentoBaseRowState.Meta.Icon) meta;
                            RowMetaElementFactory.INSTANCE.m21055IconSj8uqqQ(modifier3, icon.getAsset24dp(), icon.getContentDescription(), icon.m20931getTintQN2ZGVo(), icon.getOnClick(), composer2, (StringResource.$stable << 6) | ((i5 >> 3) & 14) | 196608, 0);
                            composer2.endReplaceGroup();
                        } else {
                            if (!(meta instanceof BentoBaseRowState.Meta.SingleLineAndIcon)) {
                                composer2.startReplaceGroup(199156025);
                                composer2.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer2.startReplaceGroup(199196288);
                            BentoBaseRowState.Meta.SingleLineAndIcon singleLineAndIcon = (BentoBaseRowState.Meta.SingleLineAndIcon) meta;
                            RowMetaElementFactory.INSTANCE.m21056TextAndIconM8YrEPQ(modifier3, singleLineAndIcon.getText(), singleLineAndIcon.getAsset16dp(), singleLineAndIcon.getContentDescription(), singleLineAndIcon.m20935getTintQN2ZGVo(), composer2, 196608 | ((i5 >> 3) & 14), 0);
                            composer2.endReplaceGroup();
                        }
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoBaseRowKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BentoBaseRowKt.RowMetaElement$lambda$25(meta, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (meta != null) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RowEndElement(final BentoBaseRowState.End end, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1501857972);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(end) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1501857972, i2, -1, "com.robinhood.compose.bento.component.rows.RowEndElement (BentoBaseRow.kt:575)");
            }
            if (!(end instanceof BentoBaseRowState.End.Caret)) {
                throw new NoWhenBranchMatchedException();
            }
            IconKt.m5871Iconww6aTOc(PainterResources_androidKt.painterResource(((BentoBaseRowState.End.Caret) end).getDirection().getResId(), composerStartRestartGroup, 0), "Caret", LocalShowPlaceholder.withBentoCirclePlaceholder$default(Modifier.INSTANCE, false, 1, null), ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getRow(composerStartRestartGroup, 0).getColors().m21925getCaretColor0d7_KjU(), composerStartRestartGroup, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoBaseRowKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoBaseRowKt.RowEndElement$lambda$26(end, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: maybeOverrideForegroundColor-oJZG2nU, reason: not valid java name */
    public static final long m20922maybeOverrideForegroundColoroJZG2nU(Color color, Composer composer, int i) {
        long value;
        composer.startReplaceGroup(877882702);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(877882702, i, -1, "com.robinhood.compose.bento.component.rows.maybeOverrideForegroundColor (BentoBaseRow.kt:987)");
        }
        if (color == null) {
            composer.startReplaceGroup(1831691024);
            value = ((RowColorState) composer.consume(LocalRowColorState)).m21048getFg0d7_KjU();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1831691281);
            CompositionLocal6<RowColorState> compositionLocal6 = LocalRowColorState;
            boolean enabled = ((RowColorState) composer.consume(compositionLocal6)).getEnabled();
            composer.endReplaceGroup();
            if (!enabled) {
                composer.startReplaceGroup(1831693360);
                value = ((RowColorState) composer.consume(compositionLocal6)).m21048getFg0d7_KjU();
                composer.endReplaceGroup();
            } else {
                value = color.getValue();
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RowColorState LocalRowColorState$lambda$27() {
        throw new IllegalStateException("No colors provided");
    }

    public static final void PreviewBaseRowsDay(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-672756836);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-672756836, i, -1, "com.robinhood.compose.bento.component.rows.PreviewBaseRowsDay (BentoBaseRow.kt:1068)");
            }
            BaseRows(true, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoBaseRowKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoBaseRowKt.PreviewBaseRowsDay$lambda$28(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PreviewBaseRowsNight(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(982837784);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(982837784, i, -1, "com.robinhood.compose.bento.component.rows.PreviewBaseRowsNight (BentoBaseRow.kt:1074)");
            }
            BaseRows(false, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoBaseRowKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoBaseRowKt.PreviewBaseRowsNight$lambda$29(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void BaseRows(final boolean z, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-736914764);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-736914764, i2, -1, "com.robinhood.compose.bento.component.rows.BaseRows (BentoBaseRow.kt:1079)");
            }
            BentoTheme2.BentoTheme(Boolean.valueOf(z), null, null, null, null, null, null, null, ComposableSingletons$BentoBaseRowKt.INSTANCE.getLambda$1746772588$lib_compose_bento_externalRelease(), composerStartRestartGroup, (i2 & 14) | 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoBaseRowKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoBaseRowKt.BaseRows$lambda$30(z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final SemanticsPropertyKey<BentoBaseRowState> getBentoBaseRowSemanticKey() {
        return BentoBaseRowSemanticKey;
    }

    private static final BentoBaseRowState getBentoBaseRowState(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return BentoBaseRowSemanticKey.getValue(semanticsPropertyReceiver, $$delegatedProperties[0]);
    }

    private static final void setBentoBaseRowState(SemanticsPropertyReceiver semanticsPropertyReceiver, BentoBaseRowState bentoBaseRowState) {
        BentoBaseRowSemanticKey.setValue(semanticsPropertyReceiver, $$delegatedProperties[0], bentoBaseRowState);
    }
}

package com.robinhood.compose.bento.component;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.interaction.FocusInteraction3;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColors2;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusChangedModifier2;
import androidx.compose.p011ui.focus.FocusState;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.input.VisualTransformation;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoTextInput4;
import com.robinhood.compose.bento.component.BentoTextInput8;
import com.robinhood.compose.bento.component.DeprecatedBentoTextInputState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.compose.theme.style.TextInputStyle;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: BentoTextInput.kt */
@Metadata(m3635d1 = {"\u0000\u009e\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aÁ\u0001\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001aµ\u0001\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a·\u0001\u0010\"\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\u001c\b\u0002\u0010!\u001a\u0016\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0000\u0018\u00010 H\u0007¢\u0006\u0004\b\"\u0010#\u001a×\u0001\u0010&\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f2\u0006\u0010%\u001a\u00020$2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u001c\b\u0002\u0010!\u001a\u0016\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0000\u0018\u00010 H\u0003¢\u0006\u0004\b&\u0010'\u001a5\u0010\u001a\u001a\u00020\u00032\u0006\u0010)\u001a\u00020(2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u001a\u0010*\u001a5\u0010\u001c\u001a\u00020\u00032\u0006\u0010)\u001a\u00020+2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u001c\u0010,\u001a5\u0010\u001a\u001a\u00020\u00032\u0006\u0010)\u001a\u00020-2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u001a\u0010.\u001a\u0099\u0001\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010%\u001a\u00020/2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u00100\u001a\u00020\u00172\b\b\u0002\u00101\u001a\u00020\u001e2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0006\u00102\u001a\u00020\u00002\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u001a\u00104\u001a\u0013\u00106\u001a\u00020\u0017*\u000205H\u0002¢\u0006\u0004\b6\u00107\u001a3\u0010>\u001a\u00020\u0005*\u00020\u00052\u0006\u00108\u001a\u00020\u00172\u0006\u00109\u001a\u00020\u00172\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b>\u0010?*N\b\u0002\u0010C\"#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00030\u000f¢\u0006\f\b@\u0012\b\bA\u0012\u0004\b\b(B\u0012\u0004\u0012\u00020\u00030\u00022#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00030\u000f¢\u0006\f\b@\u0012\b\bA\u0012\u0004\b\b(B\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006G²\u0006\f\u0010D\u001a\u00020\u00178\nX\u008a\u0084\u0002²\u0006\f\u0010F\u001a\u00020E8\nX\u008a\u0084\u0002²\u0006\u000e\u0010D\u001a\u00020\u00178\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"", "value", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", AnnotatedPrivateKey.LABEL, "placeholder", "hint", "Lcom/robinhood/compose/bento/component/BentoTextInputs$Message;", "message", "Lcom/robinhood/compose/bento/component/BentoTextInputs$Icon$Size24;", "leadingIcon", "trailingIcon", "Lkotlin/Function0;", "onTrailingIconClick", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "", "enabled", "readOnly", "BentoTextInput", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/compose/bento/component/BentoTextInputs$Message;Lcom/robinhood/compose/bento/component/BentoTextInputs$Icon$Size24;Lcom/robinhood/compose/bento/component/BentoTextInputs$Icon$Size24;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/ui/text/input/VisualTransformation;ZZLandroidx/compose/runtime/Composer;III)V", "BentoHeroTextInput", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/compose/bento/component/BentoTextInputs$Icon$Size24;Lcom/robinhood/compose/bento/component/BentoTextInputs$Message;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/ui/text/input/VisualTransformation;ZZLandroidx/compose/runtime/Composer;III)V", "", "characterLimit", "Lkotlin/Function2;", "onCustomCharacterLimit", "BentoTextArea", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/compose/bento/component/BentoTextInputs$Message;Ljava/lang/Integer;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Lcom/robinhood/compose/bento/component/BentoTextInputs$Size;", "size", "BentoBaseTextInput", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/compose/bento/component/BentoTextInputs$Message;Ljava/lang/Integer;Lcom/robinhood/compose/bento/component/BentoTextInputs$Icon$Size24;Lcom/robinhood/compose/bento/component/BentoTextInputs$Icon$Size24;Lkotlin/jvm/functions/Function0;Lcom/robinhood/compose/bento/component/BentoTextInputs$Size;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/ui/text/input/VisualTransformation;ZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Lcom/robinhood/compose/bento/component/BentoTextInputState;", "state", "(Lcom/robinhood/compose/bento/component/BentoTextInputState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/compose/bento/component/BentoHeroTextInputState;", "(Lcom/robinhood/compose/bento/component/BentoHeroTextInputState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/compose/bento/component/DeprecatedBentoTextInputState;", "(Lcom/robinhood/compose/bento/component/DeprecatedBentoTextInputState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/compose/bento/component/DeprecatedBentoTextInputState$Size;", "singleLine", "maxLines", "placeholderText", "errorText", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/compose/bento/component/DeprecatedBentoTextInputState$Size;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ZZLandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/ui/text/input/VisualTransformation;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/focus/FocusState;", "hasSomeSortOfFocus", "(Landroidx/compose/ui/focus/FocusState;)Z", "isError", "isFocused", "Lcom/robinhood/compose/bento/component/BentoTextInputColors;", "colors", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "shape", "fieldBorder", "(Landroidx/compose/ui/Modifier;ZZLcom/robinhood/compose/bento/component/BentoTextInputColors;Landroidx/compose/foundation/shape/RoundedCornerShape;)Landroidx/compose/ui/Modifier;", "Lkotlin/ParameterName;", "name", "innerTextField", "DecorationBoxComposable", "focused", "Landroidx/compose/ui/graphics/Color;", "valueColor", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.BentoTextInputKt, reason: use source file name */
/* loaded from: classes20.dex */
public final class BentoTextInput4 {

    /* compiled from: BentoTextInput.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.compose.bento.component.BentoTextInputKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[BentoTextInput8.Size.values().length];
            try {
                iArr[BentoTextInput8.Size.Standard.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BentoTextInput8.Size.Hero.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BentoTextInput8.Size.TextArea.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DeprecatedBentoTextInputState.Size.values().length];
            try {
                iArr2[DeprecatedBentoTextInputState.Size.Standard.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[DeprecatedBentoTextInputState.Size.Hero.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoBaseTextInput$lambda$6(String str, Function1 function1, Modifier modifier, String str2, String str3, String str4, BentoTextInput8.Message message, Integer num, BentoTextInput8.Icon.Size24 size24, BentoTextInput8.Icon.Size24 size242, Function0 function0, BentoTextInput8.Size size, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, VisualTransformation visualTransformation, boolean z, boolean z2, Function2 function2, int i, int i2, int i3, Composer composer, int i4) {
        BentoBaseTextInput(str, function1, modifier, str2, str3, str4, message, num, size24, size242, function0, size, keyboardOptions, keyboardActions, visualTransformation, z, z2, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoHeroTextInput$lambda$1(String str, Function1 function1, Modifier modifier, String str2, String str3, String str4, BentoTextInput8.Icon.Size24 size24, BentoTextInput8.Message message, Function0 function0, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, VisualTransformation visualTransformation, boolean z, boolean z2, int i, int i2, int i3, Composer composer, int i4) {
        BentoHeroTextInput(str, function1, modifier, str2, str3, str4, size24, message, function0, keyboardOptions, keyboardActions, visualTransformation, z, z2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoHeroTextInput$lambda$8(BentoHeroTextInputState bentoHeroTextInputState, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BentoHeroTextInput(bentoHeroTextInputState, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoTextArea$lambda$2(String str, Function1 function1, Modifier modifier, String str2, String str3, String str4, BentoTextInput8.Message message, Integer num, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z, boolean z2, Function2 function2, int i, int i2, int i3, Composer composer, int i4) {
        BentoTextArea(str, function1, modifier, str2, str3, str4, message, num, keyboardOptions, keyboardActions, z, z2, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoTextInput$lambda$0(String str, Function1 function1, Modifier modifier, String str2, String str3, String str4, BentoTextInput8.Message message, BentoTextInput8.Icon.Size24 size24, BentoTextInput8.Icon.Size24 size242, Function0 function0, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, VisualTransformation visualTransformation, boolean z, boolean z2, int i, int i2, int i3, Composer composer, int i4) {
        BentoTextInput(str, function1, modifier, str2, str3, str4, message, size24, size242, function0, keyboardOptions, keyboardActions, visualTransformation, z, z2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoTextInput$lambda$13(Modifier modifier, DeprecatedBentoTextInputState.Size size, String str, Function1 function1, boolean z, boolean z2, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i, VisualTransformation visualTransformation, String str2, String str3, int i2, int i3, int i4, Composer composer, int i5) {
        BentoTextInput(modifier, size, str, function1, z, z2, keyboardOptions, keyboardActions, z3, i, visualTransformation, str2, str3, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), RecomposeScopeImpl4.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoTextInput$lambda$7(BentoTextInputState bentoTextInputState, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BentoTextInput(bentoTextInputState, (Function1<? super String, Unit>) function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoTextInput$lambda$9(DeprecatedBentoTextInputState deprecatedBentoTextInputState, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BentoTextInput(deprecatedBentoTextInputState, (Function1<? super String, Unit>) function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoTextInput(final String value, final Function1<? super String, Unit> onValueChange, Modifier modifier, String str, String str2, String str3, BentoTextInput8.Message message, BentoTextInput8.Icon.Size24 size24, BentoTextInput8.Icon.Size24 size242, Function0<Unit> function0, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, VisualTransformation visualTransformation, boolean z, boolean z2, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        String str4;
        int i6;
        String str5;
        int i7;
        String str6;
        int i8;
        BentoTextInput8.Message message2;
        int i9;
        BentoTextInput8.Icon.Size24 size243;
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
        int i21;
        int i22;
        int i23;
        final Function0<Unit> function02;
        Modifier modifier3;
        final BentoTextInput8.Icon.Size24 size244;
        final BentoTextInput8.Icon.Size24 size245;
        Composer composer2;
        final BentoTextInput8.Message message3;
        final KeyboardOptions keyboardOptions2;
        final KeyboardActions keyboardActions2;
        final VisualTransformation visualTransformation2;
        final boolean z3;
        final boolean z4;
        final String str7;
        final String str8;
        final String str9;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-53344941);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(value) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onValueChange) ? 32 : 16;
        }
        int i24 = i3 & 4;
        if (i24 != 0) {
            i4 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    str4 = str;
                    i4 |= composerStartRestartGroup.changed(str4) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        str5 = str2;
                        i4 |= composerStartRestartGroup.changed(str5) ? 16384 : 8192;
                    }
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= 196608;
                        str6 = str3;
                    } else {
                        str6 = str3;
                        if ((i & 196608) == 0) {
                            i4 |= composerStartRestartGroup.changed(str6) ? 131072 : 65536;
                        }
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                        message2 = message;
                    } else {
                        message2 = message;
                        if ((i & 1572864) == 0) {
                            i4 |= composerStartRestartGroup.changed(message2) ? 1048576 : 524288;
                        }
                    }
                    i9 = i3 & 128;
                    if (i9 == 0) {
                        i4 |= 12582912;
                        size243 = size24;
                    } else {
                        size243 = size24;
                        if ((i & 12582912) == 0) {
                            i4 |= composerStartRestartGroup.changed(size243) ? 8388608 : 4194304;
                        }
                    }
                    i10 = i3 & 256;
                    if (i10 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i4 |= composerStartRestartGroup.changed(size242) ? 67108864 : 33554432;
                    }
                    i11 = i3 & 512;
                    if (i11 != 0) {
                        if ((i & 805306368) == 0) {
                            i12 = i11;
                            i4 |= composerStartRestartGroup.changedInstance(function0) ? 536870912 : 268435456;
                        }
                        i13 = i3 & 1024;
                        if (i13 != 0) {
                            i15 = i2 | 6;
                            i14 = i13;
                        } else if ((i2 & 6) == 0) {
                            i14 = i13;
                            i15 = i2 | (composerStartRestartGroup.changed(keyboardOptions) ? 4 : 2);
                        } else {
                            i14 = i13;
                            i15 = i2;
                        }
                        i16 = i3 & 2048;
                        if (i16 != 0) {
                            i15 |= 48;
                            i17 = i16;
                        } else if ((i2 & 48) == 0) {
                            i17 = i16;
                            i15 |= composerStartRestartGroup.changed(keyboardActions) ? 32 : 16;
                        } else {
                            i17 = i16;
                        }
                        int i25 = i15;
                        i18 = i3 & 4096;
                        if (i18 != 0) {
                            i19 = i25 | 384;
                        } else {
                            int i26 = i25;
                            if ((i2 & 384) == 0) {
                                i26 |= composerStartRestartGroup.changed(visualTransformation) ? 256 : 128;
                            }
                            i19 = i26;
                        }
                        i20 = i3 & 8192;
                        if (i20 != 0) {
                            i21 = i19 | 3072;
                        } else {
                            int i27 = i19;
                            if ((i2 & 3072) == 0) {
                                i21 = i27 | (composerStartRestartGroup.changed(z) ? 2048 : 1024);
                            } else {
                                i21 = i27;
                            }
                        }
                        i22 = i3 & 16384;
                        if (i22 != 0) {
                            i23 = i21 | 24576;
                        } else {
                            int i28 = i21;
                            if ((i2 & 24576) == 0) {
                                i28 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                            }
                            i23 = i28;
                        }
                        if ((i4 & 306783379) != 306783378 || (i23 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                            Modifier modifier5 = i24 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i5 != 0) {
                                str4 = null;
                            }
                            if (i6 != 0) {
                                str5 = null;
                            }
                            if (i7 != 0) {
                                str6 = null;
                            }
                            if (i8 != 0) {
                                message2 = null;
                            }
                            if (i9 != 0) {
                                size243 = null;
                            }
                            BentoTextInput8.Icon.Size24 size246 = i10 == 0 ? null : size242;
                            function02 = i12 == 0 ? null : function0;
                            KeyboardOptions keyboardOptions3 = i14 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                            KeyboardActions keyboardActions3 = i17 == 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                            VisualTransformation none = i18 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                            boolean z5 = i20 == 0 ? true : z;
                            boolean z6 = i22 == 0 ? false : z2;
                            KeyboardOptions keyboardOptions4 = keyboardOptions3;
                            if (ComposerKt.isTraceInProgress()) {
                                modifier3 = modifier5;
                            } else {
                                modifier3 = modifier5;
                                ComposerKt.traceEventStart(-53344941, i4, i23, "com.robinhood.compose.bento.component.BentoTextInput (BentoTextInput.kt:72)");
                            }
                            String str10 = str5;
                            size244 = size246;
                            String str11 = str6;
                            int i29 = i4 << 3;
                            int i30 = i23 << 6;
                            String str12 = str4;
                            size245 = size243;
                            VisualTransformation visualTransformation3 = none;
                            boolean z7 = z5;
                            boolean z8 = z6;
                            Modifier modifier6 = modifier3;
                            composer2 = composerStartRestartGroup;
                            BentoTextInput8.Message message4 = message2;
                            BentoBaseTextInput(value, onValueChange, modifier6, str12, str10, str11, message4, null, size245, size244, function02, BentoTextInput8.Size.Standard, keyboardOptions4, keyboardActions3, visualTransformation3, z7, z8, null, composer2, (i4 & 14) | 12582912 | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (i29 & 234881024) | (i29 & 1879048192), ((i4 >> 27) & 14) | 12582960 | (i30 & 896) | (i30 & 7168) | (57344 & i30) | (458752 & i30) | (i30 & 3670016), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            message3 = message4;
                            keyboardOptions2 = keyboardOptions4;
                            keyboardActions2 = keyboardActions3;
                            visualTransformation2 = visualTransformation3;
                            z3 = z7;
                            z4 = z8;
                            str7 = str11;
                            str8 = str10;
                            str9 = str12;
                            modifier4 = modifier6;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            function02 = function0;
                            visualTransformation2 = visualTransformation;
                            composer2 = composerStartRestartGroup;
                            str9 = str4;
                            str8 = str5;
                            str7 = str6;
                            message3 = message2;
                            size245 = size243;
                            modifier4 = modifier2;
                            size244 = size242;
                            keyboardOptions2 = keyboardOptions;
                            keyboardActions2 = keyboardActions;
                            z3 = z;
                            z4 = z2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoTextInputKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return BentoTextInput4.BentoTextInput$lambda$0(value, onValueChange, modifier4, str9, str8, str7, message3, size245, size244, function02, keyboardOptions2, keyboardActions2, visualTransformation2, z3, z4, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 805306368;
                    i12 = i11;
                    i13 = i3 & 1024;
                    if (i13 != 0) {
                    }
                    i16 = i3 & 2048;
                    if (i16 != 0) {
                    }
                    int i252 = i15;
                    i18 = i3 & 4096;
                    if (i18 != 0) {
                    }
                    i20 = i3 & 8192;
                    if (i20 != 0) {
                    }
                    i22 = i3 & 16384;
                    if (i22 != 0) {
                    }
                    if ((i4 & 306783379) != 306783378) {
                        if (i24 == 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i9 != 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        if (i18 == 0) {
                        }
                        if (i20 == 0) {
                        }
                        if (i22 == 0) {
                        }
                        KeyboardOptions keyboardOptions42 = keyboardOptions3;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        String str102 = str5;
                        size244 = size246;
                        String str112 = str6;
                        int i292 = i4 << 3;
                        int i302 = i23 << 6;
                        String str122 = str4;
                        size245 = size243;
                        VisualTransformation visualTransformation32 = none;
                        boolean z72 = z5;
                        boolean z82 = z6;
                        Modifier modifier62 = modifier3;
                        composer2 = composerStartRestartGroup;
                        BentoTextInput8.Message message42 = message2;
                        BentoBaseTextInput(value, onValueChange, modifier62, str122, str102, str112, message42, null, size245, size244, function02, BentoTextInput8.Size.Standard, keyboardOptions42, keyboardActions3, visualTransformation32, z72, z82, null, composer2, (i4 & 14) | 12582912 | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (i292 & 234881024) | (i292 & 1879048192), ((i4 >> 27) & 14) | 12582960 | (i302 & 896) | (i302 & 7168) | (57344 & i302) | (458752 & i302) | (i302 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        message3 = message42;
                        keyboardOptions2 = keyboardOptions42;
                        keyboardActions2 = keyboardActions3;
                        visualTransformation2 = visualTransformation32;
                        z3 = z72;
                        z4 = z82;
                        str7 = str112;
                        str8 = str102;
                        str9 = str122;
                        modifier4 = modifier62;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                str5 = str2;
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
                i11 = i3 & 512;
                if (i11 != 0) {
                }
                i12 = i11;
                i13 = i3 & 1024;
                if (i13 != 0) {
                }
                i16 = i3 & 2048;
                if (i16 != 0) {
                }
                int i2522 = i15;
                i18 = i3 & 4096;
                if (i18 != 0) {
                }
                i20 = i3 & 8192;
                if (i20 != 0) {
                }
                i22 = i3 & 16384;
                if (i22 != 0) {
                }
                if ((i4 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            str4 = str;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            str5 = str2;
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
            i11 = i3 & 512;
            if (i11 != 0) {
            }
            i12 = i11;
            i13 = i3 & 1024;
            if (i13 != 0) {
            }
            i16 = i3 & 2048;
            if (i16 != 0) {
            }
            int i25222 = i15;
            i18 = i3 & 4096;
            if (i18 != 0) {
            }
            i20 = i3 & 8192;
            if (i20 != 0) {
            }
            i22 = i3 & 16384;
            if (i22 != 0) {
            }
            if ((i4 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        str4 = str;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        str5 = str2;
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
        i11 = i3 & 512;
        if (i11 != 0) {
        }
        i12 = i11;
        i13 = i3 & 1024;
        if (i13 != 0) {
        }
        i16 = i3 & 2048;
        if (i16 != 0) {
        }
        int i252222 = i15;
        i18 = i3 & 4096;
        if (i18 != 0) {
        }
        i20 = i3 & 8192;
        if (i20 != 0) {
        }
        i22 = i3 & 16384;
        if (i22 != 0) {
        }
        if ((i4 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BentoBaseTextInput$lambda$4(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long BentoBaseTextInput$lambda$5(SnapshotState4<Color> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BentoTextInput$lambda$11(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:205:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoHeroTextInput(final String value, final Function1<? super String, Unit> onValueChange, Modifier modifier, String str, String str2, String str3, BentoTextInput8.Icon.Size24 size24, BentoTextInput8.Message message, Function0<Unit> function0, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, VisualTransformation visualTransformation, boolean z, boolean z2, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        String str4;
        int i6;
        String str5;
        int i7;
        String str6;
        int i8;
        BentoTextInput8.Icon.Size24 size242;
        int i9;
        BentoTextInput8.Message message2;
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
        int i21;
        Modifier modifier3;
        Composer composer2;
        final BentoTextInput8.Message message3;
        final BentoTextInput8.Icon.Size24 size243;
        final Function0<Unit> function02;
        final KeyboardOptions keyboardOptions2;
        final KeyboardActions keyboardActions2;
        final VisualTransformation visualTransformation2;
        final boolean z3;
        final boolean z4;
        final String str7;
        final String str8;
        final String str9;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1916122380);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(value) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onValueChange) ? 32 : 16;
        }
        int i22 = i3 & 4;
        if (i22 != 0) {
            i4 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    str4 = str;
                    i4 |= composerStartRestartGroup.changed(str4) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        str5 = str2;
                        i4 |= composerStartRestartGroup.changed(str5) ? 16384 : 8192;
                    }
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= 196608;
                        str6 = str3;
                    } else {
                        str6 = str3;
                        if ((i & 196608) == 0) {
                            i4 |= composerStartRestartGroup.changed(str6) ? 131072 : 65536;
                        }
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                        size242 = size24;
                    } else {
                        size242 = size24;
                        if ((i & 1572864) == 0) {
                            i4 |= composerStartRestartGroup.changed(size242) ? 1048576 : 524288;
                        }
                    }
                    i9 = i3 & 128;
                    if (i9 == 0) {
                        i4 |= 12582912;
                        message2 = message;
                    } else {
                        message2 = message;
                        if ((i & 12582912) == 0) {
                            i4 |= composerStartRestartGroup.changed(message2) ? 8388608 : 4194304;
                        }
                    }
                    i10 = i3 & 256;
                    if (i10 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function0) ? 67108864 : 33554432;
                    }
                    i11 = i3 & 512;
                    if (i11 != 0) {
                        if ((i & 805306368) == 0) {
                            i12 = i11;
                            i4 |= composerStartRestartGroup.changed(keyboardOptions) ? 536870912 : 268435456;
                        }
                        i13 = i3 & 1024;
                        if (i13 != 0) {
                            i15 = i2 | 6;
                            i14 = i13;
                        } else if ((i2 & 6) == 0) {
                            i14 = i13;
                            i15 = i2 | (composerStartRestartGroup.changed(keyboardActions) ? 4 : 2);
                        } else {
                            i14 = i13;
                            i15 = i2;
                        }
                        i16 = i3 & 2048;
                        if (i16 != 0) {
                            i15 |= 48;
                            i17 = i16;
                        } else if ((i2 & 48) == 0) {
                            i17 = i16;
                            i15 |= composerStartRestartGroup.changed(visualTransformation) ? 32 : 16;
                        } else {
                            i17 = i16;
                        }
                        int i23 = i15;
                        i18 = i3 & 4096;
                        if (i18 != 0) {
                            i19 = i23 | 384;
                        } else {
                            int i24 = i23;
                            if ((i2 & 384) == 0) {
                                i24 |= composerStartRestartGroup.changed(z) ? 256 : 128;
                            }
                            i19 = i24;
                        }
                        i20 = i3 & 8192;
                        if (i20 != 0) {
                            i21 = i19 | 3072;
                        } else {
                            int i25 = i19;
                            if ((i2 & 3072) == 0) {
                                i21 = i25 | (composerStartRestartGroup.changed(z2) ? 2048 : 1024);
                            } else {
                                i21 = i25;
                            }
                        }
                        if ((i4 & 306783379) != 306783378 || (i21 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                            Modifier modifier5 = i22 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i5 != 0) {
                                str4 = null;
                            }
                            if (i6 != 0) {
                                str5 = null;
                            }
                            if (i7 != 0) {
                                str6 = null;
                            }
                            if (i8 != 0) {
                                size242 = null;
                            }
                            if (i9 != 0) {
                                message2 = null;
                            }
                            Function0<Unit> function03 = i10 == 0 ? null : function0;
                            KeyboardOptions keyboardOptions3 = i12 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                            KeyboardActions keyboardActions3 = i14 == 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                            VisualTransformation none = i17 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                            boolean z5 = i18 == 0 ? true : z;
                            boolean z6 = i20 == 0 ? false : z2;
                            KeyboardOptions keyboardOptions4 = keyboardOptions3;
                            if (ComposerKt.isTraceInProgress()) {
                                modifier3 = modifier5;
                            } else {
                                modifier3 = modifier5;
                                ComposerKt.traceEventStart(-1916122380, i4, i21, "com.robinhood.compose.bento.component.BentoHeroTextInput (BentoTextInput.kt:114)");
                            }
                            composer2 = composerStartRestartGroup;
                            BentoTextInput8.Message message4 = message2;
                            VisualTransformation visualTransformation3 = none;
                            String str10 = str6;
                            int i26 = i21 << 9;
                            String str11 = str4;
                            Modifier modifier6 = modifier3;
                            String str12 = str5;
                            BentoTextInput8.Icon.Size24 size244 = size242;
                            BentoBaseTextInput(value, onValueChange, modifier6, str11, str12, str10, message4, null, null, size244, function03, BentoTextInput8.Size.Hero, keyboardOptions4, keyboardActions3, visualTransformation3, z5, z6, null, composer2, (i4 & 14) | 113246208 | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | ((i4 >> 3) & 3670016) | ((i4 << 9) & 1879048192), ((i4 >> 24) & 14) | 12582960 | ((i4 >> 21) & 896) | (i26 & 7168) | (57344 & i26) | (458752 & i26) | (i26 & 3670016), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            message3 = message4;
                            size243 = size244;
                            function02 = function03;
                            keyboardOptions2 = keyboardOptions4;
                            keyboardActions2 = keyboardActions3;
                            visualTransformation2 = visualTransformation3;
                            z3 = z5;
                            z4 = z6;
                            str7 = str10;
                            str8 = str12;
                            str9 = str11;
                            modifier4 = modifier6;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            keyboardOptions2 = keyboardOptions;
                            z3 = z;
                            composer2 = composerStartRestartGroup;
                            str9 = str4;
                            str8 = str5;
                            str7 = str6;
                            size243 = size242;
                            message3 = message2;
                            modifier4 = modifier2;
                            function02 = function0;
                            keyboardActions2 = keyboardActions;
                            visualTransformation2 = visualTransformation;
                            z4 = z2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoTextInputKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return BentoTextInput4.BentoHeroTextInput$lambda$1(value, onValueChange, modifier4, str9, str8, str7, size243, message3, function02, keyboardOptions2, keyboardActions2, visualTransformation2, z3, z4, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 805306368;
                    i12 = i11;
                    i13 = i3 & 1024;
                    if (i13 != 0) {
                    }
                    i16 = i3 & 2048;
                    if (i16 != 0) {
                    }
                    int i232 = i15;
                    i18 = i3 & 4096;
                    if (i18 != 0) {
                    }
                    i20 = i3 & 8192;
                    if (i20 != 0) {
                    }
                    if ((i4 & 306783379) != 306783378) {
                        if (i22 == 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i9 != 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        if (i18 == 0) {
                        }
                        if (i20 == 0) {
                        }
                        KeyboardOptions keyboardOptions42 = keyboardOptions3;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer2 = composerStartRestartGroup;
                        BentoTextInput8.Message message42 = message2;
                        VisualTransformation visualTransformation32 = none;
                        String str102 = str6;
                        int i262 = i21 << 9;
                        String str112 = str4;
                        Modifier modifier62 = modifier3;
                        String str122 = str5;
                        BentoTextInput8.Icon.Size24 size2442 = size242;
                        BentoBaseTextInput(value, onValueChange, modifier62, str112, str122, str102, message42, null, null, size2442, function03, BentoTextInput8.Size.Hero, keyboardOptions42, keyboardActions3, visualTransformation32, z5, z6, null, composer2, (i4 & 14) | 113246208 | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | ((i4 >> 3) & 3670016) | ((i4 << 9) & 1879048192), ((i4 >> 24) & 14) | 12582960 | ((i4 >> 21) & 896) | (i262 & 7168) | (57344 & i262) | (458752 & i262) | (i262 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        message3 = message42;
                        size243 = size2442;
                        function02 = function03;
                        keyboardOptions2 = keyboardOptions42;
                        keyboardActions2 = keyboardActions3;
                        visualTransformation2 = visualTransformation32;
                        z3 = z5;
                        z4 = z6;
                        str7 = str102;
                        str8 = str122;
                        str9 = str112;
                        modifier4 = modifier62;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                str5 = str2;
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
                i11 = i3 & 512;
                if (i11 != 0) {
                }
                i12 = i11;
                i13 = i3 & 1024;
                if (i13 != 0) {
                }
                i16 = i3 & 2048;
                if (i16 != 0) {
                }
                int i2322 = i15;
                i18 = i3 & 4096;
                if (i18 != 0) {
                }
                i20 = i3 & 8192;
                if (i20 != 0) {
                }
                if ((i4 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            str4 = str;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            str5 = str2;
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
            i11 = i3 & 512;
            if (i11 != 0) {
            }
            i12 = i11;
            i13 = i3 & 1024;
            if (i13 != 0) {
            }
            i16 = i3 & 2048;
            if (i16 != 0) {
            }
            int i23222 = i15;
            i18 = i3 & 4096;
            if (i18 != 0) {
            }
            i20 = i3 & 8192;
            if (i20 != 0) {
            }
            if ((i4 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        str4 = str;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        str5 = str2;
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
        i11 = i3 & 512;
        if (i11 != 0) {
        }
        i12 = i11;
        i13 = i3 & 1024;
        if (i13 != 0) {
        }
        i16 = i3 & 2048;
        if (i16 != 0) {
        }
        int i232222 = i15;
        i18 = i3 & 4096;
        if (i18 != 0) {
        }
        i20 = i3 & 8192;
        if (i20 != 0) {
        }
        if ((i4 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoTextArea(final String value, final Function1<? super String, Unit> onValueChange, Modifier modifier, String str, String str2, String str3, BentoTextInput8.Message message, Integer num, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z, boolean z2, Function2<? super Integer, ? super Integer, String> function2, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        String str4;
        int i6;
        String str5;
        int i7;
        String str6;
        int i8;
        BentoTextInput8.Message message2;
        int i9;
        Integer num2;
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
        Composer composer2;
        final Integer num3;
        final KeyboardOptions keyboardOptions2;
        final KeyboardActions keyboardActions2;
        final boolean z3;
        final boolean z4;
        final Function2<? super Integer, ? super Integer, String> function22;
        final BentoTextInput8.Message message3;
        final String str7;
        final String str8;
        final String str9;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(41367524);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(value) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onValueChange) ? 32 : 16;
        }
        int i20 = i3 & 4;
        if (i20 != 0) {
            i4 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    str4 = str;
                    i4 |= composerStartRestartGroup.changed(str4) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        str5 = str2;
                        i4 |= composerStartRestartGroup.changed(str5) ? 16384 : 8192;
                    }
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= 196608;
                        str6 = str3;
                    } else {
                        str6 = str3;
                        if ((i & 196608) == 0) {
                            i4 |= composerStartRestartGroup.changed(str6) ? 131072 : 65536;
                        }
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                        message2 = message;
                    } else {
                        message2 = message;
                        if ((i & 1572864) == 0) {
                            i4 |= composerStartRestartGroup.changed(message2) ? 1048576 : 524288;
                        }
                    }
                    i9 = i3 & 128;
                    if (i9 == 0) {
                        i4 |= 12582912;
                        num2 = num;
                    } else {
                        num2 = num;
                        if ((i & 12582912) == 0) {
                            i4 |= composerStartRestartGroup.changed(num2) ? 8388608 : 4194304;
                        }
                    }
                    i10 = i3 & 256;
                    if (i10 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i4 |= composerStartRestartGroup.changed(keyboardOptions) ? 67108864 : 33554432;
                    }
                    i11 = i3 & 512;
                    if (i11 != 0) {
                        if ((i & 805306368) == 0) {
                            i12 = i11;
                            i4 |= composerStartRestartGroup.changed(keyboardActions) ? 536870912 : 268435456;
                        }
                        i13 = i3 & 1024;
                        if (i13 != 0) {
                            i15 = i2 | 6;
                            i14 = i13;
                        } else if ((i2 & 6) == 0) {
                            i14 = i13;
                            i15 = i2 | (composerStartRestartGroup.changed(z) ? 4 : 2);
                        } else {
                            i14 = i13;
                            i15 = i2;
                        }
                        i16 = i3 & 2048;
                        if (i16 != 0) {
                            i15 |= 48;
                            i17 = i16;
                        } else if ((i2 & 48) == 0) {
                            i17 = i16;
                            i15 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
                        } else {
                            i17 = i16;
                        }
                        int i21 = i15;
                        i18 = i3 & 4096;
                        if (i18 != 0) {
                            i19 = i21 | 384;
                        } else {
                            int i22 = i21;
                            if ((i2 & 384) == 0) {
                                i22 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
                            }
                            i19 = i22;
                        }
                        if ((i4 & 306783379) != 306783378 || (i19 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
                            Modifier modifier4 = i20 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i5 != 0) {
                                str4 = null;
                            }
                            if (i6 != 0) {
                                str5 = null;
                            }
                            if (i7 != 0) {
                                str6 = null;
                            }
                            if (i8 != 0) {
                                message2 = null;
                            }
                            if (i9 != 0) {
                                num2 = null;
                            }
                            KeyboardOptions keyboardOptions3 = i10 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                            KeyboardActions keyboardActions3 = i12 == 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                            boolean z5 = i14 == 0 ? true : z;
                            boolean z6 = i17 == 0 ? false : z2;
                            Function2<? super Integer, ? super Integer, String> function23 = i18 == 0 ? null : function2;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(41367524, i4, i19, "com.robinhood.compose.bento.component.BentoTextArea (BentoTextInput.kt:155)");
                            }
                            composer2 = composerStartRestartGroup;
                            BentoTextInput8.Message message4 = message2;
                            KeyboardOptions keyboardOptions4 = keyboardOptions3;
                            String str10 = str6;
                            int i23 = i19;
                            int i24 = (i4 & 896) | (i4 & 14) | 905969664 | (i4 & 112) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4);
                            int i25 = i4 >> 18;
                            int i26 = i23 << 15;
                            int i27 = (i25 & 7168) | (i25 & 896) | 24630 | (i26 & 458752) | (i26 & 3670016) | (i26 & 29360128);
                            String str11 = str4;
                            String str12 = str5;
                            Integer num4 = num2;
                            BentoBaseTextInput(value, onValueChange, modifier4, str11, str12, str10, message4, num4, null, null, null, BentoTextInput8.Size.TextArea, keyboardOptions4, keyboardActions3, VisualTransformation.INSTANCE.getNone(), z5, z6, function23, composer2, i24, i27, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            num3 = num4;
                            keyboardOptions2 = keyboardOptions4;
                            keyboardActions2 = keyboardActions3;
                            z3 = z5;
                            z4 = z6;
                            function22 = function23;
                            message3 = message4;
                            str7 = str10;
                            str8 = str12;
                            str9 = str11;
                            modifier3 = modifier4;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            keyboardActions2 = keyboardActions;
                            function22 = function2;
                            composer2 = composerStartRestartGroup;
                            str9 = str4;
                            str8 = str5;
                            str7 = str6;
                            message3 = message2;
                            num3 = num2;
                            modifier3 = modifier2;
                            keyboardOptions2 = keyboardOptions;
                            z3 = z;
                            z4 = z2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoTextInputKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return BentoTextInput4.BentoTextArea$lambda$2(value, onValueChange, modifier3, str9, str8, str7, message3, num3, keyboardOptions2, keyboardActions2, z3, z4, function22, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 805306368;
                    i12 = i11;
                    i13 = i3 & 1024;
                    if (i13 != 0) {
                    }
                    i16 = i3 & 2048;
                    if (i16 != 0) {
                    }
                    int i212 = i15;
                    i18 = i3 & 4096;
                    if (i18 != 0) {
                    }
                    if ((i4 & 306783379) != 306783378) {
                        if (i20 == 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i9 != 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        if (i18 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer2 = composerStartRestartGroup;
                        BentoTextInput8.Message message42 = message2;
                        KeyboardOptions keyboardOptions42 = keyboardOptions3;
                        String str102 = str6;
                        int i232 = i19;
                        int i242 = (i4 & 896) | (i4 & 14) | 905969664 | (i4 & 112) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4);
                        int i252 = i4 >> 18;
                        int i262 = i232 << 15;
                        int i272 = (i252 & 7168) | (i252 & 896) | 24630 | (i262 & 458752) | (i262 & 3670016) | (i262 & 29360128);
                        String str112 = str4;
                        String str122 = str5;
                        Integer num42 = num2;
                        BentoBaseTextInput(value, onValueChange, modifier4, str112, str122, str102, message42, num42, null, null, null, BentoTextInput8.Size.TextArea, keyboardOptions42, keyboardActions3, VisualTransformation.INSTANCE.getNone(), z5, z6, function23, composer2, i242, i272, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        num3 = num42;
                        keyboardOptions2 = keyboardOptions42;
                        keyboardActions2 = keyboardActions3;
                        z3 = z5;
                        z4 = z6;
                        function22 = function23;
                        message3 = message42;
                        str7 = str102;
                        str8 = str122;
                        str9 = str112;
                        modifier3 = modifier4;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                str5 = str2;
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
                i11 = i3 & 512;
                if (i11 != 0) {
                }
                i12 = i11;
                i13 = i3 & 1024;
                if (i13 != 0) {
                }
                i16 = i3 & 2048;
                if (i16 != 0) {
                }
                int i2122 = i15;
                i18 = i3 & 4096;
                if (i18 != 0) {
                }
                if ((i4 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            str4 = str;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            str5 = str2;
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
            i11 = i3 & 512;
            if (i11 != 0) {
            }
            i12 = i11;
            i13 = i3 & 1024;
            if (i13 != 0) {
            }
            i16 = i3 & 2048;
            if (i16 != 0) {
            }
            int i21222 = i15;
            i18 = i3 & 4096;
            if (i18 != 0) {
            }
            if ((i4 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        str4 = str;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        str5 = str2;
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
        i11 = i3 & 512;
        if (i11 != 0) {
        }
        i12 = i11;
        i13 = i3 & 1024;
        if (i13 != 0) {
        }
        i16 = i3 & 2048;
        if (i16 != 0) {
        }
        int i212222 = i15;
        i18 = i3 & 4096;
        if (i18 != 0) {
        }
        if ((i4 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:247:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void BentoBaseTextInput(final String str, final Function1<? super String, Unit> function1, final Modifier modifier, final String str2, final String str3, final String str4, final BentoTextInput8.Message message, final Integer num, final BentoTextInput8.Icon.Size24 size24, final BentoTextInput8.Icon.Size24 size242, final Function0<Unit> function0, final BentoTextInput8.Size size, final KeyboardOptions keyboardOptions, final KeyboardActions keyboardActions, final VisualTransformation visualTransformation, final boolean z, final boolean z2, Function2<? super Integer, ? super Integer, String> function2, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Function1<? super String, Unit> function12;
        Modifier modifier2;
        String str5;
        String str6;
        Integer num2;
        final BentoTextInput8.Icon.Size24 size243;
        BentoTextInput8.Icon.Size24 size244;
        int i5;
        VisualTransformation visualTransformation2;
        int i6;
        int i7;
        int i8;
        TextInputStyle.Style standard;
        Object objRememberedValue;
        TextInputStyle.InputState inputState;
        final Function2<? super Integer, ? super Integer, String> function22;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(629639308);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                function12 = function1;
                i4 |= composerStartRestartGroup.changedInstance(function12) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i4 |= 384;
            } else {
                if ((i & 384) == 0) {
                    modifier2 = modifier;
                    i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                }
                if ((i3 & 8) != 0) {
                    i4 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        str5 = str2;
                        i4 |= composerStartRestartGroup.changed(str5) ? 2048 : 1024;
                    }
                    if ((i3 & 16) == 0) {
                        i4 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            str6 = str3;
                            i4 |= composerStartRestartGroup.changed(str6) ? 16384 : 8192;
                        }
                        if ((i3 & 32) != 0) {
                            i4 |= 196608;
                        } else if ((i & 196608) == 0) {
                            i4 |= composerStartRestartGroup.changed(str4) ? 131072 : 65536;
                        }
                        if ((i3 & 64) != 0) {
                            i4 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i4 |= composerStartRestartGroup.changed(message) ? 1048576 : 524288;
                        }
                        if ((i3 & 128) != 0) {
                            i4 |= 12582912;
                        } else {
                            if ((i & 12582912) == 0) {
                                num2 = num;
                                i4 |= composerStartRestartGroup.changed(num2) ? 8388608 : 4194304;
                            }
                            if ((i3 & 256) == 0) {
                                i4 |= 100663296;
                            } else {
                                if ((100663296 & i) == 0) {
                                    size243 = size24;
                                    i4 |= composerStartRestartGroup.changed(size243) ? 67108864 : 33554432;
                                }
                                if ((i3 & 512) != 0) {
                                    i4 |= 805306368;
                                } else {
                                    if ((805306368 & i) == 0) {
                                        size244 = size242;
                                        i4 |= composerStartRestartGroup.changed(size244) ? 536870912 : 268435456;
                                    }
                                    if ((i3 & 1024) == 0) {
                                        i5 = i2 | 6;
                                    } else if ((i2 & 6) == 0) {
                                        i5 = i2 | (composerStartRestartGroup.changedInstance(function0) ? 4 : 2);
                                    } else {
                                        i5 = i2;
                                    }
                                    if ((i3 & 2048) == 0) {
                                        i5 |= 48;
                                    } else if ((i2 & 48) == 0) {
                                        i5 |= composerStartRestartGroup.changed(size.ordinal()) ? 32 : 16;
                                    }
                                    int i9 = i5;
                                    if ((i3 & 4096) == 0) {
                                        i9 |= 384;
                                    } else {
                                        if ((i2 & 384) == 0) {
                                            i9 |= composerStartRestartGroup.changed(keyboardOptions) ? 256 : 128;
                                        }
                                        if ((i3 & 8192) != 0) {
                                            i9 |= 3072;
                                        } else {
                                            if ((i2 & 3072) == 0) {
                                                i9 |= composerStartRestartGroup.changed(keyboardActions) ? 2048 : 1024;
                                            }
                                            if ((i3 & 16384) != 0) {
                                                if ((i2 & 24576) == 0) {
                                                    visualTransformation2 = visualTransformation;
                                                    i9 |= composerStartRestartGroup.changed(visualTransformation2) ? 16384 : 8192;
                                                }
                                                if ((i3 & 32768) != 0) {
                                                    i9 |= 196608;
                                                } else if ((i2 & 196608) == 0) {
                                                    i9 |= composerStartRestartGroup.changed(z) ? 131072 : 65536;
                                                }
                                                if ((i3 & 65536) != 0) {
                                                    i6 = i9 | 1572864;
                                                } else {
                                                    int i10 = i9;
                                                    if ((i2 & 1572864) == 0) {
                                                        i6 = i10 | (composerStartRestartGroup.changed(z2) ? 1048576 : 524288);
                                                    } else {
                                                        i6 = i10;
                                                    }
                                                }
                                                i7 = i3 & 131072;
                                                if (i7 != 0) {
                                                    i6 |= 12582912;
                                                } else if ((i2 & 12582912) == 0) {
                                                    i6 |= composerStartRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                                                }
                                                int i11 = i6;
                                                if ((i4 & 306783379) != 306783378 || (4793491 & i11) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                                                    final Function2<? super Integer, ? super Integer, String> function23 = i7 == 0 ? null : function2;
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(629639308, i4, i11, "com.robinhood.compose.bento.component.BentoBaseTextInput (BentoTextInput.kt:203)");
                                                    }
                                                    i8 = WhenMappings.$EnumSwitchMapping$0[size.ordinal()];
                                                    if (i8 != 1) {
                                                        composerStartRestartGroup.startReplaceGroup(-506989580);
                                                        standard = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getTextInput(composerStartRestartGroup, 0).getStandard();
                                                        composerStartRestartGroup.endReplaceGroup();
                                                    } else if (i8 == 2) {
                                                        composerStartRestartGroup.startReplaceGroup(-506987152);
                                                        standard = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getTextInput(composerStartRestartGroup, 0).getHero();
                                                        composerStartRestartGroup.endReplaceGroup();
                                                    } else {
                                                        if (i8 != 3) {
                                                            composerStartRestartGroup.startReplaceGroup(-506992057);
                                                            composerStartRestartGroup.endReplaceGroup();
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        composerStartRestartGroup.startReplaceGroup(-506984716);
                                                        standard = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getTextInput(composerStartRestartGroup, 0).getTextArea();
                                                        composerStartRestartGroup.endReplaceGroup();
                                                    }
                                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue = InteractionSource2.MutableInteractionSource();
                                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                                    }
                                                    final InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue;
                                                    composerStartRestartGroup.endReplaceGroup();
                                                    final SnapshotState4<Boolean> snapshotState4CollectIsFocusedAsState = FocusInteraction3.collectIsFocusedAsState(interactionSource3, composerStartRestartGroup, 6);
                                                    if (z) {
                                                        inputState = TextInputStyle.InputState.Disabled;
                                                    } else if (message != null) {
                                                        if (message instanceof BentoTextInput8.Message.Error) {
                                                            inputState = TextInputStyle.InputState.Error;
                                                        } else {
                                                            if (!(message instanceof BentoTextInput8.Message.Success)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            inputState = TextInputStyle.InputState.Success;
                                                        }
                                                    } else {
                                                        inputState = BentoBaseTextInput$lambda$4(snapshotState4CollectIsFocusedAsState) ? TextInputStyle.InputState.Focused : TextInputStyle.InputState.Enabled;
                                                    }
                                                    SelectionColors selectionColors = new SelectionColors(standard.getColors().m21993getCursorColor0d7_KjU(), Color.m6705copywmQWz5c$default(standard.getColors().m21993getCursorColor0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
                                                    final TextInputStyle.Style style = standard;
                                                    final SnapshotState4<Color> snapshotState4 = standard.getColors().getValueColor().get(inputState, composerStartRestartGroup, TextInputStyle.StateColor.$stable << 3);
                                                    final BentoTextInput8.Icon.Size24 size245 = size244;
                                                    final String str7 = str6;
                                                    final Modifier modifier3 = modifier2;
                                                    final Integer num3 = num2;
                                                    final String str8 = str5;
                                                    final TextInputStyle.InputState inputState2 = inputState;
                                                    final Function1<? super String, Unit> function13 = function12;
                                                    final VisualTransformation visualTransformation3 = visualTransformation2;
                                                    composerStartRestartGroup = composerStartRestartGroup;
                                                    CompositionLocal3.CompositionLocalProvider(TextSelectionColors2.getLocalTextSelectionColors().provides(selectionColors), ComposableLambda3.rememberComposableLambda(-1752068788, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.BentoTextInputKt.BentoBaseTextInput.1

                                                        /* compiled from: BentoTextInput.kt */
                                                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                                        /* renamed from: com.robinhood.compose.bento.component.BentoTextInputKt$BentoBaseTextInput$1$WhenMappings */
                                                        public /* synthetic */ class WhenMappings {
                                                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                                            static {
                                                                int[] iArr = new int[BentoTextInput8.Size.values().length];
                                                                try {
                                                                    iArr[BentoTextInput8.Size.Standard.ordinal()] = 1;
                                                                } catch (NoSuchFieldError unused) {
                                                                }
                                                                try {
                                                                    iArr[BentoTextInput8.Size.Hero.ordinal()] = 2;
                                                                } catch (NoSuchFieldError unused2) {
                                                                }
                                                                try {
                                                                    iArr[BentoTextInput8.Size.TextArea.ordinal()] = 3;
                                                                } catch (NoSuchFieldError unused3) {
                                                                }
                                                                $EnumSwitchMapping$0 = iArr;
                                                            }
                                                        }

                                                        /* compiled from: BentoTextInput.kt */
                                                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                                        @SourceDebugExtension
                                                        /* renamed from: com.robinhood.compose.bento.component.BentoTextInputKt$BentoBaseTextInput$1$1, reason: invalid class name */
                                                        /* loaded from: classes15.dex */
                                                        static final class AnonymousClass1 implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {
                                                            final /* synthetic */ Integer $characterLimit;
                                                            final /* synthetic */ SnapshotState4<Boolean> $focused$delegate;
                                                            final /* synthetic */ String $hint;
                                                            final /* synthetic */ TextInputStyle.InputState $inputState;
                                                            final /* synthetic */ String $label;
                                                            final /* synthetic */ BentoTextInput8.Icon.Size24 $leadingIcon;
                                                            final /* synthetic */ BentoTextInput8.Message $message;
                                                            final /* synthetic */ Function2<Integer, Integer, String> $onCustomCharacterLimit;
                                                            final /* synthetic */ Function0<Unit> $onTrailingIconClick;
                                                            final /* synthetic */ String $placeholder;
                                                            final /* synthetic */ boolean $singleLine;
                                                            final /* synthetic */ BentoTextInput8.Size $size;
                                                            final /* synthetic */ TextInputStyle.Style $style;
                                                            final /* synthetic */ BentoTextInput8.Icon.Size24 $trailingIcon;
                                                            final /* synthetic */ String $value;
                                                            final /* synthetic */ SnapshotState4<Color> $valueColor$delegate;

                                                            /* compiled from: BentoTextInput.kt */
                                                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                                            /* renamed from: com.robinhood.compose.bento.component.BentoTextInputKt$BentoBaseTextInput$1$1$WhenMappings */
                                                            public /* synthetic */ class WhenMappings {
                                                                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                                                static {
                                                                    int[] iArr = new int[BentoTextInput8.Size.values().length];
                                                                    try {
                                                                        iArr[BentoTextInput8.Size.Standard.ordinal()] = 1;
                                                                    } catch (NoSuchFieldError unused) {
                                                                    }
                                                                    try {
                                                                        iArr[BentoTextInput8.Size.Hero.ordinal()] = 2;
                                                                    } catch (NoSuchFieldError unused2) {
                                                                    }
                                                                    try {
                                                                        iArr[BentoTextInput8.Size.TextArea.ordinal()] = 3;
                                                                    } catch (NoSuchFieldError unused3) {
                                                                    }
                                                                    $EnumSwitchMapping$0 = iArr;
                                                                }
                                                            }

                                                            /* JADX WARN: Multi-variable type inference failed */
                                                            AnonymousClass1(TextInputStyle.Style style, String str, TextInputStyle.InputState inputState, BentoTextInput8.Size size, BentoTextInput8.Icon.Size24 size24, BentoTextInput8.Icon.Size24 size242, BentoTextInput8.Message message, String str2, Integer num, SnapshotState4<Boolean> snapshotState4, Function0<Unit> function0, SnapshotState4<Color> snapshotState42, String str3, String str4, boolean z, Function2<? super Integer, ? super Integer, String> function2) {
                                                                this.$style = style;
                                                                this.$label = str;
                                                                this.$inputState = inputState;
                                                                this.$size = size;
                                                                this.$leadingIcon = size24;
                                                                this.$trailingIcon = size242;
                                                                this.$message = message;
                                                                this.$hint = str2;
                                                                this.$characterLimit = num;
                                                                this.$focused$delegate = snapshotState4;
                                                                this.$onTrailingIconClick = function0;
                                                                this.$valueColor$delegate = snapshotState42;
                                                                this.$placeholder = str3;
                                                                this.$value = str4;
                                                                this.$singleLine = z;
                                                                this.$onCustomCharacterLimit = function2;
                                                            }

                                                            /* JADX WARN: Removed duplicated region for block: B:110:0x0497  */
                                                            /* JADX WARN: Removed duplicated region for block: B:113:0x04b3  */
                                                            /* JADX WARN: Removed duplicated region for block: B:120:0x0502  */
                                                            /* JADX WARN: Removed duplicated region for block: B:123:0x0515  */
                                                            /* JADX WARN: Removed duplicated region for block: B:127:0x0523 A[ADDED_TO_REGION] */
                                                            /* JADX WARN: Removed duplicated region for block: B:132:0x052f  */
                                                            /* JADX WARN: Removed duplicated region for block: B:136:0x0555  */
                                                            /* JADX WARN: Removed duplicated region for block: B:139:0x0561  */
                                                            /* JADX WARN: Removed duplicated region for block: B:140:0x0565  */
                                                            /* JADX WARN: Removed duplicated region for block: B:145:0x0592  */
                                                            /* JADX WARN: Removed duplicated region for block: B:148:0x05db  */
                                                            /* JADX WARN: Removed duplicated region for block: B:151:0x05e7  */
                                                            /* JADX WARN: Removed duplicated region for block: B:152:0x05eb  */
                                                            /* JADX WARN: Removed duplicated region for block: B:157:0x0618  */
                                                            /* JADX WARN: Removed duplicated region for block: B:183:0x0742  */
                                                            /* JADX WARN: Removed duplicated region for block: B:196:0x07a9  */
                                                            /* JADX WARN: Removed duplicated region for block: B:197:0x07bb  */
                                                            /* JADX WARN: Removed duplicated region for block: B:199:0x07c1  */
                                                            /* JADX WARN: Removed duplicated region for block: B:204:0x081f  */
                                                            /* JADX WARN: Removed duplicated region for block: B:206:? A[RETURN, SYNTHETIC] */
                                                            /* JADX WARN: Removed duplicated region for block: B:82:0x0389  */
                                                            /* JADX WARN: Removed duplicated region for block: B:85:0x03aa  */
                                                            /* JADX WARN: Removed duplicated region for block: B:86:0x03af  */
                                                            /* JADX WARN: Removed duplicated region for block: B:89:0x03cd  */
                                                            /* JADX WARN: Removed duplicated region for block: B:92:0x03d9  */
                                                            /* JADX WARN: Removed duplicated region for block: B:93:0x03dd  */
                                                            /* JADX WARN: Removed duplicated region for block: B:98:0x040a  */
                                                            /* JADX WARN: Type inference failed for: r14v12 */
                                                            /* JADX WARN: Type inference failed for: r14v2 */
                                                            /* JADX WARN: Type inference failed for: r14v3, types: [boolean, int] */
                                                            /*
                                                                Code decompiled incorrectly, please refer to instructions dump.
                                                            */
                                                            public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer, int i) {
                                                                int i2;
                                                                int i3;
                                                                Arrangement arrangement;
                                                                TextInputStyle.Style style;
                                                                TextInputStyle.InputState inputState;
                                                                BentoTextInput8.Size size;
                                                                BentoTextInput8.Icon.Size24 size24;
                                                                BentoTextInput8.Icon.Size24 size242;
                                                                BentoTextInput8.Message message;
                                                                String str;
                                                                Integer num;
                                                                SnapshotState4<Boolean> snapshotState4;
                                                                Function0<Unit> function0;
                                                                SnapshotState4<Color> snapshotState42;
                                                                String str2;
                                                                Function2<Integer, Integer, String> function2;
                                                                Modifier.Companion companion;
                                                                int i4;
                                                                Alignment.Vertical centerVertically;
                                                                Arrangement arrangement2;
                                                                float f;
                                                                Modifier.Companion companion2;
                                                                Composer composer2;
                                                                BentoTextInput8.Size size2;
                                                                Object obj;
                                                                ?? r14;
                                                                Modifier.Companion companion3;
                                                                Object objRememberedValue;
                                                                Composer.Companion companion4;
                                                                int currentCompositeKeyHash;
                                                                Composer composerM6388constructorimpl;
                                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
                                                                Composer composer3;
                                                                TextInputStyle.InputState inputState2;
                                                                Modifier.Companion companion5;
                                                                BentoTextInput8.Size size3;
                                                                String str3;
                                                                int i5;
                                                                BentoTextInput8.Message message2;
                                                                Integer num2;
                                                                int currentCompositeKeyHash2;
                                                                Composer composerM6388constructorimpl2;
                                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
                                                                int currentCompositeKeyHash3;
                                                                Composer composerM6388constructorimpl3;
                                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
                                                                BentoTextInput8.Size size4;
                                                                String str4;
                                                                Integer num3;
                                                                TextInputStyle.InputState inputState3;
                                                                Function2<Integer, Integer, String> function22;
                                                                Integer num4;
                                                                String strInvoke;
                                                                ServerToBentoAssetMapper2 serverToBentoAssetMapper2;
                                                                Composer composer4 = composer;
                                                                Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                                                                if ((i & 6) == 0) {
                                                                    i2 = i | (composer4.changedInstance(innerTextField) ? 4 : 2);
                                                                } else {
                                                                    i2 = i;
                                                                }
                                                                if ((i2 & 19) == 18 && composer4.getSkipping()) {
                                                                    composer4.skipToGroupEnd();
                                                                    return;
                                                                }
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(1107266633, i2, -1, "com.robinhood.compose.bento.component.BentoBaseTextInput.<anonymous>.<anonymous> (BentoTextInput.kt:255)");
                                                                }
                                                                Arrangement arrangement3 = Arrangement.INSTANCE;
                                                                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement3.m5089spacedBy0680j_4(this.$style.getSpacing().m22021getVerticalSpacingD9Ej5fM());
                                                                Alignment.Horizontal horizontalAlignment = this.$style.getHorizontalAlignment();
                                                                int i6 = i2;
                                                                String str5 = this.$label;
                                                                TextInputStyle.Style style2 = this.$style;
                                                                TextInputStyle.InputState inputState4 = this.$inputState;
                                                                BentoTextInput8.Size size5 = this.$size;
                                                                BentoTextInput8.Icon.Size24 size243 = this.$leadingIcon;
                                                                BentoTextInput8.Icon.Size24 size244 = this.$trailingIcon;
                                                                BentoTextInput8.Message message3 = this.$message;
                                                                String str6 = this.$hint;
                                                                Integer num5 = this.$characterLimit;
                                                                SnapshotState4<Boolean> snapshotState43 = this.$focused$delegate;
                                                                Function0<Unit> function02 = this.$onTrailingIconClick;
                                                                SnapshotState4<Color> snapshotState44 = this.$valueColor$delegate;
                                                                String str7 = this.$placeholder;
                                                                String str8 = this.$value;
                                                                boolean z = this.$singleLine;
                                                                Function2<Integer, Integer, String> function23 = this.$onCustomCharacterLimit;
                                                                Modifier.Companion companion6 = Modifier.INSTANCE;
                                                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, horizontalAlignment, composer4, 0);
                                                                int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                                                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, companion6);
                                                                ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                                                                Function0<ComposeUiNode> constructor = companion7.getConstructor();
                                                                if (composer4.getApplier() == null) {
                                                                    Composables.invalidApplier();
                                                                }
                                                                composer4.startReusableNode();
                                                                if (composer4.getInserting()) {
                                                                    composer4.createNode(constructor);
                                                                } else {
                                                                    composer4.useNode();
                                                                }
                                                                Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer4);
                                                                Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy, companion7.getSetMeasurePolicy());
                                                                Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap, companion7.getSetResolvedCompositionLocals());
                                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion7.getSetCompositeKeyHash();
                                                                if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                                                    composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                                                    composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                                                }
                                                                Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier, companion7.getSetModifier());
                                                                Column6 column6 = Column6.INSTANCE;
                                                                composer4.startReplaceGroup(-1816249442);
                                                                if (str5 == null || StringsKt.isBlank(str5)) {
                                                                    i3 = i6;
                                                                    arrangement = arrangement3;
                                                                    style = style2;
                                                                    inputState = inputState4;
                                                                    size = size5;
                                                                    size24 = size243;
                                                                    size242 = size244;
                                                                    message = message3;
                                                                    str = str6;
                                                                    num = num5;
                                                                    snapshotState4 = snapshotState43;
                                                                    function0 = function02;
                                                                    snapshotState42 = snapshotState44;
                                                                    str2 = str8;
                                                                    function2 = function23;
                                                                    companion = companion6;
                                                                    i4 = 2;
                                                                } else {
                                                                    snapshotState4 = snapshotState43;
                                                                    size = size5;
                                                                    size24 = size243;
                                                                    size242 = size244;
                                                                    str = str6;
                                                                    arrangement = arrangement3;
                                                                    str2 = str8;
                                                                    function2 = function23;
                                                                    companion = companion6;
                                                                    inputState = inputState4;
                                                                    message = message3;
                                                                    num = num5;
                                                                    i4 = 2;
                                                                    snapshotState42 = snapshotState44;
                                                                    function0 = function02;
                                                                    style = style2;
                                                                    i3 = i6;
                                                                    BentoText2.m20747BentoText38GnDrw(str5, null, style2.getColors().getLabelColor().get(inputState4, composer4, TextInputStyle.StateColor.$stable << 3).getValue(), null, null, null, null, 0, false, 0, 0, null, 0, style2.getTypography().getLabelTextStyle(), composer, 0, 0, 8186);
                                                                    composer4 = composer;
                                                                }
                                                                composer4.endReplaceGroup();
                                                                int i7 = WhenMappings.$EnumSwitchMapping$0[size.ordinal()];
                                                                if (i7 == 1 || i7 == i4) {
                                                                    centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                                } else {
                                                                    if (i7 != 3) {
                                                                        throw new NoWhenBranchMatchedException();
                                                                    }
                                                                    centerVertically = Alignment.INSTANCE.getTop();
                                                                }
                                                                float value = style.getSizing().getBorderSize().get(BentoTextInput4.BentoBaseTextInput$lambda$4(snapshotState4), composer4, TextInputStyle.BorderSize.$stable << 3).getValue().getValue();
                                                                TextInputStyle.BorderColor borderColor = style.getColors().getBorderColor();
                                                                int i8 = TextInputStyle.BorderColor.$stable;
                                                                TextInputStyle.InputState inputState5 = inputState;
                                                                Modifier.Companion companion8 = companion;
                                                                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.m5155defaultMinSizeVpY3zN4$default(Background3.m4871backgroundbw27NRU(BorderKt.m4876borderxT4_qwU(companion8, value, borderColor.get(inputState5, composer4, i8 << 3).getValue().getValue(), style.getSizing().getShape()), style.getColors().m21992getBackgroundColor0d7_KjU(), style.getSizing().getShape()), 0.0f, style.getSizing().m22011getMinHeightD9Ej5fM(), 1, null), style.getSpacing().getContainerHorizontalPadding().get((size24 == null && size242 == null) ? false : true, composer4, TextInputStyle.HorizontalPadding.$stable << 3).getValue().getValue(), 0.0f, i4, null);
                                                                Arrangement arrangement4 = arrangement;
                                                                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement4.m5089spacedBy0680j_4(style.getSpacing().m22018getContainerIconSpacingD9Ej5fM()), centerVertically, composer4, 0);
                                                                int currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                                                CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer4, modifierM5144paddingVpY3zN4$default);
                                                                Function0<ComposeUiNode> constructor2 = companion7.getConstructor();
                                                                if (composer4.getApplier() == null) {
                                                                    Composables.invalidApplier();
                                                                }
                                                                composer4.startReusableNode();
                                                                if (composer4.getInserting()) {
                                                                    composer4.createNode(constructor2);
                                                                } else {
                                                                    composer4.useNode();
                                                                }
                                                                Composer composerM6388constructorimpl5 = Updater.m6388constructorimpl(composer4);
                                                                Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyRowMeasurePolicy, companion7.getSetMeasurePolicy());
                                                                Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap2, companion7.getSetResolvedCompositionLocals());
                                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion7.getSetCompositeKeyHash();
                                                                if (composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                                                    composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                                                    composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                                                }
                                                                Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier2, companion7.getSetModifier());
                                                                Row6 row6 = Row6.INSTANCE;
                                                                composer4.startReplaceGroup(-1038685916);
                                                                if (size24 != null) {
                                                                    BentoTextInput8.Size size6 = size;
                                                                    if (size6 == BentoTextInput8.Size.Standard) {
                                                                        BentoIcon4.Size24 size245 = new BentoIcon4.Size24(size24.getAsset());
                                                                        String contentDescription = size24.getContentDescription();
                                                                        Color colorM20746getAssetTintOverrideQN2ZGVo = size24.m20746getAssetTintOverrideQN2ZGVo();
                                                                        long value2 = colorM20746getAssetTintOverrideQN2ZGVo != null ? colorM20746getAssetTintOverrideQN2ZGVo.getValue() : BentoTextInput4.BentoBaseTextInput$lambda$5(snapshotState42);
                                                                        Modifier modifierTestTag = TestTag3.testTag(companion8, BentoTextInput7.TEXT_INPUT_LEADING_ICON);
                                                                        composer4.startReplaceGroup(1849434622);
                                                                        Object objRememberedValue2 = composer4.rememberedValue();
                                                                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                                            objRememberedValue2 = new Function1() { // from class: com.robinhood.compose.bento.component.BentoTextInputKt$BentoBaseTextInput$1$1$$ExternalSyntheticLambda0
                                                                                @Override // kotlin.jvm.functions.Function1
                                                                                public final Object invoke(Object obj2) {
                                                                                    return BentoTextInput4.C324531.AnonymousClass1.invoke$lambda$11$lambda$7$lambda$1$lambda$0((SemanticsPropertyReceiver) obj2);
                                                                                }
                                                                            };
                                                                            composer4.updateRememberedValue(objRememberedValue2);
                                                                        }
                                                                        composer4.endReplaceGroup();
                                                                        arrangement2 = arrangement4;
                                                                        Composer composer5 = composer4;
                                                                        obj = null;
                                                                        companion2 = companion8;
                                                                        size2 = size6;
                                                                        r14 = 0;
                                                                        f = 0.0f;
                                                                        BentoIcon2.m20644BentoIconFU0evQE(size245, contentDescription, value2, SemanticsModifier6.semantics$default(modifierTestTag, false, (Function1) objRememberedValue2, 1, null), null, false, composer5, 0, 48);
                                                                        composer2 = composer5;
                                                                        composer2.endReplaceGroup();
                                                                        companion3 = companion2;
                                                                        Modifier modifierTestTag2 = TestTag3.testTag(PaddingKt.m5144paddingVpY3zN4$default(Row5.weight$default(row6, companion3, 1.0f, false, 2, null), f, style.getSpacing().m22019getContainerVerticalPaddingD9Ej5fM(), 1, obj), BentoTextInput7.TEXT_INPUT_BOX);
                                                                        composer2.startReplaceGroup(1849434622);
                                                                        objRememberedValue = composer2.rememberedValue();
                                                                        companion4 = Composer.INSTANCE;
                                                                        if (objRememberedValue == companion4.getEmpty()) {
                                                                            objRememberedValue = new Function1() { // from class: com.robinhood.compose.bento.component.BentoTextInputKt$BentoBaseTextInput$1$1$$ExternalSyntheticLambda1
                                                                                @Override // kotlin.jvm.functions.Function1
                                                                                public final Object invoke(Object obj2) {
                                                                                    return BentoTextInput4.C324531.AnonymousClass1.invoke$lambda$11$lambda$7$lambda$3$lambda$2((SemanticsPropertyReceiver) obj2);
                                                                                }
                                                                            };
                                                                            composer2.updateRememberedValue(objRememberedValue);
                                                                        }
                                                                        composer2.endReplaceGroup();
                                                                        Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(modifierTestTag2, r14, (Function1) objRememberedValue, 1, obj);
                                                                        Alignment.Horizontal horizontalAlignment2 = style.getHorizontalAlignment();
                                                                        Alignment.Companion companion9 = Alignment.INSTANCE;
                                                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(!Intrinsics.areEqual(horizontalAlignment2, companion9.getCenterHorizontally()) ? companion9.getCenter() : companion9.getTopStart(), r14);
                                                                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, r14);
                                                                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                                                                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierSemantics$default);
                                                                        Function0<ComposeUiNode> constructor3 = companion7.getConstructor();
                                                                        if (composer2.getApplier() == null) {
                                                                            Composables.invalidApplier();
                                                                        }
                                                                        composer2.startReusableNode();
                                                                        if (composer2.getInserting()) {
                                                                            composer2.useNode();
                                                                        } else {
                                                                            composer2.createNode(constructor3);
                                                                        }
                                                                        composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                                                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion7.getSetMeasurePolicy());
                                                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion7.getSetResolvedCompositionLocals());
                                                                        setCompositeKeyHash = companion7.getSetCompositeKeyHash();
                                                                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                                        }
                                                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion7.getSetModifier());
                                                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                                        composer2.startReplaceGroup(-77535801);
                                                                        if (str7 == null && !StringsKt.isBlank(str7) && str2.length() == 0) {
                                                                            inputState2 = inputState5;
                                                                            companion5 = companion3;
                                                                            TextKt.m6028Text4IGK_g(str7, null, style.getColors().getPlaceholderColor().get(inputState5, composer2, TextInputStyle.PlaceholderColor.$stable << 3).getValue().getValue(), 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), !z, z ? 1 : Integer.MAX_VALUE, 0, null, style.getTypography().getValueTextStyle(), composer, 0, 48, 51194);
                                                                            composer3 = composer;
                                                                        } else {
                                                                            composer3 = composer2;
                                                                            inputState2 = inputState5;
                                                                            companion5 = companion3;
                                                                        }
                                                                        composer3.endReplaceGroup();
                                                                        innerTextField.invoke(composer3, Integer.valueOf(i3 & 14));
                                                                        composer3.endNode();
                                                                        composer3.startReplaceGroup(-1038607930);
                                                                        if (size242 == null) {
                                                                            size3 = size2;
                                                                            if (size3 != BentoTextInput8.Size.TextArea) {
                                                                                BentoIcon4.Size24 size246 = new BentoIcon4.Size24(size242.getAsset());
                                                                                String contentDescription2 = size242.getContentDescription();
                                                                                long jBentoBaseTextInput$lambda$5 = BentoTextInput4.BentoBaseTextInput$lambda$5(snapshotState42);
                                                                                Modifier modifierTestTag3 = TestTag3.testTag(companion5, BentoTextInput7.TEXT_INPUT_TRAILING_ICON);
                                                                                composer3.startReplaceGroup(1849434622);
                                                                                Object objRememberedValue3 = composer3.rememberedValue();
                                                                                if (objRememberedValue3 == companion4.getEmpty()) {
                                                                                    objRememberedValue3 = new Function1() { // from class: com.robinhood.compose.bento.component.BentoTextInputKt$BentoBaseTextInput$1$1$$ExternalSyntheticLambda2
                                                                                        @Override // kotlin.jvm.functions.Function1
                                                                                        public final Object invoke(Object obj2) {
                                                                                            return BentoTextInput4.C324531.AnonymousClass1.invoke$lambda$11$lambda$7$lambda$6$lambda$5((SemanticsPropertyReceiver) obj2);
                                                                                        }
                                                                                    };
                                                                                    composer3.updateRememberedValue(objRememberedValue3);
                                                                                }
                                                                                composer3.endReplaceGroup();
                                                                                str3 = null;
                                                                                i5 = 0;
                                                                                BentoIcon2.m20644BentoIconFU0evQE(size246, contentDescription2, jBentoBaseTextInput$lambda$5, SemanticsModifier6.semantics$default(modifierTestTag3, false, (Function1) objRememberedValue3, 1, null), function0, false, composer3, 0, 32);
                                                                            }
                                                                            composer3.endReplaceGroup();
                                                                            composer3.endNode();
                                                                            composer3.startReplaceGroup(-1816083537);
                                                                            message2 = message;
                                                                            if ((message2 == null || StringsKt.isBlank(message2.getMessage())) && (str == null || StringsKt.isBlank(str))) {
                                                                                num2 = num;
                                                                                if (num2 != null && size3 == BentoTextInput8.Size.TextArea) {
                                                                                }
                                                                                composer.endReplaceGroup();
                                                                                composer.endNode();
                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                    return;
                                                                                }
                                                                                ComposerKt.traceEventEnd();
                                                                                return;
                                                                            }
                                                                            num2 = num;
                                                                            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion9.getTop(), composer3, i5);
                                                                            currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, i5);
                                                                            CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                                                                            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer3, companion5);
                                                                            Function0<ComposeUiNode> constructor4 = companion7.getConstructor();
                                                                            if (composer3.getApplier() == null) {
                                                                                Composables.invalidApplier();
                                                                            }
                                                                            composer3.startReusableNode();
                                                                            if (composer3.getInserting()) {
                                                                                composer3.useNode();
                                                                            } else {
                                                                                composer3.createNode(constructor4);
                                                                            }
                                                                            composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                                                                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion7.getSetMeasurePolicy());
                                                                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap4, companion7.getSetResolvedCompositionLocals());
                                                                            setCompositeKeyHash2 = companion7.getSetCompositeKeyHash();
                                                                            if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                                            }
                                                                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier4, companion7.getSetModifier());
                                                                            Modifier.Companion companion10 = companion5;
                                                                            Modifier modifierWeight$default = Row5.weight$default(row6, companion10, 1.0f, false, 2, null);
                                                                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion9.getStart(), composer3, i5);
                                                                            currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, i5);
                                                                            CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                                                                            Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composer3, modifierWeight$default);
                                                                            Function0<ComposeUiNode> constructor5 = companion7.getConstructor();
                                                                            if (composer3.getApplier() == null) {
                                                                                Composables.invalidApplier();
                                                                            }
                                                                            composer3.startReusableNode();
                                                                            if (composer3.getInserting()) {
                                                                                composer3.useNode();
                                                                            } else {
                                                                                composer3.createNode(constructor5);
                                                                            }
                                                                            composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer3);
                                                                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion7.getSetMeasurePolicy());
                                                                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap5, companion7.getSetResolvedCompositionLocals());
                                                                            setCompositeKeyHash3 = companion7.getSetCompositeKeyHash();
                                                                            if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                                                            }
                                                                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier5, companion7.getSetModifier());
                                                                            composer3.startReplaceGroup(-340346335);
                                                                            if (message2 != null || StringsKt.isBlank(message2.getMessage())) {
                                                                                size4 = size3;
                                                                                str4 = str3;
                                                                                num3 = num2;
                                                                                inputState3 = inputState2;
                                                                            } else {
                                                                                MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(arrangement2.m5089spacedBy0680j_4(style.getSpacing().m22020getMessageIconSpacingD9Ej5fM()), companion9.getCenterVertically(), composer3, 48);
                                                                                int currentCompositeKeyHash6 = Composables.getCurrentCompositeKeyHash(composer3, i5);
                                                                                CompositionLocalMap currentCompositionLocalMap6 = composer3.getCurrentCompositionLocalMap();
                                                                                Modifier modifierMaterializeModifier6 = ComposedModifier2.materializeModifier(composer3, companion10);
                                                                                Function0<ComposeUiNode> constructor6 = companion7.getConstructor();
                                                                                if (composer3.getApplier() == null) {
                                                                                    Composables.invalidApplier();
                                                                                }
                                                                                composer3.startReusableNode();
                                                                                if (composer3.getInserting()) {
                                                                                    composer3.createNode(constructor6);
                                                                                } else {
                                                                                    composer3.useNode();
                                                                                }
                                                                                Composer composerM6388constructorimpl6 = Updater.m6388constructorimpl(composer3);
                                                                                Updater.m6390setimpl(composerM6388constructorimpl6, measurePolicyRowMeasurePolicy3, companion7.getSetMeasurePolicy());
                                                                                Updater.m6390setimpl(composerM6388constructorimpl6, currentCompositionLocalMap6, companion7.getSetResolvedCompositionLocals());
                                                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion7.getSetCompositeKeyHash();
                                                                                if (composerM6388constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                                                                    composerM6388constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                                                                                    composerM6388constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                                                                                }
                                                                                Updater.m6390setimpl(composerM6388constructorimpl6, modifierMaterializeModifier6, companion7.getSetModifier());
                                                                                if (message2 instanceof BentoTextInput8.Message.Success) {
                                                                                    serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.BUBBLE_CHECKED_16;
                                                                                } else {
                                                                                    if (!(message2 instanceof BentoTextInput8.Message.Error)) {
                                                                                        throw new NoWhenBranchMatchedException();
                                                                                    }
                                                                                    serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.TRIANGLE_ALERT_16;
                                                                                }
                                                                                TextInputStyle.InputState inputState6 = inputState2;
                                                                                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(serverToBentoAssetMapper2), null, style.getColors().getBorderColor().get(inputState6, composer3, i8 << 3).getValue().getValue(), null, null, false, composer3, 48, 56);
                                                                                str4 = str3;
                                                                                num3 = num2;
                                                                                size4 = size3;
                                                                                inputState3 = inputState2;
                                                                                BentoText2.m20747BentoText38GnDrw(message2.getMessage(), null, style.getColors().getBorderColor().get(inputState6, composer3, i8 << 3).getValue(), null, null, null, null, 0, false, 0, 0, null, 0, style.getTypography().getMessageTextStyle(), composer3, 0, 0, 8186);
                                                                                composer3.endNode();
                                                                            }
                                                                            composer3.endReplaceGroup();
                                                                            composer3.startReplaceGroup(-340293298);
                                                                            if (str != null && !StringsKt.isBlank(str)) {
                                                                                BentoText2.m20747BentoText38GnDrw(str, null, style.getColors().getHintColor().get(inputState3, composer3, TextInputStyle.StateColor.$stable << 3).getValue(), null, null, null, null, 0, false, 0, 0, null, 0, style.getTypography().getHintTextStyle(), composer3, 0, 0, 8186);
                                                                            }
                                                                            composer3.endReplaceGroup();
                                                                            composer3.endNode();
                                                                            composer3.startReplaceGroup(2056909099);
                                                                            if (num3 != null && size4 == BentoTextInput8.Size.TextArea) {
                                                                                function22 = function2;
                                                                                if (function22 == null) {
                                                                                    num4 = num3;
                                                                                    strInvoke = function22.invoke(num4, Integer.valueOf(str2.length()));
                                                                                } else {
                                                                                    num4 = num3;
                                                                                    strInvoke = str4;
                                                                                }
                                                                                if (strInvoke == null) {
                                                                                    strInvoke = str2.length() + "/" + num4;
                                                                                }
                                                                                BentoText2.m20747BentoText38GnDrw(strInvoke, null, style.getColors().getCharacterLimitColor().get(inputState3, composer3, TextInputStyle.StateColor.$stable << 3).getValue(), null, null, null, null, 0, false, 0, 0, null, 0, style.getTypography().getCharacterLimitTextStyle(), composer3, 0, 0, 8186);
                                                                            }
                                                                            composer.endReplaceGroup();
                                                                            composer.endNode();
                                                                            composer.endReplaceGroup();
                                                                            composer.endNode();
                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                            }
                                                                        } else {
                                                                            size3 = size2;
                                                                        }
                                                                        str3 = null;
                                                                        i5 = 0;
                                                                        composer3.endReplaceGroup();
                                                                        composer3.endNode();
                                                                        composer3.startReplaceGroup(-1816083537);
                                                                        message2 = message;
                                                                        if (message2 == null) {
                                                                            num2 = num;
                                                                            if (num2 != null) {
                                                                                MeasurePolicy measurePolicyRowMeasurePolicy22 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion9.getTop(), composer3, i5);
                                                                                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, i5);
                                                                                CompositionLocalMap currentCompositionLocalMap42 = composer3.getCurrentCompositionLocalMap();
                                                                                Modifier modifierMaterializeModifier42 = ComposedModifier2.materializeModifier(composer3, companion5);
                                                                                Function0<ComposeUiNode> constructor42 = companion7.getConstructor();
                                                                                if (composer3.getApplier() == null) {
                                                                                }
                                                                                composer3.startReusableNode();
                                                                                if (composer3.getInserting()) {
                                                                                }
                                                                                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                                                                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy22, companion7.getSetMeasurePolicy());
                                                                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap42, companion7.getSetResolvedCompositionLocals());
                                                                                setCompositeKeyHash2 = companion7.getSetCompositeKeyHash();
                                                                                if (!composerM6388constructorimpl2.getInserting()) {
                                                                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                                                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier42, companion7.getSetModifier());
                                                                                    Modifier.Companion companion102 = companion5;
                                                                                    Modifier modifierWeight$default2 = Row5.weight$default(row6, companion102, 1.0f, false, 2, null);
                                                                                    MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion9.getStart(), composer3, i5);
                                                                                    currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, i5);
                                                                                    CompositionLocalMap currentCompositionLocalMap52 = composer3.getCurrentCompositionLocalMap();
                                                                                    Modifier modifierMaterializeModifier52 = ComposedModifier2.materializeModifier(composer3, modifierWeight$default2);
                                                                                    Function0<ComposeUiNode> constructor52 = companion7.getConstructor();
                                                                                    if (composer3.getApplier() == null) {
                                                                                    }
                                                                                    composer3.startReusableNode();
                                                                                    if (composer3.getInserting()) {
                                                                                    }
                                                                                    composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer3);
                                                                                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy22, companion7.getSetMeasurePolicy());
                                                                                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap52, companion7.getSetResolvedCompositionLocals());
                                                                                    setCompositeKeyHash3 = companion7.getSetCompositeKeyHash();
                                                                                    if (!composerM6388constructorimpl3.getInserting()) {
                                                                                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                                                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                                                                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier52, companion7.getSetModifier());
                                                                                        composer3.startReplaceGroup(-340346335);
                                                                                        if (message2 != null) {
                                                                                            size4 = size3;
                                                                                            str4 = str3;
                                                                                            num3 = num2;
                                                                                            inputState3 = inputState2;
                                                                                            composer3.endReplaceGroup();
                                                                                            composer3.startReplaceGroup(-340293298);
                                                                                            if (str != null) {
                                                                                                BentoText2.m20747BentoText38GnDrw(str, null, style.getColors().getHintColor().get(inputState3, composer3, TextInputStyle.StateColor.$stable << 3).getValue(), null, null, null, null, 0, false, 0, 0, null, 0, style.getTypography().getHintTextStyle(), composer3, 0, 0, 8186);
                                                                                            }
                                                                                            composer3.endReplaceGroup();
                                                                                            composer3.endNode();
                                                                                            composer3.startReplaceGroup(2056909099);
                                                                                            if (num3 != null) {
                                                                                                function22 = function2;
                                                                                                if (function22 == null) {
                                                                                                }
                                                                                                if (strInvoke == null) {
                                                                                                }
                                                                                                BentoText2.m20747BentoText38GnDrw(strInvoke, null, style.getColors().getCharacterLimitColor().get(inputState3, composer3, TextInputStyle.StateColor.$stable << 3).getValue(), null, null, null, null, 0, false, 0, 0, null, 0, style.getTypography().getCharacterLimitTextStyle(), composer3, 0, 0, 8186);
                                                                                            }
                                                                                            composer.endReplaceGroup();
                                                                                            composer.endNode();
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            num2 = num;
                                                                            if (num2 != null) {
                                                                            }
                                                                        }
                                                                        composer.endReplaceGroup();
                                                                        composer.endNode();
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                        }
                                                                    } else {
                                                                        size2 = size6;
                                                                        arrangement2 = arrangement4;
                                                                        f = 0.0f;
                                                                        companion2 = companion8;
                                                                        composer2 = composer4;
                                                                    }
                                                                } else {
                                                                    arrangement2 = arrangement4;
                                                                    f = 0.0f;
                                                                    companion2 = companion8;
                                                                    composer2 = composer4;
                                                                    size2 = size;
                                                                }
                                                                obj = null;
                                                                r14 = 0;
                                                                composer2.endReplaceGroup();
                                                                companion3 = companion2;
                                                                Modifier modifierTestTag22 = TestTag3.testTag(PaddingKt.m5144paddingVpY3zN4$default(Row5.weight$default(row6, companion3, 1.0f, false, 2, null), f, style.getSpacing().m22019getContainerVerticalPaddingD9Ej5fM(), 1, obj), BentoTextInput7.TEXT_INPUT_BOX);
                                                                composer2.startReplaceGroup(1849434622);
                                                                objRememberedValue = composer2.rememberedValue();
                                                                companion4 = Composer.INSTANCE;
                                                                if (objRememberedValue == companion4.getEmpty()) {
                                                                }
                                                                composer2.endReplaceGroup();
                                                                Modifier modifierSemantics$default2 = SemanticsModifier6.semantics$default(modifierTestTag22, r14, (Function1) objRememberedValue, 1, obj);
                                                                Alignment.Horizontal horizontalAlignment22 = style.getHorizontalAlignment();
                                                                Alignment.Companion companion92 = Alignment.INSTANCE;
                                                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(!Intrinsics.areEqual(horizontalAlignment22, companion92.getCenterHorizontally()) ? companion92.getCenter() : companion92.getTopStart(), r14);
                                                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, r14);
                                                                CompositionLocalMap currentCompositionLocalMap32 = composer2.getCurrentCompositionLocalMap();
                                                                Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composer2, modifierSemantics$default2);
                                                                Function0<ComposeUiNode> constructor32 = companion7.getConstructor();
                                                                if (composer2.getApplier() == null) {
                                                                }
                                                                composer2.startReusableNode();
                                                                if (composer2.getInserting()) {
                                                                }
                                                                composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                                                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion7.getSetMeasurePolicy());
                                                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap32, companion7.getSetResolvedCompositionLocals());
                                                                setCompositeKeyHash = companion7.getSetCompositeKeyHash();
                                                                if (!composerM6388constructorimpl.getInserting()) {
                                                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                                }
                                                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier32, companion7.getSetModifier());
                                                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                                composer2.startReplaceGroup(-77535801);
                                                                if (str7 == null) {
                                                                    composer3 = composer2;
                                                                    inputState2 = inputState5;
                                                                    companion5 = companion3;
                                                                }
                                                                composer3.endReplaceGroup();
                                                                innerTextField.invoke(composer3, Integer.valueOf(i3 & 14));
                                                                composer3.endNode();
                                                                composer3.startReplaceGroup(-1038607930);
                                                                if (size242 == null) {
                                                                }
                                                                str3 = null;
                                                                i5 = 0;
                                                                composer3.endReplaceGroup();
                                                                composer3.endNode();
                                                                composer3.startReplaceGroup(-1816083537);
                                                                message2 = message;
                                                                if (message2 == null) {
                                                                }
                                                                composer.endReplaceGroup();
                                                                composer.endNode();
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                }
                                                            }

                                                            @Override // kotlin.jvm.functions.Function3
                                                            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
                                                                invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer, num.intValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* JADX INFO: Access modifiers changed from: private */
                                                            public static final Unit invoke$lambda$11$lambda$7$lambda$1$lambda$0(SemanticsPropertyReceiver semantics) {
                                                                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                                                SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* JADX INFO: Access modifiers changed from: private */
                                                            public static final Unit invoke$lambda$11$lambda$7$lambda$3$lambda$2(SemanticsPropertyReceiver semantics) {
                                                                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                                                SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* JADX INFO: Access modifiers changed from: private */
                                                            public static final Unit invoke$lambda$11$lambda$7$lambda$6$lambda$5(SemanticsPropertyReceiver semantics) {
                                                                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                                                SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
                                                                return Unit.INSTANCE;
                                                            }
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num4) {
                                                            invoke(composer2, num4.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(Composer composer2, int i12) {
                                                            boolean z3;
                                                            if ((i12 & 3) == 2 && composer2.getSkipping()) {
                                                                composer2.skipToGroupEnd();
                                                                return;
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-1752068788, i12, -1, "com.robinhood.compose.bento.component.BentoBaseTextInput.<anonymous> (BentoTextInput.kt:234)");
                                                            }
                                                            int i13 = WhenMappings.$EnumSwitchMapping$0[size.ordinal()];
                                                            if (i13 == 1 || i13 == 2) {
                                                                z3 = true;
                                                            } else {
                                                                if (i13 != 3) {
                                                                    throw new NoWhenBranchMatchedException();
                                                                }
                                                                z3 = false;
                                                            }
                                                            Modifier modifierWithBentoPlaceholder$default = LocalShowPlaceholder.withBentoPlaceholder$default(modifier3, false, null, 3, null);
                                                            TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(style.getTypography().getValueTextStyle(), BentoTextInput4.BentoBaseTextInput$lambda$5(snapshotState4), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                                                            SolidColor solidColor = new SolidColor(style.getColors().m21993getCursorColor0d7_KjU(), null);
                                                            String str9 = str;
                                                            BasicTextFieldKt.BasicTextField(str9, function13, modifierWithBentoPlaceholder$default, z, z2, textStyleM7655copyp1EtxEg$default, keyboardOptions, keyboardActions, z3, 0, 0, visualTransformation3, (Function1<? super TextLayoutResult, Unit>) null, interactionSource3, solidColor, ComposableLambda3.rememberComposableLambda(1107266633, true, new AnonymousClass1(style, str8, inputState2, size, size243, size245, message, str4, num3, snapshotState4CollectIsFocusedAsState, function0, snapshotState4, str7, str9, z3, function23), composer2, 54), composer2, 0, 199680, 5632);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                        }
                                                    }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                    function22 = function23;
                                                } else {
                                                    composerStartRestartGroup.skipToGroupEnd();
                                                    function22 = function2;
                                                }
                                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                                if (scopeUpdateScopeEndRestartGroup != null) {
                                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoTextInputKt$$ExternalSyntheticLambda6
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Object invoke(Object obj, Object obj2) {
                                                            return BentoTextInput4.BentoBaseTextInput$lambda$6(str, function1, modifier, str2, str3, str4, message, num, size24, size242, function0, size, keyboardOptions, keyboardActions, visualTransformation, z, z2, function22, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                                        }
                                                    });
                                                    return;
                                                }
                                                return;
                                            }
                                            i9 |= 24576;
                                            visualTransformation2 = visualTransformation;
                                            if ((i3 & 32768) != 0) {
                                            }
                                            if ((i3 & 65536) != 0) {
                                            }
                                            i7 = i3 & 131072;
                                            if (i7 != 0) {
                                            }
                                            int i112 = i6;
                                            if ((i4 & 306783379) != 306783378) {
                                                if (i7 == 0) {
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                i8 = WhenMappings.$EnumSwitchMapping$0[size.ordinal()];
                                                if (i8 != 1) {
                                                }
                                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                }
                                                final InteractionSource3 interactionSource32 = (InteractionSource3) objRememberedValue;
                                                composerStartRestartGroup.endReplaceGroup();
                                                final SnapshotState4<Boolean> snapshotState4CollectIsFocusedAsState2 = FocusInteraction3.collectIsFocusedAsState(interactionSource32, composerStartRestartGroup, 6);
                                                if (z) {
                                                }
                                                SelectionColors selectionColors2 = new SelectionColors(standard.getColors().m21993getCursorColor0d7_KjU(), Color.m6705copywmQWz5c$default(standard.getColors().m21993getCursorColor0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
                                                final TextInputStyle.Style style2 = standard;
                                                final SnapshotState4<Color> snapshotState42 = standard.getColors().getValueColor().get(inputState, composerStartRestartGroup, TextInputStyle.StateColor.$stable << 3);
                                                final BentoTextInput8.Icon.Size24 size2452 = size244;
                                                final String str72 = str6;
                                                final Modifier modifier32 = modifier2;
                                                final Integer num32 = num2;
                                                final String str82 = str5;
                                                final TextInputStyle.InputState inputState22 = inputState;
                                                final Function1<? super String, Unit> function132 = function12;
                                                final VisualTransformation visualTransformation32 = visualTransformation2;
                                                composerStartRestartGroup = composerStartRestartGroup;
                                                CompositionLocal3.CompositionLocalProvider(TextSelectionColors2.getLocalTextSelectionColors().provides(selectionColors2), ComposableLambda3.rememberComposableLambda(-1752068788, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.BentoTextInputKt.BentoBaseTextInput.1

                                                    /* compiled from: BentoTextInput.kt */
                                                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                                    /* renamed from: com.robinhood.compose.bento.component.BentoTextInputKt$BentoBaseTextInput$1$WhenMappings */
                                                    public /* synthetic */ class WhenMappings {
                                                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                                        static {
                                                            int[] iArr = new int[BentoTextInput8.Size.values().length];
                                                            try {
                                                                iArr[BentoTextInput8.Size.Standard.ordinal()] = 1;
                                                            } catch (NoSuchFieldError unused) {
                                                            }
                                                            try {
                                                                iArr[BentoTextInput8.Size.Hero.ordinal()] = 2;
                                                            } catch (NoSuchFieldError unused2) {
                                                            }
                                                            try {
                                                                iArr[BentoTextInput8.Size.TextArea.ordinal()] = 3;
                                                            } catch (NoSuchFieldError unused3) {
                                                            }
                                                            $EnumSwitchMapping$0 = iArr;
                                                        }
                                                    }

                                                    /* compiled from: BentoTextInput.kt */
                                                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                                    @SourceDebugExtension
                                                    /* renamed from: com.robinhood.compose.bento.component.BentoTextInputKt$BentoBaseTextInput$1$1, reason: invalid class name */
                                                    /* loaded from: classes15.dex */
                                                    static final class AnonymousClass1 implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {
                                                        final /* synthetic */ Integer $characterLimit;
                                                        final /* synthetic */ SnapshotState4<Boolean> $focused$delegate;
                                                        final /* synthetic */ String $hint;
                                                        final /* synthetic */ TextInputStyle.InputState $inputState;
                                                        final /* synthetic */ String $label;
                                                        final /* synthetic */ BentoTextInput8.Icon.Size24 $leadingIcon;
                                                        final /* synthetic */ BentoTextInput8.Message $message;
                                                        final /* synthetic */ Function2<Integer, Integer, String> $onCustomCharacterLimit;
                                                        final /* synthetic */ Function0<Unit> $onTrailingIconClick;
                                                        final /* synthetic */ String $placeholder;
                                                        final /* synthetic */ boolean $singleLine;
                                                        final /* synthetic */ BentoTextInput8.Size $size;
                                                        final /* synthetic */ TextInputStyle.Style $style;
                                                        final /* synthetic */ BentoTextInput8.Icon.Size24 $trailingIcon;
                                                        final /* synthetic */ String $value;
                                                        final /* synthetic */ SnapshotState4<Color> $valueColor$delegate;

                                                        /* compiled from: BentoTextInput.kt */
                                                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                                        /* renamed from: com.robinhood.compose.bento.component.BentoTextInputKt$BentoBaseTextInput$1$1$WhenMappings */
                                                        public /* synthetic */ class WhenMappings {
                                                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                                            static {
                                                                int[] iArr = new int[BentoTextInput8.Size.values().length];
                                                                try {
                                                                    iArr[BentoTextInput8.Size.Standard.ordinal()] = 1;
                                                                } catch (NoSuchFieldError unused) {
                                                                }
                                                                try {
                                                                    iArr[BentoTextInput8.Size.Hero.ordinal()] = 2;
                                                                } catch (NoSuchFieldError unused2) {
                                                                }
                                                                try {
                                                                    iArr[BentoTextInput8.Size.TextArea.ordinal()] = 3;
                                                                } catch (NoSuchFieldError unused3) {
                                                                }
                                                                $EnumSwitchMapping$0 = iArr;
                                                            }
                                                        }

                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        AnonymousClass1(TextInputStyle.Style style, String str, TextInputStyle.InputState inputState, BentoTextInput8.Size size, BentoTextInput8.Icon.Size24 size24, BentoTextInput8.Icon.Size24 size242, BentoTextInput8.Message message, String str2, Integer num, SnapshotState4<Boolean> snapshotState4, Function0<Unit> function0, SnapshotState4<Color> snapshotState42, String str3, String str4, boolean z, Function2<? super Integer, ? super Integer, String> function2) {
                                                            this.$style = style;
                                                            this.$label = str;
                                                            this.$inputState = inputState;
                                                            this.$size = size;
                                                            this.$leadingIcon = size24;
                                                            this.$trailingIcon = size242;
                                                            this.$message = message;
                                                            this.$hint = str2;
                                                            this.$characterLimit = num;
                                                            this.$focused$delegate = snapshotState4;
                                                            this.$onTrailingIconClick = function0;
                                                            this.$valueColor$delegate = snapshotState42;
                                                            this.$placeholder = str3;
                                                            this.$value = str4;
                                                            this.$singleLine = z;
                                                            this.$onCustomCharacterLimit = function2;
                                                        }

                                                        /* JADX WARN: Removed duplicated region for block: B:110:0x0497  */
                                                        /* JADX WARN: Removed duplicated region for block: B:113:0x04b3  */
                                                        /* JADX WARN: Removed duplicated region for block: B:120:0x0502  */
                                                        /* JADX WARN: Removed duplicated region for block: B:123:0x0515  */
                                                        /* JADX WARN: Removed duplicated region for block: B:127:0x0523 A[ADDED_TO_REGION] */
                                                        /* JADX WARN: Removed duplicated region for block: B:132:0x052f  */
                                                        /* JADX WARN: Removed duplicated region for block: B:136:0x0555  */
                                                        /* JADX WARN: Removed duplicated region for block: B:139:0x0561  */
                                                        /* JADX WARN: Removed duplicated region for block: B:140:0x0565  */
                                                        /* JADX WARN: Removed duplicated region for block: B:145:0x0592  */
                                                        /* JADX WARN: Removed duplicated region for block: B:148:0x05db  */
                                                        /* JADX WARN: Removed duplicated region for block: B:151:0x05e7  */
                                                        /* JADX WARN: Removed duplicated region for block: B:152:0x05eb  */
                                                        /* JADX WARN: Removed duplicated region for block: B:157:0x0618  */
                                                        /* JADX WARN: Removed duplicated region for block: B:183:0x0742  */
                                                        /* JADX WARN: Removed duplicated region for block: B:196:0x07a9  */
                                                        /* JADX WARN: Removed duplicated region for block: B:197:0x07bb  */
                                                        /* JADX WARN: Removed duplicated region for block: B:199:0x07c1  */
                                                        /* JADX WARN: Removed duplicated region for block: B:204:0x081f  */
                                                        /* JADX WARN: Removed duplicated region for block: B:206:? A[RETURN, SYNTHETIC] */
                                                        /* JADX WARN: Removed duplicated region for block: B:82:0x0389  */
                                                        /* JADX WARN: Removed duplicated region for block: B:85:0x03aa  */
                                                        /* JADX WARN: Removed duplicated region for block: B:86:0x03af  */
                                                        /* JADX WARN: Removed duplicated region for block: B:89:0x03cd  */
                                                        /* JADX WARN: Removed duplicated region for block: B:92:0x03d9  */
                                                        /* JADX WARN: Removed duplicated region for block: B:93:0x03dd  */
                                                        /* JADX WARN: Removed duplicated region for block: B:98:0x040a  */
                                                        /* JADX WARN: Type inference failed for: r14v12 */
                                                        /* JADX WARN: Type inference failed for: r14v2 */
                                                        /* JADX WARN: Type inference failed for: r14v3, types: [boolean, int] */
                                                        /*
                                                            Code decompiled incorrectly, please refer to instructions dump.
                                                        */
                                                        public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer, int i) {
                                                            int i2;
                                                            int i3;
                                                            Arrangement arrangement;
                                                            TextInputStyle.Style style;
                                                            TextInputStyle.InputState inputState;
                                                            BentoTextInput8.Size size;
                                                            BentoTextInput8.Icon.Size24 size24;
                                                            BentoTextInput8.Icon.Size24 size242;
                                                            BentoTextInput8.Message message;
                                                            String str;
                                                            Integer num;
                                                            SnapshotState4<Boolean> snapshotState4;
                                                            Function0<Unit> function0;
                                                            SnapshotState4<Color> snapshotState42;
                                                            String str2;
                                                            Function2<Integer, Integer, String> function2;
                                                            Modifier.Companion companion;
                                                            int i4;
                                                            Alignment.Vertical centerVertically;
                                                            Arrangement arrangement2;
                                                            float f;
                                                            Modifier.Companion companion2;
                                                            Composer composer2;
                                                            BentoTextInput8.Size size2;
                                                            Object obj;
                                                            ?? r14;
                                                            Modifier.Companion companion3;
                                                            Object objRememberedValue;
                                                            Composer.Companion companion4;
                                                            int currentCompositeKeyHash;
                                                            Composer composerM6388constructorimpl;
                                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
                                                            Composer composer3;
                                                            TextInputStyle.InputState inputState2;
                                                            Modifier.Companion companion5;
                                                            BentoTextInput8.Size size3;
                                                            String str3;
                                                            int i5;
                                                            BentoTextInput8.Message message2;
                                                            Integer num2;
                                                            int currentCompositeKeyHash2;
                                                            Composer composerM6388constructorimpl2;
                                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
                                                            int currentCompositeKeyHash3;
                                                            Composer composerM6388constructorimpl3;
                                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
                                                            BentoTextInput8.Size size4;
                                                            String str4;
                                                            Integer num3;
                                                            TextInputStyle.InputState inputState3;
                                                            Function2<Integer, Integer, String> function22;
                                                            Integer num4;
                                                            String strInvoke;
                                                            ServerToBentoAssetMapper2 serverToBentoAssetMapper2;
                                                            Composer composer4 = composer;
                                                            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                                                            if ((i & 6) == 0) {
                                                                i2 = i | (composer4.changedInstance(innerTextField) ? 4 : 2);
                                                            } else {
                                                                i2 = i;
                                                            }
                                                            if ((i2 & 19) == 18 && composer4.getSkipping()) {
                                                                composer4.skipToGroupEnd();
                                                                return;
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(1107266633, i2, -1, "com.robinhood.compose.bento.component.BentoBaseTextInput.<anonymous>.<anonymous> (BentoTextInput.kt:255)");
                                                            }
                                                            Arrangement arrangement3 = Arrangement.INSTANCE;
                                                            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement3.m5089spacedBy0680j_4(this.$style.getSpacing().m22021getVerticalSpacingD9Ej5fM());
                                                            Alignment.Horizontal horizontalAlignment = this.$style.getHorizontalAlignment();
                                                            int i6 = i2;
                                                            String str5 = this.$label;
                                                            TextInputStyle.Style style2 = this.$style;
                                                            TextInputStyle.InputState inputState4 = this.$inputState;
                                                            BentoTextInput8.Size size5 = this.$size;
                                                            BentoTextInput8.Icon.Size24 size243 = this.$leadingIcon;
                                                            BentoTextInput8.Icon.Size24 size244 = this.$trailingIcon;
                                                            BentoTextInput8.Message message3 = this.$message;
                                                            String str6 = this.$hint;
                                                            Integer num5 = this.$characterLimit;
                                                            SnapshotState4<Boolean> snapshotState43 = this.$focused$delegate;
                                                            Function0<Unit> function02 = this.$onTrailingIconClick;
                                                            SnapshotState4<Color> snapshotState44 = this.$valueColor$delegate;
                                                            String str7 = this.$placeholder;
                                                            String str8 = this.$value;
                                                            boolean z = this.$singleLine;
                                                            Function2<Integer, Integer, String> function23 = this.$onCustomCharacterLimit;
                                                            Modifier.Companion companion6 = Modifier.INSTANCE;
                                                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, horizontalAlignment, composer4, 0);
                                                            int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, companion6);
                                                            ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                                                            Function0<ComposeUiNode> constructor = companion7.getConstructor();
                                                            if (composer4.getApplier() == null) {
                                                                Composables.invalidApplier();
                                                            }
                                                            composer4.startReusableNode();
                                                            if (composer4.getInserting()) {
                                                                composer4.createNode(constructor);
                                                            } else {
                                                                composer4.useNode();
                                                            }
                                                            Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer4);
                                                            Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy, companion7.getSetMeasurePolicy());
                                                            Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap, companion7.getSetResolvedCompositionLocals());
                                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion7.getSetCompositeKeyHash();
                                                            if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                                                composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                                                composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                                            }
                                                            Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier, companion7.getSetModifier());
                                                            Column6 column6 = Column6.INSTANCE;
                                                            composer4.startReplaceGroup(-1816249442);
                                                            if (str5 == null || StringsKt.isBlank(str5)) {
                                                                i3 = i6;
                                                                arrangement = arrangement3;
                                                                style = style2;
                                                                inputState = inputState4;
                                                                size = size5;
                                                                size24 = size243;
                                                                size242 = size244;
                                                                message = message3;
                                                                str = str6;
                                                                num = num5;
                                                                snapshotState4 = snapshotState43;
                                                                function0 = function02;
                                                                snapshotState42 = snapshotState44;
                                                                str2 = str8;
                                                                function2 = function23;
                                                                companion = companion6;
                                                                i4 = 2;
                                                            } else {
                                                                snapshotState4 = snapshotState43;
                                                                size = size5;
                                                                size24 = size243;
                                                                size242 = size244;
                                                                str = str6;
                                                                arrangement = arrangement3;
                                                                str2 = str8;
                                                                function2 = function23;
                                                                companion = companion6;
                                                                inputState = inputState4;
                                                                message = message3;
                                                                num = num5;
                                                                i4 = 2;
                                                                snapshotState42 = snapshotState44;
                                                                function0 = function02;
                                                                style = style2;
                                                                i3 = i6;
                                                                BentoText2.m20747BentoText38GnDrw(str5, null, style2.getColors().getLabelColor().get(inputState4, composer4, TextInputStyle.StateColor.$stable << 3).getValue(), null, null, null, null, 0, false, 0, 0, null, 0, style2.getTypography().getLabelTextStyle(), composer, 0, 0, 8186);
                                                                composer4 = composer;
                                                            }
                                                            composer4.endReplaceGroup();
                                                            int i7 = WhenMappings.$EnumSwitchMapping$0[size.ordinal()];
                                                            if (i7 == 1 || i7 == i4) {
                                                                centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                            } else {
                                                                if (i7 != 3) {
                                                                    throw new NoWhenBranchMatchedException();
                                                                }
                                                                centerVertically = Alignment.INSTANCE.getTop();
                                                            }
                                                            float value = style.getSizing().getBorderSize().get(BentoTextInput4.BentoBaseTextInput$lambda$4(snapshotState4), composer4, TextInputStyle.BorderSize.$stable << 3).getValue().getValue();
                                                            TextInputStyle.BorderColor borderColor = style.getColors().getBorderColor();
                                                            int i8 = TextInputStyle.BorderColor.$stable;
                                                            TextInputStyle.InputState inputState5 = inputState;
                                                            Modifier.Companion companion8 = companion;
                                                            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.m5155defaultMinSizeVpY3zN4$default(Background3.m4871backgroundbw27NRU(BorderKt.m4876borderxT4_qwU(companion8, value, borderColor.get(inputState5, composer4, i8 << 3).getValue().getValue(), style.getSizing().getShape()), style.getColors().m21992getBackgroundColor0d7_KjU(), style.getSizing().getShape()), 0.0f, style.getSizing().m22011getMinHeightD9Ej5fM(), 1, null), style.getSpacing().getContainerHorizontalPadding().get((size24 == null && size242 == null) ? false : true, composer4, TextInputStyle.HorizontalPadding.$stable << 3).getValue().getValue(), 0.0f, i4, null);
                                                            Arrangement arrangement4 = arrangement;
                                                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement4.m5089spacedBy0680j_4(style.getSpacing().m22018getContainerIconSpacingD9Ej5fM()), centerVertically, composer4, 0);
                                                            int currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                                            CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer4, modifierM5144paddingVpY3zN4$default);
                                                            Function0<ComposeUiNode> constructor2 = companion7.getConstructor();
                                                            if (composer4.getApplier() == null) {
                                                                Composables.invalidApplier();
                                                            }
                                                            composer4.startReusableNode();
                                                            if (composer4.getInserting()) {
                                                                composer4.createNode(constructor2);
                                                            } else {
                                                                composer4.useNode();
                                                            }
                                                            Composer composerM6388constructorimpl5 = Updater.m6388constructorimpl(composer4);
                                                            Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyRowMeasurePolicy, companion7.getSetMeasurePolicy());
                                                            Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap2, companion7.getSetResolvedCompositionLocals());
                                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion7.getSetCompositeKeyHash();
                                                            if (composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                                                composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                                                composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                                            }
                                                            Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier2, companion7.getSetModifier());
                                                            Row6 row6 = Row6.INSTANCE;
                                                            composer4.startReplaceGroup(-1038685916);
                                                            if (size24 != null) {
                                                                BentoTextInput8.Size size6 = size;
                                                                if (size6 == BentoTextInput8.Size.Standard) {
                                                                    BentoIcon4.Size24 size245 = new BentoIcon4.Size24(size24.getAsset());
                                                                    String contentDescription = size24.getContentDescription();
                                                                    Color colorM20746getAssetTintOverrideQN2ZGVo = size24.m20746getAssetTintOverrideQN2ZGVo();
                                                                    long value2 = colorM20746getAssetTintOverrideQN2ZGVo != null ? colorM20746getAssetTintOverrideQN2ZGVo.getValue() : BentoTextInput4.BentoBaseTextInput$lambda$5(snapshotState42);
                                                                    Modifier modifierTestTag = TestTag3.testTag(companion8, BentoTextInput7.TEXT_INPUT_LEADING_ICON);
                                                                    composer4.startReplaceGroup(1849434622);
                                                                    Object objRememberedValue2 = composer4.rememberedValue();
                                                                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                                        objRememberedValue2 = new Function1() { // from class: com.robinhood.compose.bento.component.BentoTextInputKt$BentoBaseTextInput$1$1$$ExternalSyntheticLambda0
                                                                            @Override // kotlin.jvm.functions.Function1
                                                                            public final Object invoke(Object obj2) {
                                                                                return BentoTextInput4.C324531.AnonymousClass1.invoke$lambda$11$lambda$7$lambda$1$lambda$0((SemanticsPropertyReceiver) obj2);
                                                                            }
                                                                        };
                                                                        composer4.updateRememberedValue(objRememberedValue2);
                                                                    }
                                                                    composer4.endReplaceGroup();
                                                                    arrangement2 = arrangement4;
                                                                    Composer composer5 = composer4;
                                                                    obj = null;
                                                                    companion2 = companion8;
                                                                    size2 = size6;
                                                                    r14 = 0;
                                                                    f = 0.0f;
                                                                    BentoIcon2.m20644BentoIconFU0evQE(size245, contentDescription, value2, SemanticsModifier6.semantics$default(modifierTestTag, false, (Function1) objRememberedValue2, 1, null), null, false, composer5, 0, 48);
                                                                    composer2 = composer5;
                                                                    composer2.endReplaceGroup();
                                                                    companion3 = companion2;
                                                                    Modifier modifierTestTag22 = TestTag3.testTag(PaddingKt.m5144paddingVpY3zN4$default(Row5.weight$default(row6, companion3, 1.0f, false, 2, null), f, style.getSpacing().m22019getContainerVerticalPaddingD9Ej5fM(), 1, obj), BentoTextInput7.TEXT_INPUT_BOX);
                                                                    composer2.startReplaceGroup(1849434622);
                                                                    objRememberedValue = composer2.rememberedValue();
                                                                    companion4 = Composer.INSTANCE;
                                                                    if (objRememberedValue == companion4.getEmpty()) {
                                                                        objRememberedValue = new Function1() { // from class: com.robinhood.compose.bento.component.BentoTextInputKt$BentoBaseTextInput$1$1$$ExternalSyntheticLambda1
                                                                            @Override // kotlin.jvm.functions.Function1
                                                                            public final Object invoke(Object obj2) {
                                                                                return BentoTextInput4.C324531.AnonymousClass1.invoke$lambda$11$lambda$7$lambda$3$lambda$2((SemanticsPropertyReceiver) obj2);
                                                                            }
                                                                        };
                                                                        composer2.updateRememberedValue(objRememberedValue);
                                                                    }
                                                                    composer2.endReplaceGroup();
                                                                    Modifier modifierSemantics$default2 = SemanticsModifier6.semantics$default(modifierTestTag22, r14, (Function1) objRememberedValue, 1, obj);
                                                                    Alignment.Horizontal horizontalAlignment22 = style.getHorizontalAlignment();
                                                                    Alignment.Companion companion92 = Alignment.INSTANCE;
                                                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(!Intrinsics.areEqual(horizontalAlignment22, companion92.getCenterHorizontally()) ? companion92.getCenter() : companion92.getTopStart(), r14);
                                                                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, r14);
                                                                    CompositionLocalMap currentCompositionLocalMap32 = composer2.getCurrentCompositionLocalMap();
                                                                    Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composer2, modifierSemantics$default2);
                                                                    Function0<ComposeUiNode> constructor32 = companion7.getConstructor();
                                                                    if (composer2.getApplier() == null) {
                                                                        Composables.invalidApplier();
                                                                    }
                                                                    composer2.startReusableNode();
                                                                    if (composer2.getInserting()) {
                                                                        composer2.useNode();
                                                                    } else {
                                                                        composer2.createNode(constructor32);
                                                                    }
                                                                    composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                                                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion7.getSetMeasurePolicy());
                                                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap32, companion7.getSetResolvedCompositionLocals());
                                                                    setCompositeKeyHash = companion7.getSetCompositeKeyHash();
                                                                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                                    }
                                                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier32, companion7.getSetModifier());
                                                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                                    composer2.startReplaceGroup(-77535801);
                                                                    if (str7 == null && !StringsKt.isBlank(str7) && str2.length() == 0) {
                                                                        inputState2 = inputState5;
                                                                        companion5 = companion3;
                                                                        TextKt.m6028Text4IGK_g(str7, null, style.getColors().getPlaceholderColor().get(inputState5, composer2, TextInputStyle.PlaceholderColor.$stable << 3).getValue().getValue(), 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), !z, z ? 1 : Integer.MAX_VALUE, 0, null, style.getTypography().getValueTextStyle(), composer, 0, 48, 51194);
                                                                        composer3 = composer;
                                                                    } else {
                                                                        composer3 = composer2;
                                                                        inputState2 = inputState5;
                                                                        companion5 = companion3;
                                                                    }
                                                                    composer3.endReplaceGroup();
                                                                    innerTextField.invoke(composer3, Integer.valueOf(i3 & 14));
                                                                    composer3.endNode();
                                                                    composer3.startReplaceGroup(-1038607930);
                                                                    if (size242 == null) {
                                                                        size3 = size2;
                                                                        if (size3 != BentoTextInput8.Size.TextArea) {
                                                                            BentoIcon4.Size24 size246 = new BentoIcon4.Size24(size242.getAsset());
                                                                            String contentDescription2 = size242.getContentDescription();
                                                                            long jBentoBaseTextInput$lambda$5 = BentoTextInput4.BentoBaseTextInput$lambda$5(snapshotState42);
                                                                            Modifier modifierTestTag3 = TestTag3.testTag(companion5, BentoTextInput7.TEXT_INPUT_TRAILING_ICON);
                                                                            composer3.startReplaceGroup(1849434622);
                                                                            Object objRememberedValue3 = composer3.rememberedValue();
                                                                            if (objRememberedValue3 == companion4.getEmpty()) {
                                                                                objRememberedValue3 = new Function1() { // from class: com.robinhood.compose.bento.component.BentoTextInputKt$BentoBaseTextInput$1$1$$ExternalSyntheticLambda2
                                                                                    @Override // kotlin.jvm.functions.Function1
                                                                                    public final Object invoke(Object obj2) {
                                                                                        return BentoTextInput4.C324531.AnonymousClass1.invoke$lambda$11$lambda$7$lambda$6$lambda$5((SemanticsPropertyReceiver) obj2);
                                                                                    }
                                                                                };
                                                                                composer3.updateRememberedValue(objRememberedValue3);
                                                                            }
                                                                            composer3.endReplaceGroup();
                                                                            str3 = null;
                                                                            i5 = 0;
                                                                            BentoIcon2.m20644BentoIconFU0evQE(size246, contentDescription2, jBentoBaseTextInput$lambda$5, SemanticsModifier6.semantics$default(modifierTestTag3, false, (Function1) objRememberedValue3, 1, null), function0, false, composer3, 0, 32);
                                                                        }
                                                                        composer3.endReplaceGroup();
                                                                        composer3.endNode();
                                                                        composer3.startReplaceGroup(-1816083537);
                                                                        message2 = message;
                                                                        if ((message2 == null || StringsKt.isBlank(message2.getMessage())) && (str == null || StringsKt.isBlank(str))) {
                                                                            num2 = num;
                                                                            if (num2 != null && size3 == BentoTextInput8.Size.TextArea) {
                                                                            }
                                                                            composer.endReplaceGroup();
                                                                            composer.endNode();
                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                return;
                                                                            }
                                                                            ComposerKt.traceEventEnd();
                                                                            return;
                                                                        }
                                                                        num2 = num;
                                                                        MeasurePolicy measurePolicyRowMeasurePolicy22 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion92.getTop(), composer3, i5);
                                                                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, i5);
                                                                        CompositionLocalMap currentCompositionLocalMap42 = composer3.getCurrentCompositionLocalMap();
                                                                        Modifier modifierMaterializeModifier42 = ComposedModifier2.materializeModifier(composer3, companion5);
                                                                        Function0<ComposeUiNode> constructor42 = companion7.getConstructor();
                                                                        if (composer3.getApplier() == null) {
                                                                            Composables.invalidApplier();
                                                                        }
                                                                        composer3.startReusableNode();
                                                                        if (composer3.getInserting()) {
                                                                            composer3.useNode();
                                                                        } else {
                                                                            composer3.createNode(constructor42);
                                                                        }
                                                                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                                                                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy22, companion7.getSetMeasurePolicy());
                                                                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap42, companion7.getSetResolvedCompositionLocals());
                                                                        setCompositeKeyHash2 = companion7.getSetCompositeKeyHash();
                                                                        if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                                        }
                                                                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier42, companion7.getSetModifier());
                                                                        Modifier.Companion companion102 = companion5;
                                                                        Modifier modifierWeight$default2 = Row5.weight$default(row6, companion102, 1.0f, false, 2, null);
                                                                        MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion92.getStart(), composer3, i5);
                                                                        currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, i5);
                                                                        CompositionLocalMap currentCompositionLocalMap52 = composer3.getCurrentCompositionLocalMap();
                                                                        Modifier modifierMaterializeModifier52 = ComposedModifier2.materializeModifier(composer3, modifierWeight$default2);
                                                                        Function0<ComposeUiNode> constructor52 = companion7.getConstructor();
                                                                        if (composer3.getApplier() == null) {
                                                                            Composables.invalidApplier();
                                                                        }
                                                                        composer3.startReusableNode();
                                                                        if (composer3.getInserting()) {
                                                                            composer3.useNode();
                                                                        } else {
                                                                            composer3.createNode(constructor52);
                                                                        }
                                                                        composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer3);
                                                                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy22, companion7.getSetMeasurePolicy());
                                                                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap52, companion7.getSetResolvedCompositionLocals());
                                                                        setCompositeKeyHash3 = companion7.getSetCompositeKeyHash();
                                                                        if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                                                        }
                                                                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier52, companion7.getSetModifier());
                                                                        composer3.startReplaceGroup(-340346335);
                                                                        if (message2 != null || StringsKt.isBlank(message2.getMessage())) {
                                                                            size4 = size3;
                                                                            str4 = str3;
                                                                            num3 = num2;
                                                                            inputState3 = inputState2;
                                                                        } else {
                                                                            MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(arrangement2.m5089spacedBy0680j_4(style.getSpacing().m22020getMessageIconSpacingD9Ej5fM()), companion92.getCenterVertically(), composer3, 48);
                                                                            int currentCompositeKeyHash6 = Composables.getCurrentCompositeKeyHash(composer3, i5);
                                                                            CompositionLocalMap currentCompositionLocalMap6 = composer3.getCurrentCompositionLocalMap();
                                                                            Modifier modifierMaterializeModifier6 = ComposedModifier2.materializeModifier(composer3, companion102);
                                                                            Function0<ComposeUiNode> constructor6 = companion7.getConstructor();
                                                                            if (composer3.getApplier() == null) {
                                                                                Composables.invalidApplier();
                                                                            }
                                                                            composer3.startReusableNode();
                                                                            if (composer3.getInserting()) {
                                                                                composer3.createNode(constructor6);
                                                                            } else {
                                                                                composer3.useNode();
                                                                            }
                                                                            Composer composerM6388constructorimpl6 = Updater.m6388constructorimpl(composer3);
                                                                            Updater.m6390setimpl(composerM6388constructorimpl6, measurePolicyRowMeasurePolicy3, companion7.getSetMeasurePolicy());
                                                                            Updater.m6390setimpl(composerM6388constructorimpl6, currentCompositionLocalMap6, companion7.getSetResolvedCompositionLocals());
                                                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion7.getSetCompositeKeyHash();
                                                                            if (composerM6388constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                                                                composerM6388constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                                                                                composerM6388constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                                                                            }
                                                                            Updater.m6390setimpl(composerM6388constructorimpl6, modifierMaterializeModifier6, companion7.getSetModifier());
                                                                            if (message2 instanceof BentoTextInput8.Message.Success) {
                                                                                serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.BUBBLE_CHECKED_16;
                                                                            } else {
                                                                                if (!(message2 instanceof BentoTextInput8.Message.Error)) {
                                                                                    throw new NoWhenBranchMatchedException();
                                                                                }
                                                                                serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.TRIANGLE_ALERT_16;
                                                                            }
                                                                            TextInputStyle.InputState inputState6 = inputState2;
                                                                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(serverToBentoAssetMapper2), null, style.getColors().getBorderColor().get(inputState6, composer3, i8 << 3).getValue().getValue(), null, null, false, composer3, 48, 56);
                                                                            str4 = str3;
                                                                            num3 = num2;
                                                                            size4 = size3;
                                                                            inputState3 = inputState2;
                                                                            BentoText2.m20747BentoText38GnDrw(message2.getMessage(), null, style.getColors().getBorderColor().get(inputState6, composer3, i8 << 3).getValue(), null, null, null, null, 0, false, 0, 0, null, 0, style.getTypography().getMessageTextStyle(), composer3, 0, 0, 8186);
                                                                            composer3.endNode();
                                                                        }
                                                                        composer3.endReplaceGroup();
                                                                        composer3.startReplaceGroup(-340293298);
                                                                        if (str != null && !StringsKt.isBlank(str)) {
                                                                            BentoText2.m20747BentoText38GnDrw(str, null, style.getColors().getHintColor().get(inputState3, composer3, TextInputStyle.StateColor.$stable << 3).getValue(), null, null, null, null, 0, false, 0, 0, null, 0, style.getTypography().getHintTextStyle(), composer3, 0, 0, 8186);
                                                                        }
                                                                        composer3.endReplaceGroup();
                                                                        composer3.endNode();
                                                                        composer3.startReplaceGroup(2056909099);
                                                                        if (num3 != null && size4 == BentoTextInput8.Size.TextArea) {
                                                                            function22 = function2;
                                                                            if (function22 == null) {
                                                                                num4 = num3;
                                                                                strInvoke = function22.invoke(num4, Integer.valueOf(str2.length()));
                                                                            } else {
                                                                                num4 = num3;
                                                                                strInvoke = str4;
                                                                            }
                                                                            if (strInvoke == null) {
                                                                                strInvoke = str2.length() + "/" + num4;
                                                                            }
                                                                            BentoText2.m20747BentoText38GnDrw(strInvoke, null, style.getColors().getCharacterLimitColor().get(inputState3, composer3, TextInputStyle.StateColor.$stable << 3).getValue(), null, null, null, null, 0, false, 0, 0, null, 0, style.getTypography().getCharacterLimitTextStyle(), composer3, 0, 0, 8186);
                                                                        }
                                                                        composer.endReplaceGroup();
                                                                        composer.endNode();
                                                                        composer.endReplaceGroup();
                                                                        composer.endNode();
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                        }
                                                                    } else {
                                                                        size3 = size2;
                                                                    }
                                                                    str3 = null;
                                                                    i5 = 0;
                                                                    composer3.endReplaceGroup();
                                                                    composer3.endNode();
                                                                    composer3.startReplaceGroup(-1816083537);
                                                                    message2 = message;
                                                                    if (message2 == null) {
                                                                        num2 = num;
                                                                        if (num2 != null) {
                                                                            MeasurePolicy measurePolicyRowMeasurePolicy222 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion92.getTop(), composer3, i5);
                                                                            currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, i5);
                                                                            CompositionLocalMap currentCompositionLocalMap422 = composer3.getCurrentCompositionLocalMap();
                                                                            Modifier modifierMaterializeModifier422 = ComposedModifier2.materializeModifier(composer3, companion5);
                                                                            Function0<ComposeUiNode> constructor422 = companion7.getConstructor();
                                                                            if (composer3.getApplier() == null) {
                                                                            }
                                                                            composer3.startReusableNode();
                                                                            if (composer3.getInserting()) {
                                                                            }
                                                                            composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                                                                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy222, companion7.getSetMeasurePolicy());
                                                                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap422, companion7.getSetResolvedCompositionLocals());
                                                                            setCompositeKeyHash2 = companion7.getSetCompositeKeyHash();
                                                                            if (!composerM6388constructorimpl2.getInserting()) {
                                                                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier422, companion7.getSetModifier());
                                                                                Modifier.Companion companion1022 = companion5;
                                                                                Modifier modifierWeight$default22 = Row5.weight$default(row6, companion1022, 1.0f, false, 2, null);
                                                                                MeasurePolicy measurePolicyColumnMeasurePolicy222 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion92.getStart(), composer3, i5);
                                                                                currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, i5);
                                                                                CompositionLocalMap currentCompositionLocalMap522 = composer3.getCurrentCompositionLocalMap();
                                                                                Modifier modifierMaterializeModifier522 = ComposedModifier2.materializeModifier(composer3, modifierWeight$default22);
                                                                                Function0<ComposeUiNode> constructor522 = companion7.getConstructor();
                                                                                if (composer3.getApplier() == null) {
                                                                                }
                                                                                composer3.startReusableNode();
                                                                                if (composer3.getInserting()) {
                                                                                }
                                                                                composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer3);
                                                                                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy222, companion7.getSetMeasurePolicy());
                                                                                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap522, companion7.getSetResolvedCompositionLocals());
                                                                                setCompositeKeyHash3 = companion7.getSetCompositeKeyHash();
                                                                                if (!composerM6388constructorimpl3.getInserting()) {
                                                                                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                                                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                                                                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier522, companion7.getSetModifier());
                                                                                    composer3.startReplaceGroup(-340346335);
                                                                                    if (message2 != null) {
                                                                                        size4 = size3;
                                                                                        str4 = str3;
                                                                                        num3 = num2;
                                                                                        inputState3 = inputState2;
                                                                                        composer3.endReplaceGroup();
                                                                                        composer3.startReplaceGroup(-340293298);
                                                                                        if (str != null) {
                                                                                            BentoText2.m20747BentoText38GnDrw(str, null, style.getColors().getHintColor().get(inputState3, composer3, TextInputStyle.StateColor.$stable << 3).getValue(), null, null, null, null, 0, false, 0, 0, null, 0, style.getTypography().getHintTextStyle(), composer3, 0, 0, 8186);
                                                                                        }
                                                                                        composer3.endReplaceGroup();
                                                                                        composer3.endNode();
                                                                                        composer3.startReplaceGroup(2056909099);
                                                                                        if (num3 != null) {
                                                                                            function22 = function2;
                                                                                            if (function22 == null) {
                                                                                            }
                                                                                            if (strInvoke == null) {
                                                                                            }
                                                                                            BentoText2.m20747BentoText38GnDrw(strInvoke, null, style.getColors().getCharacterLimitColor().get(inputState3, composer3, TextInputStyle.StateColor.$stable << 3).getValue(), null, null, null, null, 0, false, 0, 0, null, 0, style.getTypography().getCharacterLimitTextStyle(), composer3, 0, 0, 8186);
                                                                                        }
                                                                                        composer.endReplaceGroup();
                                                                                        composer.endNode();
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        num2 = num;
                                                                        if (num2 != null) {
                                                                        }
                                                                    }
                                                                    composer.endReplaceGroup();
                                                                    composer.endNode();
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                    }
                                                                } else {
                                                                    size2 = size6;
                                                                    arrangement2 = arrangement4;
                                                                    f = 0.0f;
                                                                    companion2 = companion8;
                                                                    composer2 = composer4;
                                                                }
                                                            } else {
                                                                arrangement2 = arrangement4;
                                                                f = 0.0f;
                                                                companion2 = companion8;
                                                                composer2 = composer4;
                                                                size2 = size;
                                                            }
                                                            obj = null;
                                                            r14 = 0;
                                                            composer2.endReplaceGroup();
                                                            companion3 = companion2;
                                                            Modifier modifierTestTag222 = TestTag3.testTag(PaddingKt.m5144paddingVpY3zN4$default(Row5.weight$default(row6, companion3, 1.0f, false, 2, null), f, style.getSpacing().m22019getContainerVerticalPaddingD9Ej5fM(), 1, obj), BentoTextInput7.TEXT_INPUT_BOX);
                                                            composer2.startReplaceGroup(1849434622);
                                                            objRememberedValue = composer2.rememberedValue();
                                                            companion4 = Composer.INSTANCE;
                                                            if (objRememberedValue == companion4.getEmpty()) {
                                                            }
                                                            composer2.endReplaceGroup();
                                                            Modifier modifierSemantics$default22 = SemanticsModifier6.semantics$default(modifierTestTag222, r14, (Function1) objRememberedValue, 1, obj);
                                                            Alignment.Horizontal horizontalAlignment222 = style.getHorizontalAlignment();
                                                            Alignment.Companion companion922 = Alignment.INSTANCE;
                                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(!Intrinsics.areEqual(horizontalAlignment222, companion922.getCenterHorizontally()) ? companion922.getCenter() : companion922.getTopStart(), r14);
                                                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, r14);
                                                            CompositionLocalMap currentCompositionLocalMap322 = composer2.getCurrentCompositionLocalMap();
                                                            Modifier modifierMaterializeModifier322 = ComposedModifier2.materializeModifier(composer2, modifierSemantics$default22);
                                                            Function0<ComposeUiNode> constructor322 = companion7.getConstructor();
                                                            if (composer2.getApplier() == null) {
                                                            }
                                                            composer2.startReusableNode();
                                                            if (composer2.getInserting()) {
                                                            }
                                                            composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                                                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy22, companion7.getSetMeasurePolicy());
                                                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap322, companion7.getSetResolvedCompositionLocals());
                                                            setCompositeKeyHash = companion7.getSetCompositeKeyHash();
                                                            if (!composerM6388constructorimpl.getInserting()) {
                                                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                            }
                                                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier322, companion7.getSetModifier());
                                                            BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                                                            composer2.startReplaceGroup(-77535801);
                                                            if (str7 == null) {
                                                                composer3 = composer2;
                                                                inputState2 = inputState5;
                                                                companion5 = companion3;
                                                            }
                                                            composer3.endReplaceGroup();
                                                            innerTextField.invoke(composer3, Integer.valueOf(i3 & 14));
                                                            composer3.endNode();
                                                            composer3.startReplaceGroup(-1038607930);
                                                            if (size242 == null) {
                                                            }
                                                            str3 = null;
                                                            i5 = 0;
                                                            composer3.endReplaceGroup();
                                                            composer3.endNode();
                                                            composer3.startReplaceGroup(-1816083537);
                                                            message2 = message;
                                                            if (message2 == null) {
                                                            }
                                                            composer.endReplaceGroup();
                                                            composer.endNode();
                                                            if (ComposerKt.isTraceInProgress()) {
                                                            }
                                                        }

                                                        @Override // kotlin.jvm.functions.Function3
                                                        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
                                                            invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* JADX INFO: Access modifiers changed from: private */
                                                        public static final Unit invoke$lambda$11$lambda$7$lambda$1$lambda$0(SemanticsPropertyReceiver semantics) {
                                                            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                                            SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* JADX INFO: Access modifiers changed from: private */
                                                        public static final Unit invoke$lambda$11$lambda$7$lambda$3$lambda$2(SemanticsPropertyReceiver semantics) {
                                                            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                                            SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* JADX INFO: Access modifiers changed from: private */
                                                        public static final Unit invoke$lambda$11$lambda$7$lambda$6$lambda$5(SemanticsPropertyReceiver semantics) {
                                                            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                                            SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
                                                            return Unit.INSTANCE;
                                                        }
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num4) {
                                                        invoke(composer2, num4.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Composer composer2, int i12) {
                                                        boolean z3;
                                                        if ((i12 & 3) == 2 && composer2.getSkipping()) {
                                                            composer2.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1752068788, i12, -1, "com.robinhood.compose.bento.component.BentoBaseTextInput.<anonymous> (BentoTextInput.kt:234)");
                                                        }
                                                        int i13 = WhenMappings.$EnumSwitchMapping$0[size.ordinal()];
                                                        if (i13 == 1 || i13 == 2) {
                                                            z3 = true;
                                                        } else {
                                                            if (i13 != 3) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            z3 = false;
                                                        }
                                                        Modifier modifierWithBentoPlaceholder$default = LocalShowPlaceholder.withBentoPlaceholder$default(modifier32, false, null, 3, null);
                                                        TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(style2.getTypography().getValueTextStyle(), BentoTextInput4.BentoBaseTextInput$lambda$5(snapshotState42), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                                                        SolidColor solidColor = new SolidColor(style2.getColors().m21993getCursorColor0d7_KjU(), null);
                                                        String str9 = str;
                                                        BasicTextFieldKt.BasicTextField(str9, function132, modifierWithBentoPlaceholder$default, z, z2, textStyleM7655copyp1EtxEg$default, keyboardOptions, keyboardActions, z3, 0, 0, visualTransformation32, (Function1<? super TextLayoutResult, Unit>) null, interactionSource32, solidColor, ComposableLambda3.rememberComposableLambda(1107266633, true, new AnonymousClass1(style2, str82, inputState22, size, size243, size2452, message, str4, num32, snapshotState4CollectIsFocusedAsState2, function0, snapshotState42, str72, str9, z3, function23), composer2, 54), composer2, 0, 199680, 5632);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                function22 = function23;
                                            }
                                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                            if (scopeUpdateScopeEndRestartGroup != null) {
                                            }
                                        }
                                        if ((i3 & 16384) != 0) {
                                        }
                                        visualTransformation2 = visualTransformation;
                                        if ((i3 & 32768) != 0) {
                                        }
                                        if ((i3 & 65536) != 0) {
                                        }
                                        i7 = i3 & 131072;
                                        if (i7 != 0) {
                                        }
                                        int i1122 = i6;
                                        if ((i4 & 306783379) != 306783378) {
                                        }
                                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                        if (scopeUpdateScopeEndRestartGroup != null) {
                                        }
                                    }
                                    if ((i3 & 8192) != 0) {
                                    }
                                    if ((i3 & 16384) != 0) {
                                    }
                                    visualTransformation2 = visualTransformation;
                                    if ((i3 & 32768) != 0) {
                                    }
                                    if ((i3 & 65536) != 0) {
                                    }
                                    i7 = i3 & 131072;
                                    if (i7 != 0) {
                                    }
                                    int i11222 = i6;
                                    if ((i4 & 306783379) != 306783378) {
                                    }
                                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup != null) {
                                    }
                                }
                                size244 = size242;
                                if ((i3 & 1024) == 0) {
                                }
                                if ((i3 & 2048) == 0) {
                                }
                                int i92 = i5;
                                if ((i3 & 4096) == 0) {
                                }
                                if ((i3 & 8192) != 0) {
                                }
                                if ((i3 & 16384) != 0) {
                                }
                                visualTransformation2 = visualTransformation;
                                if ((i3 & 32768) != 0) {
                                }
                                if ((i3 & 65536) != 0) {
                                }
                                i7 = i3 & 131072;
                                if (i7 != 0) {
                                }
                                int i112222 = i6;
                                if ((i4 & 306783379) != 306783378) {
                                }
                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                }
                            }
                            size243 = size24;
                            if ((i3 & 512) != 0) {
                            }
                            size244 = size242;
                            if ((i3 & 1024) == 0) {
                            }
                            if ((i3 & 2048) == 0) {
                            }
                            int i922 = i5;
                            if ((i3 & 4096) == 0) {
                            }
                            if ((i3 & 8192) != 0) {
                            }
                            if ((i3 & 16384) != 0) {
                            }
                            visualTransformation2 = visualTransformation;
                            if ((i3 & 32768) != 0) {
                            }
                            if ((i3 & 65536) != 0) {
                            }
                            i7 = i3 & 131072;
                            if (i7 != 0) {
                            }
                            int i1122222 = i6;
                            if ((i4 & 306783379) != 306783378) {
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        num2 = num;
                        if ((i3 & 256) == 0) {
                        }
                        size243 = size24;
                        if ((i3 & 512) != 0) {
                        }
                        size244 = size242;
                        if ((i3 & 1024) == 0) {
                        }
                        if ((i3 & 2048) == 0) {
                        }
                        int i9222 = i5;
                        if ((i3 & 4096) == 0) {
                        }
                        if ((i3 & 8192) != 0) {
                        }
                        if ((i3 & 16384) != 0) {
                        }
                        visualTransformation2 = visualTransformation;
                        if ((i3 & 32768) != 0) {
                        }
                        if ((i3 & 65536) != 0) {
                        }
                        i7 = i3 & 131072;
                        if (i7 != 0) {
                        }
                        int i11222222 = i6;
                        if ((i4 & 306783379) != 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    str6 = str3;
                    if ((i3 & 32) != 0) {
                    }
                    if ((i3 & 64) != 0) {
                    }
                    if ((i3 & 128) != 0) {
                    }
                    num2 = num;
                    if ((i3 & 256) == 0) {
                    }
                    size243 = size24;
                    if ((i3 & 512) != 0) {
                    }
                    size244 = size242;
                    if ((i3 & 1024) == 0) {
                    }
                    if ((i3 & 2048) == 0) {
                    }
                    int i92222 = i5;
                    if ((i3 & 4096) == 0) {
                    }
                    if ((i3 & 8192) != 0) {
                    }
                    if ((i3 & 16384) != 0) {
                    }
                    visualTransformation2 = visualTransformation;
                    if ((i3 & 32768) != 0) {
                    }
                    if ((i3 & 65536) != 0) {
                    }
                    i7 = i3 & 131072;
                    if (i7 != 0) {
                    }
                    int i112222222 = i6;
                    if ((i4 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                str5 = str2;
                if ((i3 & 16) == 0) {
                }
                str6 = str3;
                if ((i3 & 32) != 0) {
                }
                if ((i3 & 64) != 0) {
                }
                if ((i3 & 128) != 0) {
                }
                num2 = num;
                if ((i3 & 256) == 0) {
                }
                size243 = size24;
                if ((i3 & 512) != 0) {
                }
                size244 = size242;
                if ((i3 & 1024) == 0) {
                }
                if ((i3 & 2048) == 0) {
                }
                int i922222 = i5;
                if ((i3 & 4096) == 0) {
                }
                if ((i3 & 8192) != 0) {
                }
                if ((i3 & 16384) != 0) {
                }
                visualTransformation2 = visualTransformation;
                if ((i3 & 32768) != 0) {
                }
                if ((i3 & 65536) != 0) {
                }
                i7 = i3 & 131072;
                if (i7 != 0) {
                }
                int i1122222222 = i6;
                if ((i4 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            if ((i3 & 8) != 0) {
            }
            str5 = str2;
            if ((i3 & 16) == 0) {
            }
            str6 = str3;
            if ((i3 & 32) != 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if ((i3 & 128) != 0) {
            }
            num2 = num;
            if ((i3 & 256) == 0) {
            }
            size243 = size24;
            if ((i3 & 512) != 0) {
            }
            size244 = size242;
            if ((i3 & 1024) == 0) {
            }
            if ((i3 & 2048) == 0) {
            }
            int i9222222 = i5;
            if ((i3 & 4096) == 0) {
            }
            if ((i3 & 8192) != 0) {
            }
            if ((i3 & 16384) != 0) {
            }
            visualTransformation2 = visualTransformation;
            if ((i3 & 32768) != 0) {
            }
            if ((i3 & 65536) != 0) {
            }
            i7 = i3 & 131072;
            if (i7 != 0) {
            }
            int i11222222222 = i6;
            if ((i4 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        function12 = function1;
        if ((i3 & 4) == 0) {
        }
        modifier2 = modifier;
        if ((i3 & 8) != 0) {
        }
        str5 = str2;
        if ((i3 & 16) == 0) {
        }
        str6 = str3;
        if ((i3 & 32) != 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if ((i3 & 128) != 0) {
        }
        num2 = num;
        if ((i3 & 256) == 0) {
        }
        size243 = size24;
        if ((i3 & 512) != 0) {
        }
        size244 = size242;
        if ((i3 & 1024) == 0) {
        }
        if ((i3 & 2048) == 0) {
        }
        int i92222222 = i5;
        if ((i3 & 4096) == 0) {
        }
        if ((i3 & 8192) != 0) {
        }
        if ((i3 & 16384) != 0) {
        }
        visualTransformation2 = visualTransformation;
        if ((i3 & 32768) != 0) {
        }
        if ((i3 & 65536) != 0) {
        }
        i7 = i3 & 131072;
        if (i7 != 0) {
        }
        int i112222222222 = i6;
        if ((i4 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoTextInput(final BentoTextInputState state, final Function1<? super String, Unit> onValueChange, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(2081637532);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onValueChange) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2081637532, i3, -1, "com.robinhood.compose.bento.component.BentoTextInput (BentoTextInput.kt:435)");
                }
                composer2 = composerStartRestartGroup;
                Modifier modifier5 = modifier4;
                BentoTextInput(state.getValue(), onValueChange, modifier5, state.getLabel(), state.getPlaceholder(), state.getHint(), state.getMessage(), state.getLeadingIcon(), state.getTrailingIcon(), null, state.getKeyboardOptions(), null, null, state.getEnabled(), false, composer2, i3 & 1008, 0, 23040);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoTextInputKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BentoTextInput4.BentoTextInput$lambda$7(state, onValueChange, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composer2 = composerStartRestartGroup;
            Modifier modifier52 = modifier4;
            BentoTextInput(state.getValue(), onValueChange, modifier52, state.getLabel(), state.getPlaceholder(), state.getHint(), state.getMessage(), state.getLeadingIcon(), state.getTrailingIcon(), null, state.getKeyboardOptions(), null, null, state.getEnabled(), false, composer2, i3 & 1008, 0, 23040);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoHeroTextInput(final BentoHeroTextInputState state, final Function1<? super String, Unit> onValueChange, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(1277015132);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onValueChange) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1277015132, i3, -1, "com.robinhood.compose.bento.component.BentoHeroTextInput (BentoTextInput.kt:472)");
                }
                composer2 = composerStartRestartGroup;
                Modifier modifier5 = modifier4;
                BentoHeroTextInput(state.getValue(), onValueChange, modifier5, state.getLabel(), state.getPlaceholder(), state.getHint(), null, state.getMessage(), null, state.getKeyboardOptions(), null, null, state.getEnabled(), false, composer2, i3 & 1008, 0, 11584);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoTextInputKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BentoTextInput4.BentoHeroTextInput$lambda$8(state, onValueChange, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composer2 = composerStartRestartGroup;
            Modifier modifier52 = modifier4;
            BentoHeroTextInput(state.getValue(), onValueChange, modifier52, state.getLabel(), state.getPlaceholder(), state.getHint(), null, state.getMessage(), null, state.getKeyboardOptions(), null, null, state.getEnabled(), false, composer2, i3 & 1008, 0, 11584);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoTextInput(final DeprecatedBentoTextInputState state, final Function1<? super String, Unit> onValueChange, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(106851887);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onValueChange) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(106851887, i3, -1, "com.robinhood.compose.bento.component.BentoTextInput (BentoTextInput.kt:497)");
                }
                int i5 = i3;
                Modifier modifier5 = modifier4;
                BentoTextInput(modifier5, state.getSize(), state.getValue(), onValueChange, state.getEnabled(), state.getReadOnly(), state.getKeyboardOptions(), state.getKeyboardActions(), state.getSingleLine(), state.getMaxLines(), state.getVisualTransformation(), state.getPlaceholderText(), state.getErrorText(), composerStartRestartGroup, ((i5 >> 6) & 14) | ((i5 << 6) & 7168), 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoTextInputKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BentoTextInput4.BentoTextInput$lambda$9(state, onValueChange, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i52 = i3;
            Modifier modifier52 = modifier4;
            BentoTextInput(modifier52, state.getSize(), state.getValue(), onValueChange, state.getEnabled(), state.getReadOnly(), state.getKeyboardOptions(), state.getKeyboardActions(), state.getSingleLine(), state.getMaxLines(), state.getVisualTransformation(), state.getPlaceholderText(), state.getErrorText(), composerStartRestartGroup, ((i52 >> 6) & 14) | ((i52 << 6) & 7168), 0, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:212:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011e  */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoTextInput(Modifier modifier, DeprecatedBentoTextInputState.Size size, final String value, final Function1<? super String, Unit> onValueChange, boolean z, boolean z2, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i, VisualTransformation visualTransformation, final String placeholderText, String str, Composer composer, final int i2, final int i3, final int i4) {
        Modifier modifier2;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        int i7;
        KeyboardOptions keyboardOptions2;
        int i8;
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
        Object objRememberedValue;
        int i19;
        TextStyle textStyleM7655copyp1EtxEg$default;
        int i20;
        TextStyle textS;
        Composer composer2;
        final KeyboardOptions keyboardOptions3;
        final KeyboardActions keyboardActions2;
        final boolean z6;
        final int i21;
        final VisualTransformation visualTransformation2;
        final Modifier modifier3;
        final boolean z7;
        final DeprecatedBentoTextInputState.Size size2;
        final String str2;
        final boolean z8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Intrinsics.checkNotNullParameter(placeholderText, "placeholderText");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1604087377);
        int i22 = i4 & 1;
        if (i22 != 0) {
            i5 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i5 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i5 = i2;
        }
        int i23 = i4 & 2;
        if (i23 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(size == null ? -1 : size.ordinal()) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= 384;
        } else if ((i2 & 384) == 0) {
            i5 |= composerStartRestartGroup.changed(value) ? 256 : 128;
        }
        if ((i4 & 8) != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(onValueChange) ? 2048 : 1024;
        }
        int i24 = i4 & 16;
        if (i24 != 0) {
            i5 |= 24576;
        } else {
            if ((i2 & 24576) == 0) {
                z4 = z;
                i5 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
            }
            i6 = i4 & 32;
            if (i6 == 0) {
                i5 |= 196608;
                z5 = z2;
            } else {
                z5 = z2;
                if ((i2 & 196608) == 0) {
                    i5 |= composerStartRestartGroup.changed(z5) ? 131072 : 65536;
                }
            }
            i7 = i4 & 64;
            if (i7 == 0) {
                i5 |= 1572864;
                keyboardOptions2 = keyboardOptions;
            } else {
                keyboardOptions2 = keyboardOptions;
                if ((i2 & 1572864) == 0) {
                    i5 |= composerStartRestartGroup.changed(keyboardOptions2) ? 1048576 : 524288;
                }
            }
            i8 = i4 & 128;
            if (i8 == 0) {
                i5 |= 12582912;
            } else {
                if ((i2 & 12582912) == 0) {
                    i9 = i8;
                    i5 |= composerStartRestartGroup.changed(keyboardActions) ? 8388608 : 4194304;
                }
                i10 = i4 & 256;
                if (i10 != 0) {
                    i5 |= 100663296;
                } else {
                    if ((i2 & 100663296) == 0) {
                        i11 = i10;
                        i5 |= composerStartRestartGroup.changed(z3) ? 67108864 : 33554432;
                    }
                    i12 = i4 & 512;
                    if (i12 != 0) {
                        if ((i2 & 805306368) == 0) {
                            i13 = i12;
                            i5 |= composerStartRestartGroup.changed(i) ? 536870912 : 268435456;
                        }
                        i14 = i4 & 1024;
                        if (i14 != 0) {
                            i16 = i3 | 6;
                            i15 = i14;
                        } else if ((i3 & 6) == 0) {
                            i15 = i14;
                            i16 = i3 | (composerStartRestartGroup.changed(visualTransformation) ? 4 : 2);
                        } else {
                            i15 = i14;
                            i16 = i3;
                        }
                        if ((i4 & 2048) != 0) {
                            i16 |= 48;
                        } else if ((i3 & 48) == 0) {
                            i16 |= composerStartRestartGroup.changed(placeholderText) ? 32 : 16;
                        }
                        int i25 = i16;
                        i17 = i4 & 4096;
                        if (i17 != 0) {
                            i18 = i25 | 384;
                        } else if ((i3 & 384) == 0) {
                            i18 = i25 | (composerStartRestartGroup.changed(str) ? 256 : 128);
                        } else {
                            i18 = i25;
                        }
                        if ((i5 & 306783379) != 306783378 || (i18 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
                            Modifier modifier4 = i22 == 0 ? Modifier.INSTANCE : modifier2;
                            final DeprecatedBentoTextInputState.Size size3 = i23 == 0 ? DeprecatedBentoTextInputState.Size.Standard : size;
                            if (i24 != 0) {
                                z4 = true;
                            }
                            if (i6 != 0) {
                                z5 = false;
                            }
                            KeyboardOptions keyboardOptions4 = i7 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions2;
                            KeyboardActions keyboardActions3 = i9 == 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                            boolean z9 = i11 == 0 ? true : z3;
                            int i26 = i13 == 0 ? Integer.MAX_VALUE : i;
                            VisualTransformation none = i15 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                            String str3 = i17 == 0 ? null : str;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1604087377, i5, i18, "com.robinhood.compose.bento.component.BentoTextInput (BentoTextInput.kt:534)");
                            }
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            final BentoTextInputColors bentoTextInputColorsColors = BentoTextInput3.INSTANCE.colors(composerStartRestartGroup, TextInputStyle.BorderSize.$stable);
                            int[] iArr = WhenMappings.$EnumSwitchMapping$1;
                            i19 = iArr[size3.ordinal()];
                            if (i19 != 1) {
                                composerStartRestartGroup.startReplaceGroup(365322568);
                                textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getTextM(), bentoTextInputColorsColors.m20734getText0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                                composerStartRestartGroup.endReplaceGroup();
                            } else {
                                if (i19 != 2) {
                                    composerStartRestartGroup.startReplaceGroup(365319737);
                                    composerStartRestartGroup.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composerStartRestartGroup.startReplaceGroup(365325993);
                                textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getTextL(), bentoTextInputColorsColors.m20734getText0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m7919getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744446, null);
                                composerStartRestartGroup.endReplaceGroup();
                            }
                            final TextStyle textStyle = textStyleM7655copyp1EtxEg$default;
                            i20 = iArr[size3.ordinal()];
                            if (i20 != 1) {
                                composerStartRestartGroup.startReplaceGroup(365332724);
                                textS = BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getTextS();
                                composerStartRestartGroup.endReplaceGroup();
                            } else {
                                if (i20 != 2) {
                                    composerStartRestartGroup.startReplaceGroup(365330023);
                                    composerStartRestartGroup.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composerStartRestartGroup.startReplaceGroup(365335473);
                                textS = TextStyle.m7655copyp1EtxEg$default(BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getTextS(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m7919getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null);
                                composerStartRestartGroup.endReplaceGroup();
                            }
                            final String str4 = str3;
                            SolidColor solidColor = new SolidColor(bentoTextInputColorsColors.m20730getCursor0d7_KjU(), null);
                            final TextStyle textStyle2 = textS;
                            DeprecatedBentoTextInputState.Size size4 = size3;
                            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1893460198, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.BentoTextInputKt$BentoTextInput$decorBox$1
                                public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer3, int i27) {
                                    int i28;
                                    Modifier.Companion companion;
                                    String str5;
                                    BentoTextInputColors bentoTextInputColors;
                                    TextStyle textStyle3;
                                    int i29;
                                    DeprecatedBentoTextInputState.Size size5;
                                    Composer composer4 = composer3;
                                    Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                                    if ((i27 & 6) == 0) {
                                        i28 = i27 | (composer4.changedInstance(innerTextField) ? 4 : 2);
                                    } else {
                                        i28 = i27;
                                    }
                                    if ((i28 & 19) == 18 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1893460198, i28, -1, "com.robinhood.compose.bento.component.BentoTextInput.<anonymous> (BentoTextInput.kt:551)");
                                    }
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                                    DeprecatedBentoTextInputState.Size size6 = size3;
                                    String str6 = str4;
                                    BentoTextInputColors bentoTextInputColors2 = bentoTextInputColorsColors;
                                    TextStyle textStyle4 = textStyle2;
                                    SnapshotState<Boolean> snapshotState2 = snapshotState;
                                    String str7 = value;
                                    int i30 = i28;
                                    String str8 = placeholderText;
                                    TextStyle textStyle5 = textStyle;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierFillMaxWidth$default);
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                    if (composer4.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                    Column6 column6 = Column6.INSTANCE;
                                    Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(Background3.m4871backgroundbw27NRU(BentoTextInput4.fieldBorder(SizeKt.m5155defaultMinSizeVpY3zN4$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, size6.getMinHeight(), 1, null), str6 != null, BentoTextInput4.BentoTextInput$lambda$11(snapshotState2), bentoTextInputColors2, size6.getShape()), bentoTextInputColors2.m20727getBackground0d7_KjU(), size6.getShape()), size6.getHorizontalInternalPadding(), size6.getVerticalInternalPadding());
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(size6.getContentAlignment(), false);
                                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer4, modifierM5143paddingVpY3zN4);
                                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                    if (composer4.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor2);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer4);
                                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    composer4.startReplaceGroup(-906001870);
                                    if (str7.length() == 0) {
                                        bentoTextInputColors = bentoTextInputColors2;
                                        textStyle3 = textStyle4;
                                        i29 = i30;
                                        companion = companion2;
                                        str5 = str6;
                                        size5 = size6;
                                        BentoText2.m20747BentoText38GnDrw(str8, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Color.m6701boximpl(bentoTextInputColors2.m20735placeholdervNxB06k(BentoTextInput4.BentoTextInput$lambda$11(snapshotState2))), null, null, null, null, 0, false, 0, 0, null, 0, textStyle5, composer3, 48, 0, 8184);
                                        composer4 = composer3;
                                    } else {
                                        companion = companion2;
                                        str5 = str6;
                                        bentoTextInputColors = bentoTextInputColors2;
                                        textStyle3 = textStyle4;
                                        i29 = i30;
                                        size5 = size6;
                                    }
                                    composer4.endReplaceGroup();
                                    innerTextField.invoke(composer4, Integer.valueOf(i29 & 14));
                                    composer4.endNode();
                                    composer4.startReplaceGroup(51323957);
                                    if (str5 != null) {
                                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, size5.getErrorTextSpacing()), composer4, 0);
                                        BentoText2.m20747BentoText38GnDrw(str5, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Color.m6701boximpl(bentoTextInputColors.m20731getError0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, textStyle3, composer4, 48, 0, 8184);
                                    }
                                    composer3.endReplaceGroup();
                                    composer3.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer3, Integer num) {
                                    invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }
                            }, composerStartRestartGroup, 54);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            boolean z10 = z4;
                            boolean z11 = z5;
                            composer2 = composerStartRestartGroup;
                            Modifier modifier5 = modifier4;
                            keyboardOptions3 = keyboardOptions4;
                            keyboardActions2 = keyboardActions3;
                            z6 = z9;
                            i21 = i26;
                            visualTransformation2 = none;
                            CompositionLocal3.CompositionLocalProvider(TextSelectionColors2.getLocalTextSelectionColors().provides(new SelectionColors(bentoTheme.getColors(composerStartRestartGroup, 6).m21368getAccent0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, 6).m21368getAccent0d7_KjU(), null)), ComposableLambda3.rememberComposableLambda(1385026799, true, new C324544(value, onValueChange, modifier5, z10, z11, textStyle, keyboardOptions3, keyboardActions2, z6, i21, visualTransformation2, solidColor, composableLambdaRememberComposableLambda, snapshotState), composer2, 54), composer2, ProvidedValue.$stable | 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier5;
                            z7 = z11;
                            size2 = size4;
                            str2 = str4;
                            z8 = z10;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            size2 = size;
                            keyboardActions2 = keyboardActions;
                            z6 = z3;
                            i21 = i;
                            visualTransformation2 = visualTransformation;
                            keyboardOptions3 = keyboardOptions2;
                            modifier3 = modifier2;
                            composer2 = composerStartRestartGroup;
                            z8 = z4;
                            z7 = z5;
                            str2 = str;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoTextInputKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return BentoTextInput4.BentoTextInput$lambda$13(modifier3, size2, value, onValueChange, z8, z7, keyboardOptions3, keyboardActions2, z6, i21, visualTransformation2, placeholderText, str2, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 805306368;
                    i13 = i12;
                    i14 = i4 & 1024;
                    if (i14 != 0) {
                    }
                    if ((i4 & 2048) != 0) {
                    }
                    int i252 = i16;
                    i17 = i4 & 4096;
                    if (i17 != 0) {
                    }
                    if ((i5 & 306783379) != 306783378) {
                        if (i22 == 0) {
                        }
                        if (i23 == 0) {
                        }
                        if (i24 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i15 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        final SnapshotState<Boolean> snapshotState2 = (SnapshotState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        final BentoTextInputColors bentoTextInputColorsColors2 = BentoTextInput3.INSTANCE.colors(composerStartRestartGroup, TextInputStyle.BorderSize.$stable);
                        int[] iArr2 = WhenMappings.$EnumSwitchMapping$1;
                        i19 = iArr2[size3.ordinal()];
                        if (i19 != 1) {
                        }
                        final TextStyle textStyle3 = textStyleM7655copyp1EtxEg$default;
                        i20 = iArr2[size3.ordinal()];
                        if (i20 != 1) {
                        }
                        final String str42 = str3;
                        SolidColor solidColor2 = new SolidColor(bentoTextInputColorsColors2.m20730getCursor0d7_KjU(), null);
                        final TextStyle textStyle22 = textS;
                        DeprecatedBentoTextInputState.Size size42 = size3;
                        ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-1893460198, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.BentoTextInputKt$BentoTextInput$decorBox$1
                            public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer3, int i27) {
                                int i28;
                                Modifier.Companion companion;
                                String str5;
                                BentoTextInputColors bentoTextInputColors;
                                TextStyle textStyle32;
                                int i29;
                                DeprecatedBentoTextInputState.Size size5;
                                Composer composer4 = composer3;
                                Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                                if ((i27 & 6) == 0) {
                                    i28 = i27 | (composer4.changedInstance(innerTextField) ? 4 : 2);
                                } else {
                                    i28 = i27;
                                }
                                if ((i28 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1893460198, i28, -1, "com.robinhood.compose.bento.component.BentoTextInput.<anonymous> (BentoTextInput.kt:551)");
                                }
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                                DeprecatedBentoTextInputState.Size size6 = size3;
                                String str6 = str42;
                                BentoTextInputColors bentoTextInputColors2 = bentoTextInputColorsColors2;
                                TextStyle textStyle4 = textStyle22;
                                SnapshotState<Boolean> snapshotState22 = snapshotState2;
                                String str7 = value;
                                int i30 = i28;
                                String str8 = placeholderText;
                                TextStyle textStyle5 = textStyle3;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierFillMaxWidth$default);
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                if (composer4.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor);
                                } else {
                                    composer4.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(Background3.m4871backgroundbw27NRU(BentoTextInput4.fieldBorder(SizeKt.m5155defaultMinSizeVpY3zN4$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, size6.getMinHeight(), 1, null), str6 != null, BentoTextInput4.BentoTextInput$lambda$11(snapshotState22), bentoTextInputColors2, size6.getShape()), bentoTextInputColors2.m20727getBackground0d7_KjU(), size6.getShape()), size6.getHorizontalInternalPadding(), size6.getVerticalInternalPadding());
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(size6.getContentAlignment(), false);
                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer4, modifierM5143paddingVpY3zN4);
                                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                if (composer4.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor2);
                                } else {
                                    composer4.useNode();
                                }
                                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer4);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                composer4.startReplaceGroup(-906001870);
                                if (str7.length() == 0) {
                                    bentoTextInputColors = bentoTextInputColors2;
                                    textStyle32 = textStyle4;
                                    i29 = i30;
                                    companion = companion2;
                                    str5 = str6;
                                    size5 = size6;
                                    BentoText2.m20747BentoText38GnDrw(str8, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Color.m6701boximpl(bentoTextInputColors2.m20735placeholdervNxB06k(BentoTextInput4.BentoTextInput$lambda$11(snapshotState22))), null, null, null, null, 0, false, 0, 0, null, 0, textStyle5, composer3, 48, 0, 8184);
                                    composer4 = composer3;
                                } else {
                                    companion = companion2;
                                    str5 = str6;
                                    bentoTextInputColors = bentoTextInputColors2;
                                    textStyle32 = textStyle4;
                                    i29 = i30;
                                    size5 = size6;
                                }
                                composer4.endReplaceGroup();
                                innerTextField.invoke(composer4, Integer.valueOf(i29 & 14));
                                composer4.endNode();
                                composer4.startReplaceGroup(51323957);
                                if (str5 != null) {
                                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, size5.getErrorTextSpacing()), composer4, 0);
                                    BentoText2.m20747BentoText38GnDrw(str5, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Color.m6701boximpl(bentoTextInputColors.m20731getError0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, textStyle32, composer4, 48, 0, 8184);
                                }
                                composer3.endReplaceGroup();
                                composer3.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer3, Integer num) {
                                invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }
                        }, composerStartRestartGroup, 54);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        boolean z102 = z4;
                        boolean z112 = z5;
                        composer2 = composerStartRestartGroup;
                        Modifier modifier52 = modifier4;
                        keyboardOptions3 = keyboardOptions4;
                        keyboardActions2 = keyboardActions3;
                        z6 = z9;
                        i21 = i26;
                        visualTransformation2 = none;
                        CompositionLocal3.CompositionLocalProvider(TextSelectionColors2.getLocalTextSelectionColors().provides(new SelectionColors(bentoTheme2.getColors(composerStartRestartGroup, 6).m21368getAccent0d7_KjU(), bentoTheme2.getColors(composerStartRestartGroup, 6).m21368getAccent0d7_KjU(), null)), ComposableLambda3.rememberComposableLambda(1385026799, true, new C324544(value, onValueChange, modifier52, z102, z112, textStyle3, keyboardOptions3, keyboardActions2, z6, i21, visualTransformation2, solidColor2, composableLambdaRememberComposableLambda2, snapshotState2), composer2, 54), composer2, ProvidedValue.$stable | 48);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                        z7 = z112;
                        size2 = size42;
                        str2 = str42;
                        z8 = z102;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i11 = i10;
                i12 = i4 & 512;
                if (i12 != 0) {
                }
                i13 = i12;
                i14 = i4 & 1024;
                if (i14 != 0) {
                }
                if ((i4 & 2048) != 0) {
                }
                int i2522 = i16;
                i17 = i4 & 4096;
                if (i17 != 0) {
                }
                if ((i5 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i9 = i8;
            i10 = i4 & 256;
            if (i10 != 0) {
            }
            i11 = i10;
            i12 = i4 & 512;
            if (i12 != 0) {
            }
            i13 = i12;
            i14 = i4 & 1024;
            if (i14 != 0) {
            }
            if ((i4 & 2048) != 0) {
            }
            int i25222 = i16;
            i17 = i4 & 4096;
            if (i17 != 0) {
            }
            if ((i5 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z4 = z;
        i6 = i4 & 32;
        if (i6 == 0) {
        }
        i7 = i4 & 64;
        if (i7 == 0) {
        }
        i8 = i4 & 128;
        if (i8 == 0) {
        }
        i9 = i8;
        i10 = i4 & 256;
        if (i10 != 0) {
        }
        i11 = i10;
        i12 = i4 & 512;
        if (i12 != 0) {
        }
        i13 = i12;
        i14 = i4 & 1024;
        if (i14 != 0) {
        }
        if ((i4 & 2048) != 0) {
        }
        int i252222 = i16;
        i17 = i4 & 4096;
        if (i17 != 0) {
        }
        if ((i5 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BentoTextInput$lambda$12(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: BentoTextInput.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.compose.bento.component.BentoTextInputKt$BentoTextInput$4 */
    /* loaded from: classes15.dex */
    static final class C324544 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SolidColor $cursorBrush;
        final /* synthetic */ Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> $decorBox;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ SnapshotState<Boolean> $focused$delegate;
        final /* synthetic */ KeyboardActions $keyboardActions;
        final /* synthetic */ KeyboardOptions $keyboardOptions;
        final /* synthetic */ int $maxLines;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function1<String, Unit> $onValueChange;
        final /* synthetic */ boolean $readOnly;
        final /* synthetic */ boolean $singleLine;
        final /* synthetic */ TextStyle $textStyle;
        final /* synthetic */ String $value;
        final /* synthetic */ VisualTransformation $visualTransformation;

        /* JADX WARN: Multi-variable type inference failed */
        C324544(String str, Function1<? super String, Unit> function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i, VisualTransformation visualTransformation, SolidColor solidColor, Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3, SnapshotState<Boolean> snapshotState) {
            this.$value = str;
            this.$onValueChange = function1;
            this.$modifier = modifier;
            this.$enabled = z;
            this.$readOnly = z2;
            this.$textStyle = textStyle;
            this.$keyboardOptions = keyboardOptions;
            this.$keyboardActions = keyboardActions;
            this.$singleLine = z3;
            this.$maxLines = i;
            this.$visualTransformation = visualTransformation;
            this.$cursorBrush = solidColor;
            this.$decorBox = function3;
            this.$focused$delegate = snapshotState;
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
                ComposerKt.traceEventStart(1385026799, i, -1, "com.robinhood.compose.bento.component.BentoTextInput.<anonymous> (BentoTextInput.kt:597)");
            }
            String str = this.$value;
            Function1<String, Unit> function1 = this.$onValueChange;
            Modifier modifier = this.$modifier;
            composer.startReplaceGroup(5004770);
            final SnapshotState<Boolean> snapshotState = this.$focused$delegate;
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.compose.bento.component.BentoTextInputKt$BentoTextInput$4$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BentoTextInput4.C324544.invoke$lambda$1$lambda$0(snapshotState, (FocusState) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierWithBentoPlaceholder$default = LocalShowPlaceholder.withBentoPlaceholder$default(FocusChangedModifier2.onFocusChanged(modifier, (Function1) objRememberedValue), false, null, 3, null);
            boolean z = this.$enabled;
            boolean z2 = this.$readOnly;
            TextStyle textStyle = this.$textStyle;
            KeyboardOptions keyboardOptions = this.$keyboardOptions;
            KeyboardActions keyboardActions = this.$keyboardActions;
            boolean z3 = this.$singleLine;
            int i2 = this.$maxLines;
            VisualTransformation visualTransformation = this.$visualTransformation;
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = InteractionSource2.MutableInteractionSource();
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BasicTextFieldKt.BasicTextField(str, function1, modifierWithBentoPlaceholder$default, z, z2, textStyle, keyboardOptions, keyboardActions, z3, i2, 0, visualTransformation, (Function1<? super TextLayoutResult, Unit>) null, (InteractionSource3) objRememberedValue2, this.$cursorBrush, this.$decorBox, composer, 0, 199680, 5120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState, FocusState focusState) {
            Intrinsics.checkNotNullParameter(focusState, "focusState");
            BentoTextInput4.BentoTextInput$lambda$12(snapshotState, BentoTextInput4.hasSomeSortOfFocus(focusState));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasSomeSortOfFocus(FocusState focusState) {
        return focusState.getHasFocus() || focusState.isFocused() || focusState.isCaptured();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier fieldBorder(Modifier modifier, boolean z, boolean z2, BentoTextInputColors bentoTextInputColors, RoundedCornerShape roundedCornerShape) {
        long jM20729getBorderUnfocused0d7_KjU;
        if (z) {
            jM20729getBorderUnfocused0d7_KjU = bentoTextInputColors.m20731getError0d7_KjU();
        } else if (z2) {
            jM20729getBorderUnfocused0d7_KjU = bentoTextInputColors.m20728getBorderFocused0d7_KjU();
        } else {
            jM20729getBorderUnfocused0d7_KjU = bentoTextInputColors.m20729getBorderUnfocused0d7_KjU();
        }
        return BorderKt.m4876borderxT4_qwU(modifier, C2002Dp.m7995constructorimpl(1), jM20729getBorderUnfocused0d7_KjU, roundedCornerShape);
    }
}

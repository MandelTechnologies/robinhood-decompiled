package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Parcelable;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTypography;
import com.robinhood.compose.bento.theme.Spacing2;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.robinhood.models.serverdriven.experimental.api.ImageSource;
import com.robinhood.models.serverdriven.experimental.api.TextAlignment;
import com.robinhood.models.serverdriven.experimental.api.TextStyle;
import com.robinhood.models.serverdriven.experimental.api.ThemedImageSource;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.extensions.ContextsUiExtensions2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;
import rh_server_driven_ui.p531v1.FontDto;
import rh_server_driven_ui.p531v1.TextAlignmentDto;
import rh_server_driven_ui.p531v1.TextStyleDto;
import rh_server_driven_ui.p531v1.UIComponentDto;

/* compiled from: Util.kt */
@Metadata(m3635d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\u0011\u001a\u00020\n*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a#\u0010\u0016\u001a\u00020\n\"\b\b\u0000\u0010\u0014*\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00018\u0000H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0019\u0010\u001f\u001a\u00020\u0019*\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 \u001a\u0013\u0010!\u001a\u00020\u000f*\u00020\u0018H\u0007¢\u0006\u0004\b!\u0010\"\u001a\u0019\u0010#\u001a\u00020\r*\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b#\u0010$\u001a%\u0010)\u001a\u00020(2\n\u0010&\u001a\u0006\u0012\u0002\b\u00030%2\b\b\u0002\u0010'\u001a\u00020\nH\u0007¢\u0006\u0004\b)\u0010*\u001a!\u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020+2\b\b\u0002\u0010'\u001a\u00020\nH\u0007¢\u0006\u0004\b)\u0010,\u001a!\u0010)\u001a\u00020(2\u0006\u0010-\u001a\u00020\r2\b\b\u0002\u0010'\u001a\u00020\nH\u0003¢\u0006\u0004\b)\u0010.\u001a\u001f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/\"\b\b\u0000\u0010\u0014*\u00020\u0013H\u0001¢\u0006\u0004\b0\u00101\u001a\u001d\u00104\u001a\u00020(2\f\u00103\u001a\b\u0012\u0004\u0012\u00020(02H\u0001¢\u0006\u0004\b4\u00105\u001a%\u00108\u001a\u00020(2\u0006\u00107\u001a\u0002062\f\u00103\u001a\b\u0012\u0004\u0012\u00020(02H\u0007¢\u0006\u0004\b8\u00109\"'\u0010;\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030/0:8\u0006¢\u0006\u0012\n\u0004\b;\u0010<\u0012\u0004\b?\u0010@\u001a\u0004\b=\u0010>\"\u0015\u0010C\u001a\u00020\u0003*\u00020\u00068G¢\u0006\u0006\u001a\u0004\bA\u0010B\"\u0015\u0010C\u001a\u00020\u0003*\u00020\u00008G¢\u0006\u0006\u001a\u0004\bA\u0010D\"\u0015\u0010H\u001a\u00020E*\u00020\u00068F¢\u0006\u0006\u001a\u0004\bF\u0010G\"\u0015\u0010H\u001a\u00020E*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bF\u0010I\"\u0017\u0010N\u001a\u0004\u0018\u00010K*\u00020J8F¢\u0006\u0006\u001a\u0004\bL\u0010M\"\u001a\u0010R\u001a\u0004\u0018\u00010\u0007*\u00020O8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bP\u0010Q\"\u0015\u0010V\u001a\u00020S*\u00020O8F¢\u0006\u0006\u001a\u0004\bT\u0010U\"\u0015\u0010V\u001a\u00020S*\u00020W8F¢\u0006\u0006\u001a\u0004\bT\u0010X\"\u0015\u0010\\\u001a\u00020Y*\u00020W8F¢\u0006\u0006\u001a\u0004\bZ\u0010[¨\u0006]"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextStyleDto;", "Lrh_server_driven_ui/v1/FontDto;", "fontDto", "Landroidx/compose/ui/text/TextStyle;", "composeTextStyleWithFont", "(Lrh_server_driven_ui/v1/TextStyleDto;Lrh_server_driven_ui/v1/FontDto;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;", "Lcom/robinhood/models/serverdriven/experimental/api/TextStyle;", "", "toResourceId", "(Lcom/robinhood/models/serverdriven/experimental/api/TextStyle;)I", "Landroidx/compose/ui/Modifier;", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "type", "", "identifier", "", "logPerformance", "autoLogEvents", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;Ljava/lang/String;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", "Landroid/os/Parcelable;", "ActionT", "action", "onClickModifierWithNoIndication", "(Landroid/os/Parcelable;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "Lcom/robinhood/models/serverdriven/experimental/api/ThemedImageSource;", "Lokhttp3/HttpUrl;", "toHttpUrl", "(Lcom/robinhood/models/serverdriven/experimental/api/ThemedImageSource;Landroidx/compose/runtime/Composer;I)Lokhttp3/HttpUrl;", "Lcom/robinhood/models/serverdriven/experimental/api/ImageSource;", "Landroid/content/Context;", "context", "toImageUrl", "(Lcom/robinhood/models/serverdriven/experimental/api/ImageSource;Landroid/content/Context;)Lokhttp3/HttpUrl;", "hasInvalidImageUrl", "(Lcom/robinhood/models/serverdriven/experimental/api/ThemedImageSource;Landroidx/compose/runtime/Composer;I)Z", "getImageUrlString", "(Lcom/robinhood/models/serverdriven/experimental/api/ImageSource;Landroid/content/Context;)Ljava/lang/String;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "component", "modifier", "", "ComponentNotFound", "(Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "(Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "componentString", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Ljava/lang/Class;", "currentActionClass", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/Class;", "Lkotlin/Function0;", "content", "NoHorizontalPadding", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;", "horizontalPadding", "SduiHorizontalPadding", "(Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalActionClass", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalActionClass", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalActionClass$annotations", "()V", "getComposeTextStyle", "(Lcom/robinhood/models/serverdriven/experimental/api/TextStyle;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;", "composeTextStyle", "(Lrh_server_driven_ui/v1/TextStyleDto;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;", "Landroidx/compose/ui/text/font/FontWeight;", "getFontWeight", "(Lcom/robinhood/models/serverdriven/experimental/api/TextStyle;)Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "(Lrh_server_driven_ui/v1/TextStyleDto;)Landroidx/compose/ui/text/font/FontWeight;", "Lcom/robinhood/models/serverdriven/experimental/api/Icon;", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getIconAsset", "(Lcom/robinhood/models/serverdriven/experimental/api/Icon;)Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "iconAsset", "Lcom/robinhood/models/serverdriven/experimental/api/TextAlignment;", "getGravity", "(Lcom/robinhood/models/serverdriven/experimental/api/TextAlignment;)Ljava/lang/Integer;", "gravity", "Landroidx/compose/ui/text/style/TextAlign;", "getComposeTextAlign", "(Lcom/robinhood/models/serverdriven/experimental/api/TextAlignment;)I", "composeTextAlign", "Lrh_server_driven_ui/v1/TextAlignmentDto;", "(Lrh_server_driven_ui/v1/TextAlignmentDto;)I", "Landroidx/compose/ui/Alignment$Horizontal;", "getComposeHorizontalAlignment", "(Lrh_server_driven_ui/v1/TextAlignmentDto;)Landroidx/compose/ui/Alignment$Horizontal;", "composeHorizontalAlignment", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class UtilKt {
    private static final CompositionLocal6<Class<?>> LocalActionClass = CompositionLocal3.compositionLocalOf$default(null, new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UtilKt.LocalActionClass$lambda$4();
        }
    }, 1, null);

    /* compiled from: Util.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;

        static {
            int[] iArr = new int[TextStyle.values().length];
            try {
                iArr[TextStyle.TEXT_SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextStyle.TEXT_SMALL_BOLD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextStyle.TEXT_MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TextStyle.TEXT_MEDIUM_BOLD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TextStyle.TEXT_LARGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TextStyle.TEXT_LARGE_BOLD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TextStyle.DISPLAY_SMALL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TextStyle.DISPLAY_MEDIUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[TextStyle.DISPLAY_LARGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TextStyleDto.values().length];
            try {
                iArr2[TextStyleDto.TEXT_STYLE_TEXT_SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[TextStyleDto.TEXT_STYLE_TEXT_SMALL_BOLD.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[TextStyleDto.TEXT_STYLE_TEXT_MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[TextStyleDto.TEXT_STYLE_TEXT_MEDIUM_BOLD.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[TextStyleDto.TEXT_STYLE_TEXT_LARGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[TextStyleDto.TEXT_STYLE_TEXT_LARGE_BOLD.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[TextStyleDto.TEXT_STYLE_DISPLAY_SMALL.ordinal()] = 7;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[TextStyleDto.TEXT_STYLE_DISPLAY_MEDIUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[TextStyleDto.TEXT_STYLE_DISPLAY_LARGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[TextStyleDto.TEXT_STYLE_BOOK_COVER_SMALL.ordinal()] = 10;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[TextStyleDto.TEXT_STYLE_BOOK_COVER_MEDIUM.ordinal()] = 11;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[TextStyleDto.TEXT_STYLE_BOOK_COVER_LARGE.ordinal()] = 12;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[TextStyleDto.TEXT_STYLE_UNSPECIFIED.ordinal()] = 13;
            } catch (NoSuchFieldError unused22) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[FontDto.values().length];
            try {
                iArr3[FontDto.NIB.ordinal()] = 1;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[FontDto.CAPSULE.ordinal()] = 2;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[FontDto.MARTINA_PLANTINJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused25) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[ContextsUiExtensions2.values().length];
            try {
                iArr4[ContextsUiExtensions2.MDPI.ordinal()] = 1;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr4[ContextsUiExtensions2.HDPI.ordinal()] = 2;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr4[ContextsUiExtensions2.XHDPI.ordinal()] = 3;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr4[ContextsUiExtensions2.XXHDPI.ordinal()] = 4;
            } catch (NoSuchFieldError unused29) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[TextAlignment.values().length];
            try {
                iArr5[TextAlignment.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr5[TextAlignment.START.ordinal()] = 2;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr5[TextAlignment.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr5[TextAlignment.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr5[TextAlignment.CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr5[TextAlignment.JUSTIFIED.ordinal()] = 6;
            } catch (NoSuchFieldError unused35) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[TextAlignmentDto.values().length];
            try {
                iArr6[TextAlignmentDto.TEXT_ALIGNMENT_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr6[TextAlignmentDto.TEXT_ALIGNMENT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr6[TextAlignmentDto.TEXT_ALIGNMENT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr6[TextAlignmentDto.TEXT_ALIGNMENT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr6[TextAlignmentDto.TEXT_ALIGNMENT_RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr6[TextAlignmentDto.TEXT_ALIGNMENT_JUSTIFIED.ordinal()] = 6;
            } catch (NoSuchFieldError unused41) {
            }
            $EnumSwitchMapping$5 = iArr6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComponentNotFound$lambda$1(UIComponent uIComponent, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ComponentNotFound((UIComponent<?>) uIComponent, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComponentNotFound$lambda$2(UIComponentDto.ConcreteDto concreteDto, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ComponentNotFound(concreteDto, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComponentNotFound$lambda$3(String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ComponentNotFound(str, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NoHorizontalPadding$lambda$5(Function2 function2, int i, Composer composer, int i2) {
        NoHorizontalPadding(function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiHorizontalPadding$lambda$6(HorizontalPadding horizontalPadding, Function2 function2, int i, Composer composer, int i2) {
        SduiHorizontalPadding(horizontalPadding, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getLocalActionClass$annotations() {
    }

    @JvmName
    public static final androidx.compose.p011ui.text.TextStyle getComposeTextStyle(TextStyle textStyle, Composer composer, int i) {
        androidx.compose.p011ui.text.TextStyle textS;
        Intrinsics.checkNotNullParameter(textStyle, "<this>");
        composer.startReplaceGroup(721336542);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(721336542, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.<get-composeTextStyle> (Util.kt:50)");
        }
        BentoTypography typography = BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable);
        switch (WhenMappings.$EnumSwitchMapping$0[textStyle.ordinal()]) {
            case 1:
                textS = typography.getTextS();
                break;
            case 2:
                textS = androidx.compose.p011ui.text.TextStyle.m7655copyp1EtxEg$default(typography.getTextS(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null);
                break;
            case 3:
                textS = typography.getTextM();
                break;
            case 4:
                textS = androidx.compose.p011ui.text.TextStyle.m7655copyp1EtxEg$default(typography.getTextM(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null);
                break;
            case 5:
                textS = typography.getTextL();
                break;
            case 6:
                textS = androidx.compose.p011ui.text.TextStyle.m7655copyp1EtxEg$default(typography.getTextL(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null);
                break;
            case 7:
                textS = typography.getDisplayCapsuleSmall();
                break;
            case 8:
                textS = typography.getDisplayCapsuleMedium();
                break;
            case 9:
                textS = typography.getDisplayCapsuleLarge();
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return textS;
    }

    @JvmName
    public static final androidx.compose.p011ui.text.TextStyle getComposeTextStyle(TextStyleDto textStyleDto, Composer composer, int i) {
        androidx.compose.p011ui.text.TextStyle textS;
        Intrinsics.checkNotNullParameter(textStyleDto, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(19328433, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.<get-composeTextStyle> (Util.kt:67)");
        }
        BentoTypography typography = BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable);
        switch (WhenMappings.$EnumSwitchMapping$1[textStyleDto.ordinal()]) {
            case 1:
                textS = typography.getTextS();
                break;
            case 2:
                textS = androidx.compose.p011ui.text.TextStyle.m7655copyp1EtxEg$default(typography.getTextS(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null);
                break;
            case 3:
                textS = typography.getTextM();
                break;
            case 4:
                textS = androidx.compose.p011ui.text.TextStyle.m7655copyp1EtxEg$default(typography.getTextM(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null);
                break;
            case 5:
                textS = typography.getTextL();
                break;
            case 6:
                textS = androidx.compose.p011ui.text.TextStyle.m7655copyp1EtxEg$default(typography.getTextL(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null);
                break;
            case 7:
                textS = typography.getDisplayCapsuleSmall();
                break;
            case 8:
                textS = typography.getDisplayCapsuleMedium();
                break;
            case 9:
                textS = typography.getDisplayCapsuleLarge();
                break;
            case 10:
                textS = typography.getBookCoverCapsuleSmall();
                break;
            case 11:
                textS = typography.getBookCoverCapsuleMedium();
                break;
            case 12:
                textS = typography.getBookCoverCapsuleLarge();
                break;
            case 13:
                textS = typography.getTextM();
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textS;
    }

    public static final androidx.compose.p011ui.text.TextStyle composeTextStyleWithFont(TextStyleDto textStyleDto, FontDto fontDto, Composer composer, int i) {
        androidx.compose.p011ui.text.TextStyle textS;
        Intrinsics.checkNotNullParameter(textStyleDto, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-186862399, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.composeTextStyleWithFont (Util.kt:88)");
        }
        if (fontDto == null) {
            androidx.compose.p011ui.text.TextStyle composeTextStyle = getComposeTextStyle(textStyleDto, composer, i & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return composeTextStyle;
        }
        BentoTypography typography = BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable);
        switch (WhenMappings.$EnumSwitchMapping$1[textStyleDto.ordinal()]) {
            case 1:
                textS = typography.getTextS();
                break;
            case 2:
                textS = androidx.compose.p011ui.text.TextStyle.m7655copyp1EtxEg$default(typography.getTextS(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null);
                break;
            case 3:
                textS = typography.getTextM();
                break;
            case 4:
                textS = androidx.compose.p011ui.text.TextStyle.m7655copyp1EtxEg$default(typography.getTextM(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null);
                break;
            case 5:
                textS = typography.getTextL();
                break;
            case 6:
                textS = androidx.compose.p011ui.text.TextStyle.m7655copyp1EtxEg$default(typography.getTextL(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null);
                break;
            case 7:
                int i2 = WhenMappings.$EnumSwitchMapping$2[fontDto.ordinal()];
                if (i2 == 1) {
                    textS = typography.getDisplayNibSmall();
                    break;
                } else if (i2 == 2) {
                    textS = typography.getDisplayCapsuleSmall();
                    break;
                } else if (i2 == 3) {
                    textS = typography.getDisplayMartinaSmall();
                    break;
                } else {
                    textS = typography.getDisplayCapsuleMedium();
                    break;
                }
            case 8:
                int i3 = WhenMappings.$EnumSwitchMapping$2[fontDto.ordinal()];
                if (i3 == 1) {
                    textS = typography.getDisplayNibMedium();
                    break;
                } else if (i3 != 2 && i3 == 3) {
                    textS = typography.getDisplayMartinaMedium();
                    break;
                } else {
                    textS = typography.getDisplayCapsuleMedium();
                    break;
                }
                break;
            case 9:
                int i4 = WhenMappings.$EnumSwitchMapping$2[fontDto.ordinal()];
                if (i4 == 1) {
                    textS = typography.getDisplayNibLarge();
                    break;
                } else if (i4 != 2 && i4 == 3) {
                    textS = typography.getDisplayMartinaLarge();
                    break;
                } else {
                    textS = typography.getDisplayCapsuleLarge();
                    break;
                }
                break;
            case 10:
                int i5 = WhenMappings.$EnumSwitchMapping$2[fontDto.ordinal()];
                if (i5 == 1) {
                    textS = typography.getBookCoverNibSmall();
                    break;
                } else if (i5 == 2) {
                    textS = typography.getBookCoverCapsuleSmall();
                    break;
                } else if (i5 == 3) {
                    textS = typography.getBookCoverMartinaSmall();
                    break;
                } else {
                    textS = typography.getDisplayCapsuleSmall();
                    break;
                }
            case 11:
                int i6 = WhenMappings.$EnumSwitchMapping$2[fontDto.ordinal()];
                if (i6 == 1) {
                    textS = typography.getBookCoverNibMedium();
                    break;
                } else if (i6 == 2) {
                    textS = typography.getBookCoverCapsuleMedium();
                    break;
                } else if (i6 == 3) {
                    textS = typography.getBookCoverMartinaMedium();
                    break;
                } else {
                    textS = typography.getDisplayCapsuleMedium();
                    break;
                }
            case 12:
                int i7 = WhenMappings.$EnumSwitchMapping$2[fontDto.ordinal()];
                if (i7 == 1) {
                    textS = typography.getBookCoverNibLarge();
                    break;
                } else if (i7 == 2) {
                    textS = typography.getBookCoverCapsuleLarge();
                    break;
                } else if (i7 == 3) {
                    textS = typography.getBookCoverMartinaLarge();
                    break;
                } else {
                    textS = typography.getDisplayCapsuleLarge();
                    break;
                }
            case 13:
                textS = typography.getTextM();
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textS;
    }

    public static final FontWeight getFontWeight(TextStyle textStyle) {
        Intrinsics.checkNotNullParameter(textStyle, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[textStyle.ordinal()]) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 9:
                return FontWeight.INSTANCE.getNormal();
            case 2:
            case 4:
            case 6:
                return FontWeight.INSTANCE.getBold();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final FontWeight getFontWeight(TextStyleDto textStyleDto) {
        Intrinsics.checkNotNullParameter(textStyleDto, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$1[textStyleDto.ordinal()]) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                return FontWeight.INSTANCE.getNormal();
            case 2:
            case 4:
            case 6:
                return FontWeight.INSTANCE.getBold();
            case 13:
                return FontWeight.INSTANCE.getNormal();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final int toResourceId(TextStyle textStyle) {
        Intrinsics.checkNotNullParameter(textStyle, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[textStyle.ordinal()]) {
            case 1:
                return C20690R.attr.textAppearanceRegularSmall;
            case 2:
                return C20690R.attr.textAppearanceRegularSmallBold;
            case 3:
                return C20690R.attr.textAppearanceRegularMedium;
            case 4:
                return C20690R.attr.textAppearanceRegularMediumBold;
            case 5:
                return C20690R.attr.textAppearanceRegularLarge;
            case 6:
                return C20690R.attr.textAppearanceRegularLargeBold;
            case 7:
                return C20690R.attr.textAppearanceDisplaySmall;
            case 8:
                return C20690R.attr.textAppearanceDisplayMedium;
            case 9:
                return C20690R.attr.textAppearanceDisplayLarge;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final ServerToBentoAssetMapper2 getIconAsset(Icon icon) {
        Intrinsics.checkNotNullParameter(icon, "<this>");
        return ServerToBentoAssetMapper2.INSTANCE.fromServerValue(icon.getServerValue());
    }

    @SuppressLint({"ComposableModifierFactory"})
    public static final Modifier autoLogEvents(Modifier modifier, Component.ComponentType type2, String str, boolean z, Composer composer, int i, int i2) {
        Modifier modifierThen = modifier;
        Intrinsics.checkNotNullParameter(modifierThen, "<this>");
        Intrinsics.checkNotNullParameter(type2, "type");
        composer.startReplaceGroup(1060959093);
        boolean z2 = (i2 & 4) != 0 ? false : z;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1060959093, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.autoLogEvents (Util.kt:206)");
        }
        if (str != null && !StringsKt.isBlank(str)) {
            modifierThen = modifierThen.then(ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(type2, str, null, 4, null), null, 47, null), true, false, false, true, z2, null, 76, null));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierThen;
    }

    public static final HttpUrl toHttpUrl(ThemedImageSource themedImageSource, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(themedImageSource, "<this>");
        composer.startReplaceGroup(-569460075);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-569460075, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.toHttpUrl (Util.kt:243)");
        }
        HttpUrl imageUrl = toImageUrl(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).getIsDay() ? themedImageSource.getLight() : themedImageSource.getDark(), (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return imageUrl;
    }

    public static final HttpUrl toImageUrl(ImageSource imageSource, Context context) {
        String url_1x;
        Intrinsics.checkNotNullParameter(imageSource, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        HttpUrl.Companion companion = HttpUrl.INSTANCE;
        int i = WhenMappings.$EnumSwitchMapping$3[ContextsUiExtensions.getDensitySpec(context).ordinal()];
        if (i == 1 || i == 2) {
            url_1x = imageSource.getUrl_1x();
        } else if (i == 3) {
            url_1x = imageSource.getUrl_2x();
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            url_1x = imageSource.getUrl_3x();
        }
        return companion.get(url_1x);
    }

    public static final boolean hasInvalidImageUrl(ThemedImageSource themedImageSource, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(themedImageSource, "<this>");
        composer.startReplaceGroup(1572442587);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1572442587, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.hasInvalidImageUrl (Util.kt:255)");
        }
        boolean z = HttpUrl.INSTANCE.parse(getImageUrlString(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).getIsDay() ? themedImageSource.getLight() : themedImageSource.getDark(), (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()))) == null;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return z;
    }

    public static final String getImageUrlString(ImageSource imageSource, Context context) {
        Intrinsics.checkNotNullParameter(imageSource, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        int i = WhenMappings.$EnumSwitchMapping$3[ContextsUiExtensions.getDensitySpec(context).ordinal()];
        if (i == 1) {
            return imageSource.getUrl_1x();
        }
        if (i == 2) {
            return imageSource.getUrl_1x();
        }
        if (i == 3) {
            return imageSource.getUrl_2x();
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return imageSource.getUrl_3x();
    }

    public static final void ComponentNotFound(final UIComponent<?> component, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(217311591);
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
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(217311591, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.ComponentNotFound (Util.kt:267)");
            }
            ComponentNotFound(component.toString(), modifier, composerStartRestartGroup, i3 & 112, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UtilKt.ComponentNotFound$lambda$1(component, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void ComponentNotFound(final UIComponentDto.ConcreteDto component, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(496384918);
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
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(496384918, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.ComponentNotFound (Util.kt:272)");
            }
            System.out.println((Object) ("ComponentNotFound: " + Reflection.getOrCreateKotlinClass(component.getClass()).getSimpleName()));
            ComponentNotFound(component.toString(), modifier, composerStartRestartGroup, i3 & 112, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UtilKt.ComponentNotFound$lambda$2(component, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ComponentNotFound(final String str, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1947872981);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) != 18 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            } else {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1947872981, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.ComponentNotFound (Util.kt:281)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw("Not found: " + str, Background3.m4872backgroundbw27NRU$default(modifier2, bentoTheme.getColors(composerStartRestartGroup, i5).m21452getNegative0d7_KjU(), null, 2, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).getNova()), null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16376);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return UtilKt.ComponentNotFound$lambda$3(str, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) != 18) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            Modifier modifier32 = modifier2;
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw("Not found: " + str, Background3.m4872backgroundbw27NRU$default(modifier2, bentoTheme2.getColors(composerStartRestartGroup, i52).m21452getNegative0d7_KjU(), null, 2, null), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).getNova()), null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16376);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier32;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final CompositionLocal6<Class<?>> getLocalActionClass() {
        return LocalActionClass;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Class LocalActionClass$lambda$4() {
        throw new IllegalStateException("No Action class provided");
    }

    public static final <ActionT extends Parcelable> Class<ActionT> currentActionClass(Composer composer, int i) {
        composer.startReplaceGroup(-163545744);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-163545744, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.currentActionClass (Util.kt:297)");
        }
        Object objConsume = composer.consume(LocalActionClass);
        Intrinsics.checkNotNull(objConsume, "null cannot be cast to non-null type java.lang.Class<ActionT of com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt.currentActionClass>");
        Class<ActionT> cls = (Class) objConsume;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return cls;
    }

    public static final void NoHorizontalPadding(final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-142562812);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(content) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-142562812, i2, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.NoHorizontalPadding (Util.kt:302)");
            }
            CompositionLocal3.CompositionLocalProvider(Spacing2.getLocalHorizontalPadding().provides(C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(0))), ComposableLambda3.rememberComposableLambda(-1859617084, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt.NoHorizontalPadding.1
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
                        ComposerKt.traceEventStart(-1859617084, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.NoHorizontalPadding.<anonymous> (Util.kt:302)");
                    }
                    content.invoke(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UtilKt.NoHorizontalPadding$lambda$5(content, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void SduiHorizontalPadding(final HorizontalPadding horizontalPadding, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(horizontalPadding, "horizontalPadding");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1645551969);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(horizontalPadding.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1645551969, i2, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiHorizontalPadding (Util.kt:312)");
            }
            if (horizontalPadding == HorizontalPadding.None) {
                composerStartRestartGroup.startReplaceGroup(-117832324);
                NoHorizontalPadding(ComposableLambda3.rememberComposableLambda(2002685469, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt.SduiHorizontalPadding.1
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
                            ComposerKt.traceEventStart(2002685469, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiHorizontalPadding.<anonymous> (Util.kt:315)");
                        }
                        content.invoke(composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-117759288);
                content.invoke(composerStartRestartGroup, Integer.valueOf((i2 >> 3) & 14));
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UtilKt.SduiHorizontalPadding$lambda$6(horizontalPadding, content, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Integer getGravity(TextAlignment textAlignment) {
        Intrinsics.checkNotNullParameter(textAlignment, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$4[textAlignment.ordinal()];
        if (i == 1 || i == 2) {
            return 8388611;
        }
        if (i == 3 || i == 4) {
            return 8388613;
        }
        return i != 5 ? null : 1;
    }

    public static final int getComposeTextAlign(TextAlignment textAlignment) {
        Intrinsics.checkNotNullParameter(textAlignment, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$4[textAlignment.ordinal()]) {
            case 1:
                return TextAlign.INSTANCE.m7922getLefte0LSkKk();
            case 2:
                return TextAlign.INSTANCE.m7924getStarte0LSkKk();
            case 3:
                return TextAlign.INSTANCE.m7923getRighte0LSkKk();
            case 4:
                return TextAlign.INSTANCE.m7920getEnde0LSkKk();
            case 5:
                return TextAlign.INSTANCE.m7919getCentere0LSkKk();
            case 6:
                return TextAlign.INSTANCE.m7921getJustifye0LSkKk();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final int getComposeTextAlign(TextAlignmentDto textAlignmentDto) {
        Intrinsics.checkNotNullParameter(textAlignmentDto, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$5[textAlignmentDto.ordinal()]) {
            case 1:
                return TextAlign.INSTANCE.m7924getStarte0LSkKk();
            case 2:
                return TextAlign.INSTANCE.m7924getStarte0LSkKk();
            case 3:
                return TextAlign.INSTANCE.m7920getEnde0LSkKk();
            case 4:
                return TextAlign.INSTANCE.m7919getCentere0LSkKk();
            case 5:
                return TextAlign.INSTANCE.m7923getRighte0LSkKk();
            case 6:
                return TextAlign.INSTANCE.m7921getJustifye0LSkKk();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final Alignment.Horizontal getComposeHorizontalAlignment(TextAlignmentDto textAlignmentDto) {
        Intrinsics.checkNotNullParameter(textAlignmentDto, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$5[textAlignmentDto.ordinal()]) {
            case 1:
                return Alignment.INSTANCE.getStart();
            case 2:
                return Alignment.INSTANCE.getStart();
            case 3:
                return Alignment.INSTANCE.getEnd();
            case 4:
                return Alignment.INSTANCE.getCenterHorizontally();
            case 5:
                return Alignment.INSTANCE.getEnd();
            case 6:
                return Alignment.INSTANCE.getStart();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final <ActionT extends Parcelable> Modifier onClickModifierWithNoIndication(ActionT actiont, Composer composer, int i) {
        Modifier modifierM4891clickableO2vRcR0$default;
        composer.startReplaceGroup(-1973865573);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1973865573, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.onClickModifierWithNoIndication (Util.kt:226)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = InteractionSource2.MutableInteractionSource();
            composer.updateRememberedValue(objRememberedValue);
        }
        InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue;
        composer.endReplaceGroup();
        if (actiont != null) {
            modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(Modifier.INSTANCE, interactionSource3, null, false, null, null, SduiActionHandler3.handling(SduiActionHandler3.currentActionHandler(composer, 0), actiont), 28, null);
        } else {
            modifierM4891clickableO2vRcR0$default = Modifier.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierM4891clickableO2vRcR0$default;
    }
}

package com.truelayer.payments.p419ui.components.toolbars;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardActions2;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.Close2;
import androidx.compose.material3.IconButton5;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextField2;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldDefaults;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusManager;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.input.ImeAction;
import androidx.compose.p011ui.text.input.KeyboardType;
import androidx.compose.p011ui.text.input.PlatformImeOptions;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.TextUnit2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.utils.extensions.ResourceTypes;
import com.truelayer.payments.p419ui.C42830R;
import com.truelayer.payments.p419ui.theme.Color7;
import com.truelayer.payments.p419ui.utils.TestTags;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: SearchField.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u001a¦\u0001\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052#\b\u0002\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u00072#\b\u0002\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\f0\u00072%\b\u0002\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007H\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a<\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001c\u0010!\u001a\u00020\u001e2\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u000f\u0010\"\u001a\u00020\u001eH\u0001¢\u0006\u0004\b\"\u0010#\u001a\u001a\u0010&\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006'"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "value", "hint", "", "inline", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextStyle;", "Lkotlin/ParameterName;", "name", "textStyle", "", AnnotatedPrivateKey.LABEL, "onChange", "onClear", "SearchField", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "text", "SearchFieldLabel", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;I)V", "isVisible", "Landroidx/compose/ui/graphics/Color;", ResourceTypes.COLOR, "Lkotlin/Function0;", "onClick", "contentDescription", "CloseIcon-sW7UJKQ", "(ZJLkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "CloseIcon", "Landroidx/compose/material3/TextFieldColors;", "searchFieldColors-Iv8Zu3U", "(JLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TextFieldColors;", "searchFieldColors", "searchFieldInlineColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TextFieldColors;", "searchFieldTextStyle-ek8zF_U", "(JLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;", "searchFieldTextStyle", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.components.toolbars.SearchFieldKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class SearchField2 {
    /* JADX WARN: Removed duplicated region for block: B:100:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SearchField(Modifier modifier, String str, final String hint, boolean z, Function3<? super TextStyle, ? super Composer, ? super Integer, Unit> function3, Function1<? super String, Unit> function1, Function1<? super String, Unit> function12, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final String str2;
        int i4;
        boolean z2;
        int i5;
        Function3<? super TextStyle, ? super Composer, ? super Integer, Unit> function32;
        int i6;
        int i7;
        Function1<? super String, Unit> function13;
        int i8;
        Function1<? super String, Unit> function14;
        final boolean z3;
        final Function1<? super String, Unit> function15;
        final Function1<? super String, Unit> function16;
        Tuples2 tuples2M3642to;
        boolean z4;
        Object objRememberedValue;
        Composer composer2;
        final Function1<? super String, Unit> function17;
        final Function1<? super String, Unit> function18;
        final String str3;
        final Function3<? super TextStyle, ? super Composer, ? super Integer, Unit> function33;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(hint, "hint");
        Composer composerStartRestartGroup = composer.startRestartGroup(274037381);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else {
            if ((i & 112) == 0) {
                str2 = str;
                i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                i3 |= composerStartRestartGroup.changed(hint) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 7168) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 == 0) {
                    if ((57344 & i) == 0) {
                        function32 = function3;
                        i3 |= composerStartRestartGroup.changedInstance(function32) ? 16384 : 8192;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                        i7 = 458752;
                        function13 = function1;
                    } else {
                        i7 = 458752;
                        function13 = function1;
                        if ((i & 458752) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function13) ? 131072 : 65536;
                        }
                    }
                    i8 = i2 & 64;
                    if (i8 == 0) {
                        i3 |= 1572864;
                        function14 = function12;
                    } else {
                        function14 = function12;
                        if ((i & 3670016) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function14) ? 1048576 : 524288;
                        }
                    }
                    if ((i3 & 2995931) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i10 != 0) {
                            str2 = "";
                        }
                        z3 = i4 == 0 ? false : z2;
                        final Function3<? super TextStyle, ? super Composer, ? super Integer, Unit> function3ComposableLambda = i5 == 0 ? ComposableLambda3.composableLambda(composerStartRestartGroup, 2126587743, true, new Function3<TextStyle, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.toolbars.SearchFieldKt.SearchField.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(TextStyle textStyle, Composer composer3, Integer num) {
                                invoke(textStyle, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(TextStyle it, Composer composer3, int i11) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                if ((i11 & 14) == 0) {
                                    i11 |= composer3.changed(it) ? 4 : 2;
                                }
                                if ((i11 & 91) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2126587743, i11, -1, "com.truelayer.payments.ui.components.toolbars.SearchField.<anonymous> (SearchField.kt:38)");
                                }
                                SearchField2.SearchFieldLabel(hint, it, composer3, (i11 << 3) & 112);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }) : function32;
                        function15 = i6 == 0 ? new Function1<String, Unit>() { // from class: com.truelayer.payments.ui.components.toolbars.SearchFieldKt.SearchField.2
                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(String it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(String str4) {
                                invoke2(str4);
                                return Unit.INSTANCE;
                            }
                        } : function13;
                        Function1<? super String, Unit> function19 = i8 == 0 ? null : function14;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(274037381, i3, -1, "com.truelayer.payments.ui.components.toolbars.SearchField (SearchField.kt:41)");
                        }
                        final FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                        if (z3) {
                            composerStartRestartGroup.startReplaceableGroup(-432256321);
                            function16 = function19;
                            tuples2M3642to = Tuples4.m3642to(Color.m6701boximpl(Color7.onToolbarColor(MaterialTheme.INSTANCE, composerStartRestartGroup, MaterialTheme.$stable)), m27072searchFieldColorsIv8Zu3U(0L, composerStartRestartGroup, 0, 1));
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            function16 = function19;
                            composerStartRestartGroup.startReplaceableGroup(-432256246);
                            tuples2M3642to = Tuples4.m3642to(Color.m6701boximpl(Color.INSTANCE.m6726getUnspecified0d7_KjU()), searchFieldInlineColors(composerStartRestartGroup, 0));
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        final long value = ((Color) tuples2M3642to.component1()).getValue();
                        TextFieldColors textFieldColors = (TextFieldColors) tuples2M3642to.component2();
                        KeyboardOptions keyboardOptions = new KeyboardOptions(0, false, KeyboardType.INSTANCE.m7785getTextPjHm6EE(), ImeAction.INSTANCE.m7747getDoneeUduSuo(), (PlatformImeOptions) null, 19, (DefaultConstructorMarker) null);
                        KeyboardActions keyboardActions = new KeyboardActions(new Function1<KeyboardActions2, Unit>() { // from class: com.truelayer.payments.ui.components.toolbars.SearchFieldKt.SearchField.3
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(KeyboardActions2 keyboardActions2) {
                                invoke2(keyboardActions2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(KeyboardActions2 $receiver) {
                                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                                FocusManager.clearFocus$default(focusManager, false, 1, null);
                            }
                        }, null, null, null, null, null, 62, null);
                        Modifier modifierM5155defaultMinSizeVpY3zN4$default = SizeKt.m5155defaultMinSizeVpY3zN4$default(TestTag3.testTag(modifier4, TestTags.SEARCH_FIELD), 0.0f, C2002Dp.m7995constructorimpl(20), 1, null);
                        TextStyle textStyleM27073searchFieldTextStyleek8zF_U = m27073searchFieldTextStyleek8zF_U(value, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-432256041);
                        z4 = (i3 & i7) != 131072;
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<String, Unit>() { // from class: com.truelayer.payments.ui.components.toolbars.SearchFieldKt$SearchField$4$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(String str4) {
                                    invoke2(str4);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(String query) {
                                    Intrinsics.checkNotNullParameter(query, "query");
                                    function15.invoke(query);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ComposableLambda composableLambda = ComposableLambda3.composableLambda(composerStartRestartGroup, -466620864, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.toolbars.SearchFieldKt.SearchField.5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i11) {
                                if ((i11 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-466620864, i11, -1, "com.truelayer.payments.ui.components.toolbars.SearchField.<anonymous> (SearchField.kt:53)");
                                }
                                function3ComposableLambda.invoke(SearchField2.m27073searchFieldTextStyleek8zF_U(value, composer3, 0), composer3, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                        ComposableLambda composableLambda2 = ComposableLambda3.composableLambda(composerStartRestartGroup, -1156452354, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.toolbars.SearchFieldKt.SearchField.6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i11) {
                                String strStringResource;
                                if ((i11 & 11) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1156452354, i11, -1, "com.truelayer.payments.ui.components.toolbars.SearchField.<anonymous> (SearchField.kt:68)");
                                    }
                                    boolean z5 = function16 != null;
                                    composer3.startReplaceableGroup(-1237201725);
                                    boolean zChanged = composer3.changed(function16) | composer3.changed(str2);
                                    final Function1<String, Unit> function110 = function16;
                                    final String str4 = str2;
                                    Object objRememberedValue2 = composer3.rememberedValue();
                                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new Function0<Unit>() { // from class: com.truelayer.payments.ui.components.toolbars.SearchFieldKt$SearchField$6$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public /* bridge */ /* synthetic */ Unit invoke() {
                                                invoke2();
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2() {
                                                Function1<String, Unit> function111 = function110;
                                                if (function111 != null) {
                                                    function111.invoke(str4);
                                                }
                                            }
                                        };
                                        composer3.updateRememberedValue(objRememberedValue2);
                                    }
                                    Function0 function0 = (Function0) objRememberedValue2;
                                    composer3.endReplaceableGroup();
                                    if (str2.length() > 0) {
                                        composer3.startReplaceableGroup(-1237201614);
                                        strStringResource = StringResources_androidKt.stringResource(C42830R.string.accessibility_clear_search_field, composer3, 0);
                                        composer3.endReplaceableGroup();
                                    } else {
                                        composer3.startReplaceableGroup(-1237201506);
                                        strStringResource = StringResources_androidKt.stringResource(C42830R.string.accessibility_close_search_field, composer3, 0);
                                        composer3.endReplaceableGroup();
                                    }
                                    SearchField2.m27071CloseIconsW7UJKQ(z5, 0L, function0, strStringResource, composer3, 0, 2);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        });
                        int i11 = ((i3 >> 3) & 14) | 817889280;
                        Function1<? super String, Unit> function110 = function15;
                        Function1<? super String, Unit> function111 = function16;
                        composer2 = composerStartRestartGroup;
                        Function3<? super TextStyle, ? super Composer, ? super Integer, Unit> function34 = function3ComposableLambda;
                        String str4 = str2;
                        TextField2.TextField(str4, (Function1) objRememberedValue, modifierM5155defaultMinSizeVpY3zN4$default, false, false, textStyleM27073searchFieldTextStyleek8zF_U, null, composableLambda, null, composableLambda2, null, null, null, false, null, keyboardOptions, keyboardActions, true, 0, 0, null, null, textFieldColors, composer2, i11, 12779520, 0, 3964248);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function17 = function110;
                        function18 = function111;
                        str3 = str4;
                        function33 = function34;
                        modifier3 = modifier4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier2;
                        str3 = str2;
                        z3 = z2;
                        function33 = function32;
                        function18 = function14;
                        function17 = function13;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.toolbars.SearchFieldKt.SearchField.7
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i12) {
                                SearchField2.SearchField(modifier3, str3, hint, z3, function33, function17, function18, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                function32 = function3;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                i8 = i2 & 64;
                if (i8 == 0) {
                }
                if ((i3 & 2995931) == 599186) {
                    if (i9 == 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    final FocusManager focusManager2 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                    if (z3) {
                    }
                    final long value2 = ((Color) tuples2M3642to.component1()).getValue();
                    TextFieldColors textFieldColors2 = (TextFieldColors) tuples2M3642to.component2();
                    KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, false, KeyboardType.INSTANCE.m7785getTextPjHm6EE(), ImeAction.INSTANCE.m7747getDoneeUduSuo(), (PlatformImeOptions) null, 19, (DefaultConstructorMarker) null);
                    KeyboardActions keyboardActions2 = new KeyboardActions(new Function1<KeyboardActions2, Unit>() { // from class: com.truelayer.payments.ui.components.toolbars.SearchFieldKt.SearchField.3
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(KeyboardActions2 keyboardActions22) {
                            invoke2(keyboardActions22);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(KeyboardActions2 $receiver) {
                            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                            FocusManager.clearFocus$default(focusManager2, false, 1, null);
                        }
                    }, null, null, null, null, null, 62, null);
                    Modifier modifierM5155defaultMinSizeVpY3zN4$default2 = SizeKt.m5155defaultMinSizeVpY3zN4$default(TestTag3.testTag(modifier4, TestTags.SEARCH_FIELD), 0.0f, C2002Dp.m7995constructorimpl(20), 1, null);
                    TextStyle textStyleM27073searchFieldTextStyleek8zF_U2 = m27073searchFieldTextStyleek8zF_U(value2, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-432256041);
                    if ((i3 & i7) != 131072) {
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z4) {
                        objRememberedValue = new Function1<String, Unit>() { // from class: com.truelayer.payments.ui.components.toolbars.SearchFieldKt$SearchField$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(String str42) {
                                invoke2(str42);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(String query) {
                                Intrinsics.checkNotNullParameter(query, "query");
                                function15.invoke(query);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceableGroup();
                        ComposableLambda composableLambda3 = ComposableLambda3.composableLambda(composerStartRestartGroup, -466620864, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.toolbars.SearchFieldKt.SearchField.5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i112) {
                                if ((i112 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-466620864, i112, -1, "com.truelayer.payments.ui.components.toolbars.SearchField.<anonymous> (SearchField.kt:53)");
                                }
                                function3ComposableLambda.invoke(SearchField2.m27073searchFieldTextStyleek8zF_U(value2, composer3, 0), composer3, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                        ComposableLambda composableLambda22 = ComposableLambda3.composableLambda(composerStartRestartGroup, -1156452354, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.toolbars.SearchFieldKt.SearchField.6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i112) {
                                String strStringResource;
                                if ((i112 & 11) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1156452354, i112, -1, "com.truelayer.payments.ui.components.toolbars.SearchField.<anonymous> (SearchField.kt:68)");
                                    }
                                    boolean z5 = function16 != null;
                                    composer3.startReplaceableGroup(-1237201725);
                                    boolean zChanged = composer3.changed(function16) | composer3.changed(str2);
                                    final Function1<? super String, Unit> function1102 = function16;
                                    final String str42 = str2;
                                    Object objRememberedValue2 = composer3.rememberedValue();
                                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new Function0<Unit>() { // from class: com.truelayer.payments.ui.components.toolbars.SearchFieldKt$SearchField$6$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public /* bridge */ /* synthetic */ Unit invoke() {
                                                invoke2();
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2() {
                                                Function1<String, Unit> function1112 = function1102;
                                                if (function1112 != null) {
                                                    function1112.invoke(str42);
                                                }
                                            }
                                        };
                                        composer3.updateRememberedValue(objRememberedValue2);
                                    }
                                    Function0 function0 = (Function0) objRememberedValue2;
                                    composer3.endReplaceableGroup();
                                    if (str2.length() > 0) {
                                        composer3.startReplaceableGroup(-1237201614);
                                        strStringResource = StringResources_androidKt.stringResource(C42830R.string.accessibility_clear_search_field, composer3, 0);
                                        composer3.endReplaceableGroup();
                                    } else {
                                        composer3.startReplaceableGroup(-1237201506);
                                        strStringResource = StringResources_androidKt.stringResource(C42830R.string.accessibility_close_search_field, composer3, 0);
                                        composer3.endReplaceableGroup();
                                    }
                                    SearchField2.m27071CloseIconsW7UJKQ(z5, 0L, function0, strStringResource, composer3, 0, 2);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        });
                        int i112 = ((i3 >> 3) & 14) | 817889280;
                        Function1<? super String, Unit> function1102 = function15;
                        Function1<? super String, Unit> function1112 = function16;
                        composer2 = composerStartRestartGroup;
                        Function3<? super TextStyle, ? super Composer, ? super Integer, Unit> function342 = function3ComposableLambda;
                        String str42 = str2;
                        TextField2.TextField(str42, (Function1) objRememberedValue, modifierM5155defaultMinSizeVpY3zN4$default2, false, false, textStyleM27073searchFieldTextStyleek8zF_U2, null, composableLambda3, null, composableLambda22, null, null, null, false, null, keyboardOptions2, keyboardActions2, true, 0, 0, null, null, textFieldColors2, composer2, i112, 12779520, 0, 3964248);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function17 = function1102;
                        function18 = function1112;
                        str3 = str42;
                        function33 = function342;
                        modifier3 = modifier4;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            function32 = function3;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            i8 = i2 & 64;
            if (i8 == 0) {
            }
            if ((i3 & 2995931) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        str2 = str;
        if ((i2 & 4) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        function32 = function3;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        i8 = i2 & 64;
        if (i8 == 0) {
        }
        if ((i3 & 2995931) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final void SearchFieldLabel(final String text, TextStyle textStyle, Composer composer, final int i) {
        int i2;
        Composer composer2;
        final TextStyle textStyle2 = textStyle;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(textStyle2, "textStyle");
        Composer composerStartRestartGroup = composer.startRestartGroup(1678436194);
        if ((i & 14) == 0) {
            i2 = i | (composerStartRestartGroup.changed(text) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(textStyle2) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1678436194, i2, -1, "com.truelayer.payments.ui.components.toolbars.SearchFieldLabel (SearchField.kt:82)");
            }
            composer2 = composerStartRestartGroup;
            TextKt.m6028Text4IGK_g(text, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, composer2, i2 & 14, (i2 << 15) & 3670016, 65534);
            textStyle2 = textStyle;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.toolbars.SearchFieldKt.SearchFieldLabel.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    SearchField2.SearchFieldLabel(text, textStyle2, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e8  */
    /* renamed from: CloseIcon-sW7UJKQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m27071CloseIconsW7UJKQ(final boolean z, long j, final Function0<Unit> onClick, String str, Composer composer, final int i, final int i2) {
        int i3;
        String strStringResource;
        final String str2;
        final long j2;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-203062484);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            i3 |= ((i2 & 2) == 0 && composerStartRestartGroup.changed(j)) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            if ((i2 & 8) == 0) {
                strStringResource = str;
                int i4 = composerStartRestartGroup.changed(strStringResource) ? 2048 : 1024;
                i3 |= i4;
            } else {
                strStringResource = str;
            }
            i3 |= i4;
        } else {
            strStringResource = str;
        }
        if ((i3 & 5851) != 1170 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 2) != 0) {
                    j = Color7.onToolbarColor(MaterialTheme.INSTANCE, composerStartRestartGroup, MaterialTheme.$stable);
                    i3 &= -113;
                }
                if ((i2 & 8) != 0) {
                    strStringResource = StringResources_androidKt.stringResource(C42830R.string.close, composerStartRestartGroup, 0);
                    i3 &= -7169;
                }
                final String str3 = strStringResource;
                final long j3 = j;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-203062484, i3, -1, "com.truelayer.payments.ui.components.toolbars.CloseIcon (SearchField.kt:93)");
                }
                if (z) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.toolbars.SearchFieldKt$CloseIcon$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i5) {
                                SearchField2.m27071CloseIconsW7UJKQ(z, j3, onClick, str3, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                IconButton5.IconButton(onClick, null, false, null, null, ComposableLambda3.composableLambda(composerStartRestartGroup, 50744265, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.toolbars.SearchFieldKt$CloseIcon$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 11) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(50744265, i5, -1, "com.truelayer.payments.ui.components.toolbars.CloseIcon.<anonymous> (SearchField.kt:97)");
                            }
                            ImageKt.Image(Close2.getClose(Icons.Filled.INSTANCE), str3, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m6729tintxETnrds$default(ColorFilter.INSTANCE, j3, 0, 2, null), composer2, 0, 60);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), composerStartRestartGroup, ((i3 >> 6) & 14) | 196608, 30);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                str2 = str3;
                j2 = j3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                final String str32 = strStringResource;
                final long j32 = j;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                if (z) {
                }
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            str2 = strStringResource;
            j2 = j;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.toolbars.SearchFieldKt$CloseIcon$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    SearchField2.m27071CloseIconsW7UJKQ(z, j2, onClick, str2, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* renamed from: searchFieldColors-Iv8Zu3U, reason: not valid java name */
    public static final TextFieldColors m27072searchFieldColorsIv8Zu3U(long j, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(602470713);
        long jOnToolbarColor = (i2 & 1) != 0 ? Color7.onToolbarColor(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable) : j;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(602470713, i, -1, "com.truelayer.payments.ui.components.toolbars.searchFieldColors (SearchField.kt:107)");
        }
        TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
        long jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(jOnToolbarColor, 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
        long jM6705copywmQWz5c$default2 = Color.m6705copywmQWz5c$default(jOnToolbarColor, 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
        Color.Companion companion = Color.INSTANCE;
        long jM6725getTransparent0d7_KjU = companion.m6725getTransparent0d7_KjU();
        long jM6725getTransparent0d7_KjU2 = companion.m6725getTransparent0d7_KjU();
        long j2 = jOnToolbarColor;
        TextFieldColors textFieldColorsM6015colors0hiis_0 = textFieldDefaults.m6015colors0hiis_0(j2, j2, 0L, 0L, jM6725getTransparent0d7_KjU, companion.m6725getTransparent0d7_KjU(), 0L, jM6725getTransparent0d7_KjU2, j2, 0L, null, companion.m6725getTransparent0d7_KjU(), companion.m6725getTransparent0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, jM6705copywmQWz5c$default2, jM6705copywmQWz5c$default, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, (i & 14) | 12804096 | ((i << 3) & 112) | ((i << 24) & 234881024), 432, 0, 0, 3072, 1744823884, 4095);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textFieldColorsM6015colors0hiis_0;
    }

    public static final TextFieldColors searchFieldInlineColors(Composer composer, int i) {
        composer.startReplaceableGroup(-1160218363);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1160218363, i, -1, "com.truelayer.payments.ui.components.toolbars.searchFieldInlineColors (SearchField.kt:121)");
        }
        TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
        Color.Companion companion = Color.INSTANCE;
        TextFieldColors textFieldColorsM6015colors0hiis_0 = textFieldDefaults.m6015colors0hiis_0(0L, 0L, 0L, 0L, companion.m6725getTransparent0d7_KjU(), companion.m6725getTransparent0d7_KjU(), companion.m6725getTransparent0d7_KjU(), companion.m6725getTransparent0d7_KjU(), 0L, 0L, null, companion.m6725getTransparent0d7_KjU(), companion.m6725getTransparent0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, 14376960, 432, 0, 0, 3072, 2147477263, 4095);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textFieldColorsM6015colors0hiis_0;
    }

    /* renamed from: searchFieldTextStyle-ek8zF_U, reason: not valid java name */
    public static final TextStyle m27073searchFieldTextStyleek8zF_U(long j, Composer composer, int i) {
        composer.startReplaceableGroup(1402564844);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1402564844, i, -1, "com.truelayer.payments.ui.components.toolbars.searchFieldTextStyle (SearchField.kt:131)");
        }
        TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleMedium(), j, TextUnit2.getSp(18), FontWeight.INSTANCE.getNormal(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777208, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textStyleM7655copyp1EtxEg$default;
    }
}

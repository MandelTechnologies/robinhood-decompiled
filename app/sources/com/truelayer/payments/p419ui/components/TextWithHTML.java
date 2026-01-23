package com.truelayer.payments.p419ui.components;

import androidx.compose.foundation.text.ClickableTextKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.CustomAccessibilityAction;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.utils.extensions.ResourceTypes;
import com.truelayer.payments.p419ui.C42830R;
import com.truelayer.payments.p419ui.theme.Typography6;
import com.truelayer.payments.p419ui.utils.AnnotationInfo;
import com.truelayer.payments.p419ui.utils.HTMLMatcher;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;

/* compiled from: TextWithHTML.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001as\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2>\b\u0002\u0010\n\u001a8\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00030\u000f¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00010\u000bH\u0001¢\u0006\u0002\u0010\u0011\u001aR\u0010\u0012\u001a\u00020\u0013*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162<\u0010\u0017\u001a8\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00030\u000f¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00010\u000bH\u0002¨\u0006\u0018"}, m3636d2 = {"TextWithHTML", "", "text", "", "modifier", "Landroidx/compose/ui/Modifier;", ResourceTypes.STYLE, "Landroidx/compose/ui/text/TextStyle;", "linkStyle", "Landroidx/compose/ui/text/SpanStyle;", "onLinkClicked", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "url", "Landroidx/compose/ui/text/AnnotatedString$Range;", "annotation", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/SpanStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "onUrlClick", "", "Landroidx/compose/ui/text/AnnotatedString;", "position", "Lkotlin/ranges/IntRange;", "onClick", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.components.TextWithHTMLKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class TextWithHTML {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TextWithHTML(final String text, Modifier modifier, TextStyle textStyle, SpanStyle spanStyle, Function2<? super String, ? super AnnotatedString.Range<String>, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        TextStyle textStyle2;
        SpanStyle linkStyleDefault;
        int i4;
        Function2<? super String, ? super AnnotatedString.Range<String>, Unit> function22;
        Modifier modifier3;
        TextStyle textStyle3;
        int i5;
        SpanStyle spanStyle2;
        final Function2<? super String, ? super AnnotatedString.Range<String>, Unit> function23;
        boolean z;
        Object objRememberedValue;
        AnnotationInfo annotationInfo;
        boolean zChanged;
        Object objRememberedValue2;
        final AnnotatedString annotatedString;
        String strStringResource;
        boolean zChanged2;
        Object objRememberedValue3;
        boolean zChanged3;
        Object objRememberedValue4;
        final SpanStyle spanStyle3;
        final Modifier modifier4;
        final Function2<? super String, ? super AnnotatedString.Range<String>, Unit> function24;
        final TextStyle textStyle4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(-295571850);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 896) != 0) {
                if ((i2 & 4) == 0) {
                    textStyle2 = textStyle;
                    int i7 = composerStartRestartGroup.changed(textStyle2) ? 256 : 128;
                    i3 |= i7;
                } else {
                    textStyle2 = textStyle;
                }
                i3 |= i7;
            } else {
                textStyle2 = textStyle;
            }
            if ((i & 7168) != 0) {
                if ((i2 & 8) == 0) {
                    linkStyleDefault = spanStyle;
                    int i8 = composerStartRestartGroup.changed(linkStyleDefault) ? 2048 : 1024;
                    i3 |= i8;
                } else {
                    linkStyleDefault = spanStyle;
                }
                i3 |= i8;
            } else {
                linkStyleDefault = spanStyle;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 57344) == 0) {
                    function22 = function2;
                    i3 |= composerStartRestartGroup.changedInstance(function22) ? 16384 : 8192;
                }
                if ((46811 & i3) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 4) == 0) {
                            textStyle3 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i3 &= -897;
                        } else {
                            textStyle3 = textStyle2;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            linkStyleDefault = Typography6.getLinkStyleDefault(composerStartRestartGroup, 0);
                        }
                        if (i4 == 0) {
                            function23 = new Function2<String, AnnotatedString.Range<String>, Unit>() { // from class: com.truelayer.payments.ui.components.TextWithHTMLKt.TextWithHTML.1
                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(String str, AnnotatedString.Range<String> range) {
                                    Intrinsics.checkNotNullParameter(str, "<anonymous parameter 0>");
                                    Intrinsics.checkNotNullParameter(range, "<anonymous parameter 1>");
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(String str, AnnotatedString.Range<String> range) {
                                    invoke2(str, range);
                                    return Unit.INSTANCE;
                                }
                            };
                            SpanStyle spanStyle4 = linkStyleDefault;
                            i5 = i3;
                            spanStyle2 = spanStyle4;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-295571850, i5, -1, "com.truelayer.payments.ui.components.TextWithHTML (TextWithHTML.kt:24)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(280949347);
                            z = (i5 & 14) != 4;
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = HTMLMatcher.INSTANCE.intoAnnotationInfo(text);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            annotationInfo = (AnnotationInfo) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(280949435);
                            zChanged = composerStartRestartGroup.changed(annotationInfo) | ((((i5 & 7168) ^ 3072) <= 2048 && composerStartRestartGroup.changed(spanStyle2)) || (i5 & 3072) == 2048);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = annotationInfo.intoAnnotatedString(spanStyle2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            annotatedString = (AnnotatedString) objRememberedValue2;
                            composerStartRestartGroup.endReplaceableGroup();
                            strStringResource = StringResources_androidKt.stringResource(C42830R.string.accessibility_open_link, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(280949632);
                            zChanged2 = composerStartRestartGroup.changed(annotationInfo);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = annotationInfo.intoAccessibilityActions(strStringResource, new Function1<PrimitiveRanges2, Boolean>() { // from class: com.truelayer.payments.ui.components.TextWithHTMLKt$TextWithHTML$accessibilityActions$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final Boolean invoke(PrimitiveRanges2 position) {
                                        Intrinsics.checkNotNullParameter(position, "position");
                                        return Boolean.valueOf(TextWithHTML.onUrlClick(annotatedString, position, function23));
                                    }
                                });
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            final List list = (List) objRememberedValue3;
                            composerStartRestartGroup.endReplaceableGroup();
                            Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(modifier3, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.truelayer.payments.ui.components.TextWithHTMLKt.TextWithHTML.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(SemanticsPropertyReceiver semantics) {
                                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                    SemanticsPropertiesKt.setCustomActions(semantics, list);
                                }
                            }, 1, null);
                            composerStartRestartGroup.startReplaceableGroup(280950052);
                            zChanged3 = composerStartRestartGroup.changed(annotatedString) | ((i5 & 57344) == 16384);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new Function1<Integer, Unit>() { // from class: com.truelayer.payments.ui.components.TextWithHTMLKt$TextWithHTML$3$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                                        invoke(num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(int i9) {
                                        TextWithHTML.onUrlClick(annotatedString, new PrimitiveRanges2(i9, i9), function23);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Function2<? super String, ? super AnnotatedString.Range<String>, Unit> function25 = function23;
                            TextStyle textStyle5 = textStyle3;
                            ClickableTextKt.m5339ClickableText4YKlhWE(annotatedString, modifierSemantics$default, textStyle5, false, 0, 0, null, (Function1) objRememberedValue4, composerStartRestartGroup, i5 & 896, 120);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            Modifier modifier5 = modifier3;
                            spanStyle3 = spanStyle2;
                            modifier4 = modifier5;
                            function24 = function25;
                            textStyle4 = textStyle5;
                        } else {
                            SpanStyle spanStyle5 = linkStyleDefault;
                            i5 = i3;
                            spanStyle2 = spanStyle5;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        SpanStyle spanStyle6 = linkStyleDefault;
                        i5 = i3;
                        spanStyle2 = spanStyle6;
                        modifier3 = modifier2;
                        textStyle3 = textStyle2;
                    }
                    function23 = function22;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.startReplaceableGroup(280949347);
                    if ((i5 & 14) != 4) {
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z) {
                        objRememberedValue = HTMLMatcher.INSTANCE.intoAnnotationInfo(text);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        annotationInfo = (AnnotationInfo) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(280949435);
                        if (((i5 & 7168) ^ 3072) <= 2048) {
                            zChanged = composerStartRestartGroup.changed(annotationInfo) | ((((i5 & 7168) ^ 3072) <= 2048 && composerStartRestartGroup.changed(spanStyle2)) || (i5 & 3072) == 2048);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue2 = annotationInfo.intoAnnotatedString(spanStyle2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                annotatedString = (AnnotatedString) objRememberedValue2;
                                composerStartRestartGroup.endReplaceableGroup();
                                strStringResource = StringResources_androidKt.stringResource(C42830R.string.accessibility_open_link, composerStartRestartGroup, 0);
                                composerStartRestartGroup.startReplaceableGroup(280949632);
                                zChanged2 = composerStartRestartGroup.changed(annotationInfo);
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (!zChanged2) {
                                    objRememberedValue3 = annotationInfo.intoAccessibilityActions(strStringResource, new Function1<PrimitiveRanges2, Boolean>() { // from class: com.truelayer.payments.ui.components.TextWithHTMLKt$TextWithHTML$accessibilityActions$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public final Boolean invoke(PrimitiveRanges2 position) {
                                            Intrinsics.checkNotNullParameter(position, "position");
                                            return Boolean.valueOf(TextWithHTML.onUrlClick(annotatedString, position, function23));
                                        }
                                    });
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                    final List<CustomAccessibilityAction> list2 = (List) objRememberedValue3;
                                    composerStartRestartGroup.endReplaceableGroup();
                                    Modifier modifierSemantics$default2 = SemanticsModifier6.semantics$default(modifier3, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.truelayer.payments.ui.components.TextWithHTMLKt.TextWithHTML.2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            invoke2(semanticsPropertyReceiver);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(SemanticsPropertyReceiver semantics) {
                                            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                            SemanticsPropertiesKt.setCustomActions(semantics, list2);
                                        }
                                    }, 1, null);
                                    composerStartRestartGroup.startReplaceableGroup(280950052);
                                    zChanged3 = composerStartRestartGroup.changed(annotatedString) | ((i5 & 57344) == 16384);
                                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                    if (!zChanged3) {
                                        objRememberedValue4 = new Function1<Integer, Unit>() { // from class: com.truelayer.payments.ui.components.TextWithHTMLKt$TextWithHTML$3$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                                                invoke(num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(int i9) {
                                                TextWithHTML.onUrlClick(annotatedString, new PrimitiveRanges2(i9, i9), function23);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                        composerStartRestartGroup.endReplaceableGroup();
                                        Function2<? super String, ? super AnnotatedString.Range<String>, Unit> function252 = function23;
                                        TextStyle textStyle52 = textStyle3;
                                        ClickableTextKt.m5339ClickableText4YKlhWE(annotatedString, modifierSemantics$default2, textStyle52, false, 0, 0, null, (Function1) objRememberedValue4, composerStartRestartGroup, i5 & 896, 120);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        Modifier modifier52 = modifier3;
                                        spanStyle3 = spanStyle2;
                                        modifier4 = modifier52;
                                        function24 = function252;
                                        textStyle4 = textStyle52;
                                    }
                                }
                            }
                        } else {
                            zChanged = composerStartRestartGroup.changed(annotationInfo) | ((((i5 & 7168) ^ 3072) <= 2048 && composerStartRestartGroup.changed(spanStyle2)) || (i5 & 3072) == 2048);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                            }
                        }
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    textStyle4 = textStyle2;
                    spanStyle3 = linkStyleDefault;
                    function24 = function22;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.TextWithHTMLKt.TextWithHTML.4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i9) {
                            TextWithHTML.TextWithHTML(text, modifier4, textStyle4, spanStyle3, function24, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            function22 = function2;
            if ((46811 & i3) != 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i6 == 0) {
                    }
                    if ((i2 & 4) == 0) {
                    }
                    if ((i2 & 8) != 0) {
                    }
                    if (i4 == 0) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 896) != 0) {
        }
        if ((i & 7168) != 0) {
        }
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        function22 = function2;
        if ((46811 & i3) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onUrlClick(AnnotatedString annotatedString, PrimitiveRanges2 primitiveRanges2, Function2<? super String, ? super AnnotatedString.Range<String>, Unit> function2) {
        Unit unit;
        AnnotatedString.Range range = (AnnotatedString.Range) CollectionsKt.firstOrNull((List) annotatedString.getStringAnnotations("URL", primitiveRanges2.getFirst(), primitiveRanges2.getLast()));
        if (range != null) {
            function2.invoke(range.getItem(), range);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        return unit != null;
    }
}

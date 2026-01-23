package com.truelayer.payments.p419ui.components;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.InfoKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.vector.ImageVector;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.platform.UriHandler;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.truelayer.payments.p419ui.theme.Spacing;
import com.truelayer.payments.p419ui.theme.Theme5;
import com.truelayer.payments.p419ui.utils.TestTags;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InfoBanner.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aI\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u000bH\u0001¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"InfoBanner", "", "modifier", "Landroidx/compose/ui/Modifier;", "text", "", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "iconColorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "onLinkClicked", "Lkotlin/Function1;", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;Landroidx/compose/ui/graphics/ColorFilter;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "PreviewInfoBanner", "(Landroidx/compose/runtime/Composer;I)V", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.components.InfoBannerKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class InfoBanner4 {
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InfoBanner(Modifier modifier, final String text, ImageVector imageVector, ColorFilter colorFilter, Function1<? super String, Unit> function1, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        ImageVector imageVector2;
        ColorFilter colorFilterM6729tintxETnrds$default;
        Function1<? super String, Unit> function12;
        Modifier modifier3;
        final ImageVector info;
        int i4;
        final ColorFilter colorFilter2;
        final Function1<? super String, Unit> function13;
        Composer composer2;
        final Modifier modifier4;
        final ImageVector imageVector3;
        final ColorFilter colorFilter3;
        final Function1<? super String, Unit> function14;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(-288972867);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(text) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                imageVector2 = imageVector;
                int i6 = composerStartRestartGroup.changed(imageVector2) ? 256 : 128;
                i3 |= i6;
            } else {
                imageVector2 = imageVector;
            }
            i3 |= i6;
        } else {
            imageVector2 = imageVector;
        }
        if ((i & 7168) == 0) {
            if ((i2 & 8) == 0) {
                colorFilterM6729tintxETnrds$default = colorFilter;
                int i7 = composerStartRestartGroup.changed(colorFilterM6729tintxETnrds$default) ? 2048 : 1024;
                i3 |= i7;
            } else {
                colorFilterM6729tintxETnrds$default = colorFilter;
            }
            i3 |= i7;
        } else {
            colorFilterM6729tintxETnrds$default = colorFilter;
        }
        int i8 = i2 & 16;
        if (i8 == 0) {
            if ((57344 & i) == 0) {
                function12 = function1;
                i3 |= composerStartRestartGroup.changedInstance(function12) ? 16384 : 8192;
            }
            if ((46811 & i3) == 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        info = InfoKt.getInfo(Icons.Outlined.INSTANCE);
                        i3 &= -897;
                    } else {
                        info = imageVector2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        colorFilterM6729tintxETnrds$default = ColorFilter.Companion.m6729tintxETnrds$default(ColorFilter.INSTANCE, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSecondary(), 0, 2, null);
                    }
                    if (i8 == 0) {
                        function13 = new Function1<String, Unit>() { // from class: com.truelayer.payments.ui.components.InfoBannerKt.InfoBanner.1
                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(String it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                                invoke2(str);
                                return Unit.INSTANCE;
                            }
                        };
                        ColorFilter colorFilter4 = colorFilterM6729tintxETnrds$default;
                        i4 = i3;
                        colorFilter2 = colorFilter4;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-288972867, i4, -1, "com.truelayer.payments.ui.components.InfoBanner (InfoBanner.kt:33)");
                        }
                        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                        int i9 = MaterialTheme.$stable;
                        Function1<? super String, Unit> function15 = function13;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m5967SurfaceT9BRK9s(TestTag3.testTag(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), TestTags.INFO_BANNER), materialTheme.getShapes(composerStartRestartGroup, i9).getExtraSmall(), materialTheme.getColorScheme(composerStartRestartGroup, i9).getSurfaceVariant(), 0L, 0.0f, 0.0f, null, ComposableLambda3.composableLambda(composerStartRestartGroup, 495317464, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.InfoBannerKt.InfoBanner.2
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

                            public final void invoke(Composer composer3, int i10) {
                                if ((i10 & 11) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(495317464, i10, -1, "com.truelayer.payments.ui.components.InfoBanner.<anonymous> (InfoBanner.kt:41)");
                                    }
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    float f = 16;
                                    Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(companion, Spacing.INSTANCE.m27177getREGULARD9Ej5fM(), C2002Dp.m7995constructorimpl(f));
                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                    ImageVector imageVector4 = info;
                                    ColorFilter colorFilter5 = colorFilter2;
                                    String str = text;
                                    final Function1<String, Unit> function16 = function13;
                                    composer3.startReplaceableGroup(693286680);
                                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                                    composer3.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM5143paddingVpY3zN4);
                                    if (composer3.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    Row6 row6 = Row6.INSTANCE;
                                    ImageKt.Image(imageVector4, (String) null, TestTag3.testTag(SizeKt.m5169size3ABfNKs(companion, C2002Dp.m7995constructorimpl(f)), TestTags.INFO_BANNER_ICON), (Alignment) null, (ContentScale) null, 0.0f, colorFilter5, composer3, 432, 56);
                                    final UriHandler uriHandler = (UriHandler) composer3.consume(CompositionLocalsKt.getLocalUriHandler());
                                    MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                                    int i11 = MaterialTheme.$stable;
                                    TextWithHTML.TextWithHTML(str, PaddingKt.m5146paddingqDBjuR0$default(companion, C2002Dp.m7995constructorimpl(8), 0.0f, 0.0f, 0.0f, 14, null), TextStyle.m7655copyp1EtxEg$default(materialTheme2.getTypography(composer3, i11).getBodySmall(), materialTheme2.getColorScheme(composer3, i11).getOnSurfaceVariant(), 0L, FontWeight.INSTANCE.getMedium(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777210, null), null, new Function2<String, AnnotatedString.Range<String>, Unit>() { // from class: com.truelayer.payments.ui.components.InfoBannerKt$InfoBanner$2$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(String str2, AnnotatedString.Range<String> range) {
                                            invoke2(str2, range);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(String uri, AnnotatedString.Range<String> range) {
                                            Intrinsics.checkNotNullParameter(uri, "uri");
                                            Intrinsics.checkNotNullParameter(range, "<anonymous parameter 1>");
                                            function16.invoke(uri);
                                            uriHandler.openUri(uri);
                                        }
                                    }, composer3, 48, 8);
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), composer2, 12582912, 120);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        imageVector3 = info;
                        colorFilter3 = colorFilter2;
                        function14 = function15;
                    } else {
                        ColorFilter colorFilter5 = colorFilterM6729tintxETnrds$default;
                        i4 = i3;
                        colorFilter2 = colorFilter5;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    ColorFilter colorFilter6 = colorFilterM6729tintxETnrds$default;
                    i4 = i3;
                    colorFilter2 = colorFilter6;
                    modifier3 = modifier2;
                    info = imageVector2;
                }
                function13 = function12;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                int i92 = MaterialTheme.$stable;
                Function1<? super String, Unit> function152 = function13;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m5967SurfaceT9BRK9s(TestTag3.testTag(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), TestTags.INFO_BANNER), materialTheme2.getShapes(composerStartRestartGroup, i92).getExtraSmall(), materialTheme2.getColorScheme(composerStartRestartGroup, i92).getSurfaceVariant(), 0L, 0.0f, 0.0f, null, ComposableLambda3.composableLambda(composerStartRestartGroup, 495317464, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.InfoBannerKt.InfoBanner.2
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

                    public final void invoke(Composer composer3, int i10) {
                        if ((i10 & 11) != 2 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(495317464, i10, -1, "com.truelayer.payments.ui.components.InfoBanner.<anonymous> (InfoBanner.kt:41)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            float f = 16;
                            Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(companion, Spacing.INSTANCE.m27177getREGULARD9Ej5fM(), C2002Dp.m7995constructorimpl(f));
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            ImageVector imageVector4 = info;
                            ColorFilter colorFilter52 = colorFilter2;
                            String str = text;
                            final Function1<? super String, Unit> function16 = function13;
                            composer3.startReplaceableGroup(693286680);
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                            composer3.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM5143paddingVpY3zN4);
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer3)), composer3, 0);
                            composer3.startReplaceableGroup(2058660585);
                            Row6 row6 = Row6.INSTANCE;
                            ImageKt.Image(imageVector4, (String) null, TestTag3.testTag(SizeKt.m5169size3ABfNKs(companion, C2002Dp.m7995constructorimpl(f)), TestTags.INFO_BANNER_ICON), (Alignment) null, (ContentScale) null, 0.0f, colorFilter52, composer3, 432, 56);
                            final UriHandler uriHandler = (UriHandler) composer3.consume(CompositionLocalsKt.getLocalUriHandler());
                            MaterialTheme materialTheme22 = MaterialTheme.INSTANCE;
                            int i11 = MaterialTheme.$stable;
                            TextWithHTML.TextWithHTML(str, PaddingKt.m5146paddingqDBjuR0$default(companion, C2002Dp.m7995constructorimpl(8), 0.0f, 0.0f, 0.0f, 14, null), TextStyle.m7655copyp1EtxEg$default(materialTheme22.getTypography(composer3, i11).getBodySmall(), materialTheme22.getColorScheme(composer3, i11).getOnSurfaceVariant(), 0L, FontWeight.INSTANCE.getMedium(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777210, null), null, new Function2<String, AnnotatedString.Range<String>, Unit>() { // from class: com.truelayer.payments.ui.components.InfoBannerKt$InfoBanner$2$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(String str2, AnnotatedString.Range<String> range) {
                                    invoke2(str2, range);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(String uri, AnnotatedString.Range<String> range) {
                                    Intrinsics.checkNotNullParameter(uri, "uri");
                                    Intrinsics.checkNotNullParameter(range, "<anonymous parameter 1>");
                                    function16.invoke(uri);
                                    uriHandler.openUri(uri);
                                }
                            }, composer3, 48, 8);
                            composer3.endReplaceableGroup();
                            composer3.endNode();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }), composer2, 12582912, 120);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
                imageVector3 = info;
                colorFilter3 = colorFilter2;
                function14 = function152;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier4 = modifier2;
                imageVector3 = imageVector2;
                colorFilter3 = colorFilterM6729tintxETnrds$default;
                function14 = function12;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.InfoBannerKt.InfoBanner.3
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

                    public final void invoke(Composer composer3, int i10) {
                        InfoBanner4.InfoBanner(modifier4, text, imageVector3, colorFilter3, function14, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        function12 = function1;
        if ((46811 & i3) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if ((i2 & 4) == 0) {
                }
                if ((i2 & 8) != 0) {
                }
                if (i8 == 0) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final void PreviewInfoBanner(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-968258563);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-968258563, i, -1, "com.truelayer.payments.ui.components.PreviewInfoBanner (InfoBanner.kt:79)");
            }
            Theme5.Theme(null, false, null, InfoBanner2.INSTANCE.m27030getLambda1$payments_ui_release(), composerStartRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.InfoBannerKt.PreviewInfoBanner.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    InfoBanner4.PreviewInfoBanner(composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

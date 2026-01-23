package com.truelayer.payments.p419ui.components;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons2;
import androidx.compose.material.icons.automirrored.filled.ArrowBack;
import androidx.compose.material3.IconButton5;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressComposableKt;
import com.truelayer.payments.p419ui.C42830R;
import com.truelayer.payments.p419ui.theme.Color7;
import com.truelayer.payments.p419ui.utils.TestTags;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BackButton.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {CryptoTransferSendSavedAddressComposableKt.TestTagBackButton, "", "modifier", "Landroidx/compose/ui/Modifier;", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "onClick", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/ColorFilter;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.components.BackButtonKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class BackButton {
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BackButton(Modifier modifier, ColorFilter colorFilter, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        ColorFilter colorFilter2;
        Function0<Unit> function02;
        final Modifier modifier3;
        final ColorFilter colorFilterM6729tintxETnrds$default;
        Function0<Unit> function03;
        final Function0<Unit> function04;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1922292065);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                colorFilter2 = colorFilter;
                int i5 = composerStartRestartGroup.changed(colorFilter2) ? 32 : 16;
                i3 |= i5;
            } else {
                colorFilter2 = colorFilter;
            }
            i3 |= i5;
        } else {
            colorFilter2 = colorFilter;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 896) == 0) {
                function02 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
            }
            if ((i3 & 731) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 2) == 0) {
                        colorFilterM6729tintxETnrds$default = ColorFilter.Companion.m6729tintxETnrds$default(ColorFilter.INSTANCE, Color7.onToolbarColor(MaterialTheme.INSTANCE, composerStartRestartGroup, MaterialTheme.$stable), 0, 2, null);
                        i3 &= -113;
                    } else {
                        colorFilterM6729tintxETnrds$default = colorFilter2;
                    }
                    if (i6 == 0) {
                        function03 = new Function0<Unit>() { // from class: com.truelayer.payments.ui.components.BackButtonKt.BackButton.1
                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }
                        };
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1922292065, i3, -1, "com.truelayer.payments.ui.components.BackButton (BackButton.kt:25)");
                    }
                    IconButton5.IconButton(function03, TestTag3.testTag(SizeKt.m5169size3ABfNKs(modifier3, C2002Dp.m7995constructorimpl(48)), TestTags.BACK), false, null, null, ComposableLambda3.composableLambda(composerStartRestartGroup, -158152350, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.BackButtonKt.BackButton.2
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i7) {
                            if ((i7 & 11) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-158152350, i7, -1, "com.truelayer.payments.ui.components.BackButton.<anonymous> (BackButton.kt:31)");
                                }
                                ImageKt.Image(ArrowBack.getArrowBack(Icons2.INSTANCE), StringResources_androidKt.stringResource(C42830R.string.back, composer2, 0), (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, colorFilterM6729tintxETnrds$default, composer2, 0, 60);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), composerStartRestartGroup, ((i3 >> 6) & 14) | 196608, 28);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function04 = function03;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    modifier3 = modifier2;
                    colorFilterM6729tintxETnrds$default = colorFilter2;
                }
                function03 = function02;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                IconButton5.IconButton(function03, TestTag3.testTag(SizeKt.m5169size3ABfNKs(modifier3, C2002Dp.m7995constructorimpl(48)), TestTags.BACK), false, null, null, ComposableLambda3.composableLambda(composerStartRestartGroup, -158152350, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.BackButtonKt.BackButton.2
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        if ((i7 & 11) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-158152350, i7, -1, "com.truelayer.payments.ui.components.BackButton.<anonymous> (BackButton.kt:31)");
                            }
                            ImageKt.Image(ArrowBack.getArrowBack(Icons2.INSTANCE), StringResources_androidKt.stringResource(C42830R.string.back, composer2, 0), (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, colorFilterM6729tintxETnrds$default, composer2, 0, 60);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), composerStartRestartGroup, ((i3 >> 6) & 14) | 196608, 28);
                if (ComposerKt.isTraceInProgress()) {
                }
                function04 = function03;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                colorFilterM6729tintxETnrds$default = colorFilter2;
                function04 = function02;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.BackButtonKt.BackButton.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        BackButton.BackButton(modifier3, colorFilterM6729tintxETnrds$default, function04, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        function02 = function0;
        if ((i3 & 731) == 146) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i4 == 0) {
                }
                if ((i2 & 2) == 0) {
                }
                if (i6 == 0) {
                    function03 = function02;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                IconButton5.IconButton(function03, TestTag3.testTag(SizeKt.m5169size3ABfNKs(modifier3, C2002Dp.m7995constructorimpl(48)), TestTags.BACK), false, null, null, ComposableLambda3.composableLambda(composerStartRestartGroup, -158152350, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.BackButtonKt.BackButton.2
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        if ((i7 & 11) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-158152350, i7, -1, "com.truelayer.payments.ui.components.BackButton.<anonymous> (BackButton.kt:31)");
                            }
                            ImageKt.Image(ArrowBack.getArrowBack(Icons2.INSTANCE), StringResources_androidKt.stringResource(C42830R.string.back, composer2, 0), (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, colorFilterM6729tintxETnrds$default, composer2, 0, 60);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), composerStartRestartGroup, ((i3 >> 6) & 14) | 196608, 28);
                if (ComposerKt.isTraceInProgress()) {
                }
                function04 = function03;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}

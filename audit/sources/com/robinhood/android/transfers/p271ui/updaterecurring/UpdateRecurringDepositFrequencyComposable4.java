package com.robinhood.android.transfers.p271ui.updaterecurring;

import android.content.res.Resources;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.contracts.UpdateRecurringDepositKey;
import com.robinhood.android.transfers.p271ui.p272v2.CreateTransferV2Composable3;
import com.robinhood.android.transfers.p271ui.updaterecurring.UpdateRecurringDepositFrequencyComposable4;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRow2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.common.Haptics;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.context.BaseContexts;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: UpdateRecurringDepositFrequencyComposable.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001aR\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007¢\u0006\u0002\u0010\u000f\u001aP\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\u0011\u001a8\u0010\u0012\u001a\u00020\u00012!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0016\u001a#\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0003¢\u0006\u0002\u0010\u0018\u001aC\u0010\u0019\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\u001f¨\u0006 "}, m3636d2 = {"UpdateRecurringDepositFrequencyComposable", "", "depositInfo", "Lcom/robinhood/android/transfers/contracts/UpdateRecurringDepositKey;", "onContinueClicked", "Lkotlin/Function1;", "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "Lkotlin/ParameterName;", "name", "frequency", "modifier", "Landroidx/compose/ui/Modifier;", "frequencyRows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/transfers/ui/updaterecurring/TransferFrequencyRowItem;", "(Lcom/robinhood/android/transfers/contracts/UpdateRecurringDepositKey;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/runtime/Composer;II)V", "RecurringFrequencyUpsellContent", "(Lcom/robinhood/android/transfers/contracts/UpdateRecurringDepositKey;Lkotlin/jvm/functions/Function1;Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", CreateTransferV2Composable3.ContinueButtonTag, "selectedFrequency", "(Lkotlin/jvm/functions/Function1;Lcom/robinhood/models/api/bonfire/TransferFrequency;Landroidx/compose/runtime/Composer;I)V", "Title", "(Landroidx/compose/runtime/Composer;I)V", "Description", "(Lcom/robinhood/android/transfers/contracts/UpdateRecurringDepositKey;Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/runtime/Composer;I)V", "FrequencySelectionRow", "selected", "", "secondaryText", "", "onFrequencyClicked", "(Lcom/robinhood/android/transfers/ui/updaterecurring/TransferFrequencyRowItem;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.ui.updaterecurring.UpdateRecurringDepositFrequencyComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class UpdateRecurringDepositFrequencyComposable4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContinueButton$lambda$4(Function1 function1, ApiCreateTransferRequest2 apiCreateTransferRequest2, int i, Composer composer, int i2) {
        ContinueButton(function1, apiCreateTransferRequest2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Description$lambda$9(UpdateRecurringDepositKey updateRecurringDepositKey, ImmutableList immutableList, int i, Composer composer, int i2) throws Resources.NotFoundException {
        Description(updateRecurringDepositKey, immutableList, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FrequencySelectionRow$lambda$12(TransferFrequencyRowItem transferFrequencyRowItem, boolean z, String str, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FrequencySelectionRow(transferFrequencyRowItem, z, str, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecurringFrequencyUpsellContent$lambda$1(UpdateRecurringDepositKey updateRecurringDepositKey, Function1 function1, ImmutableList immutableList, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RecurringFrequencyUpsellContent(updateRecurringDepositKey, function1, immutableList, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Title$lambda$5(int i, Composer composer, int i2) {
        Title(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpdateRecurringDepositFrequencyComposable$lambda$0(UpdateRecurringDepositKey updateRecurringDepositKey, Function1 function1, Modifier modifier, ImmutableList immutableList, int i, int i2, Composer composer, int i3) {
        UpdateRecurringDepositFrequencyComposable(updateRecurringDepositKey, function1, modifier, immutableList, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UpdateRecurringDepositFrequencyComposable(final UpdateRecurringDepositKey depositInfo, final Function1<? super ApiCreateTransferRequest2, Unit> onContinueClicked, Modifier modifier, ImmutableList<? extends TransferFrequencyRowItem> immutableList, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        ImmutableList<? extends TransferFrequencyRowItem> immutableList2;
        final ImmutableList<? extends TransferFrequencyRowItem> persistentList;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(depositInfo, "depositInfo");
        Intrinsics.checkNotNullParameter(onContinueClicked, "onContinueClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-345543971);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(depositInfo) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onContinueClicked) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    immutableList2 = immutableList;
                    int i5 = composerStartRestartGroup.changed(immutableList2) ? 2048 : 1024;
                    i3 |= i5;
                } else {
                    immutableList2 = immutableList;
                }
                i3 |= i5;
            } else {
                immutableList2 = immutableList;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) == 0) {
                        i3 &= -7169;
                        modifier2 = modifier3;
                        persistentList = extensions2.toPersistentList(TransferFrequencyRowItem.getEntries());
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-345543971, i3, -1, "com.robinhood.android.transfers.ui.updaterecurring.UpdateRecurringDepositFrequencyComposable (UpdateRecurringDepositFrequencyComposable.kt:52)");
                        }
                        final UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, new Screen(Screen.Name.CHOOSE_TRANSFER_FREQUENCY, null, null, null, 14, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, depositInfo.getEntrypointLoggingIdentifier(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null), null, null, 53, null);
                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-211726094, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.updaterecurring.UpdateRecurringDepositFrequencyComposableKt.UpdateRecurringDepositFrequencyComposable.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i6) {
                                if ((i6 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-211726094, i6, -1, "com.robinhood.android.transfers.ui.updaterecurring.UpdateRecurringDepositFrequencyComposable.<anonymous> (UpdateRecurringDepositFrequencyComposable.kt:62)");
                                }
                                UserInteractionEventDescriptor userInteractionEventDescriptor2 = userInteractionEventDescriptor;
                                final UpdateRecurringDepositKey updateRecurringDepositKey = depositInfo;
                                final Function1<ApiCreateTransferRequest2, Unit> function1 = onContinueClicked;
                                final ImmutableList<TransferFrequencyRowItem> immutableList3 = persistentList;
                                final Modifier modifier4 = modifier2;
                                AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor2, ComposableLambda3.rememberComposableLambda(-1160394969, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.updaterecurring.UpdateRecurringDepositFrequencyComposableKt.UpdateRecurringDepositFrequencyComposable.1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i7) {
                                        if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1160394969, i7, -1, "com.robinhood.android.transfers.ui.updaterecurring.UpdateRecurringDepositFrequencyComposable.<anonymous>.<anonymous> (UpdateRecurringDepositFrequencyComposable.kt:63)");
                                        }
                                        UpdateRecurringDepositFrequencyComposable4.RecurringFrequencyUpsellContent(updateRecurringDepositKey, function1, immutableList3, ModifiersKt.autoLogEvents$default(modifier4, (UserInteractionEventDescriptor) composer3.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), true, false, true, true, false, null, 100, null), composer3, 0, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54), composer2, 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        modifier2 = modifier3;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                }
                persistentList = immutableList2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final UserInteractionEventDescriptor userInteractionEventDescriptor2 = new UserInteractionEventDescriptor(null, new Screen(Screen.Name.CHOOSE_TRANSFER_FREQUENCY, null, null, null, 14, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, depositInfo.getEntrypointLoggingIdentifier(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null), null, null, 53, null);
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-211726094, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.updaterecurring.UpdateRecurringDepositFrequencyComposableKt.UpdateRecurringDepositFrequencyComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-211726094, i6, -1, "com.robinhood.android.transfers.ui.updaterecurring.UpdateRecurringDepositFrequencyComposable.<anonymous> (UpdateRecurringDepositFrequencyComposable.kt:62)");
                        }
                        UserInteractionEventDescriptor userInteractionEventDescriptor22 = userInteractionEventDescriptor2;
                        final UpdateRecurringDepositKey updateRecurringDepositKey = depositInfo;
                        final Function1<? super ApiCreateTransferRequest2, Unit> function1 = onContinueClicked;
                        final ImmutableList<? extends TransferFrequencyRowItem> immutableList3 = persistentList;
                        final Modifier modifier4 = modifier2;
                        AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor22, ComposableLambda3.rememberComposableLambda(-1160394969, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.updaterecurring.UpdateRecurringDepositFrequencyComposableKt.UpdateRecurringDepositFrequencyComposable.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i7) {
                                if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1160394969, i7, -1, "com.robinhood.android.transfers.ui.updaterecurring.UpdateRecurringDepositFrequencyComposable.<anonymous>.<anonymous> (UpdateRecurringDepositFrequencyComposable.kt:63)");
                                }
                                UpdateRecurringDepositFrequencyComposable4.RecurringFrequencyUpsellContent(updateRecurringDepositKey, function1, immutableList3, ModifiersKt.autoLogEvents$default(modifier4, (UserInteractionEventDescriptor) composer3.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), true, false, true, true, false, null, 100, null), composer3, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                persistentList = immutableList2;
            }
            final Modifier modifier4 = modifier2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.updaterecurring.UpdateRecurringDepositFrequencyComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return UpdateRecurringDepositFrequencyComposable4.UpdateRecurringDepositFrequencyComposable$lambda$0(depositInfo, onContinueClicked, modifier4, persistentList, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if ((i3 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i4 == 0) {
                }
                if ((i2 & 8) == 0) {
                }
            }
        }
        final Modifier modifier42 = modifier2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: UpdateRecurringDepositFrequencyComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.transfers.ui.updaterecurring.UpdateRecurringDepositFrequencyComposableKt$RecurringFrequencyUpsellContent$2 */
    static final class C311092 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ UpdateRecurringDepositKey $depositInfo;
        final /* synthetic */ ImmutableList<TransferFrequencyRowItem> $frequencyRows;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function1<ApiCreateTransferRequest2, Unit> $onContinueClicked;

        /* JADX WARN: Multi-variable type inference failed */
        C311092(UpdateRecurringDepositKey updateRecurringDepositKey, Modifier modifier, ImmutableList<? extends TransferFrequencyRowItem> immutableList, Function1<? super ApiCreateTransferRequest2, Unit> function1) {
            this.$depositInfo = updateRecurringDepositKey;
            this.$modifier = modifier;
            this.$frequencyRows = immutableList;
            this.$onContinueClicked = function1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void invoke(PaddingValues paddingValues, Composer composer, int i) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            int i2 = (i & 6) == 0 ? i | (composer.changed(paddingValues) ? 4 : 2) : i;
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-911683912, i2, -1, "com.robinhood.android.transfers.ui.updaterecurring.RecurringFrequencyUpsellContent.<anonymous> (UpdateRecurringDepositFrequencyComposable.kt:111)");
            }
            composer.startReplaceGroup(1849434622);
            UpdateRecurringDepositKey updateRecurringDepositKey = this.$depositInfo;
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(updateRecurringDepositKey.getFrequency(), null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composer.endReplaceGroup();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.padding(companion, paddingValues), 0.0f, 1, null);
            Modifier modifier = this.$modifier;
            UpdateRecurringDepositKey updateRecurringDepositKey2 = this.$depositInfo;
            ImmutableList<TransferFrequencyRowItem> immutableList = this.$frequencyRows;
            Function1<ApiCreateTransferRequest2, Unit> function1 = this.$onContinueClicked;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierFillMaxWidth$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            UpdateRecurringDepositFrequencyComposable4.Title(composer, 0);
            UpdateRecurringDepositFrequencyComposable4.Description(updateRecurringDepositKey2, immutableList, composer, 0);
            int i3 = 0;
            Modifier modifierWeight$default = Column5.weight$default(column6, companion, 1.0f, false, 2, null);
            float f = 0.0f;
            int i4 = 1;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(modifierWeight$default, 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            composer.startReplaceGroup(122234867);
            for (TransferFrequencyRowItem transferFrequencyRowItem : immutableList) {
                int i5 = transferFrequencyRowItem.getFrequency() == snapshotState.getValue() ? i4 : i3;
                String strStringResource = StringResources_androidKt.stringResource(transferFrequencyRowItem.getDescription(), composer, i3);
                composer.startReplaceGroup(5004770);
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.transfers.ui.updaterecurring.UpdateRecurringDepositFrequencyComposableKt$RecurringFrequencyUpsellContent$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return UpdateRecurringDepositFrequencyComposable4.C311092.invoke$lambda$7$lambda$5$lambda$4$lambda$3$lambda$2$lambda$1(snapshotState, (ApiCreateTransferRequest2) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                UpdateRecurringDepositFrequencyComposable4.FrequencySelectionRow(transferFrequencyRowItem, i5, strStringResource, (Function1) objRememberedValue2, null, composer, 3072, 16);
                boxScopeInstance = boxScopeInstance;
                f = f;
                i4 = i4;
                function1 = function1;
                i3 = 0;
            }
            Function1<ApiCreateTransferRequest2, Unit> function12 = function1;
            int i6 = i4;
            BoxScopeInstance boxScopeInstance2 = boxScopeInstance;
            composer.endReplaceGroup();
            composer.endNode();
            composer.endNode();
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f, i6, null), 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 7, null);
            Alignment.Companion companion4 = Alignment.INSTANCE;
            Modifier modifierAlign = boxScopeInstance2.align(modifierM5146paddingqDBjuR0$default, companion4.getBottomCenter());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
            int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer, modifierAlign);
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor4 = companion5.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor4);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy2, companion5.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion5.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion5.getSetCompositeKeyHash();
            if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion5.getSetModifier());
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            UpdateRecurringDepositFrequencyComposable4.ContinueButton(function12, (ApiCreateTransferRequest2) snapshotState.getValue(), composer, 0);
            composer.endNode();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) throws Resources.NotFoundException {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$5$lambda$4$lambda$3$lambda$2$lambda$1(SnapshotState snapshotState, ApiCreateTransferRequest2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            snapshotState.setValue(it);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RecurringFrequencyUpsellContent(final UpdateRecurringDepositKey depositInfo, final Function1<? super ApiCreateTransferRequest2, Unit> onContinueClicked, final ImmutableList<? extends TransferFrequencyRowItem> frequencyRows, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(depositInfo, "depositInfo");
        Intrinsics.checkNotNullParameter(onContinueClicked, "onContinueClicked");
        Intrinsics.checkNotNullParameter(frequencyRows, "frequencyRows");
        Composer composerStartRestartGroup = composer.startRestartGroup(260147623);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(depositInfo) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onContinueClicked) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(frequencyRows) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(260147623, i3, -1, "com.robinhood.android.transfers.ui.updaterecurring.RecurringFrequencyUpsellContent (UpdateRecurringDepositFrequencyComposable.kt:85)");
                }
                final AppCompatActivity appCompatActivityRequireActivityBaseContext = BaseContexts.requireActivityBaseContext((android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                ScaffoldKt.m5939ScaffoldTvnljyQ(null, ComposableLambda3.rememberComposableLambda(1454994019, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.updaterecurring.UpdateRecurringDepositFrequencyComposableKt.RecurringFrequencyUpsellContent.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i6) {
                        if ((i6 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1454994019, i6, -1, "com.robinhood.android.transfers.ui.updaterecurring.RecurringFrequencyUpsellContent.<anonymous> (UpdateRecurringDepositFrequencyComposable.kt:91)");
                        }
                        Function2<Composer, Integer, Unit> lambda$1364826838$feature_transfers_externalRelease = UpdateRecurringDepositFrequencyComposable.INSTANCE.getLambda$1364826838$feature_transfers_externalRelease();
                        final AppCompatActivity appCompatActivity = appCompatActivityRequireActivityBaseContext;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$1364826838$feature_transfers_externalRelease, null, ComposableLambda3.rememberComposableLambda(-701388542, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.updaterecurring.UpdateRecurringDepositFrequencyComposableKt.RecurringFrequencyUpsellContent.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                invoke(bentoAppBarScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i7) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i7 & 6) == 0) {
                                    i7 |= (i7 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i7 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-701388542, i7, -1, "com.robinhood.android.transfers.ui.updaterecurring.RecurringFrequencyUpsellContent.<anonymous>.<anonymous> (UpdateRecurringDepositFrequencyComposable.kt:100)");
                                }
                                AppCompatActivity appCompatActivity2 = appCompatActivity;
                                composer4.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer4.changedInstance(appCompatActivity2);
                                Object objRememberedValue = composer4.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new UpdateRecurringDepositFrequencyComposable5(appCompatActivity2);
                                    composer4.updateRememberedValue(objRememberedValue);
                                }
                                composer4.endReplaceGroup();
                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) ((KFunction) objRememberedValue), composer4, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), UpdateRecurringDepositFrequencyComposable.INSTANCE.getLambda$566956482$feature_transfers_externalRelease(), null, null, 0, bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(-911683912, true, new C311092(depositInfo, modifier4, frequencyRows, onContinueClicked), composerStartRestartGroup, 54), composer2, 805306800, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.updaterecurring.UpdateRecurringDepositFrequencyComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return UpdateRecurringDepositFrequencyComposable4.RecurringFrequencyUpsellContent$lambda$1(depositInfo, onContinueClicked, frequencyRows, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final AppCompatActivity appCompatActivityRequireActivityBaseContext2 = BaseContexts.requireActivityBaseContext((android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            Modifier modifier52 = modifier4;
            composer2 = composerStartRestartGroup;
            ScaffoldKt.m5939ScaffoldTvnljyQ(null, ComposableLambda3.rememberComposableLambda(1454994019, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.updaterecurring.UpdateRecurringDepositFrequencyComposableKt.RecurringFrequencyUpsellContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i6) {
                    if ((i6 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1454994019, i6, -1, "com.robinhood.android.transfers.ui.updaterecurring.RecurringFrequencyUpsellContent.<anonymous> (UpdateRecurringDepositFrequencyComposable.kt:91)");
                    }
                    Function2<Composer, Integer, Unit> lambda$1364826838$feature_transfers_externalRelease = UpdateRecurringDepositFrequencyComposable.INSTANCE.getLambda$1364826838$feature_transfers_externalRelease();
                    final AppCompatActivity appCompatActivity = appCompatActivityRequireActivityBaseContext2;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$1364826838$feature_transfers_externalRelease, null, ComposableLambda3.rememberComposableLambda(-701388542, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.updaterecurring.UpdateRecurringDepositFrequencyComposableKt.RecurringFrequencyUpsellContent.1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                            invoke(bentoAppBarScope, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i7) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i7 & 6) == 0) {
                                i7 |= (i7 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                            }
                            if ((i7 & 19) == 18 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-701388542, i7, -1, "com.robinhood.android.transfers.ui.updaterecurring.RecurringFrequencyUpsellContent.<anonymous>.<anonymous> (UpdateRecurringDepositFrequencyComposable.kt:100)");
                            }
                            AppCompatActivity appCompatActivity2 = appCompatActivity;
                            composer4.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer4.changedInstance(appCompatActivity2);
                            Object objRememberedValue = composer4.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new UpdateRecurringDepositFrequencyComposable5(appCompatActivity2);
                                composer4.updateRememberedValue(objRememberedValue);
                            }
                            composer4.endReplaceGroup();
                            BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) ((KFunction) objRememberedValue), composer4, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 7);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), UpdateRecurringDepositFrequencyComposable.INSTANCE.getLambda$566956482$feature_transfers_externalRelease(), null, null, 0, bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU(), bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(-911683912, true, new C311092(depositInfo, modifier4, frequencyRows, onContinueClicked), composerStartRestartGroup, 54), composer2, 805306800, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ContinueButton(final Function1<? super ApiCreateTransferRequest2, Unit> function1, final ApiCreateTransferRequest2 apiCreateTransferRequest2, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(174082862);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(apiCreateTransferRequest2.ordinal()) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(174082862, i2, -1, "com.robinhood.android.transfers.ui.updaterecurring.ContinueButton (UpdateRecurringDepositFrequencyComposable.kt:165)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(PaddingKt.m5143paddingVpY3zN4(modifierFillMaxWidth$default, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM()), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.CONTINUE, null, new Component(Component.ComponentType.BUTTON, "continue", null, 4, null), null, 43, null), true, false, false, true, false, null, 108, null);
            String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composerStartRestartGroup, 0);
            BentoButtons.Type type2 = BentoButtons.Type.Primary;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.ui.updaterecurring.UpdateRecurringDepositFrequencyComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UpdateRecurringDepositFrequencyComposable4.ContinueButton$lambda$3$lambda$2(function1, apiCreateTransferRequest2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            BentoButtonKt.m20586BentoButtonEikTQX8(Haptics.hapticClick((Function0) objRememberedValue, composerStartRestartGroup, 0), strStringResource, modifierAutoLogEvents$default, null, type2, true, false, null, null, null, null, false, null, composer2, 221184, 0, 8136);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.updaterecurring.UpdateRecurringDepositFrequencyComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UpdateRecurringDepositFrequencyComposable4.ContinueButton$lambda$4(function1, apiCreateTransferRequest2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContinueButton$lambda$3$lambda$2(Function1 function1, ApiCreateTransferRequest2 apiCreateTransferRequest2) {
        function1.invoke(apiCreateTransferRequest2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Title(Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(173223247);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(173223247, i, -1, "com.robinhood.android.transfers.ui.updaterecurring.Title (UpdateRecurringDepositFrequencyComposable.kt:189)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(companion, bentoTheme.getSpacing(composerStartRestartGroup, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i2).m21592getMediumD9Ej5fM());
            String strStringResource = StringResources_androidKt.stringResource(C30065R.string.update_recurring_deposit_frequency_title, composerStartRestartGroup, 0);
            TextStyle displayCapsuleMedium = bentoTheme.getTypography(composerStartRestartGroup, i2).getDisplayCapsuleMedium();
            long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i2).m21425getFg0d7_KjU();
            int iM7924getStarte0LSkKk = TextAlign.INSTANCE.m7924getStarte0LSkKk();
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM5143paddingVpY3zN4, Color.m6701boximpl(jM21425getFg0d7_KjU), null, FontWeight.INSTANCE.getW500(), null, TextAlign.m7912boximpl(iM7924getStarte0LSkKk), 0, false, 0, 0, null, 0, displayCapsuleMedium, composer2, 24576, 0, 8104);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.updaterecurring.UpdateRecurringDepositFrequencyComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UpdateRecurringDepositFrequencyComposable4.Title$lambda$5(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Description(final UpdateRecurringDepositKey updateRecurringDepositKey, final ImmutableList<? extends TransferFrequencyRowItem> immutableList, Composer composer, final int i) throws Resources.NotFoundException {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-334951008);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(updateRecurringDepositKey) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(immutableList) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-334951008, i2, -1, "com.robinhood.android.transfers.ui.updaterecurring.Description (UpdateRecurringDepositFrequencyComposable.kt:207)");
            }
            for (TransferFrequencyRowItem transferFrequencyRowItem : immutableList) {
                if (transferFrequencyRowItem.getFrequency() == updateRecurringDepositKey.getFrequency()) {
                    String strStringResource = StringResources_androidKt.stringResource(transferFrequencyRowItem.getOccurrenceLabel(), composerStartRestartGroup, 0);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i3 = BentoTheme.$stable;
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                    composerStartRestartGroup.startReplaceGroup(234642397);
                    AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                    String strStringResource2 = StringResources_androidKt.stringResource(C30065R.string.update_recurring_deposit_frequency_body, new Object[]{updateRecurringDepositKey.getAmount(), strStringResource}, composerStartRestartGroup, 0);
                    String strStringResource3 = StringResources_androidKt.stringResource(C30065R.string.update_recurring_deposit_frequency_highlight, new Object[]{updateRecurringDepositKey.getAmount(), strStringResource}, composerStartRestartGroup, 0);
                    int iIndexOf$default = StringsKt.indexOf$default((CharSequence) strStringResource2, strStringResource3, 0, false, 6, (Object) null);
                    String strSubstring = strStringResource2.substring(0, iIndexOf$default);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    builder.append(strSubstring);
                    int iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null));
                    try {
                        builder.append(strStringResource3);
                        Unit unit = Unit.INSTANCE;
                        builder.pop(iPushStyle);
                        String strSubstring2 = strStringResource2.substring(iIndexOf$default + strStringResource3.length());
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                        builder.append(strSubstring2);
                        AnnotatedString annotatedString = builder.toAnnotatedString();
                        composerStartRestartGroup.endReplaceGroup();
                        composer2 = composerStartRestartGroup;
                        BentoText2.m20748BentoTextQnj7Zds(annotatedString, modifierM5144paddingVpY3zN4$default, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7924getStarte0LSkKk()), 0, false, 0, 0, null, null, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM(), composer2, 0, 0, 8120);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } catch (Throwable th) {
                        builder.pop(iPushStyle);
                        throw th;
                    }
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        composerStartRestartGroup.skipToGroupEnd();
        composer2 = composerStartRestartGroup;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.updaterecurring.UpdateRecurringDepositFrequencyComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UpdateRecurringDepositFrequencyComposable4.Description$lambda$9(updateRecurringDepositKey, immutableList, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FrequencySelectionRow(final TransferFrequencyRowItem frequency, final boolean z, final String secondaryText, final Function1<? super ApiCreateTransferRequest2, Unit> onFrequencyClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        boolean z2;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
        Intrinsics.checkNotNullParameter(onFrequencyClicked, "onFrequencyClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1937789746);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(frequency.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(secondaryText) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onFrequencyClicked) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                }
                if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1937789746, i3, -1, "com.robinhood.android.transfers.ui.updaterecurring.FrequencySelectionRow (UpdateRecurringDepositFrequencyComposable.kt:250)");
                    }
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier4, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.SELECT_FREQUENCY, null, new Component(Component.ComponentType.RADIO_BUTTON, frequency.getFrequency().getServerValue(), null, 4, null), null, 43, null), false, false, false, true, false, null, 108, null);
                    Modifier modifier5 = modifier4;
                    BentoSelectionRowState.Type type2 = BentoSelectionRowState.Type.RadioButton;
                    String strStringResource = StringResources_androidKt.stringResource(frequency.getTitle(), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    z2 = ((i3 & 7168) != 2048) | ((i3 & 14) == 4);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.ui.updaterecurring.UpdateRecurringDepositFrequencyComposableKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return UpdateRecurringDepositFrequencyComposable4.FrequencySelectionRow$lambda$11$lambda$10(onFrequencyClicked, frequency);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    int i5 = i3 << 6;
                    BentoSelectionRow2.BentoSelectionRow(modifierAutoLogEvents$default, type2, strStringResource, z, secondaryText, false, null, false, false, false, Haptics.hapticClick((Function0) objRememberedValue, composerStartRestartGroup, 0), composerStartRestartGroup, (i5 & 7168) | 48 | (i5 & 57344), 0, 992);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.updaterecurring.UpdateRecurringDepositFrequencyComposableKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return UpdateRecurringDepositFrequencyComposable4.FrequencySelectionRow$lambda$12(frequency, z, secondaryText, onFrequencyClicked, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            modifier2 = modifier;
            if ((i3 & 9363) != 9362) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(modifier4, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.SELECT_FREQUENCY, null, new Component(Component.ComponentType.RADIO_BUTTON, frequency.getFrequency().getServerValue(), null, 4, null), null, 43, null), false, false, false, true, false, null, 108, null);
                Modifier modifier52 = modifier4;
                BentoSelectionRowState.Type type22 = BentoSelectionRowState.Type.RadioButton;
                String strStringResource2 = StringResources_androidKt.stringResource(frequency.getTitle(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                z2 = ((i3 & 7168) != 2048) | ((i3 & 14) == 4);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z2) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.ui.updaterecurring.UpdateRecurringDepositFrequencyComposableKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return UpdateRecurringDepositFrequencyComposable4.FrequencySelectionRow$lambda$11$lambda$10(onFrequencyClicked, frequency);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    int i52 = i3 << 6;
                    BentoSelectionRow2.BentoSelectionRow(modifierAutoLogEvents$default2, type22, strStringResource2, z, secondaryText, false, null, false, false, false, Haptics.hapticClick((Function0) objRememberedValue, composerStartRestartGroup, 0), composerStartRestartGroup, (i52 & 7168) | 48 | (i52 & 57344), 0, 992);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FrequencySelectionRow$lambda$11$lambda$10(Function1 function1, TransferFrequencyRowItem transferFrequencyRowItem) {
        function1.invoke(transferFrequencyRowItem.getFrequency());
        return Unit.INSTANCE;
    }
}

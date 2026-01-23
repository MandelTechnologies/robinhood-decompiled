package com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.review;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.ach.format.AchRelationships;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.LocalLifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs;
import com.robinhood.android.navigation.compose.destination.ComposeNav;
import com.robinhood.android.transfers.recurring.C30439R;
import com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.RecurringDepositExtraCashDestinations;
import com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.RecurringExtraCashData;
import com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.review.ReviewComposable;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoDataRowKt;
import com.robinhood.compose.bento.component.rows.BentoDataRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ReviewComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"ReviewComposable", "", "args", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/RecurringExtraCashData;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/RecurringExtraCashData;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-recurring-deposits_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.extracash.review.ReviewComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class ReviewComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReviewComposable$lambda$0(RecurringExtraCashData recurringExtraCashData, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ReviewComposable(recurringExtraCashData, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ReviewComposable(final RecurringExtraCashData args, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(args, "args");
        Composer composerStartRestartGroup = composer.startRestartGroup(1561420202);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(args) ? 4 : 2) | i;
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
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1561420202, i3, -1, "com.robinhood.android.transfers.recurring.ui.experiment.extracash.review.ReviewComposable (ReviewComposable.kt:37)");
                }
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.EXTRA_CASH_SETUP_REVIEW, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-1302516715, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.review.ReviewComposableKt.ReviewComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* compiled from: ReviewComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.extracash.review.ReviewComposableKt$ReviewComposable$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
                        final /* synthetic */ RecurringExtraCashData $args;
                        final /* synthetic */ UserInteractionEventDescriptor $eventData;
                        final /* synthetic */ EventLogger $eventLogger;
                        final /* synthetic */ LifecycleAwareNavigator $navigator;

                        AnonymousClass1(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, LifecycleAwareNavigator lifecycleAwareNavigator, RecurringExtraCashData recurringExtraCashData) {
                            this.$eventLogger = eventLogger;
                            this.$eventData = userInteractionEventDescriptor;
                            this.$navigator = lifecycleAwareNavigator;
                            this.$args = recurringExtraCashData;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
                            invoke(bentoButtonBar3, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                            if ((i & 17) == 16 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1107686090, i, -1, "com.robinhood.android.transfers.recurring.ui.experiment.extracash.review.ReviewComposable.<anonymous>.<anonymous> (ReviewComposable.kt:51)");
                            }
                            String strStringResource = StringResources_androidKt.stringResource(C30439R.string.recurring_deposit_extra_cash_review_footer, composer, 0);
                            String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_label_confirm, composer, 0);
                            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                            composer.startReplaceGroup(-1224400529);
                            boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$eventData) | composer.changed(this.$navigator) | composer.changedInstance(this.$args);
                            final EventLogger eventLogger = this.$eventLogger;
                            final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventData;
                            final LifecycleAwareNavigator lifecycleAwareNavigator = this.$navigator;
                            final RecurringExtraCashData recurringExtraCashData = this.$args;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.review.ReviewComposableKt$ReviewComposable$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return ReviewComposable.C305241.AnonymousClass1.invoke$lambda$1$lambda$0(eventLogger, userInteractionEventDescriptor, lifecycleAwareNavigator, recurringExtraCashData);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BentoButtonBar2.BentoButtonBar(modifierM5144paddingVpY3zN4$default, strStringResource, null, false, null, null, (Function0) objRememberedValue, strStringResource2, false, null, false, null, null, false, null, false, composer, 0, 0, 65340);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, LifecycleAwareNavigator lifecycleAwareNavigator, RecurringExtraCashData recurringExtraCashData) throws Resources.NotFoundException {
                            EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(Component.ComponentType.BUTTON, "continue", null, 4, null), null, 47, null), UserInteractionEventData.EventType.TAP), false, false, 6, null);
                            LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, (ComposeNav) ComposableDestinationWithArgs.composeNav$default(RecurringDepositExtraCashDestinations.INSTANCE, recurringExtraCashData, null, null, 6, null), false, (Function1) null, 6, (Object) null);
                            return Unit.INSTANCE;
                        }
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1302516715, i5, -1, "com.robinhood.android.transfers.recurring.ui.experiment.extracash.review.ReviewComposable.<anonymous> (ReviewComposable.kt:45)");
                        }
                        UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                        EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer2, AutoLoggingCompositionLocals4.$stable);
                        LifecycleAwareNavigator lifecycleAwareNavigator = (LifecycleAwareNavigator) composer2.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
                        Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(modifier3, null, 1, null);
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1107686090, true, new AnonymousClass1(current, userInteractionEventDescriptor, lifecycleAwareNavigator, args), composer2, 54);
                        final RecurringExtraCashData recurringExtraCashData = args;
                        BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifierLogScreenTransitions$default, false, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(681930493, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.review.ReviewComposableKt.ReviewComposable.1.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                                invoke(boxScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer3, int i6) {
                                String displayTitle;
                                Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                if ((i6 & 17) == 16 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(681930493, i6, -1, "com.robinhood.android.transfers.recurring.ui.experiment.extracash.review.ReviewComposable.<anonymous>.<anonymous> (ReviewComposable.kt:82)");
                                }
                                RecurringExtraCashData recurringExtraCashData2 = recurringExtraCashData;
                                Modifier.Companion companion = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                String strStringResource = StringResources_androidKt.stringResource(C30439R.string.recurring_deposit_extra_cash_review_title, composer3, 0);
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i7 = BentoTheme.$stable;
                                BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer3, i7).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i7).getDisplayCapsuleSmall(), composer3, 0, 0, 8188);
                                String strStringResource2 = StringResources_androidKt.stringResource(C30439R.string.bank_account_header, composer3, 0);
                                FontWeight.Companion companion3 = FontWeight.INSTANCE;
                                BentoText2.m20747BentoText38GnDrw(strStringResource2, PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer3, i7).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer3, i7).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer3, i7).m21592getMediumD9Ej5fM(), 0.0f, 8, null), null, null, companion3.getW700(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i7).getTextM(), composer3, 24576, 0, 8172);
                                AnnotatedString annotatedString = new AnnotatedString(StringResources_androidKt.stringResource(C11048R.string.general_label_from, composer3, 0), null, 2, null);
                                AchRelationship fromAccount = recurringExtraCashData2.getFromAccount();
                                composer3.startReplaceGroup(-1387074846);
                                if (fromAccount == null) {
                                    displayTitle = null;
                                } else {
                                    Resources resources = ((Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                                    displayTitle = AchRelationships.getDisplayTitle(fromAccount, resources);
                                }
                                composer3.endReplaceGroup();
                                if (displayTitle == null) {
                                    displayTitle = "";
                                }
                                BentoDataRowState bentoDataRowState = new BentoDataRowState(null, annotatedString, null, null, null, new AnnotatedString(displayTitle, null, 2, null), null, null, null, null, false, false, 4061, null);
                                int i8 = BentoDataRowState.$stable;
                                BentoDataRowKt.BentoDataRow(bentoDataRowState, null, null, composer3, i8, 6);
                                AnnotatedString annotatedString2 = new AnnotatedString(StringResources_androidKt.stringResource(C30439R.string.maximum_balance, composer3, 0), null, 2, null);
                                BigDecimal amount = recurringExtraCashData2.getAmount();
                                if (amount == null) {
                                    throw new IllegalStateException("Required value was null.");
                                }
                                BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, annotatedString2, null, null, null, new AnnotatedString(Money.format$default(Money3.toMoney$default(amount, null, 1, null), null, false, null, false, 0, null, false, null, false, false, 1023, null), null, 2, null), null, null, null, null, false, false, 4061, null), null, null, composer3, i8, 6);
                                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C30439R.string.robinhood_account_header, composer3, 0), PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer3, i7).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer3, i7).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer3, i7).m21592getMediumD9Ej5fM(), 0.0f, 8, null), null, null, companion3.getW700(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i7).getTextM(), composer3, 24576, 0, 8172);
                                AnnotatedString annotatedString3 = new AnnotatedString(StringResources_androidKt.stringResource(C11048R.string.general_label_to, composer3, 0), null, 2, null);
                                TransferAccount toAccount = recurringExtraCashData2.getToAccount();
                                if (toAccount == null) {
                                    throw new IllegalStateException("Required value was null.");
                                }
                                BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, annotatedString3, null, null, null, new AnnotatedString(toAccount.getDisplayTitle(), null, 2, null), null, null, null, null, false, false, 4061, null), null, null, composer3, i8, 6);
                                composer3.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 3504, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.review.ReviewComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ReviewComposable.ReviewComposable$lambda$0(args, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.EXTRA_CASH_SETUP_REVIEW, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-1302516715, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.review.ReviewComposableKt.ReviewComposable.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                /* compiled from: ReviewComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.extracash.review.ReviewComposableKt$ReviewComposable$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
                    final /* synthetic */ RecurringExtraCashData $args;
                    final /* synthetic */ UserInteractionEventDescriptor $eventData;
                    final /* synthetic */ EventLogger $eventLogger;
                    final /* synthetic */ LifecycleAwareNavigator $navigator;

                    AnonymousClass1(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, LifecycleAwareNavigator lifecycleAwareNavigator, RecurringExtraCashData recurringExtraCashData) {
                        this.$eventLogger = eventLogger;
                        this.$eventData = userInteractionEventDescriptor;
                        this.$navigator = lifecycleAwareNavigator;
                        this.$args = recurringExtraCashData;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
                        invoke(bentoButtonBar3, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                        if ((i & 17) == 16 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1107686090, i, -1, "com.robinhood.android.transfers.recurring.ui.experiment.extracash.review.ReviewComposable.<anonymous>.<anonymous> (ReviewComposable.kt:51)");
                        }
                        String strStringResource = StringResources_androidKt.stringResource(C30439R.string.recurring_deposit_extra_cash_review_footer, composer, 0);
                        String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_label_confirm, composer, 0);
                        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                        composer.startReplaceGroup(-1224400529);
                        boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$eventData) | composer.changed(this.$navigator) | composer.changedInstance(this.$args);
                        final EventLogger eventLogger = this.$eventLogger;
                        final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventData;
                        final LifecycleAwareNavigator lifecycleAwareNavigator = this.$navigator;
                        final RecurringExtraCashData recurringExtraCashData = this.$args;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.review.ReviewComposableKt$ReviewComposable$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ReviewComposable.C305241.AnonymousClass1.invoke$lambda$1$lambda$0(eventLogger, userInteractionEventDescriptor, lifecycleAwareNavigator, recurringExtraCashData);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        BentoButtonBar2.BentoButtonBar(modifierM5144paddingVpY3zN4$default, strStringResource, null, false, null, null, (Function0) objRememberedValue, strStringResource2, false, null, false, null, null, false, null, false, composer, 0, 0, 65340);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, LifecycleAwareNavigator lifecycleAwareNavigator, RecurringExtraCashData recurringExtraCashData) throws Resources.NotFoundException {
                        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(Component.ComponentType.BUTTON, "continue", null, 4, null), null, 47, null), UserInteractionEventData.EventType.TAP), false, false, 6, null);
                        LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, (ComposeNav) ComposableDestinationWithArgs.composeNav$default(RecurringDepositExtraCashDestinations.INSTANCE, recurringExtraCashData, null, null, 6, null), false, (Function1) null, 6, (Object) null);
                        return Unit.INSTANCE;
                    }
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1302516715, i5, -1, "com.robinhood.android.transfers.recurring.ui.experiment.extracash.review.ReviewComposable.<anonymous> (ReviewComposable.kt:45)");
                    }
                    UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                    EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer2, AutoLoggingCompositionLocals4.$stable);
                    LifecycleAwareNavigator lifecycleAwareNavigator = (LifecycleAwareNavigator) composer2.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
                    Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(modifier3, null, 1, null);
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1107686090, true, new AnonymousClass1(current, userInteractionEventDescriptor, lifecycleAwareNavigator, args), composer2, 54);
                    final RecurringExtraCashData recurringExtraCashData = args;
                    BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifierLogScreenTransitions$default, false, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(681930493, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.review.ReviewComposableKt.ReviewComposable.1.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                            invoke(boxScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer3, int i6) {
                            String displayTitle;
                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                            if ((i6 & 17) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(681930493, i6, -1, "com.robinhood.android.transfers.recurring.ui.experiment.extracash.review.ReviewComposable.<anonymous>.<anonymous> (ReviewComposable.kt:82)");
                            }
                            RecurringExtraCashData recurringExtraCashData2 = recurringExtraCashData;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            String strStringResource = StringResources_androidKt.stringResource(C30439R.string.recurring_deposit_extra_cash_review_title, composer3, 0);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer3, i7).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i7).getDisplayCapsuleSmall(), composer3, 0, 0, 8188);
                            String strStringResource2 = StringResources_androidKt.stringResource(C30439R.string.bank_account_header, composer3, 0);
                            FontWeight.Companion companion3 = FontWeight.INSTANCE;
                            BentoText2.m20747BentoText38GnDrw(strStringResource2, PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer3, i7).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer3, i7).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer3, i7).m21592getMediumD9Ej5fM(), 0.0f, 8, null), null, null, companion3.getW700(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i7).getTextM(), composer3, 24576, 0, 8172);
                            AnnotatedString annotatedString = new AnnotatedString(StringResources_androidKt.stringResource(C11048R.string.general_label_from, composer3, 0), null, 2, null);
                            AchRelationship fromAccount = recurringExtraCashData2.getFromAccount();
                            composer3.startReplaceGroup(-1387074846);
                            if (fromAccount == null) {
                                displayTitle = null;
                            } else {
                                Resources resources = ((Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                                displayTitle = AchRelationships.getDisplayTitle(fromAccount, resources);
                            }
                            composer3.endReplaceGroup();
                            if (displayTitle == null) {
                                displayTitle = "";
                            }
                            BentoDataRowState bentoDataRowState = new BentoDataRowState(null, annotatedString, null, null, null, new AnnotatedString(displayTitle, null, 2, null), null, null, null, null, false, false, 4061, null);
                            int i8 = BentoDataRowState.$stable;
                            BentoDataRowKt.BentoDataRow(bentoDataRowState, null, null, composer3, i8, 6);
                            AnnotatedString annotatedString2 = new AnnotatedString(StringResources_androidKt.stringResource(C30439R.string.maximum_balance, composer3, 0), null, 2, null);
                            BigDecimal amount = recurringExtraCashData2.getAmount();
                            if (amount == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                            BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, annotatedString2, null, null, null, new AnnotatedString(Money.format$default(Money3.toMoney$default(amount, null, 1, null), null, false, null, false, 0, null, false, null, false, false, 1023, null), null, 2, null), null, null, null, null, false, false, 4061, null), null, null, composer3, i8, 6);
                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C30439R.string.robinhood_account_header, composer3, 0), PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer3, i7).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer3, i7).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer3, i7).m21592getMediumD9Ej5fM(), 0.0f, 8, null), null, null, companion3.getW700(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i7).getTextM(), composer3, 24576, 0, 8172);
                            AnnotatedString annotatedString3 = new AnnotatedString(StringResources_androidKt.stringResource(C11048R.string.general_label_to, composer3, 0), null, 2, null);
                            TransferAccount toAccount = recurringExtraCashData2.getToAccount();
                            if (toAccount == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                            BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, annotatedString3, null, null, null, new AnnotatedString(toAccount.getDisplayTitle(), null, 2, null), null, null, null, null, false, false, 4061, null), null, null, composer3, i8, 6);
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 3504, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}

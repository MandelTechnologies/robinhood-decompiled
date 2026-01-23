package com.robinhood.android.pathfinder.corepages.contactemail;

import android.content.Context;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Intrinsic3;
import androidx.compose.foundation.layout.Intrinsic4;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;
import com.google.android.material.timepicker.MaterialTimePicker;
import com.robinhood.android.beneficiaries.p067ui.detail.BeneficiaryDetailCompose2;
import com.robinhood.android.common.util.Validation;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.pathfinder.corepages.contactemail.ContactEmailViewState;
import com.robinhood.android.transfers.p271ui.p272v2.CreateTransferV2Composable3;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextInput4;
import com.robinhood.compose.bento.component.BentoTextInput8;
import com.robinhood.compose.bento.component.BentoTextInputState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.pathfinder.contexts.OptionalFieldType;
import com.robinhood.models.api.pathfinder.input.OptionalField;
import com.robinhood.models.p355ui.pathfinder.contexts.OptionalFieldDescription;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.shared.pathfinder.corepages.C39352R;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.datetime.format.LocalTimeFormatter;
import com.robinhood.utils.p409ui.context.BaseContexts;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableMap;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.LocalTime;
import p479j$.time.OffsetTime;
import p479j$.time.ZoneId;
import p479j$.time.ZoneOffset;
import p479j$.time.format.DateTimeFormatter;
import p479j$.time.format.DateTimeFormatterBuilder;
import p479j$.time.format.DateTimeParseException;
import p479j$.time.temporal.ChronoField;

/* compiled from: ContactEmailComposable.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0005\u001a\u0081\u0001\u0010\r\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00072&\u0010\f\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u00040\tH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0011\u0010\u0010\u001a7\u0010\u0015\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001aK\u0010\u001d\u001a\u00020\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001a2\u0018\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0007H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a-\u0010 \u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b \u0010!\u001a7\u0010(\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u00032\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040&H\u0003¢\u0006\u0004\b(\u0010)\u001a9\u0010,\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u00032\u0018\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0007H\u0003¢\u0006\u0004\b,\u0010-\u001a9\u0010.\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u00032\u0018\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0007H\u0003¢\u0006\u0004\b.\u0010-\u001a9\u0010/\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u00032\u0018\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0007H\u0003¢\u0006\u0004\b/\u0010-\u001a9\u00103\u001a\u00020\u00042\b\u00100\u001a\u0004\u0018\u00010\u00032\u0006\u0010+\u001a\u00020\u00032\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040&2\b\b\u0002\u00102\u001a\u000201H\u0003¢\u0006\u0004\b3\u00104\"\u001c\u00107\u001a\n 6*\u0004\u0018\u000105058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/contactemail/ContactEmailViewState;", "viewState", "Lkotlin/Function1;", "", "", "onEmailChange", "onDescriptionChange", "Lkotlin/Function2;", "onOptionalFieldChange", "Lkotlin/Function3;", "", "Lcom/robinhood/models/api/pathfinder/input/OptionalField;", "onClickCta", "ContactEmailComposable", "(Lcom/robinhood/android/pathfinder/corepages/contactemail/ContactEmailViewState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "Title", "(Landroidx/compose/runtime/Composer;I)V", "Subtitle", "Lcom/robinhood/models/serverdriven/db/RichText;", "emailErrorMessage", "emailInput", "EmailAddressInput", "(Lcom/robinhood/models/serverdriven/db/RichText;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/ui/pathfinder/contexts/OptionalFieldDescription;", "optionalFields", "Lkotlinx/collections/immutable/ImmutableMap;", "optionalFieldInputs", "onValueChange", "OptionalFields", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableMap;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "descriptionInput", "DescriptionInput", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "callToAction", "", "enabled", "loading", "Lkotlin/Function0;", "onClick", BeneficiaryDetailCompose2.BENEFICIARY_DETAIL_REMOVE_CTA_BUTTON, "(Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "optionalField", "value", "DateOptionalField", "(Lcom/robinhood/models/ui/pathfinder/contexts/OptionalFieldDescription;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "EmailOptionalField", "TimeOptionalField", AnnotatedPrivateKey.LABEL, "Landroidx/compose/ui/Modifier;", "modifier", "ReadOnlyTextInput", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "j$/time/format/DateTimeFormatter", "kotlin.jvm.PlatformType", "timeFormatter", "Lj$/time/format/DateTimeFormatter;", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.pathfinder.corepages.contactemail.ContactEmailComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class ContactEmailComposable {
    private static final DateTimeFormatter timeFormatter = new DateTimeFormatterBuilder().appendValue(ChronoField.HOUR_OF_DAY, 2).appendLiteral(':').appendValue(ChronoField.MINUTE_OF_HOUR, 2).appendOffset("+HHMM", "+0000").toFormatter();

    /* compiled from: ContactEmailComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.pathfinder.corepages.contactemail.ContactEmailComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionalFieldType.values().length];
            try {
                iArr[OptionalFieldType.DATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionalFieldType.EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OptionalFieldType.TIME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OptionalFieldType.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContactEmailComposable$lambda$5(ContactEmailViewState contactEmailViewState, Function1 function1, Function1 function12, Function2 function2, Function3 function3, int i, Composer composer, int i2) {
        ContactEmailComposable(contactEmailViewState, function1, function12, function2, function3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CtaButton$lambda$12(String str, boolean z, boolean z2, Function0 function0, int i, Composer composer, int i2) {
        CtaButton(str, z, z2, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DateOptionalField$lambda$16(OptionalFieldDescription optionalFieldDescription, String str, Function2 function2, int i, Composer composer, int i2) {
        DateOptionalField(optionalFieldDescription, str, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DescriptionInput$lambda$11(String str, Function1 function1, int i, Composer composer, int i2) {
        DescriptionInput(str, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmailAddressInput$lambda$9(RichText richText, String str, Function1 function1, int i, Composer composer, int i2) {
        EmailAddressInput(richText, str, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmailOptionalField$lambda$19(OptionalFieldDescription optionalFieldDescription, String str, Function2 function2, int i, Composer composer, int i2) {
        EmailOptionalField(optionalFieldDescription, str, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionalFields$lambda$10(ImmutableList immutableList, ImmutableMap immutableMap, Function2 function2, int i, Composer composer, int i2) {
        OptionalFields(immutableList, immutableMap, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReadOnlyTextInput$lambda$26(String str, String str2, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ReadOnlyTextInput(str, str2, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Subtitle$lambda$7(int i, Composer composer, int i2) {
        Subtitle(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimeOptionalField$lambda$22(OptionalFieldDescription optionalFieldDescription, String str, Function2 function2, int i, Composer composer, int i2) {
        TimeOptionalField(optionalFieldDescription, str, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Title$lambda$6(int i, Composer composer, int i2) {
        Title(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ContactEmailComposable(final ContactEmailViewState viewState, final Function1<? super String, Unit> onEmailChange, final Function1<? super String, Unit> onDescriptionChange, final Function2<? super String, ? super String, Unit> onOptionalFieldChange, final Function3<? super String, ? super String, ? super List<OptionalField>, Unit> onClickCta, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onEmailChange, "onEmailChange");
        Intrinsics.checkNotNullParameter(onDescriptionChange, "onDescriptionChange");
        Intrinsics.checkNotNullParameter(onOptionalFieldChange, "onOptionalFieldChange");
        Intrinsics.checkNotNullParameter(onClickCta, "onClickCta");
        Composer composerStartRestartGroup = composer.startRestartGroup(151980465);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(viewState) : composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onEmailChange) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDescriptionChange) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onOptionalFieldChange) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClickCta) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(151980465, i2, -1, "com.robinhood.android.pathfinder.corepages.contactemail.ContactEmailComposable (ContactEmailComposable.kt:56)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM());
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            boolean z = false;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5142padding3ABfNKs);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Column5.weight$default(Column6.INSTANCE, ScrollKt.verticalScroll$default(companion, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), 1.0f, false, 2, null), 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Title(composerStartRestartGroup, 0);
            Subtitle(composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(1020760910);
            if (viewState instanceof ContactEmailViewState.EmailRequired) {
                ContactEmailViewState.EmailRequired emailRequired = (ContactEmailViewState.EmailRequired) viewState;
                EmailAddressInput(emailRequired.getEmailErrorMessage(), emailRequired.getEmailInput(), onEmailChange, composerStartRestartGroup, (i2 << 3) & 896);
            }
            composerStartRestartGroup.endReplaceGroup();
            int i3 = i2 >> 3;
            OptionalFields(viewState.getOptionalFields(), viewState.getOptionalFieldInputs(), onOptionalFieldChange, composerStartRestartGroup, i3 & 896);
            DescriptionInput(viewState.getDescriptionInput(), onDescriptionChange, composerStartRestartGroup, i3 & 112);
            composerStartRestartGroup.endNode();
            int i4 = i2;
            String callToAction = viewState.getCallToAction();
            boolean zIsContinueButtonEnabled = viewState.isContinueButtonEnabled();
            boolean zIsSending = viewState.isSending();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z2 = (57344 & i4) == 16384;
            if ((i4 & 14) == 4 || ((i4 & 8) != 0 && composerStartRestartGroup.changedInstance(viewState))) {
                z = true;
            }
            boolean z3 = z2 | z;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.pathfinder.corepages.contactemail.ContactEmailComposableKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ContactEmailComposable.ContactEmailComposable$lambda$4$lambda$3$lambda$2(onClickCta, viewState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            CtaButton(callToAction, zIsContinueButtonEnabled, zIsSending, (Function0) objRememberedValue, composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.contactemail.ContactEmailComposableKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ContactEmailComposable.ContactEmailComposable$lambda$5(viewState, onEmailChange, onDescriptionChange, onOptionalFieldChange, onClickCta, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContactEmailComposable$lambda$4$lambda$3$lambda$2(Function3 function3, ContactEmailViewState contactEmailViewState) {
        ContactEmailViewState.EmailRequired emailRequired = contactEmailViewState instanceof ContactEmailViewState.EmailRequired ? (ContactEmailViewState.EmailRequired) contactEmailViewState : null;
        String emailInput = emailRequired != null ? emailRequired.getEmailInput() : null;
        String descriptionInput = contactEmailViewState.getDescriptionInput();
        ImmutableMap<String, String> optionalFieldInputs = contactEmailViewState.getOptionalFieldInputs();
        ArrayList arrayList = new ArrayList(optionalFieldInputs.size());
        for (Map.Entry<String, String> entry : optionalFieldInputs.entrySet()) {
            arrayList.add(new OptionalField(entry.getKey(), entry.getValue()));
        }
        function3.invoke(emailInput, descriptionInput, arrayList);
        return Unit.INSTANCE;
    }

    private static final void Title(Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(360576537);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(360576537, i, -1, "com.robinhood.android.pathfinder.corepages.contactemail.Title (ContactEmailComposable.kt:103)");
            }
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C39352R.string.contact_email_title, composerStartRestartGroup, 0), TestTag3.testTag(Modifier.INSTANCE, "Title"), null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getDisplayCapsuleMedium(), composer2, 0, 0, 8188);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.contactemail.ContactEmailComposableKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ContactEmailComposable.Title$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Subtitle(Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1087118019);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1087118019, i, -1, "com.robinhood.android.pathfinder.corepages.contactemail.Subtitle (ContactEmailComposable.kt:112)");
            }
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C39352R.string.contact_email_subtitle, composerStartRestartGroup, 0), PaddingKt.m5146paddingqDBjuR0$default(TestTag3.testTag(Modifier.INSTANCE, "Subtitle"), 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 7, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16380);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.contactemail.ContactEmailComposableKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ContactEmailComposable.Subtitle$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void EmailAddressInput(final RichText richText, final String str, final Function1<? super String, Unit> function1, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1025030264);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(richText) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1025030264, i2, -1, "com.robinhood.android.pathfinder.corepages.contactemail.EmailAddressInput (ContactEmailComposable.kt:126)");
            }
            BentoTextInput4.BentoTextInput(new BentoTextInputState(str == null ? "" : str, null, StringResources_androidKt.stringResource(C39352R.string.contact_email_email_address_placeholder, composerStartRestartGroup, 0), null, richText != null ? new BentoTextInput8.Message.Error(richText.getText()) : null, null, null, null, false, 490, null), function1, TestTag3.testTag(Modifier.INSTANCE, "EmailAddressInput"), composerStartRestartGroup, BentoTextInputState.$stable | ((i2 >> 3) & 112), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.contactemail.ContactEmailComposableKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ContactEmailComposable.EmailAddressInput$lambda$9(richText, str, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void OptionalFields(final ImmutableList<OptionalFieldDescription> immutableList, final ImmutableMap<String, String> immutableMap, final Function2<? super String, ? super String, Unit> function2, Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1869723664);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(immutableList) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(immutableMap) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1869723664, i2, -1, "com.robinhood.android.pathfinder.corepages.contactemail.OptionalFields (ContactEmailComposable.kt:144)");
            }
            for (OptionalFieldDescription optionalFieldDescription : immutableList) {
                String str = immutableMap.get(optionalFieldDescription.getName());
                if (str == null) {
                    str = "";
                }
                int i3 = WhenMappings.$EnumSwitchMapping$0[optionalFieldDescription.getType().ordinal()];
                if (i3 == 1) {
                    composerStartRestartGroup.startReplaceGroup(-1508098874);
                    DateOptionalField(optionalFieldDescription, str, function2, composerStartRestartGroup, i2 & 896);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (i3 == 2) {
                    composerStartRestartGroup.startReplaceGroup(-1508095865);
                    EmailOptionalField(optionalFieldDescription, str, function2, composerStartRestartGroup, i2 & 896);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (i3 == 3) {
                    composerStartRestartGroup.startReplaceGroup(-1508092858);
                    TimeOptionalField(optionalFieldDescription, str, function2, composerStartRestartGroup, i2 & 896);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (i3 != 4) {
                        composerStartRestartGroup.startReplaceGroup(-1508100678);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(493855280);
                    composerStartRestartGroup.endReplaceGroup();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.contactemail.ContactEmailComposableKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ContactEmailComposable.OptionalFields$lambda$10(immutableList, immutableMap, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void DescriptionInput(final String str, final Function1<? super String, Unit> function1, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1803041691);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1803041691, i2, -1, "com.robinhood.android.pathfinder.corepages.contactemail.DescriptionInput (ContactEmailComposable.kt:160)");
            }
            BentoTextInput4.BentoTextArea(str == null ? "" : str, function1, SizeKt.m5158heightInVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(TestTag3.testTag(Modifier.INSTANCE, "DescriptionInput"), 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, C2002Dp.m7995constructorimpl(200), 1, null), null, StringResources_androidKt.stringResource(C39352R.string.contact_email_description_placeholder, composerStartRestartGroup, 0), null, null, null, null, null, false, false, null, composerStartRestartGroup, i2 & 112, 0, 8168);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.contactemail.ContactEmailComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ContactEmailComposable.DescriptionInput$lambda$11(str, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void CtaButton(final String str, final boolean z, final boolean z2, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Function0<Unit> function02;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1089421700);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function02 = function0;
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
        } else {
            function02 = function0;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1089421700, i2, -1, "com.robinhood.android.pathfinder.corepages.contactemail.CtaButton (ContactEmailComposable.kt:178)");
            }
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth(TestTag3.testTag(Modifier.INSTANCE, CreateTransferV2Composable3.ContinueButtonTag), 1.0f), 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
            composerStartRestartGroup.startReplaceGroup(-1037755484);
            String strStringResource = str == null ? StringResources_androidKt.stringResource(C39352R.string.contact_email_send, composerStartRestartGroup, 0) : str;
            composerStartRestartGroup.endReplaceGroup();
            int i3 = (i2 >> 9) & 14;
            int i4 = i2 << 12;
            composer2 = composerStartRestartGroup;
            BentoButtonKt.m20586BentoButtonEikTQX8(function02, strStringResource, modifierM5146paddingqDBjuR0$default, null, null, z, z2, null, null, null, null, false, null, composer2, i3 | (458752 & i4) | (i4 & 3670016), 0, 8088);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.contactemail.ContactEmailComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ContactEmailComposable.CtaButton$lambda$12(str, z, z2, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void DateOptionalField(final OptionalFieldDescription optionalFieldDescription, final String str, final Function2<? super String, ? super String, Unit> function2, Composer composer, final int i) {
        int i2;
        String str2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2100948378);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(optionalFieldDescription) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2100948378, i2, -1, "com.robinhood.android.pathfinder.corepages.contactemail.DateOptionalField (ContactEmailComposable.kt:196)");
            }
            try {
                LocalDateFormatter localDateFormatter = LocalDateFormatter.MEDIUM;
                LocalDate localDate = LocalDate.parse(str);
                Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
                str2 = localDateFormatter.format(localDate);
            } catch (DateTimeParseException unused) {
                str2 = "";
            }
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, "DateOptionalField");
            String displayLabel = optionalFieldDescription.getDisplayLabel();
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance = ((i2 & 896) == 256) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(optionalFieldDescription);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.pathfinder.corepages.contactemail.ContactEmailComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ContactEmailComposable.DateOptionalField$lambda$15$lambda$14(context, function2, optionalFieldDescription);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            ReadOnlyTextInput(displayLabel, str2, (Function0) objRememberedValue, modifierTestTag, composerStartRestartGroup, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.contactemail.ContactEmailComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ContactEmailComposable.DateOptionalField$lambda$16(optionalFieldDescription, str, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DateOptionalField$lambda$15$lambda$14(Context context, final Function2 function2, final OptionalFieldDescription optionalFieldDescription) {
        AppCompatActivity appCompatActivityRequireActivityBaseContext = BaseContexts.requireActivityBaseContext(context);
        MaterialDatePicker<Long> materialDatePickerBuild = MaterialDatePicker.Builder.datePicker().setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_DatePicker).build();
        materialDatePickerBuild.addOnPositiveButtonClickListener(new MaterialPickerOnPositiveButtonClickListener() { // from class: com.robinhood.android.pathfinder.corepages.contactemail.ContactEmailComposableKt$DateOptionalField$1$1$1$1
            @Override // com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener
            public final void onPositiveButtonClick(Long l) {
                Intrinsics.checkNotNull(l);
                Instant instantOfEpochMilli = Instant.ofEpochMilli(l.longValue());
                Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
                ZoneOffset UTC = ZoneOffset.UTC;
                Intrinsics.checkNotNullExpressionValue(UTC, "UTC");
                LocalDate localDate = Instants.toLocalDate(instantOfEpochMilli, UTC);
                Function2<String, String, Unit> function22 = function2;
                String name = optionalFieldDescription.getName();
                String string2 = localDate.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                function22.invoke(name, string2);
            }
        });
        materialDatePickerBuild.show(appCompatActivityRequireActivityBaseContext.getSupportFragmentManager(), "");
        return Unit.INSTANCE;
    }

    private static final void EmailOptionalField(final OptionalFieldDescription optionalFieldDescription, String str, Function2<? super String, ? super String, Unit> function2, Composer composer, final int i) {
        int i2;
        final String str2;
        Composer composer2;
        final Function2<? super String, ? super String, Unit> function22 = function2;
        Composer composerStartRestartGroup = composer.startRestartGroup(597458696);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(optionalFieldDescription) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function22) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(597458696, i2, -1, "com.robinhood.android.pathfinder.corepages.contactemail.EmailOptionalField (ContactEmailComposable.kt:235)");
            }
            composerStartRestartGroup.startReplaceGroup(-1367805016);
            BentoTextInput8.Message.Error error = (str.length() <= 0 || Validation.INSTANCE.isEmailValid(str)) ? null : new BentoTextInput8.Message.Error(StringResources_androidKt.stringResource(C39352R.string.contact_email_invalid_email_address, composerStartRestartGroup, 0));
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, "EmailOptionalField");
            int i3 = i2;
            BentoTextInputState bentoTextInputState = new BentoTextInputState(str, optionalFieldDescription.getDisplayLabel(), null, null, error, null, null, null, false, 492, null);
            str2 = str;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(optionalFieldDescription) | ((i3 & 896) == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                function22 = function2;
                objRememberedValue = new Function1() { // from class: com.robinhood.android.pathfinder.corepages.contactemail.ContactEmailComposableKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ContactEmailComposable.EmailOptionalField$lambda$18$lambda$17(function22, optionalFieldDescription, (String) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                function22 = function2;
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            BentoTextInput4.BentoTextInput(bentoTextInputState, (Function1<? super String, Unit>) objRememberedValue, modifierTestTag, composer2, BentoTextInputState.$stable, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            str2 = str;
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.contactemail.ContactEmailComposableKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ContactEmailComposable.EmailOptionalField$lambda$19(optionalFieldDescription, str2, function22, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmailOptionalField$lambda$18$lambda$17(Function2 function2, OptionalFieldDescription optionalFieldDescription, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function2.invoke(optionalFieldDescription.getName(), it);
        return Unit.INSTANCE;
    }

    private static final void TimeOptionalField(final OptionalFieldDescription optionalFieldDescription, final String str, final Function2<? super String, ? super String, Unit> function2, Composer composer, final int i) {
        int i2;
        String str2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-991795301);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(optionalFieldDescription) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-991795301, i2, -1, "com.robinhood.android.pathfinder.corepages.contactemail.TimeOptionalField (ContactEmailComposable.kt:257)");
            }
            try {
                str2 = LocalTimeFormatter.SHORT.format((LocalTimeFormatter) LocalTime.parse(str, timeFormatter));
            } catch (DateTimeParseException unused) {
                str2 = "";
            }
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, "TimeOptionalField");
            String displayLabel = optionalFieldDescription.getDisplayLabel();
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance = ((i2 & 896) == 256) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(optionalFieldDescription);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.pathfinder.corepages.contactemail.ContactEmailComposableKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ContactEmailComposable.TimeOptionalField$lambda$21$lambda$20(context, function2, optionalFieldDescription);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            ReadOnlyTextInput(displayLabel, str2, (Function0) objRememberedValue, modifierTestTag, composerStartRestartGroup, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.contactemail.ContactEmailComposableKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ContactEmailComposable.TimeOptionalField$lambda$22(optionalFieldDescription, str, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimeOptionalField$lambda$21$lambda$20(Context context, final Function2 function2, final OptionalFieldDescription optionalFieldDescription) {
        AppCompatActivity appCompatActivityRequireActivityBaseContext = BaseContexts.requireActivityBaseContext(context);
        final MaterialTimePicker materialTimePickerBuild = new MaterialTimePicker.Builder().build();
        Intrinsics.checkNotNullExpressionValue(materialTimePickerBuild, "build(...)");
        materialTimePickerBuild.addOnPositiveButtonClickListener(new View.OnClickListener() { // from class: com.robinhood.android.pathfinder.corepages.contactemail.ContactEmailComposableKt$TimeOptionalField$1$1$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OffsetTime offsetTimeAtOffset = LocalTime.m3408of(materialTimePickerBuild.getHour(), materialTimePickerBuild.getMinute()).atOffset(ZoneId.systemDefault().getRules().getOffset(Instant.now()));
                Function2<String, String, Unit> function22 = function2;
                String name = optionalFieldDescription.getName();
                String str = ContactEmailComposable.timeFormatter.format(offsetTimeAtOffset);
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                function22.invoke(name, str);
            }
        });
        materialTimePickerBuild.show(appCompatActivityRequireActivityBaseContext.getSupportFragmentManager(), "");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ReadOnlyTextInput(final String str, final String str2, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        String str3;
        int i3;
        String str4;
        Function0<Unit> function02;
        int i4;
        Modifier modifier2;
        final Modifier modifier3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1533357057);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            str3 = str;
        } else {
            str3 = str;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(str3) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            str4 = str2;
        } else {
            str4 = str2;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(str4) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                function02 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                }
                if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                } else {
                    modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1533357057, i3, -1, "com.robinhood.android.pathfinder.corepages.contactemail.ReadOnlyTextInput (ContactEmailComposable.kt:294)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierThen = modifier3.then(Intrinsic3.height(companion, Intrinsic4.Min));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierThen);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.pathfinder.corepages.contactemail.ContactEmailComposableKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ContactEmailComposable.ReadOnlyTextInput$lambda$25$lambda$24$lambda$23((String) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoTextInput4.BentoTextInput(str4, (Function1) objRememberedValue, null, str3, null, null, null, null, null, null, null, null, null, false, false, composerStartRestartGroup, ((i3 >> 3) & 14) | 48 | ((i3 << 9) & 7168), 0, 32756);
                    BoxKt.Box(ClickableKt.m4893clickableXHw0xAI$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), false, null, null, function02, 7, null), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.contactemail.ContactEmailComposableKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ContactEmailComposable.ReadOnlyTextInput$lambda$26(str, str2, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierThen2 = modifier3.then(Intrinsic3.height(companion3, Intrinsic4.Min));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierThen2);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoTextInput4.BentoTextInput(str4, (Function1) objRememberedValue, null, str3, null, null, null, null, null, null, null, null, null, false, false, composerStartRestartGroup, ((i3 >> 3) & 14) | 48 | ((i3 << 9) & 7168), 0, 32756);
                    BoxKt.Box(ClickableKt.m4893clickableXHw0xAI$default(SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), false, null, null, function02, 7, null), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        function02 = function0;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReadOnlyTextInput$lambda$25$lambda$24$lambda$23(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}

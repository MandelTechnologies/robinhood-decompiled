package com.robinhood.android.dashboard.lib;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.dashboard.lib.ModifiersKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.ComponentHierarchy;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Modifiers.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0001\u001an\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\f\b\u0002\u0010\u000f\u001a\u00060\u0010j\u0002`\u00112\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\"\u0014\u0010\u0002\u001a\u00020\u00038AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0019"}, m3636d2 = {"mergeAndSetLoadingContentDescription", "Landroidx/compose/ui/Modifier;", "StandardSectionSpacing", "Landroidx/compose/ui/unit/Dp;", "getStandardSectionSpacing", "(Landroidx/compose/runtime/Composer;I)F", "standardComponentTopPadding", "autoLogEventsWith", "logAppear", "", "logTap", "identifier", "", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "action", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "Lcom/robinhood/rosetta/eventlogging/EventAction;", "context", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "component", "Lcom/robinhood/rosetta/eventlogging/Component;", "componentHierarchy", "Lcom/robinhood/rosetta/eventlogging/ComponentHierarchy;", "lib-account-home_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class ModifiersKt {

    /* compiled from: Modifiers.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.dashboard.lib.ModifiersKt$mergeAndSetLoadingContentDescription$1 */
    static final class C136881 implements Function3<Modifier, Composer, Integer, Modifier> {
        public static final C136881 INSTANCE = new C136881();

        C136881() {
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        public final Modifier invoke(Modifier composed, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            composer.startReplaceGroup(-937070311);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-937070311, i, -1, "com.robinhood.android.dashboard.lib.mergeAndSetLoadingContentDescription.<anonymous> (Modifiers.kt:24)");
            }
            final String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_status_loading, composer, 0);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.dashboard.lib.ModifiersKt$mergeAndSetLoadingContentDescription$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ModifiersKt.C136881.invoke$lambda$1$lambda$0((SemanticsPropertyReceiver) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierSemantics = SemanticsModifier6.semantics(composed, true, (Function1) objRememberedValue);
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(strStringResource);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.dashboard.lib.ModifiersKt$mergeAndSetLoadingContentDescription$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ModifiersKt.C136881.invoke$lambda$3$lambda$2(strStringResource, (SemanticsPropertyReceiver) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            Modifier modifierClearAndSetSemantics = SemanticsModifier6.clearAndSetSemantics(modifierSemantics, (Function1) objRememberedValue2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return modifierClearAndSetSemantics;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(SemanticsPropertyReceiver semantics) {
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(String str, SemanticsPropertyReceiver clearAndSetSemantics) {
            Intrinsics.checkNotNullParameter(clearAndSetSemantics, "$this$clearAndSetSemantics");
            SemanticsPropertiesKt.setContentDescription(clearAndSetSemantics, str);
            return Unit.INSTANCE;
        }
    }

    public static final Modifier mergeAndSetLoadingContentDescription(Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return ComposedModifier2.composed$default(modifier, null, C136881.INSTANCE, 1, null);
    }

    @JvmName
    public static final float getStandardSectionSpacing(Composer composer, int i) {
        composer.startReplaceGroup(1867629514);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1867629514, i, -1, "com.robinhood.android.dashboard.lib.<get-StandardSectionSpacing> (Modifiers.kt:33)");
        }
        float fM21594getXlargeD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21594getXlargeD9Ej5fM();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return fM21594getXlargeD9Ej5fM;
    }

    public static final Modifier standardComponentTopPadding(Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return ComposedModifier2.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.robinhood.android.dashboard.lib.ModifiersKt.standardComponentTopPadding.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier composed, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceGroup(635610327);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(635610327, i, -1, "com.robinhood.android.dashboard.lib.standardComponentTopPadding.<anonymous> (Modifiers.kt:36)");
                }
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(composed, 0.0f, ModifiersKt.getStandardSectionSpacing(composer, 0), 0.0f, 0.0f, 13, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierM5146paddingqDBjuR0$default;
            }
        }, 1, null);
    }

    public static /* synthetic */ Modifier autoLogEventsWith$default(Modifier modifier, boolean z, boolean z2, String str, Screen screen, UserInteractionEventData.Action action, Context context, Component component, ComponentHierarchy componentHierarchy, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            screen = null;
        }
        if ((i & 16) != 0) {
            action = UserInteractionEventData.Action.ACTION_UNSPECIFIED;
        }
        if ((i & 32) != 0) {
            context = null;
        }
        if ((i & 64) != 0) {
            component = null;
        }
        if ((i & 128) != 0) {
            componentHierarchy = null;
        }
        return autoLogEventsWith(modifier, z, z2, str, screen, action, context, component, componentHierarchy);
    }

    public static final Modifier autoLogEventsWith(Modifier modifier, final boolean z, final boolean z2, final String str, final Screen screen, final UserInteractionEventData.Action action, final Context context, final Component component, final ComponentHierarchy componentHierarchy) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        return ComposedModifier2.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.robinhood.android.dashboard.lib.ModifiersKt.autoLogEventsWith.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier composed, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceGroup(-886803956);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-886803956, i, -1, "com.robinhood.android.dashboard.lib.autoLogEventsWith.<anonymous> (Modifiers.kt:56)");
                }
                Modifier modifierAutoLogEvents$default = com.robinhood.android.compose.autoeventlogging.ModifiersKt.autoLogEvents$default(composed, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(str, screen, action, context, component, componentHierarchy)), z, false, false, z2, false, null, 108, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierAutoLogEvents$default;
            }
        }, 1, null);
    }
}

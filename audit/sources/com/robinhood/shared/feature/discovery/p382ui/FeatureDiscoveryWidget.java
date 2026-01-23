package com.robinhood.shared.feature.discovery.p382ui;

import android.os.Parcelable;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.models.serverdriven.experimental.api.FeatureDiscovery;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery2;
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery3;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: FeatureDiscoveryWidget.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aX\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u0087\b¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"DiscoveryWidget", "", "ActionT", "Landroid/os/Parcelable;", "component", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "modifier", "Landroidx/compose/ui/Modifier;", "actionHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "isExpanded", "", "callback", "Lcom/robinhood/shared/discovery/sdui/FeatureDiscoveryCallback;", "(Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;ZLcom/robinhood/shared/discovery/sdui/FeatureDiscoveryCallback;Landroidx/compose/runtime/Composer;II)V", "lib-feature-discovery_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.feature.discovery.ui.FeatureDiscoveryWidgetKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class FeatureDiscoveryWidget {
    public static final /* synthetic */ <ActionT extends Parcelable> void DiscoveryWidget(UIComponent<? extends ActionT> component, Modifier modifier, SduiActionHandler<? super ActionT> sduiActionHandler, boolean z, SduiFeatureDiscovery2 sduiFeatureDiscovery2, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(component, "component");
        composer.startReplaceGroup(-2135521369);
        if ((i2 & 2) != 0) {
            modifier = Modifier.INSTANCE;
        }
        Modifier modifier2 = modifier;
        if ((i2 & 4) != 0) {
            sduiActionHandler = SduiActionHandler3.currentActionHandler(composer, 0);
        }
        SduiActionHandler<? super ActionT> sduiActionHandler2 = sduiActionHandler;
        if ((i2 & 8) != 0) {
            z = false;
        }
        SduiFeatureDiscovery2 sduiFeatureDiscovery22 = (i2 & 16) != 0 ? null : sduiFeatureDiscovery2;
        if (component instanceof FeatureDiscovery) {
            composer.startReplaceGroup(2033818501);
            Intrinsics.reifiedOperationMarker(4, "ActionT");
            ProvidedValue<?>[] providedValueArrProvidedValues = SduiColumns.providedValues(Parcelable.class, null);
            CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) Arrays.copyOf(providedValueArrProvidedValues, providedValueArrProvidedValues.length), ComposableLambda3.rememberComposableLambda(-919485118, true, new C389571(component, sduiActionHandler2, modifier2, z, sduiFeatureDiscovery22), composer, 54), composer, ProvidedValue.$stable | 48);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(2034805293);
            composer.startReplaceGroup(-1772220517);
            HorizontalPadding horizontalPadding = HorizontalPadding.Default;
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Horizontal start = Alignment.INSTANCE.getStart();
            Intrinsics.reifiedOperationMarker(4, "ActionT");
            SduiColumns.SduiColumn(extensions2.persistentListOf(component), Parcelable.class, modifier2, null, sduiActionHandler2, horizontalPadding, top, start, false, composer, (((((i & 112) | 12582912) | ((i << 3) & 7168)) << 3) & 58240) | 100663296, 0);
            composer.endReplaceGroup();
            composer.endReplaceGroup();
        }
        composer.endReplaceGroup();
    }

    /* compiled from: FeatureDiscoveryWidget.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    /* renamed from: com.robinhood.shared.feature.discovery.ui.FeatureDiscoveryWidgetKt$DiscoveryWidget$1 */
    public static final class C389571 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SduiActionHandler<ActionT> $actionHandler;
        final /* synthetic */ SduiFeatureDiscovery2 $callback;
        final /* synthetic */ UIComponent<ActionT> $component;
        final /* synthetic */ boolean $isExpanded;
        final /* synthetic */ Modifier $modifier;

        /* JADX WARN: Multi-variable type inference failed */
        public C389571(UIComponent<? extends ActionT> uIComponent, SduiActionHandler<? super ActionT> sduiActionHandler, Modifier modifier, boolean z, SduiFeatureDiscovery2 sduiFeatureDiscovery2) {
            this.$component = uIComponent;
            this.$actionHandler = sduiActionHandler;
            this.$modifier = modifier;
            this.$isExpanded = z;
            this.$callback = sduiFeatureDiscovery2;
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
                ComposerKt.traceEventStart(-919485118, i, -1, "com.robinhood.shared.feature.discovery.ui.DiscoveryWidget.<anonymous> (FeatureDiscoveryWidget.kt:36)");
            }
            Component.ComponentType componentType = Component.ComponentType.FEATURE_DISCOVERY_WIDGET;
            String logging_identifier = ((FeatureDiscovery) this.$component).getLogging_identifier();
            if (logging_identifier == null) {
                logging_identifier = "";
            }
            UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, null, null, null, new Component(componentType, logging_identifier, null, 4, null), null, 47, null);
            final SduiActionHandler<ActionT> sduiActionHandler = this.$actionHandler;
            final UIComponent<ActionT> uIComponent = this.$component;
            final Modifier modifier = this.$modifier;
            final boolean z = this.$isExpanded;
            final SduiFeatureDiscovery2 sduiFeatureDiscovery2 = this.$callback;
            AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(-405102483, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.feature.discovery.ui.FeatureDiscoveryWidgetKt.DiscoveryWidget.1.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    if ((i2 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-405102483, i2, -1, "com.robinhood.shared.feature.discovery.ui.DiscoveryWidget.<anonymous>.<anonymous> (FeatureDiscoveryWidget.kt:44)");
                    }
                    SduiActionHandler<ActionT> sduiActionHandler2 = sduiActionHandler;
                    final UIComponent<ActionT> uIComponent2 = uIComponent;
                    final Modifier modifier2 = modifier;
                    final boolean z2 = z;
                    final SduiFeatureDiscovery2 sduiFeatureDiscovery22 = sduiFeatureDiscovery2;
                    SduiActionHandler3.ProvideActionHandler(sduiActionHandler2, ComposableLambda3.rememberComposableLambda(357486252, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.feature.discovery.ui.FeatureDiscoveryWidgetKt.DiscoveryWidget.1.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i3) {
                            if ((i3 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(357486252, i3, -1, "com.robinhood.shared.feature.discovery.ui.DiscoveryWidget.<anonymous>.<anonymous>.<anonymous> (FeatureDiscoveryWidget.kt:45)");
                            }
                            Parcelable parcelable = uIComponent2;
                            Intrinsics.checkNotNull(parcelable, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.FeatureDiscovery<android.os.Parcelable>");
                            SduiFeatureDiscovery3.SduiFeatureDiscovery((FeatureDiscovery) parcelable, ModifiersKt.autoLogEvents$default(modifier2, null, true, false, false, false, false, null, 125, null), z2, sduiFeatureDiscovery22, composer3, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }
}

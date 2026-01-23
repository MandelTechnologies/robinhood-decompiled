package com.robinhood.shared.feature.discovery.p382ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.p320db.bonfire.FeatureDiscoveryResponse;
import com.robinhood.models.serverdriven.experimental.api.FeatureDiscovery;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery2;
import com.robinhood.shared.feature.discovery.C38951R;
import com.robinhood.shared.feature.discovery.databinding.MergeFeatureDiscoveryWidgetViewBinding;
import com.robinhood.shared.feature.discovery.p382ui.FeatureDiscoveryWidget;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Observable;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: FeatureDiscoveryWidgetView.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"Lcom/robinhood/shared/feature/discovery/ui/FeatureDiscoveryWidgetView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "setEventScreen", "(Lcom/robinhood/rosetta/eventlogging/Screen;)V", "binding", "Lcom/robinhood/shared/feature/discovery/databinding/MergeFeatureDiscoveryWidgetViewBinding;", "getBinding", "()Lcom/robinhood/shared/feature/discovery/databinding/MergeFeatureDiscoveryWidgetViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "isExpanded", "", "callback", "Lcom/robinhood/shared/discovery/sdui/FeatureDiscoveryCallback;", "bind", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/models/db/bonfire/FeatureDiscoveryResponse;", "actionHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "Companion", "lib-feature-discovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class FeatureDiscoveryWidgetView extends LinearLayout {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final SduiFeatureDiscovery2 callback;
    private Screen eventScreen;
    private boolean isExpanded;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(FeatureDiscoveryWidgetView.class, "binding", "getBinding()Lcom/robinhood/shared/feature/discovery/databinding/MergeFeatureDiscoveryWidgetViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureDiscoveryWidgetView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.binding = ViewBinding5.viewBinding(this, FeatureDiscoveryWidgetView2.INSTANCE);
        this.callback = new SduiFeatureDiscovery2() { // from class: com.robinhood.shared.feature.discovery.ui.FeatureDiscoveryWidgetView$callback$1
            @Override // com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery2
            public final void onExpanded(boolean z) {
                this.this$0.isExpanded = z;
            }
        };
        ViewGroups.inflate(this, C38951R.layout.merge_feature_discovery_widget_view, true);
    }

    public final Screen getEventScreen() {
        return this.eventScreen;
    }

    public final void setEventScreen(Screen screen) {
        this.eventScreen = screen;
    }

    private final MergeFeatureDiscoveryWidgetViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeFeatureDiscoveryWidgetViewBinding) value;
    }

    public final void bind(final FeatureDiscoveryResponse data, final SduiActionHandler<? super GenericAction> actionHandler) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        getBinding().composeView.setContent(ComposableLambda3.composableLambdaInstance(77672614, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.feature.discovery.ui.FeatureDiscoveryWidgetView.bind.1
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
                    ComposerKt.traceEventStart(77672614, i, -1, "com.robinhood.shared.feature.discovery.ui.FeatureDiscoveryWidgetView.bind.<anonymous> (FeatureDiscoveryWidgetView.kt:44)");
                }
                Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(ScarletManager2.getScarletManager(FeatureDiscoveryWidgetView.this));
                ThemesFromScarlet themesFromScarletThemesForCompose = ScarletComposeInterop.themesForCompose(ScarletManager2.getScarletManager(FeatureDiscoveryWidgetView.this));
                final FeatureDiscoveryWidgetView featureDiscoveryWidgetView = FeatureDiscoveryWidgetView.this;
                final FeatureDiscoveryResponse featureDiscoveryResponse = data;
                final SduiActionHandler<GenericAction> sduiActionHandler = actionHandler;
                BentoTheme2.BentoTheme(observableThemeChangesForCompose, themesFromScarletThemesForCompose, ComposableLambda3.rememberComposableLambda(-229088844, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.feature.discovery.ui.FeatureDiscoveryWidgetView.bind.1.1
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
                            ComposerKt.traceEventStart(-229088844, i2, -1, "com.robinhood.shared.feature.discovery.ui.FeatureDiscoveryWidgetView.bind.<anonymous>.<anonymous> (FeatureDiscoveryWidgetView.kt:48)");
                        }
                        UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, featureDiscoveryWidgetView.getEventScreen(), null, null, null, null, 61, null);
                        final FeatureDiscoveryResponse featureDiscoveryResponse2 = featureDiscoveryResponse;
                        final SduiActionHandler<GenericAction> sduiActionHandler2 = sduiActionHandler;
                        final FeatureDiscoveryWidgetView featureDiscoveryWidgetView2 = featureDiscoveryWidgetView;
                        AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(-912137751, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.feature.discovery.ui.FeatureDiscoveryWidgetView.bind.1.1.1
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
                                    ComposerKt.traceEventStart(-912137751, i3, -1, "com.robinhood.shared.feature.discovery.ui.FeatureDiscoveryWidgetView.bind.<anonymous>.<anonymous>.<anonymous> (FeatureDiscoveryWidgetView.kt:51)");
                                }
                                UIComponent<GenericAction> component = featureDiscoveryResponse2.getComponent();
                                if (component != null) {
                                    SduiActionHandler<GenericAction> sduiActionHandler3 = sduiActionHandler2;
                                    FeatureDiscoveryWidgetView featureDiscoveryWidgetView3 = featureDiscoveryWidgetView2;
                                    boolean z = featureDiscoveryWidgetView3.isExpanded;
                                    SduiFeatureDiscovery2 sduiFeatureDiscovery2 = featureDiscoveryWidgetView3.callback;
                                    composer3.startReplaceGroup(-2135521369);
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    if (component instanceof FeatureDiscovery) {
                                        composer3.startReplaceGroup(2033818501);
                                        ProvidedValue<?>[] providedValueArrProvidedValues = SduiColumns.providedValues(GenericAction.class, null);
                                        CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) Arrays.copyOf(providedValueArrProvidedValues, providedValueArrProvidedValues.length), ComposableLambda3.rememberComposableLambda(-919485118, true, new FeatureDiscoveryWidget.C389571(component, sduiActionHandler3, companion, z, sduiFeatureDiscovery2), composer3, 54), composer3, ProvidedValue.$stable | 48);
                                        composer3.endReplaceGroup();
                                    } else {
                                        composer3.startReplaceGroup(2034805293);
                                        ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(component);
                                        composer3.startReplaceGroup(-1772220517);
                                        SduiColumns.SduiColumn(immutableList3PersistentListOf, GenericAction.class, companion, null, sduiActionHandler3, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), false, composer3, 100663296, 0);
                                        composer3.endReplaceGroup();
                                        composer3.endReplaceGroup();
                                    }
                                    composer3.endReplaceGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 384, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    /* compiled from: FeatureDiscoveryWidgetView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/feature/discovery/ui/FeatureDiscoveryWidgetView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/shared/feature/discovery/ui/FeatureDiscoveryWidgetView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "lib-feature-discovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<FeatureDiscoveryWidgetView> {
        private final /* synthetic */ Inflater<FeatureDiscoveryWidgetView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public FeatureDiscoveryWidgetView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (FeatureDiscoveryWidgetView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C38951R.layout.include_feature_discovery_widget_view);
        }
    }
}

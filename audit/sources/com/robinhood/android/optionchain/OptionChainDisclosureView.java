package com.robinhood.android.optionchain;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.brokeragecontent.BrokerageDisclosure;
import com.robinhood.android.brokeragecontent.BrokerageResourceManager;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.optionchain.databinding.MergeOptionChainDisclosureBinding;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.staticcontent.model.disclosure.Disclosure;
import com.robinhood.staticcontent.util.Markwons;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Inflater;
import io.noties.markwon.Markwon;
import io.reactivex.Observable;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: OptionChainDisclosureView.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001cJ\b\u0010!\u001a\u00020\u001fH\u0014R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001a\u001a\u0010\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\u001c0\u001c0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/optionchain/OptionChainDisclosureView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "brokerageResourceManager", "Lcom/robinhood/android/brokeragecontent/BrokerageResourceManager;", "getBrokerageResourceManager", "()Lcom/robinhood/android/brokeragecontent/BrokerageResourceManager;", "setBrokerageResourceManager", "(Lcom/robinhood/android/brokeragecontent/BrokerageResourceManager;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "binding", "Lcom/robinhood/android/optionchain/databinding/MergeOptionChainDisclosureBinding;", "getBinding", "()Lcom/robinhood/android/optionchain/databinding/MergeOptionChainDisclosureBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "optionDisclosureRowModelRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/android/optionchain/OptionDisclosureRowModel;", "kotlin.jvm.PlatformType", "bind", "", "model", "onAttachedToWindow", "Companion", "feature-lib-option-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class OptionChainDisclosureView extends Hammer_OptionChainDisclosureView {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public BrokerageResourceManager brokerageResourceManager;
    public Markwon markwon;
    private final BehaviorRelay<OptionDisclosureRowModel> optionDisclosureRowModelRelay;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionChainDisclosureView.class, "binding", "getBinding()Lcom/robinhood/android/optionchain/databinding/MergeOptionChainDisclosureBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionChainDisclosureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C22987R.layout.merge_option_chain_disclosure, true);
        this.binding = ViewBinding5.viewBinding(this, OptionChainDisclosureView2.INSTANCE);
        BehaviorRelay<OptionDisclosureRowModel> behaviorRelayCreateDefault = BehaviorRelay.createDefault(new OptionDisclosureRowModel(false));
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.optionDisclosureRowModelRelay = behaviorRelayCreateDefault;
    }

    public final BrokerageResourceManager getBrokerageResourceManager() {
        BrokerageResourceManager brokerageResourceManager = this.brokerageResourceManager;
        if (brokerageResourceManager != null) {
            return brokerageResourceManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("brokerageResourceManager");
        return null;
    }

    public final void setBrokerageResourceManager(BrokerageResourceManager brokerageResourceManager) {
        Intrinsics.checkNotNullParameter(brokerageResourceManager, "<set-?>");
        this.brokerageResourceManager = brokerageResourceManager;
    }

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    private final MergeOptionChainDisclosureBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeOptionChainDisclosureBinding) value;
    }

    public final void bind(OptionDisclosureRowModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.optionDisclosureRowModelRelay.accept(model);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Observable observableSwitchMapSingle = this.optionDisclosureRowModelRelay.map(new Function() { // from class: com.robinhood.android.optionchain.OptionChainDisclosureView.onAttachedToWindow.1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(OptionDisclosureRowModel it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.isOnboardingDisclosure());
            }
        }).distinctUntilChanged().switchMapSingle(new Function() { // from class: com.robinhood.android.optionchain.OptionChainDisclosureView.onAttachedToWindow.2
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Disclosure> apply(Boolean isOnboardingDisclosure) {
                BrokerageDisclosure brokerageDisclosure;
                Intrinsics.checkNotNullParameter(isOnboardingDisclosure, "isOnboardingDisclosure");
                if (isOnboardingDisclosure.booleanValue()) {
                    brokerageDisclosure = BrokerageDisclosure.OPTIONS_CHAIN_SIDE_BY_SIDE_SPY_ONBOARDING;
                } else {
                    brokerageDisclosure = BrokerageDisclosure.OPTIONS_CHAIN_CHANCE_OF_PROFIT_DISCLOSURE;
                }
                return OptionChainDisclosureView.this.getBrokerageResourceManager().loadResource(brokerageDisclosure);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMapSingle, "switchMapSingle(...)");
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(observableSwitchMapSingle), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionchain.OptionChainDisclosureView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainDisclosureView.onAttachedToWindow$lambda$0(this.f$0, (Disclosure) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$0(OptionChainDisclosureView optionChainDisclosureView, Disclosure disclosure) {
        optionChainDisclosureView.getBinding().optionChainDisclosureContent.setText(Markwons.toSpanned$default(optionChainDisclosureView.getMarkwon(), disclosure.getContent(), null, 2, null));
        optionChainDisclosureView.getBinding().optionChainDisclosureTitle.setText(disclosure.getTitle());
        return Unit.INSTANCE;
    }

    /* compiled from: OptionChainDisclosureView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/optionchain/OptionChainDisclosureView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/optionchain/OptionChainDisclosureView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-option-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<OptionChainDisclosureView> {
        private final /* synthetic */ Inflater<OptionChainDisclosureView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public OptionChainDisclosureView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (OptionChainDisclosureView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C22987R.layout.include_option_chain_disclosure);
        }
    }
}

package com.robinhood.android.retirement.p239ui;

import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlingFragment;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RetirementRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: GenericRetirementTabFragment.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0016\u001a\u00020\u0017H\u0096\u0001R/\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR/\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u000f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/GenericRetirementTabFragment;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/GenericActionHandlingFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "<set-?>", "", "activeAccountNumber", "getActiveAccountNumber", "()Ljava/lang/String;", "setActiveAccountNumber", "(Ljava/lang/String;)V", "activeAccountNumber$delegate", "Lkotlin/properties/ReadWriteProperty;", "Lcom/robinhood/models/api/BrokerageAccountType;", "activeBrokerageAccountType", "getActiveBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "setActiveBrokerageAccountType", "(Lcom/robinhood/models/api/BrokerageAccountType;)V", "activeBrokerageAccountType$delegate", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public abstract class GenericRetirementTabFragment extends GenericActionHandlingFragment implements RegionGated, AutoLoggableFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(GenericRetirementTabFragment.class, "activeAccountNumber", "getActiveAccountNumber()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(GenericRetirementTabFragment.class, "activeBrokerageAccountType", "getActiveBrokerageAccountType()Lcom/robinhood/models/api/BrokerageAccountType;", 0))};
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(RetirementRegionGate.INSTANCE);

    /* renamed from: activeAccountNumber$delegate, reason: from kotlin metadata */
    private final Interfaces3 activeAccountNumber;

    /* renamed from: activeBrokerageAccountType$delegate, reason: from kotlin metadata */
    private final Interfaces3 activeBrokerageAccountType;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public GenericRetirementTabFragment() {
        Interfaces<Object, Interfaces3<Object, String>> interfacesSavedString = BindSavedState2.savedString(this);
        KProperty<?>[] kPropertyArr = $$delegatedProperties;
        this.activeAccountNumber = interfacesSavedString.provideDelegate(this, kPropertyArr[0]);
        this.activeBrokerageAccountType = (Interfaces3) BindSavedState2.savedSerializable(this).provideDelegate(this, kPropertyArr[1]);
    }

    public final String getActiveAccountNumber() {
        return (String) this.activeAccountNumber.getValue(this, $$delegatedProperties[0]);
    }

    public final void setActiveAccountNumber(String str) {
        this.activeAccountNumber.setValue(this, $$delegatedProperties[0], str);
    }

    public final BrokerageAccountType getActiveBrokerageAccountType() {
        return (BrokerageAccountType) this.activeBrokerageAccountType.getValue(this, $$delegatedProperties[1]);
    }

    public final void setActiveBrokerageAccountType(BrokerageAccountType brokerageAccountType) {
        this.activeBrokerageAccountType.setValue(this, $$delegatedProperties[1], brokerageAccountType);
    }
}

package com.robinhood.android.widget.p277ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.preference.Preference;
import com.robinhood.android.common.p088ui.BindResourcesKt;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.FuturesTradingRegionGate;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.widget.C31480R;
import com.robinhood.android.widget.util.NonPersistentListPreference;
import com.robinhood.android.widget.util.PortfolioWidgetInfo;
import com.robinhood.android.widget.util.PortfolioWidgetInfoPref;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.ObservablesAndroid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: PortfolioWidgetConfigurationFragment.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 L2\u00020\u00012\u00020\u0002:\u0002KLB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<H\u0017J\u0010\u0010=\u001a\u00020:2\u0006\u0010>\u001a\u00020?H\u0016J\u001c\u0010@\u001a\u00020:2\b\u0010A\u001a\u0004\u0018\u00010B2\b\u0010C\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010D\u001a\u00020:2\b\u0010A\u001a\u0004\u0018\u00010BH\u0016J\u001a\u0010E\u001a\u00020:2\u0006\u0010F\u001a\u00020\u00122\b\u0010G\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010H\u001a\u00020IH\u0016J\b\u0010J\u001a\u00020:H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0018\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001b\u0010\u0014R\u001b\u0010\u001d\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b\u001e\u0010\u0014R\u001b\u0010 \u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0016\u001a\u0004\b!\u0010\u0014R\u001b\u0010#\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0016\u001a\u0004\b$\u0010\u0014R\u001b\u0010&\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0016\u001a\u0004\b'\u0010\u0014R\u001b\u0010)\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b+\u0010,R\u000e\u0010/\u001a\u000200X\u0082.¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082.¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000202X\u0082.¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000202X\u0082.¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000202X\u0082.¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000202X\u0082.¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000202X\u0082.¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000202X\u0082.¢\u0006\u0002\n\u0000¨\u0006M"}, m3636d2 = {"Lcom/robinhood/android/widget/ui/PortfolioWidgetConfigurationFragment;", "Lcom/robinhood/android/common/ui/BasePreferenceFragment;", "Lcom/robinhood/android/widget/util/NonPersistentListPreference$Listener;", "<init>", "()V", "widgetInfoPref", "Lcom/robinhood/android/widget/util/PortfolioWidgetInfoPref;", "getWidgetInfoPref", "()Lcom/robinhood/android/widget/util/PortfolioWidgetInfoPref;", "setWidgetInfoPref", "(Lcom/robinhood/android/widget/util/PortfolioWidgetInfoPref;)V", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "getRegionGateProvider", "()Lcom/robinhood/android/regiongate/RegionGateProvider;", "setRegionGateProvider", "(Lcom/robinhood/android/regiongate/RegionGateProvider;)V", "periodKey", "", "getPeriodKey", "()Ljava/lang/String;", "periodKey$delegate", "Lkotlin/properties/ReadOnlyProperty;", "cryptoKey", "getCryptoKey", "cryptoKey$delegate", "optionKey", "getOptionKey", "optionKey$delegate", "instrumentsKey", "getInstrumentsKey", "instrumentsKey$delegate", "futuresKey", "getFuturesKey", "futuresKey$delegate", "curatedListsKey", "getCuratedListsKey", "curatedListsKey$delegate", "viewOptionKey", "getViewOptionKey", "viewOptionKey$delegate", PortfolioWidgetConfigurationFragment.EXTRA_APPWIDGET_ID, "", "getAppWidgetId", "()I", "appWidgetId$delegate", "Lkotlin/Lazy;", "widgetInfo", "Lcom/robinhood/android/widget/util/PortfolioWidgetInfo;", "periodPreference", "Lcom/robinhood/android/widget/util/NonPersistentListPreference;", "cryptoPreference", "optionPreference", "instrumentPreference", "futuresPreference", "curatedListsPreference", "viewOptionPreference", "onAttach", "", "context", "Landroid/content/Context;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onCreatePreferences", "savedInstanceState", "Landroid/os/Bundle;", "rootKey", "onCreate", "onPreferenceChanged", "preferenceKey", "value", "onBackPressed", "", "refreshUi", "Callbacks", "Companion", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class PortfolioWidgetConfigurationFragment extends Hammer_PortfolioWidgetConfigurationFragment implements NonPersistentListPreference.Listener {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(PortfolioWidgetConfigurationFragment.class, "periodKey", "getPeriodKey()Ljava/lang/String;", 0)), Reflection.property1(new PropertyReference1Impl(PortfolioWidgetConfigurationFragment.class, "cryptoKey", "getCryptoKey()Ljava/lang/String;", 0)), Reflection.property1(new PropertyReference1Impl(PortfolioWidgetConfigurationFragment.class, "optionKey", "getOptionKey()Ljava/lang/String;", 0)), Reflection.property1(new PropertyReference1Impl(PortfolioWidgetConfigurationFragment.class, "instrumentsKey", "getInstrumentsKey()Ljava/lang/String;", 0)), Reflection.property1(new PropertyReference1Impl(PortfolioWidgetConfigurationFragment.class, "futuresKey", "getFuturesKey()Ljava/lang/String;", 0)), Reflection.property1(new PropertyReference1Impl(PortfolioWidgetConfigurationFragment.class, "curatedListsKey", "getCuratedListsKey()Ljava/lang/String;", 0)), Reflection.property1(new PropertyReference1Impl(PortfolioWidgetConfigurationFragment.class, "viewOptionKey", "getViewOptionKey()Ljava/lang/String;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String EXTRA_APPWIDGET_ID = "appWidgetId";

    /* renamed from: appWidgetId$delegate, reason: from kotlin metadata */
    private final Lazy appWidgetId;

    /* renamed from: cryptoKey$delegate, reason: from kotlin metadata */
    private final Interfaces2 cryptoKey;
    private NonPersistentListPreference cryptoPreference;

    /* renamed from: curatedListsKey$delegate, reason: from kotlin metadata */
    private final Interfaces2 curatedListsKey;
    private NonPersistentListPreference curatedListsPreference;

    /* renamed from: futuresKey$delegate, reason: from kotlin metadata */
    private final Interfaces2 futuresKey;
    private NonPersistentListPreference futuresPreference;
    private NonPersistentListPreference instrumentPreference;

    /* renamed from: instrumentsKey$delegate, reason: from kotlin metadata */
    private final Interfaces2 instrumentsKey;

    /* renamed from: optionKey$delegate, reason: from kotlin metadata */
    private final Interfaces2 optionKey;
    private NonPersistentListPreference optionPreference;

    /* renamed from: periodKey$delegate, reason: from kotlin metadata */
    private final Interfaces2 periodKey;
    private NonPersistentListPreference periodPreference;
    public RegionGateProvider regionGateProvider;

    /* renamed from: viewOptionKey$delegate, reason: from kotlin metadata */
    private final Interfaces2 viewOptionKey;
    private NonPersistentListPreference viewOptionPreference;
    private PortfolioWidgetInfo widgetInfo;
    public PortfolioWidgetInfoPref widgetInfoPref;

    /* compiled from: PortfolioWidgetConfigurationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/widget/ui/PortfolioWidgetConfigurationFragment$Callbacks;", "", "onAddWidget", "", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAddWidget();
    }

    @JvmStatic
    public static final PortfolioWidgetConfigurationFragment newInstance(int i) {
        return INSTANCE.newInstance(i);
    }

    public PortfolioWidgetConfigurationFragment() {
        super(null);
        this.periodKey = BindResourcesKt.bindString(this, C31480R.string.widget_portfolio_key_refresh_period);
        this.cryptoKey = BindResourcesKt.bindString(this, C31480R.string.widget_portfolio_key_crypto);
        this.optionKey = BindResourcesKt.bindString(this, C31480R.string.widget_portfolio_key_option);
        this.instrumentsKey = BindResourcesKt.bindString(this, C31480R.string.widget_portfolio_key_instruments);
        this.futuresKey = BindResourcesKt.bindString(this, C31480R.string.widget_portfolio_key_futures);
        this.curatedListsKey = BindResourcesKt.bindString(this, C31480R.string.widget_portfolio_key_curated_lists);
        this.viewOptionKey = BindResourcesKt.bindString(this, C31480R.string.widget_portfolio_key_view_option);
        this.appWidgetId = Fragments2.argument(this, EXTRA_APPWIDGET_ID);
    }

    public final PortfolioWidgetInfoPref getWidgetInfoPref() {
        PortfolioWidgetInfoPref portfolioWidgetInfoPref = this.widgetInfoPref;
        if (portfolioWidgetInfoPref != null) {
            return portfolioWidgetInfoPref;
        }
        Intrinsics.throwUninitializedPropertyAccessException("widgetInfoPref");
        return null;
    }

    public final void setWidgetInfoPref(PortfolioWidgetInfoPref portfolioWidgetInfoPref) {
        Intrinsics.checkNotNullParameter(portfolioWidgetInfoPref, "<set-?>");
        this.widgetInfoPref = portfolioWidgetInfoPref;
    }

    public final RegionGateProvider getRegionGateProvider() {
        RegionGateProvider regionGateProvider = this.regionGateProvider;
        if (regionGateProvider != null) {
            return regionGateProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("regionGateProvider");
        return null;
    }

    public final void setRegionGateProvider(RegionGateProvider regionGateProvider) {
        Intrinsics.checkNotNullParameter(regionGateProvider, "<set-?>");
        this.regionGateProvider = regionGateProvider;
    }

    private final String getPeriodKey() {
        return (String) this.periodKey.getValue(this, $$delegatedProperties[0]);
    }

    private final String getCryptoKey() {
        return (String) this.cryptoKey.getValue(this, $$delegatedProperties[1]);
    }

    private final String getOptionKey() {
        return (String) this.optionKey.getValue(this, $$delegatedProperties[2]);
    }

    private final String getInstrumentsKey() {
        return (String) this.instrumentsKey.getValue(this, $$delegatedProperties[3]);
    }

    private final String getFuturesKey() {
        return (String) this.futuresKey.getValue(this, $$delegatedProperties[4]);
    }

    private final String getCuratedListsKey() {
        return (String) this.curatedListsKey.getValue(this, $$delegatedProperties[5]);
    }

    private final String getViewOptionKey() {
        return (String) this.viewOptionKey.getValue(this, $$delegatedProperties[6]);
    }

    private final int getAppWidgetId() {
        return ((Number) this.appWidgetId.getValue()).intValue();
    }

    @Override // com.robinhood.android.widget.p277ui.Hammer_PortfolioWidgetConfigurationFragment, com.robinhood.android.common.p088ui.Hammer_BasePreferenceFragment, com.robinhood.android.common.p088ui.RxPreferenceFragment, com.robinhood.android.common.p088ui.Hammer_RxPreferenceFragment, androidx.fragment.app.Fragment
    @SuppressLint({"MissingSuperCall"})
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        Preconditions.checkImplementsInterface(context, Callbacks.class);
    }

    @Override // com.robinhood.android.common.p088ui.BasePreferenceFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle(getString(C31480R.string.widget_portfolio_config_title));
    }

    @Override // androidx.preference.PreferenceFragmentCompat
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        PortfolioWidgetInfo portfolioWidgetInfo;
        addPreferencesFromResource(C31480R.xml.widget_portfolio_settings);
        if (getAppWidgetId() == 0) {
            throw new IllegalStateException("Must provide widget id");
        }
        this.widgetInfo = getWidgetInfoPref().get(getAppWidgetId());
        NonPersistentListPreference nonPersistentListPreference = null;
        if (!getWidgetInfoPref().isSet(getAppWidgetId())) {
            PortfolioWidgetInfo portfolioWidgetInfo2 = this.widgetInfo;
            if (portfolioWidgetInfo2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("widgetInfo");
                portfolioWidgetInfo = null;
            } else {
                portfolioWidgetInfo = portfolioWidgetInfo2;
            }
            PortfolioWidgetInfo.DisplayedSecurity displayedSecurity = PortfolioWidgetInfo.DisplayedSecurity.POSITIONS;
            this.widgetInfo = PortfolioWidgetInfo.copy$default(portfolioWidgetInfo, null, displayedSecurity, displayedSecurity, null, null, PortfolioWidgetInfo.DisplayedLists.ALL, null, 0, 0, 0, 0, 2009, null);
            PortfolioWidgetInfoPref widgetInfoPref = getWidgetInfoPref();
            int appWidgetId = getAppWidgetId();
            PortfolioWidgetInfo portfolioWidgetInfo3 = this.widgetInfo;
            if (portfolioWidgetInfo3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("widgetInfo");
                portfolioWidgetInfo3 = null;
            }
            widgetInfoPref.set(appWidgetId, portfolioWidgetInfo3);
        }
        Preference preferenceFindPreference = findPreference(getPeriodKey());
        Intrinsics.checkNotNull(preferenceFindPreference);
        NonPersistentListPreference nonPersistentListPreference2 = (NonPersistentListPreference) preferenceFindPreference;
        nonPersistentListPreference2.setListener(this);
        EnumEntries<PortfolioWidgetInfo.UpdatePeriod> entries = PortfolioWidgetInfo.UpdatePeriod.getEntries();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(entries, 10));
        Iterator<PortfolioWidgetInfo.UpdatePeriod> it = entries.iterator();
        while (it.hasNext()) {
            arrayList.add(getResources().getString(it.next().getDisplayNameResId()));
        }
        nonPersistentListPreference2.setEntries((CharSequence[]) arrayList.toArray(new String[0]));
        EnumEntries<PortfolioWidgetInfo.UpdatePeriod> entries2 = PortfolioWidgetInfo.UpdatePeriod.getEntries();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(entries2, 10));
        Iterator<PortfolioWidgetInfo.UpdatePeriod> it2 = entries2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next().name());
        }
        nonPersistentListPreference2.setEntryValues((CharSequence[]) arrayList2.toArray(new String[0]));
        this.periodPreference = nonPersistentListPreference2;
        Preference preferenceFindPreference2 = findPreference(getCryptoKey());
        Intrinsics.checkNotNull(preferenceFindPreference2);
        NonPersistentListPreference nonPersistentListPreference3 = (NonPersistentListPreference) preferenceFindPreference2;
        nonPersistentListPreference3.setListener(this);
        PortfolioWidgetInfo.DisplayedSecurity[] displayedSecurityArr = (PortfolioWidgetInfo.DisplayedSecurity[]) PortfolioWidgetInfo.DisplayedSecurity.getEntries().toArray(new PortfolioWidgetInfo.DisplayedSecurity[0]);
        ArrayList arrayList3 = new ArrayList(displayedSecurityArr.length);
        for (PortfolioWidgetInfo.DisplayedSecurity displayedSecurity2 : displayedSecurityArr) {
            arrayList3.add(getResources().getString(displayedSecurity2.getDisplayNameResId()));
        }
        nonPersistentListPreference3.setEntries((CharSequence[]) arrayList3.toArray(new String[0]));
        ArrayList arrayList4 = new ArrayList(displayedSecurityArr.length);
        for (PortfolioWidgetInfo.DisplayedSecurity displayedSecurity3 : displayedSecurityArr) {
            arrayList4.add(displayedSecurity3.name());
        }
        nonPersistentListPreference3.setEntryValues((CharSequence[]) arrayList4.toArray(new String[0]));
        this.cryptoPreference = nonPersistentListPreference3;
        Preference preferenceFindPreference3 = findPreference(getOptionKey());
        Intrinsics.checkNotNull(preferenceFindPreference3);
        NonPersistentListPreference nonPersistentListPreference4 = (NonPersistentListPreference) preferenceFindPreference3;
        nonPersistentListPreference4.setListener(this);
        List listListOf = CollectionsKt.listOf((Object[]) new PortfolioWidgetInfo.DisplayedSecurity[]{PortfolioWidgetInfo.DisplayedSecurity.NONE, PortfolioWidgetInfo.DisplayedSecurity.POSITIONS});
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf, 10));
        Iterator it3 = listListOf.iterator();
        while (it3.hasNext()) {
            arrayList5.add(getResources().getString(((PortfolioWidgetInfo.DisplayedSecurity) it3.next()).getDisplayNameResId()));
        }
        nonPersistentListPreference4.setEntries((CharSequence[]) arrayList5.toArray(new String[0]));
        ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf, 10));
        Iterator it4 = listListOf.iterator();
        while (it4.hasNext()) {
            arrayList6.add(((PortfolioWidgetInfo.DisplayedSecurity) it4.next()).name());
        }
        nonPersistentListPreference4.setEntryValues((CharSequence[]) arrayList6.toArray(new String[0]));
        this.optionPreference = nonPersistentListPreference4;
        Preference preferenceFindPreference4 = findPreference(getInstrumentsKey());
        Intrinsics.checkNotNull(preferenceFindPreference4);
        NonPersistentListPreference nonPersistentListPreference5 = (NonPersistentListPreference) preferenceFindPreference4;
        nonPersistentListPreference5.setListener(this);
        PortfolioWidgetInfoPref widgetInfoPref2 = getWidgetInfoPref();
        int appWidgetId2 = getAppWidgetId();
        PortfolioWidgetInfo portfolioWidgetInfo4 = this.widgetInfo;
        if (portfolioWidgetInfo4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("widgetInfo");
            portfolioWidgetInfo4 = null;
        }
        widgetInfoPref2.set(appWidgetId2, portfolioWidgetInfo4);
        PortfolioWidgetInfo.DisplayedSecurity[] displayedSecurityArr2 = (PortfolioWidgetInfo.DisplayedSecurity[]) PortfolioWidgetInfo.DisplayedSecurity.getEntries().toArray(new PortfolioWidgetInfo.DisplayedSecurity[0]);
        ArrayList arrayList7 = new ArrayList(displayedSecurityArr2.length);
        for (PortfolioWidgetInfo.DisplayedSecurity displayedSecurity4 : displayedSecurityArr2) {
            arrayList7.add(getResources().getString(displayedSecurity4.getDisplayNameResId()));
        }
        nonPersistentListPreference5.setEntries((CharSequence[]) arrayList7.toArray(new String[0]));
        ArrayList arrayList8 = new ArrayList(displayedSecurityArr2.length);
        for (PortfolioWidgetInfo.DisplayedSecurity displayedSecurity5 : displayedSecurityArr2) {
            arrayList8.add(displayedSecurity5.name());
        }
        nonPersistentListPreference5.setEntryValues((CharSequence[]) arrayList8.toArray(new String[0]));
        this.instrumentPreference = nonPersistentListPreference5;
        Preference preferenceFindPreference5 = findPreference(getFuturesKey());
        if (preferenceFindPreference5 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        NonPersistentListPreference nonPersistentListPreference6 = (NonPersistentListPreference) preferenceFindPreference5;
        nonPersistentListPreference6.setListener(this);
        PortfolioWidgetInfoPref widgetInfoPref3 = getWidgetInfoPref();
        int appWidgetId3 = getAppWidgetId();
        PortfolioWidgetInfo portfolioWidgetInfo5 = this.widgetInfo;
        if (portfolioWidgetInfo5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("widgetInfo");
            portfolioWidgetInfo5 = null;
        }
        widgetInfoPref3.set(appWidgetId3, portfolioWidgetInfo5);
        PortfolioWidgetInfo.DisplayedSecurity[] displayedSecurityArr3 = (PortfolioWidgetInfo.DisplayedSecurity[]) PortfolioWidgetInfo.DisplayedSecurity.getEntries().toArray(new PortfolioWidgetInfo.DisplayedSecurity[0]);
        ArrayList arrayList9 = new ArrayList(displayedSecurityArr3.length);
        for (PortfolioWidgetInfo.DisplayedSecurity displayedSecurity6 : displayedSecurityArr3) {
            arrayList9.add(getResources().getString(displayedSecurity6.getDisplayNameResId()));
        }
        nonPersistentListPreference6.setEntries((CharSequence[]) arrayList9.toArray(new String[0]));
        ArrayList arrayList10 = new ArrayList(displayedSecurityArr3.length);
        for (PortfolioWidgetInfo.DisplayedSecurity displayedSecurity7 : displayedSecurityArr3) {
            arrayList10.add(displayedSecurity7.name());
        }
        nonPersistentListPreference6.setEntryValues((CharSequence[]) arrayList10.toArray(new String[0]));
        this.futuresPreference = nonPersistentListPreference6;
        Preference preferenceFindPreference6 = findPreference(getCuratedListsKey());
        Intrinsics.checkNotNull(preferenceFindPreference6);
        NonPersistentListPreference nonPersistentListPreference7 = (NonPersistentListPreference) preferenceFindPreference6;
        this.curatedListsPreference = nonPersistentListPreference7;
        if (nonPersistentListPreference7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("curatedListsPreference");
        } else {
            nonPersistentListPreference = nonPersistentListPreference7;
        }
        nonPersistentListPreference.setVisible(true);
        nonPersistentListPreference.setListener(this);
        List listListOf2 = CollectionsKt.listOf((Object[]) new PortfolioWidgetInfo.DisplayedLists[]{PortfolioWidgetInfo.DisplayedLists.NONE, PortfolioWidgetInfo.DisplayedLists.ALL});
        ArrayList arrayList11 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf2, 10));
        Iterator it5 = listListOf2.iterator();
        while (it5.hasNext()) {
            arrayList11.add(getResources().getString(((PortfolioWidgetInfo.DisplayedLists) it5.next()).getDisplayNameResId()));
        }
        nonPersistentListPreference.setEntries((CharSequence[]) arrayList11.toArray(new String[0]));
        ArrayList arrayList12 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf2, 10));
        Iterator it6 = listListOf2.iterator();
        while (it6.hasNext()) {
            arrayList12.add(((PortfolioWidgetInfo.DisplayedLists) it6.next()).name());
        }
        nonPersistentListPreference.setEntryValues((CharSequence[]) arrayList12.toArray(new String[0]));
        Preference preferenceFindPreference7 = findPreference(getViewOptionKey());
        Intrinsics.checkNotNull(preferenceFindPreference7);
        NonPersistentListPreference nonPersistentListPreference8 = (NonPersistentListPreference) preferenceFindPreference7;
        nonPersistentListPreference8.setListener(this);
        EnumEntries<PortfolioWidgetInfo.ViewOption> entries3 = PortfolioWidgetInfo.ViewOption.getEntries();
        ArrayList arrayList13 = new ArrayList(CollectionsKt.collectionSizeOrDefault(entries3, 10));
        Iterator<PortfolioWidgetInfo.ViewOption> it7 = entries3.iterator();
        while (it7.hasNext()) {
            arrayList13.add(getResources().getString(it7.next().getDisplayNameResId()));
        }
        nonPersistentListPreference8.setEntries((CharSequence[]) arrayList13.toArray(new String[0]));
        EnumEntries<PortfolioWidgetInfo.ViewOption> entries4 = PortfolioWidgetInfo.ViewOption.getEntries();
        ArrayList arrayList14 = new ArrayList(CollectionsKt.collectionSizeOrDefault(entries4, 10));
        Iterator<PortfolioWidgetInfo.ViewOption> it8 = entries4.iterator();
        while (it8.hasNext()) {
            arrayList14.add(it8.next().name());
        }
        nonPersistentListPreference8.setEntryValues((CharSequence[]) arrayList14.toArray(new String[0]));
        this.viewOptionPreference = nonPersistentListPreference8;
        refreshUi();
    }

    @Override // com.robinhood.android.common.p088ui.RxPreferenceFragment, androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(RegionGateProvider.DefaultImpls.streamRegionGateState$default(getRegionGateProvider(), CryptoRegionGate.INSTANCE, false, 2, null)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.widget.ui.PortfolioWidgetConfigurationFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PortfolioWidgetConfigurationFragment.onCreate$lambda$22(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(RegionGateProvider.DefaultImpls.streamRegionGateState$default(getRegionGateProvider(), OptionsRegionGate.INSTANCE, false, 2, null)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.widget.ui.PortfolioWidgetConfigurationFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PortfolioWidgetConfigurationFragment.onCreate$lambda$23(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(RegionGateProvider.DefaultImpls.streamRegionGateState$default(getRegionGateProvider(), FuturesTradingRegionGate.INSTANCE, false, 2, null)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.widget.ui.PortfolioWidgetConfigurationFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PortfolioWidgetConfigurationFragment.onCreate$lambda$24(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$22(PortfolioWidgetConfigurationFragment portfolioWidgetConfigurationFragment, boolean z) {
        NonPersistentListPreference nonPersistentListPreference = portfolioWidgetConfigurationFragment.cryptoPreference;
        if (nonPersistentListPreference == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cryptoPreference");
            nonPersistentListPreference = null;
        }
        nonPersistentListPreference.setVisible(z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$23(PortfolioWidgetConfigurationFragment portfolioWidgetConfigurationFragment, boolean z) {
        NonPersistentListPreference nonPersistentListPreference = portfolioWidgetConfigurationFragment.optionPreference;
        if (nonPersistentListPreference == null) {
            Intrinsics.throwUninitializedPropertyAccessException("optionPreference");
            nonPersistentListPreference = null;
        }
        nonPersistentListPreference.setVisible(z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$24(PortfolioWidgetConfigurationFragment portfolioWidgetConfigurationFragment, boolean z) {
        NonPersistentListPreference nonPersistentListPreference = portfolioWidgetConfigurationFragment.futuresPreference;
        if (nonPersistentListPreference == null) {
            Intrinsics.throwUninitializedPropertyAccessException("futuresPreference");
            nonPersistentListPreference = null;
        }
        nonPersistentListPreference.setVisible(z);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017d  */
    @Override // com.robinhood.android.widget.util.NonPersistentListPreference.Listener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onPreferenceChanged(String preferenceKey, String value) {
        PortfolioWidgetInfo portfolioWidgetInfo;
        PortfolioWidgetInfo portfolioWidgetInfoCopy$default;
        PortfolioWidgetInfo portfolioWidgetInfo2;
        PortfolioWidgetInfo portfolioWidgetInfo3;
        PortfolioWidgetInfo.ViewOption viewOption;
        PortfolioWidgetInfo portfolioWidgetInfo4;
        PortfolioWidgetInfo.ViewOption viewOption2;
        PortfolioWidgetInfo portfolioWidgetInfo5;
        PortfolioWidgetInfo portfolioWidgetInfo6;
        PortfolioWidgetInfo.ViewOption viewOption3;
        PortfolioWidgetInfo portfolioWidgetInfo7;
        Intrinsics.checkNotNullParameter(preferenceKey, "preferenceKey");
        if (value == null) {
            return;
        }
        PortfolioWidgetInfo portfolioWidgetInfo8 = null;
        if (Intrinsics.areEqual(preferenceKey, getPeriodKey())) {
            PortfolioWidgetInfo portfolioWidgetInfo9 = this.widgetInfo;
            if (portfolioWidgetInfo9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("widgetInfo");
                portfolioWidgetInfo7 = null;
            } else {
                portfolioWidgetInfo7 = portfolioWidgetInfo9;
            }
            portfolioWidgetInfoCopy$default = PortfolioWidgetInfo.copy$default(portfolioWidgetInfo7, PortfolioWidgetInfo.UpdatePeriod.valueOf(value), null, null, null, null, null, null, 0, 0, 0, 0, 2046, null);
        } else if (Intrinsics.areEqual(preferenceKey, getCryptoKey())) {
            PortfolioWidgetInfo portfolioWidgetInfo10 = this.widgetInfo;
            if (portfolioWidgetInfo10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("widgetInfo");
                portfolioWidgetInfo6 = null;
            } else {
                portfolioWidgetInfo6 = portfolioWidgetInfo10;
            }
            PortfolioWidgetInfo.DisplayedSecurity displayedSecurityValueOf = PortfolioWidgetInfo.DisplayedSecurity.valueOf(value);
            PortfolioWidgetInfo portfolioWidgetInfo11 = this.widgetInfo;
            if (portfolioWidgetInfo11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("widgetInfo");
                portfolioWidgetInfo11 = null;
            }
            if (portfolioWidgetInfo11.getViewOption() == PortfolioWidgetInfo.ViewOption.EQUITY) {
                PortfolioWidgetInfo.DisplayedSecurity[] displayedSecurityArr = {PortfolioWidgetInfo.DisplayedSecurity.POSITIONS, PortfolioWidgetInfo.DisplayedSecurity.NONE};
                PortfolioWidgetInfo portfolioWidgetInfo12 = this.widgetInfo;
                if (portfolioWidgetInfo12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("widgetInfo");
                    portfolioWidgetInfo12 = null;
                }
                if (ArraysKt.contains(displayedSecurityArr, portfolioWidgetInfo12.getDisplayedCrypto())) {
                    PortfolioWidgetInfo portfolioWidgetInfo13 = this.widgetInfo;
                    if (portfolioWidgetInfo13 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("widgetInfo");
                        portfolioWidgetInfo13 = null;
                    }
                    viewOption3 = portfolioWidgetInfo13.getViewOption();
                } else {
                    viewOption3 = PortfolioWidgetInfo.ViewOption.QUOTE;
                }
                portfolioWidgetInfoCopy$default = PortfolioWidgetInfo.copy$default(portfolioWidgetInfo6, null, displayedSecurityValueOf, null, null, null, null, viewOption3, 0, 0, 0, 0, 1981, null);
            }
        } else if (Intrinsics.areEqual(preferenceKey, getOptionKey())) {
            PortfolioWidgetInfo portfolioWidgetInfo14 = this.widgetInfo;
            if (portfolioWidgetInfo14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("widgetInfo");
                portfolioWidgetInfo5 = null;
            } else {
                portfolioWidgetInfo5 = portfolioWidgetInfo14;
            }
            portfolioWidgetInfoCopy$default = PortfolioWidgetInfo.copy$default(portfolioWidgetInfo5, null, null, PortfolioWidgetInfo.DisplayedSecurity.valueOf(value), null, null, null, null, 0, 0, 0, 0, 2043, null);
        } else if (Intrinsics.areEqual(preferenceKey, getInstrumentsKey())) {
            PortfolioWidgetInfo portfolioWidgetInfo15 = this.widgetInfo;
            if (portfolioWidgetInfo15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("widgetInfo");
                portfolioWidgetInfo4 = null;
            } else {
                portfolioWidgetInfo4 = portfolioWidgetInfo15;
            }
            PortfolioWidgetInfo.DisplayedSecurity displayedSecurityValueOf2 = PortfolioWidgetInfo.DisplayedSecurity.valueOf(value);
            PortfolioWidgetInfo portfolioWidgetInfo16 = this.widgetInfo;
            if (portfolioWidgetInfo16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("widgetInfo");
                portfolioWidgetInfo16 = null;
            }
            if (portfolioWidgetInfo16.getViewOption() == PortfolioWidgetInfo.ViewOption.EQUITY) {
                PortfolioWidgetInfo.DisplayedSecurity[] displayedSecurityArr2 = {PortfolioWidgetInfo.DisplayedSecurity.POSITIONS, PortfolioWidgetInfo.DisplayedSecurity.NONE};
                PortfolioWidgetInfo portfolioWidgetInfo17 = this.widgetInfo;
                if (portfolioWidgetInfo17 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("widgetInfo");
                    portfolioWidgetInfo17 = null;
                }
                if (ArraysKt.contains(displayedSecurityArr2, portfolioWidgetInfo17.getDisplayedEquity())) {
                    PortfolioWidgetInfo portfolioWidgetInfo18 = this.widgetInfo;
                    if (portfolioWidgetInfo18 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("widgetInfo");
                        portfolioWidgetInfo18 = null;
                    }
                    viewOption2 = portfolioWidgetInfo18.getViewOption();
                } else {
                    viewOption2 = PortfolioWidgetInfo.ViewOption.QUOTE;
                }
                portfolioWidgetInfoCopy$default = PortfolioWidgetInfo.copy$default(portfolioWidgetInfo4, null, null, null, displayedSecurityValueOf2, null, null, viewOption2, 0, 0, 0, 0, 1975, null);
            }
        } else if (Intrinsics.areEqual(preferenceKey, getFuturesKey())) {
            PortfolioWidgetInfo portfolioWidgetInfo19 = this.widgetInfo;
            if (portfolioWidgetInfo19 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("widgetInfo");
                portfolioWidgetInfo3 = null;
            } else {
                portfolioWidgetInfo3 = portfolioWidgetInfo19;
            }
            PortfolioWidgetInfo.DisplayedSecurity displayedSecurityValueOf3 = PortfolioWidgetInfo.DisplayedSecurity.valueOf(value);
            PortfolioWidgetInfo portfolioWidgetInfo20 = this.widgetInfo;
            if (portfolioWidgetInfo20 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("widgetInfo");
                portfolioWidgetInfo20 = null;
            }
            if (portfolioWidgetInfo20.getViewOption() == PortfolioWidgetInfo.ViewOption.EQUITY) {
                PortfolioWidgetInfo.DisplayedSecurity[] displayedSecurityArr3 = {PortfolioWidgetInfo.DisplayedSecurity.POSITIONS, PortfolioWidgetInfo.DisplayedSecurity.NONE};
                PortfolioWidgetInfo portfolioWidgetInfo21 = this.widgetInfo;
                if (portfolioWidgetInfo21 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("widgetInfo");
                    portfolioWidgetInfo21 = null;
                }
                if (ArraysKt.contains(displayedSecurityArr3, portfolioWidgetInfo21.getDisplayedEquity())) {
                    PortfolioWidgetInfo portfolioWidgetInfo22 = this.widgetInfo;
                    if (portfolioWidgetInfo22 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("widgetInfo");
                        portfolioWidgetInfo22 = null;
                    }
                    viewOption = portfolioWidgetInfo22.getViewOption();
                } else {
                    viewOption = PortfolioWidgetInfo.ViewOption.QUOTE;
                }
                portfolioWidgetInfoCopy$default = PortfolioWidgetInfo.copy$default(portfolioWidgetInfo3, null, null, null, null, displayedSecurityValueOf3, null, viewOption, 0, 0, 0, 0, 1967, null);
            }
        } else if (Intrinsics.areEqual(preferenceKey, getCuratedListsKey())) {
            PortfolioWidgetInfo portfolioWidgetInfo23 = this.widgetInfo;
            if (portfolioWidgetInfo23 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("widgetInfo");
                portfolioWidgetInfo2 = null;
            } else {
                portfolioWidgetInfo2 = portfolioWidgetInfo23;
            }
            portfolioWidgetInfoCopy$default = PortfolioWidgetInfo.copy$default(portfolioWidgetInfo2, null, null, null, null, null, PortfolioWidgetInfo.DisplayedLists.valueOf(value), null, 0, 0, 0, 0, 2015, null);
        } else if (Intrinsics.areEqual(preferenceKey, getViewOptionKey())) {
            PortfolioWidgetInfo.ViewOption viewOptionValueOf = PortfolioWidgetInfo.ViewOption.valueOf(value);
            PortfolioWidgetInfo portfolioWidgetInfo24 = this.widgetInfo;
            if (portfolioWidgetInfo24 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("widgetInfo");
                portfolioWidgetInfo = null;
            } else {
                portfolioWidgetInfo = portfolioWidgetInfo24;
            }
            PortfolioWidgetInfo.ViewOption viewOption4 = PortfolioWidgetInfo.ViewOption.EQUITY;
            if (viewOptionValueOf == viewOption4) {
                PortfolioWidgetInfo.DisplayedSecurity displayedEquity = PortfolioWidgetInfo.DisplayedSecurity.POSITIONS;
                PortfolioWidgetInfo.DisplayedSecurity[] displayedSecurityArr4 = {displayedEquity, PortfolioWidgetInfo.DisplayedSecurity.NONE};
                PortfolioWidgetInfo portfolioWidgetInfo25 = this.widgetInfo;
                if (portfolioWidgetInfo25 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("widgetInfo");
                    portfolioWidgetInfo25 = null;
                }
                if (ArraysKt.contains(displayedSecurityArr4, portfolioWidgetInfo25.getDisplayedEquity())) {
                    PortfolioWidgetInfo portfolioWidgetInfo26 = this.widgetInfo;
                    if (portfolioWidgetInfo26 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("widgetInfo");
                        portfolioWidgetInfo26 = null;
                    }
                    displayedEquity = portfolioWidgetInfo26.getDisplayedEquity();
                }
                PortfolioWidgetInfo.DisplayedSecurity displayedSecurity = displayedEquity;
                if (viewOptionValueOf == viewOption4) {
                    PortfolioWidgetInfo.DisplayedSecurity displayedCrypto = PortfolioWidgetInfo.DisplayedSecurity.POSITIONS;
                    PortfolioWidgetInfo.DisplayedSecurity[] displayedSecurityArr5 = {displayedCrypto, PortfolioWidgetInfo.DisplayedSecurity.NONE};
                    PortfolioWidgetInfo portfolioWidgetInfo27 = this.widgetInfo;
                    if (portfolioWidgetInfo27 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("widgetInfo");
                        portfolioWidgetInfo27 = null;
                    }
                    if (ArraysKt.contains(displayedSecurityArr5, portfolioWidgetInfo27.getDisplayedCrypto())) {
                        PortfolioWidgetInfo portfolioWidgetInfo28 = this.widgetInfo;
                        if (portfolioWidgetInfo28 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("widgetInfo");
                            portfolioWidgetInfo28 = null;
                        }
                        displayedCrypto = portfolioWidgetInfo28.getDisplayedCrypto();
                    }
                    portfolioWidgetInfoCopy$default = PortfolioWidgetInfo.copy$default(portfolioWidgetInfo, null, displayedCrypto, null, displayedSecurity, null, null, viewOptionValueOf, 0, 0, 0, 0, 1973, null);
                }
            }
        } else {
            Preconditions.INSTANCE.failUnexpectedItemKotlin(preferenceKey);
            throw new ExceptionsH();
        }
        this.widgetInfo = portfolioWidgetInfoCopy$default;
        PortfolioWidgetInfoPref widgetInfoPref = getWidgetInfoPref();
        int appWidgetId = getAppWidgetId();
        PortfolioWidgetInfo portfolioWidgetInfo29 = this.widgetInfo;
        if (portfolioWidgetInfo29 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("widgetInfo");
        } else {
            portfolioWidgetInfo8 = portfolioWidgetInfo29;
        }
        widgetInfoPref.set(appWidgetId, portfolioWidgetInfo8);
        refreshUi();
    }

    @Override // com.robinhood.android.common.p088ui.BasePreferenceFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        requireActivity().finish();
        return true;
    }

    private final void refreshUi() {
        NonPersistentListPreference nonPersistentListPreference = this.periodPreference;
        PortfolioWidgetInfo portfolioWidgetInfo = null;
        if (nonPersistentListPreference == null) {
            Intrinsics.throwUninitializedPropertyAccessException("periodPreference");
            nonPersistentListPreference = null;
        }
        int i = C31480R.string.widget_portfolio_refresh_period_title;
        PortfolioWidgetInfo portfolioWidgetInfo2 = this.widgetInfo;
        if (portfolioWidgetInfo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("widgetInfo");
            portfolioWidgetInfo2 = null;
        }
        setTitle(nonPersistentListPreference, getString(i, getString(portfolioWidgetInfo2.getUpdatePeriod().getDisplayNameResId())));
        NonPersistentListPreference nonPersistentListPreference2 = this.cryptoPreference;
        if (nonPersistentListPreference2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cryptoPreference");
            nonPersistentListPreference2 = null;
        }
        int i2 = C31480R.string.gated_crypto_widget_portfolio_crypto_title;
        PortfolioWidgetInfo portfolioWidgetInfo3 = this.widgetInfo;
        if (portfolioWidgetInfo3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("widgetInfo");
            portfolioWidgetInfo3 = null;
        }
        setTitle(nonPersistentListPreference2, getString(i2, getString(portfolioWidgetInfo3.getDisplayedCrypto().getDisplayNameResId())));
        NonPersistentListPreference nonPersistentListPreference3 = this.optionPreference;
        if (nonPersistentListPreference3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("optionPreference");
            nonPersistentListPreference3 = null;
        }
        int i3 = C31480R.string.gated_options_widget_portfolio_option_title;
        PortfolioWidgetInfo portfolioWidgetInfo4 = this.widgetInfo;
        if (portfolioWidgetInfo4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("widgetInfo");
            portfolioWidgetInfo4 = null;
        }
        setTitle(nonPersistentListPreference3, getString(i3, getString(portfolioWidgetInfo4.getDisplayedOption().getDisplayNameResId())));
        NonPersistentListPreference nonPersistentListPreference4 = this.instrumentPreference;
        if (nonPersistentListPreference4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("instrumentPreference");
            nonPersistentListPreference4 = null;
        }
        int i4 = C31480R.string.widget_portfolio_instruments_title;
        PortfolioWidgetInfo portfolioWidgetInfo5 = this.widgetInfo;
        if (portfolioWidgetInfo5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("widgetInfo");
            portfolioWidgetInfo5 = null;
        }
        setTitle(nonPersistentListPreference4, getString(i4, getString(portfolioWidgetInfo5.getDisplayedEquity().getDisplayNameResId())));
        NonPersistentListPreference nonPersistentListPreference5 = this.futuresPreference;
        if (nonPersistentListPreference5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("futuresPreference");
            nonPersistentListPreference5 = null;
        }
        int i5 = C31480R.string.widget_portfolio_futures_title;
        PortfolioWidgetInfo portfolioWidgetInfo6 = this.widgetInfo;
        if (portfolioWidgetInfo6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("widgetInfo");
            portfolioWidgetInfo6 = null;
        }
        setTitle(nonPersistentListPreference5, getString(i5, getString(portfolioWidgetInfo6.getDisplayedFutures().getDisplayNameResId())));
        NonPersistentListPreference nonPersistentListPreference6 = this.curatedListsPreference;
        if (nonPersistentListPreference6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("curatedListsPreference");
            nonPersistentListPreference6 = null;
        }
        int i6 = C31480R.string.widget_portfolio_curated_lists_title;
        PortfolioWidgetInfo portfolioWidgetInfo7 = this.widgetInfo;
        if (portfolioWidgetInfo7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("widgetInfo");
            portfolioWidgetInfo7 = null;
        }
        setTitle(nonPersistentListPreference6, getString(i6, getString(portfolioWidgetInfo7.getDisplayedLists().getDisplayNameResId())));
        NonPersistentListPreference nonPersistentListPreference7 = this.viewOptionPreference;
        if (nonPersistentListPreference7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewOptionPreference");
            nonPersistentListPreference7 = null;
        }
        int i7 = C31480R.string.widget_portfolio_view_option_title;
        PortfolioWidgetInfo portfolioWidgetInfo8 = this.widgetInfo;
        if (portfolioWidgetInfo8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("widgetInfo");
        } else {
            portfolioWidgetInfo = portfolioWidgetInfo8;
        }
        setTitle(nonPersistentListPreference7, getString(i7, getString(portfolioWidgetInfo.getViewOption().getDisplayNameResId())));
    }

    /* compiled from: PortfolioWidgetConfigurationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/widget/ui/PortfolioWidgetConfigurationFragment$Companion;", "", "<init>", "()V", "EXTRA_APPWIDGET_ID", "", "newInstance", "Lcom/robinhood/android/widget/ui/PortfolioWidgetConfigurationFragment;", "appwidgetId", "", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PortfolioWidgetConfigurationFragment newInstance(int appwidgetId) {
            PortfolioWidgetConfigurationFragment portfolioWidgetConfigurationFragment = new PortfolioWidgetConfigurationFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(PortfolioWidgetConfigurationFragment.EXTRA_APPWIDGET_ID, appwidgetId);
            portfolioWidgetConfigurationFragment.setArguments(bundle);
            return portfolioWidgetConfigurationFragment;
        }
    }
}

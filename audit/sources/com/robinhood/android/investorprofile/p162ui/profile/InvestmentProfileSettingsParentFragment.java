package com.robinhood.android.investorprofile.p162ui.profile;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.core.view.MenuProvider;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.investorprofile.C19641R;
import com.robinhood.android.investorprofile.p162ui.profile.InvestmentProfileSettingsBonfireIdentiFragment;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.questionnaire.p219db.QuestionnaireContexts;
import com.robinhood.shared.questionnaire.contracts.InvestmentProfileSettings;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestmentProfileSettingsParentFragment.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0002)*B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u0010\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u0006H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u001b\u0010\u000b\u001a\u00020\u00068VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\f\u0010\bR\u000e\u0010\u000f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010%\u001a\u0004\u0018\u00010&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Landroidx/core/view/MenuProvider;", "<init>", "()V", "childFragmentsShouldNotConfigureToolbar", "", "getChildFragmentsShouldNotConfigureToolbar", "()Z", "useDesignSystemToolbar", "getUseDesignSystemToolbar", "toolbarVisible", "getToolbarVisible", "toolbarVisible$delegate", "Lkotlin/Lazy;", "fromGoldUpgrade", "configureToolbar", "displayOnly", "showButtonBar", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onCreateMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onMenuItemSelected", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Landroid/view/MenuItem;", "onBackPressed", "screenDescription", "", "getScreenDescription", "()Ljava/lang/String;", "Args", "Companion", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class InvestmentProfileSettingsParentFragment extends BaseFragment implements MenuProvider {
    private boolean configureToolbar;
    private boolean displayOnly;
    private boolean fromGoldUpgrade;
    private boolean showButtonBar;

    /* renamed from: toolbarVisible$delegate, reason: from kotlin metadata */
    private final Lazy toolbarVisible;
    private final boolean useDesignSystemToolbar;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // androidx.core.view.MenuProvider
    public /* bridge */ /* synthetic */ void onMenuClosed(Menu menu) {
        super.onMenuClosed(menu);
    }

    @Override // androidx.core.view.MenuProvider
    public /* bridge */ /* synthetic */ void onPrepareMenu(Menu menu) {
        super.onPrepareMenu(menu);
    }

    public InvestmentProfileSettingsParentFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.useDesignSystemToolbar = true;
        this.toolbarVisible = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsParentFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(InvestmentProfileSettingsParentFragment.toolbarVisible_delegate$lambda$0(this.f$0));
            }
        });
        this.configureToolbar = true;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getChildFragmentsShouldNotConfigureToolbar() {
        return !this.configureToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean toolbarVisible_delegate$lambda$0(InvestmentProfileSettingsParentFragment investmentProfileSettingsParentFragment) {
        return ((Args) INSTANCE.getArgs((Fragment) investmentProfileSettingsParentFragment)).getToolbarVisible();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return ((Boolean) this.toolbarVisible.getValue()).booleanValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Companion companion = INSTANCE;
        this.fromGoldUpgrade = ((Args) companion.getArgs((Fragment) this)).getFromGoldUpgrade();
        this.configureToolbar = ((Args) companion.getArgs((Fragment) this)).getConfigureToolbar();
        this.displayOnly = ((Args) companion.getArgs((Fragment) this)).getDisplayOnly();
        this.showButtonBar = ((Args) companion.getArgs((Fragment) this)).getShowButtonBar();
        if (savedInstanceState == null) {
            setFragment(C19641R.id.fragment_container, InvestmentProfileSettingsBonfireIdentiFragment.INSTANCE.newInstance((Parcelable) new InvestmentProfileSettingsBonfireIdentiFragment.Args(((Args) companion.getArgs((Fragment) this)).getProductContext(), ((Args) companion.getArgs((Fragment) this)).getAccountNumber(), ((Args) companion.getArgs((Fragment) this)).getApplicationId(), ((Args) companion.getArgs((Fragment) this)).getConfigureToolbar(), !this.displayOnly, this.showButtonBar, ((Args) companion.getArgs((Fragment) this)).getShowAccountSwitcher(), ((Args) companion.getArgs((Fragment) this)).getUseGoldTheme(), Intrinsics.areEqual(((Args) companion.getArgs((Fragment) this)).getSource(), InvestmentProfileSettings.SOURCE_MARGIN_UPGRADE), ((Args) companion.getArgs((Fragment) this)).getFromGoldUpgrade(), ((Args) companion.getArgs((Fragment) this)).getTitle(), ((Args) companion.getArgs((Fragment) this)).getSubtitle())));
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (this.fromGoldUpgrade) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            fragmentActivityRequireActivity.addMenuProvider(this, viewLifecycleOwner, Lifecycle.State.RESUMED);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
    }

    @Override // androidx.core.view.MenuProvider
    public void onCreateMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.createOptionsMenu(menu, inflater);
        inflater.inflate(C19641R.menu.menu_done, menu);
    }

    @Override // androidx.core.view.MenuProvider
    public boolean onMenuItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() != C19641R.id.action_done) {
            return false;
        }
        requireActivity().finish();
        return true;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        if (!this.fromGoldUpgrade) {
            Companion companion = INSTANCE;
            if (!Intrinsics.areEqual(((Args) companion.getArgs((Fragment) this)).getProductContext(), QuestionnaireContexts.AML_REFRESH) && !Intrinsics.areEqual(((Args) companion.getArgs((Fragment) this)).getSource(), InvestmentProfileSettings.SOURCE_TOKENIZED_STOCKS_ONBOARDING)) {
                return super.onBackPressed();
            }
        }
        requireActivity().finish();
        return true;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenDescription() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getSource();
    }

    /* compiled from: InvestmentProfileSettingsParentFragment.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b)\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\t\u0010,\u001a\u00020\u0007HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0097\u0001\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u00100\u001a\u000201J\u0013\u00102\u001a\u00020\u00072\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u000201HÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001J\u0016\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u000201R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014¨\u0006<"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsParentFragment$Args;", "Landroid/os/Parcelable;", "productContext", "", "accountNumber", "applicationId", "fromGoldUpgrade", "", "configureToolbar", "displayOnly", "source", "showButtonBar", "showAccountSwitcher", "useGoldTheme", "toolbarVisible", "title", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;ZZZZLjava/lang/String;Ljava/lang/String;)V", "getProductContext", "()Ljava/lang/String;", "getAccountNumber", "getApplicationId", "getFromGoldUpgrade", "()Z", "getConfigureToolbar", "getDisplayOnly", "getSource", "getShowButtonBar", "getShowAccountSwitcher", "getUseGoldTheme", "getToolbarVisible", "getTitle", "getSubtitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;
        private final String applicationId;
        private final boolean configureToolbar;
        private final boolean displayOnly;
        private final boolean fromGoldUpgrade;
        private final String productContext;
        private final boolean showAccountSwitcher;
        private final boolean showButtonBar;
        private final String source;
        private final String subtitle;
        private final String title;
        private final boolean toolbarVisible;
        private final boolean useGoldTheme;

        /* compiled from: InvestmentProfileSettingsParentFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                String str;
                boolean z5;
                boolean z6;
                boolean z7;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                boolean z8 = false;
                boolean z9 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z8 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z9 = z;
                }
                if (parcel.readInt() != 0) {
                    z3 = z2;
                } else {
                    z3 = z2;
                    z2 = z;
                }
                String string5 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z4 = z3;
                    str = string5;
                    z5 = z4;
                } else {
                    z4 = z3;
                    str = string5;
                    z5 = z;
                }
                if (parcel.readInt() != 0) {
                    z6 = z4;
                } else {
                    z6 = z4;
                    z4 = z;
                }
                if (parcel.readInt() != 0) {
                    z7 = z6;
                } else {
                    z7 = z6;
                    z6 = z;
                }
                if (parcel.readInt() == 0) {
                    z7 = z;
                }
                return new Args(string2, string3, string4, z8, z9, z2, str, z5, z4, z6, z7, parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, String str2, String str3, boolean z, boolean z2, boolean z3, String str4, boolean z4, boolean z5, boolean z6, boolean z7, String str5, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.productContext;
            }
            return args.copy(str, (i & 2) != 0 ? args.accountNumber : str2, (i & 4) != 0 ? args.applicationId : str3, (i & 8) != 0 ? args.fromGoldUpgrade : z, (i & 16) != 0 ? args.configureToolbar : z2, (i & 32) != 0 ? args.displayOnly : z3, (i & 64) != 0 ? args.source : str4, (i & 128) != 0 ? args.showButtonBar : z4, (i & 256) != 0 ? args.showAccountSwitcher : z5, (i & 512) != 0 ? args.useGoldTheme : z6, (i & 1024) != 0 ? args.toolbarVisible : z7, (i & 2048) != 0 ? args.title : str5, (i & 4096) != 0 ? args.subtitle : str6);
        }

        /* renamed from: component1, reason: from getter */
        public final String getProductContext() {
            return this.productContext;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getUseGoldTheme() {
            return this.useGoldTheme;
        }

        /* renamed from: component11, reason: from getter */
        public final boolean getToolbarVisible() {
            return this.toolbarVisible;
        }

        /* renamed from: component12, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component13, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component3, reason: from getter */
        public final String getApplicationId() {
            return this.applicationId;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getFromGoldUpgrade() {
            return this.fromGoldUpgrade;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getConfigureToolbar() {
            return this.configureToolbar;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getDisplayOnly() {
            return this.displayOnly;
        }

        /* renamed from: component7, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getShowButtonBar() {
            return this.showButtonBar;
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getShowAccountSwitcher() {
            return this.showAccountSwitcher;
        }

        public final Args copy(String productContext, String accountNumber, String applicationId, boolean fromGoldUpgrade, boolean configureToolbar, boolean displayOnly, String source, boolean showButtonBar, boolean showAccountSwitcher, boolean useGoldTheme, boolean toolbarVisible, String title, String subtitle) {
            return new Args(productContext, accountNumber, applicationId, fromGoldUpgrade, configureToolbar, displayOnly, source, showButtonBar, showAccountSwitcher, useGoldTheme, toolbarVisible, title, subtitle);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.productContext, args.productContext) && Intrinsics.areEqual(this.accountNumber, args.accountNumber) && Intrinsics.areEqual(this.applicationId, args.applicationId) && this.fromGoldUpgrade == args.fromGoldUpgrade && this.configureToolbar == args.configureToolbar && this.displayOnly == args.displayOnly && Intrinsics.areEqual(this.source, args.source) && this.showButtonBar == args.showButtonBar && this.showAccountSwitcher == args.showAccountSwitcher && this.useGoldTheme == args.useGoldTheme && this.toolbarVisible == args.toolbarVisible && Intrinsics.areEqual(this.title, args.title) && Intrinsics.areEqual(this.subtitle, args.subtitle);
        }

        public int hashCode() {
            String str = this.productContext;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.accountNumber;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.applicationId;
            int iHashCode3 = (((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + Boolean.hashCode(this.fromGoldUpgrade)) * 31) + Boolean.hashCode(this.configureToolbar)) * 31) + Boolean.hashCode(this.displayOnly)) * 31;
            String str4 = this.source;
            int iHashCode4 = (((((((((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + Boolean.hashCode(this.showButtonBar)) * 31) + Boolean.hashCode(this.showAccountSwitcher)) * 31) + Boolean.hashCode(this.useGoldTheme)) * 31) + Boolean.hashCode(this.toolbarVisible)) * 31;
            String str5 = this.title;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.subtitle;
            return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
        }

        public String toString() {
            return "Args(productContext=" + this.productContext + ", accountNumber=" + this.accountNumber + ", applicationId=" + this.applicationId + ", fromGoldUpgrade=" + this.fromGoldUpgrade + ", configureToolbar=" + this.configureToolbar + ", displayOnly=" + this.displayOnly + ", source=" + this.source + ", showButtonBar=" + this.showButtonBar + ", showAccountSwitcher=" + this.showAccountSwitcher + ", useGoldTheme=" + this.useGoldTheme + ", toolbarVisible=" + this.toolbarVisible + ", title=" + this.title + ", subtitle=" + this.subtitle + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.productContext);
            dest.writeString(this.accountNumber);
            dest.writeString(this.applicationId);
            dest.writeInt(this.fromGoldUpgrade ? 1 : 0);
            dest.writeInt(this.configureToolbar ? 1 : 0);
            dest.writeInt(this.displayOnly ? 1 : 0);
            dest.writeString(this.source);
            dest.writeInt(this.showButtonBar ? 1 : 0);
            dest.writeInt(this.showAccountSwitcher ? 1 : 0);
            dest.writeInt(this.useGoldTheme ? 1 : 0);
            dest.writeInt(this.toolbarVisible ? 1 : 0);
            dest.writeString(this.title);
            dest.writeString(this.subtitle);
        }

        public Args(String str, String str2, String str3, boolean z, boolean z2, boolean z3, String str4, boolean z4, boolean z5, boolean z6, boolean z7, String str5, String str6) {
            this.productContext = str;
            this.accountNumber = str2;
            this.applicationId = str3;
            this.fromGoldUpgrade = z;
            this.configureToolbar = z2;
            this.displayOnly = z3;
            this.source = str4;
            this.showButtonBar = z4;
            this.showAccountSwitcher = z5;
            this.useGoldTheme = z6;
            this.toolbarVisible = z7;
            this.title = str5;
            this.subtitle = str6;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Args(java.lang.String r18, java.lang.String r19, java.lang.String r20, boolean r21, boolean r22, boolean r23, java.lang.String r24, boolean r25, boolean r26, boolean r27, boolean r28, java.lang.String r29, java.lang.String r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
            /*
                r17 = this;
                r0 = r31
                r1 = r0 & 16
                r2 = 1
                if (r1 == 0) goto L9
                r8 = r2
                goto Lb
            L9:
                r8 = r22
            Lb:
                r1 = r0 & 32
                r3 = 0
                if (r1 == 0) goto L12
                r9 = r3
                goto L14
            L12:
                r9 = r23
            L14:
                r1 = r0 & 64
                r4 = 0
                if (r1 == 0) goto L1b
                r10 = r4
                goto L1d
            L1b:
                r10 = r24
            L1d:
                r1 = r0 & 128(0x80, float:1.794E-43)
                if (r1 == 0) goto L23
                r11 = r3
                goto L25
            L23:
                r11 = r25
            L25:
                r1 = r0 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L2b
                r12 = r3
                goto L2d
            L2b:
                r12 = r26
            L2d:
                r1 = r0 & 512(0x200, float:7.175E-43)
                if (r1 == 0) goto L33
                r13 = r3
                goto L35
            L33:
                r13 = r27
            L35:
                r1 = r0 & 1024(0x400, float:1.435E-42)
                if (r1 == 0) goto L3b
                r14 = r2
                goto L3d
            L3b:
                r14 = r28
            L3d:
                r1 = r0 & 2048(0x800, float:2.87E-42)
                if (r1 == 0) goto L43
                r15 = r4
                goto L45
            L43:
                r15 = r29
            L45:
                r0 = r0 & 4096(0x1000, float:5.74E-42)
                if (r0 == 0) goto L56
                r16 = r4
                r3 = r17
                r5 = r19
                r6 = r20
                r7 = r21
                r4 = r18
                goto L62
            L56:
                r16 = r30
                r3 = r17
                r4 = r18
                r5 = r19
                r6 = r20
                r7 = r21
            L62:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.investorprofile.p162ui.profile.InvestmentProfileSettingsParentFragment.Args.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.String, boolean, boolean, boolean, boolean, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final String getProductContext() {
            return this.productContext;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final String getApplicationId() {
            return this.applicationId;
        }

        public final boolean getFromGoldUpgrade() {
            return this.fromGoldUpgrade;
        }

        public final boolean getConfigureToolbar() {
            return this.configureToolbar;
        }

        public final boolean getDisplayOnly() {
            return this.displayOnly;
        }

        public final String getSource() {
            return this.source;
        }

        public final boolean getShowButtonBar() {
            return this.showButtonBar;
        }

        public final boolean getShowAccountSwitcher() {
            return this.showAccountSwitcher;
        }

        public final boolean getUseGoldTheme() {
            return this.useGoldTheme;
        }

        public final boolean getToolbarVisible() {
            return this.toolbarVisible;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }
    }

    /* compiled from: InvestmentProfileSettingsParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsParentFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/shared/questionnaire/contracts/InvestmentProfileSettings;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsParentFragment;", "Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsParentFragment$Args;", "<init>", "()V", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<InvestmentProfileSettings>, FragmentWithArgsCompanion<InvestmentProfileSettingsParentFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(InvestmentProfileSettingsParentFragment investmentProfileSettingsParentFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, investmentProfileSettingsParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public InvestmentProfileSettingsParentFragment newInstance(Args args) {
            return (InvestmentProfileSettingsParentFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(InvestmentProfileSettingsParentFragment investmentProfileSettingsParentFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, investmentProfileSettingsParentFragment, args);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(InvestmentProfileSettings key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return newInstance((Parcelable) new Args(key.getProductContext(), key.getAccountNumber(), key.getApplicationId(), key.getFromGoldUpgrade(), key.getConfigureToolbar(), key.getDisplayOnly(), key.getSource(), key.getShowButtonBar(), key.getShowAccountSwitcher(), key.getUseGoldTheme(), key.getToolbarVisible(), key.getTitle(), key.getSubtitle()));
        }
    }
}

package com.robinhood.android.optionschain.strategybuilder;

import android.R;
import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.robinhood.android.common.p088ui.RoundedImageView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.style.ThemeAttributes;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.contracts.OptionStrategyBuilderNuxIntentKey;
import com.robinhood.android.optionschain.C24135R;
import com.robinhood.android.optionschain.databinding.MergeOptionStrategyBuilderCardViewBinding;
import com.robinhood.android.optionschain.strategybuilder.OptionStrategyBuilderAdapter2;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.strategybuilder.StrategyBuilderOptionsLevel;
import com.robinhood.models.api.strategybuilder.StrategyBuilderStrategyCardState;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.OptionStrategyBuilder;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.extensions.HttpUrl2;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: OptionStrategyBuilderCardView.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001fB\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0003H\u0016R\u001b\u0010\n\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/optionschain/strategybuilder/OptionStrategyBuilderCardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/optionschain/strategybuilder/BuilderData$StrategyCardData;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "bindings", "Lcom/robinhood/android/optionschain/databinding/MergeOptionStrategyBuilderCardViewBinding;", "getBindings", "()Lcom/robinhood/android/optionschain/databinding/MergeOptionStrategyBuilderCardViewBinding;", "bindings$delegate", "Lkotlin/properties/ReadOnlyProperty;", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "bind", "", "state", "Companion", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionStrategyBuilderCardView extends Hammer_OptionStrategyBuilderCardView implements Bindable<OptionStrategyBuilderAdapter2.StrategyCardData> {

    /* renamed from: bindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 bindings;
    public ImageLoader imageLoader;
    public Navigator navigator;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionStrategyBuilderCardView.class, "bindings", "getBindings()Lcom/robinhood/android/optionschain/databinding/MergeOptionStrategyBuilderCardViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ OptionStrategyBuilderCardView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionStrategyBuilderCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.bindings = ViewBinding5.viewBinding(this, OptionStrategyBuilderCardView2.INSTANCE);
        ViewGroups.inflate(this, C24135R.layout.merge_option_strategy_builder_card_view, true);
        setForeground(ViewsKt.getDrawable(this, C24135R.drawable.option_strategy_builder_card_view_background));
        ScarletManager2.overrideAttribute(this, R.attr.foregroundTint, ThemeAttributes.INSTANCE.getCOLOR_BACKGROUND_3());
        getBindings().optionsStrategyBuilderCardViewImage.setRadius(ViewsKt.getDimension(this, C24135R.dimen.options_strategy_builder_image_corner_radius), ViewsKt.getDimension(this, C24135R.dimen.options_strategy_builder_image_corner_radius), 0.0f, 0.0f);
    }

    public final MergeOptionStrategyBuilderCardViewBinding getBindings() {
        Object value = this.bindings.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeOptionStrategyBuilderCardViewBinding) value;
    }

    public final ImageLoader getImageLoader() {
        ImageLoader imageLoader = this.imageLoader;
        if (imageLoader != null) {
            return imageLoader;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageLoader");
        return null;
    }

    public final void setImageLoader(ImageLoader imageLoader) {
        Intrinsics.checkNotNullParameter(imageLoader, "<set-?>");
        this.imageLoader = imageLoader;
    }

    public final Navigator getNavigator() {
        Navigator navigator = this.navigator;
        if (navigator != null) {
            return navigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void setNavigator(Navigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "<set-?>");
        this.navigator = navigator;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(OptionStrategyBuilderAdapter2.StrategyCardData state) {
        Intrinsics.checkNotNullParameter(state, "state");
        MergeOptionStrategyBuilderCardViewBinding bindings = getBindings();
        OptionStrategyBuilder.StrategySection.ImageURLs cardImg = state.getStrategyCard().getCardImg();
        String light = state.isDay() ? cardImg.getLight() : cardImg.getDark();
        ImageLoader imageLoader = getImageLoader();
        Uri uri = Uri.parse(light);
        Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
        ImageLoader.ImageRequest imageRequestCenterCrop = imageLoader.load(HttpUrl2.toHttpUrl(uri)).fit().centerCrop();
        RoundedImageView optionsStrategyBuilderCardViewImage = bindings.optionsStrategyBuilderCardViewImage;
        Intrinsics.checkNotNullExpressionValue(optionsStrategyBuilderCardViewImage, "optionsStrategyBuilderCardViewImage");
        ImageLoader.ImageRequest.DefaultImpls.into$default(imageRequestCenterCrop, optionsStrategyBuilderCardViewImage, null, null, 6, null);
        bindings.optionsStrategyBuilderCardViewTitle.setText(state.getStrategyCard().getTitle());
        bindings.optionsStrategyBuilderCardViewSubtitle.setText(state.getStrategyCard().getSentimentLabel());
    }

    /* compiled from: OptionStrategyBuilderCardView.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0011\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0096\u0001R\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\bR\u0018\u0010\t\u001a\u00020\u0006*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/optionschain/strategybuilder/OptionStrategyBuilderCardView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/optionschain/strategybuilder/OptionStrategyBuilderCardView;", "<init>", "()V", "isStrategyEnabled", "", "Lcom/robinhood/models/api/strategybuilder/StrategyBuilderStrategyCardState;", "(Lcom/robinhood/models/api/strategybuilder/StrategyBuilderStrategyCardState;)Z", "showComingSoonPill", "getShowComingSoonPill", "getIntentKeyFromBuilderArgs", "Lcom/robinhood/android/options/contracts/OptionStrategyBuilderNuxIntentKey;", "strategyCardData", "Lcom/robinhood/android/optionschain/strategybuilder/BuilderData$StrategyCardData;", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<OptionStrategyBuilderCardView> {
        private final /* synthetic */ Inflater<OptionStrategyBuilderCardView> $$delegate_0;

        /* compiled from: OptionStrategyBuilderCardView.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[StrategyBuilderStrategyCardState.values().length];
                try {
                    iArr[StrategyBuilderStrategyCardState.ENABLED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[StrategyBuilderStrategyCardState.DISABLED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[StrategyBuilderStrategyCardState.COMING_SOON.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[StrategyBuilderOptionsLevel.values().length];
                try {
                    iArr2[StrategyBuilderOptionsLevel.OPTION_LEVEL_2.ordinal()] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[StrategyBuilderOptionsLevel.OPTION_LEVEL_3.ordinal()] = 2;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[StrategyBuilderOptionsLevel.UNKNOWN.ordinal()] = 3;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public OptionStrategyBuilderCardView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (OptionStrategyBuilderCardView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C24135R.layout.include_option_strategy_builder_card_view);
        }

        private final boolean isStrategyEnabled(StrategyBuilderStrategyCardState strategyBuilderStrategyCardState) {
            int i = WhenMappings.$EnumSwitchMapping$0[strategyBuilderStrategyCardState.ordinal()];
            if (i == 1) {
                return true;
            }
            if (i == 2 || i == 3) {
                return false;
            }
            throw new NoWhenBranchMatchedException();
        }

        private final boolean getShowComingSoonPill(StrategyBuilderStrategyCardState strategyBuilderStrategyCardState) {
            int i = WhenMappings.$EnumSwitchMapping$0[strategyBuilderStrategyCardState.ordinal()];
            if (i == 1 || i == 2) {
                return false;
            }
            if (i == 3) {
                return true;
            }
            throw new NoWhenBranchMatchedException();
        }

        public final OptionStrategyBuilderNuxIntentKey getIntentKeyFromBuilderArgs(OptionStrategyBuilderAdapter2.StrategyCardData strategyCardData) {
            OptionStrategyBuilderNuxIntentKey.SurveyType surveyType;
            Intrinsics.checkNotNullParameter(strategyCardData, "strategyCardData");
            Account account = strategyCardData.getAccount();
            OptionStrategyBuilder.StrategySection.StrategyCard strategyCard = strategyCardData.getStrategyCard();
            boolean zIsStrategyEnabled = isStrategyEnabled(strategyCard.getState());
            StrategyBuilderOptionsLevel strategyBuilderOptionsLevel = StrategyBuilderOptionsLevel.INSTANCE.getStrategyBuilderOptionsLevel(account.getOptionLevel());
            boolean zContains = strategyCard.getAllowedLevels().contains(strategyBuilderOptionsLevel);
            boolean z = account.getBrokerageAccountType() == BrokerageAccountType.INDIVIDUAL || account.getBrokerageAccountType() == BrokerageAccountType.JOINT_TENANCY_WITH_ROS;
            String accountNumber = account.getAccountNumber();
            boolean z2 = z && zIsStrategyEnabled && !zContains;
            String eduContentfulId = strategyCard.getEduContentfulId();
            boolean z3 = zIsStrategyEnabled && zContains;
            boolean z4 = account.getBrokerageAccountType().isRetirement() && !strategyCard.getAllowedLevels().contains(StrategyBuilderOptionsLevel.OPTION_LEVEL_2);
            String nuxDescription = strategyCard.getNuxDescription();
            OptionStrategyBuilder.StrategySection.ImageURLs nuxImg = strategyCard.getNuxImg();
            boolean showComingSoonPill = getShowComingSoonPill(strategyCard.getState());
            String strategy = strategyCard.getStrategy();
            int i = WhenMappings.$EnumSwitchMapping$1[strategyBuilderOptionsLevel.ordinal()];
            if (i == 1) {
                surveyType = OptionStrategyBuilderNuxIntentKey.SurveyType.f4727L2;
            } else if (i == 2) {
                surveyType = OptionStrategyBuilderNuxIntentKey.SurveyType.f4728L3;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                surveyType = null;
            }
            return new OptionStrategyBuilderNuxIntentKey(accountNumber, z2, z4, eduContentfulId, z, z3, nuxDescription, nuxImg, showComingSoonPill, strategy, surveyType, strategyCard.getTitle(), strategyCardData.getUiOptionChains());
        }
    }
}

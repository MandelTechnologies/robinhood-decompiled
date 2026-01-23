package com.robinhood.android.lists.p173ui.ipo;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.common.util.extensions.Views;
import com.robinhood.android.common.view.AnimatedRhTextView;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoColorMapper;
import com.robinhood.android.lists.C20839R;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.directipo.models.p292db.IpoAccessItem;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.librobinhood.data.store.bonfire.IpoAccessItemStore;
import com.robinhood.models.p355ui.CuratedListEligible;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.ImageSource;
import com.robinhood.models.serverdriven.p347db.ThemedColor;
import com.robinhood.models.serverdriven.p347db.ThemedImageSource;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.SinglesAndroid;
import com.robinhood.utils.extensions.TextViewsKt;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;

/* compiled from: CuratedListIpoAccessInstrumentCard.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00010B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010#\u001a\u00020$H\u0014J\b\u0010%\u001a\u00020$H\u0002J\u0010\u0010&\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u0002H\u0016J\u0010\u0010(\u001a\u00020$2\u0006\u0010'\u001a\u00020\u0002H\u0016J\u0010\u0010)\u001a\u00020$2\u0006\u0010'\u001a\u00020\u0002H\u0016J\b\u0010*\u001a\u00020$H\u0002J\b\u0010+\u001a\u00020$H\u0002J\u0012\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-*\u00020/H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\u00020\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/ipo/CuratedListIpoAccessInstrumentCard;", "Lcom/robinhood/android/carousel/InstrumentCard;", "Lcom/robinhood/models/ui/CuratedListEligible;", "callbacks", "Lcom/robinhood/android/lists/ui/ipo/CuratedListIpoAccessInstrumentCard$Callbacks;", "context", "Landroid/content/Context;", "cardButtonGroupTitle", "", "cardButtonTitle", "<init>", "(Lcom/robinhood/android/lists/ui/ipo/CuratedListIpoAccessInstrumentCard$Callbacks;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "ipoAccessItemStore", "Lcom/robinhood/librobinhood/data/store/bonfire/IpoAccessItemStore;", "getIpoAccessItemStore", "()Lcom/robinhood/librobinhood/data/store/bonfire/IpoAccessItemStore;", "setIpoAccessItemStore", "(Lcom/robinhood/librobinhood/data/store/bonfire/IpoAccessItemStore;)V", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "listItemRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "kotlin.jvm.PlatformType", "instrumentLogoImg", "Landroid/widget/ImageView;", "onAttachedToWindow", "", "bindWithIpoAccessItem", "getButtonTitle", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "bindItem", "onClicked", "showInstrumentLogo", "showInstrumentName", "toResourceReference", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "", "Lcom/robinhood/models/serverdriven/db/ThemedColor;", "Callbacks", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class CuratedListIpoAccessInstrumentCard extends Hammer_CuratedListIpoAccessInstrumentCard<CuratedListEligible> {
    public static final int $stable = 8;
    private final Callbacks callbacks;
    public ImageLoader imageLoader;
    private final ImageView instrumentLogoImg;
    public IpoAccessItemStore ipoAccessItemStore;
    private final BehaviorRelay<CuratedListEligible> listItemRelay;
    public Navigator navigator;

    /* compiled from: CuratedListIpoAccessInstrumentCard.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/ipo/CuratedListIpoAccessInstrumentCard$Callbacks;", "", "onIpoAccessInstrumentClicked", "", "curatedListEligible", "Lcom/robinhood/models/ui/CuratedListEligible;", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onIpoAccessInstrumentClicked(CuratedListEligible curatedListEligible);
    }

    /* compiled from: CuratedListIpoAccessInstrumentCard.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DayNightOverlay.values().length];
            try {
                iArr[DayNightOverlay.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DayNightOverlay.NIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CuratedListIpoAccessInstrumentCard(Callbacks callbacks, Context context, String str, String str2) {
        super(context, str, str2, C20839R.layout.include_curated_list_ipo_access_instrument_card, null);
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(context, "context");
        this.callbacks = callbacks;
        BehaviorRelay<CuratedListEligible> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.listItemRelay = behaviorRelayCreate;
        View viewFindViewById = findViewById(C20839R.id.instrument_logo_img);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.instrumentLogoImg = (ImageView) viewFindViewById;
    }

    public final IpoAccessItemStore getIpoAccessItemStore() {
        IpoAccessItemStore ipoAccessItemStore = this.ipoAccessItemStore;
        if (ipoAccessItemStore != null) {
            return ipoAccessItemStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ipoAccessItemStore");
        return null;
    }

    public final void setIpoAccessItemStore(IpoAccessItemStore ipoAccessItemStore) {
        Intrinsics.checkNotNullParameter(ipoAccessItemStore, "<set-?>");
        this.ipoAccessItemStore = ipoAccessItemStore;
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

    @Override // com.google.android.material.card.MaterialCardView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        bindWithIpoAccessItem();
    }

    private final void bindWithIpoAccessItem() {
        ObservableSource observableSourceSwitchMap = this.listItemRelay.distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.android.lists.ui.ipo.CuratedListIpoAccessInstrumentCard$bindWithIpoAccessItem$ipoAccessItemObs$1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends IpoAccessItem> apply(CuratedListEligible item) {
                Intrinsics.checkNotNullParameter(item, "item");
                return this.this$0.getIpoAccessItemStore().stream(item.getId());
            }
        });
        Observables observables = Observables.INSTANCE;
        Observable<DayNightOverlay> dayNightStyleChanges = Views.baseActivity(this).getDayNightStyleChanges();
        Intrinsics.checkNotNull(observableSourceSwitchMap);
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(observables.combineLatest(dayNightStyleChanges, observableSourceSwitchMap)), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lists.ui.ipo.CuratedListIpoAccessInstrumentCard$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListIpoAccessInstrumentCard.bindWithIpoAccessItem$lambda$4(this.f$0, (Tuples2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindWithIpoAccessItem$lambda$4(final CuratedListIpoAccessInstrumentCard curatedListIpoAccessInstrumentCard, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        DayNightOverlay dayNightOverlay = (DayNightOverlay) tuples2.component1();
        IpoAccessItem ipoAccessItem = (IpoAccessItem) tuples2.component2();
        ThemedImageSource logoImages = ipoAccessItem.getLogoImages();
        curatedListIpoAccessInstrumentCard.showInstrumentName();
        curatedListIpoAccessInstrumentCard.getInstrumentNameTxt().setText(ipoAccessItem.getName());
        TextView instrumentSymbolTxt = curatedListIpoAccessInstrumentCard.getInstrumentSymbolTxt();
        TextViewsKt.setVisibilityText(instrumentSymbolTxt, ipoAccessItem.getTitle());
        ScarletManager2.overrideAttribute(instrumentSymbolTxt, R.attr.textColor, curatedListIpoAccessInstrumentCard.toResourceReference(ipoAccessItem.getAccentColor()));
        AnimatedRhTextView instrumentChangeTxt = curatedListIpoAccessInstrumentCard.getInstrumentChangeTxt();
        instrumentChangeTxt.setVisibility(0);
        instrumentChangeTxt.setText(ipoAccessItem.getSubtitle());
        ScarletManager2.overrideAttribute(instrumentChangeTxt, R.attr.textColor, curatedListIpoAccessInstrumentCard.toResourceReference(ipoAccessItem.getAccentColor()));
        if (logoImages != null) {
            ImageSource light = logoImages.getLight();
            Context context = curatedListIpoAccessInstrumentCard.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            HttpUrl imageUrl = light.toImageUrl(context);
            ImageSource dark = logoImages.getDark();
            Context context2 = curatedListIpoAccessInstrumentCard.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            HttpUrl imageUrl2 = dark.toImageUrl(context2);
            int i = WhenMappings.$EnumSwitchMapping$0[dayNightOverlay.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                imageUrl = imageUrl2;
            }
            curatedListIpoAccessInstrumentCard.getImageLoader().load(imageUrl).into(curatedListIpoAccessInstrumentCard.instrumentLogoImg, new Function0() { // from class: com.robinhood.android.lists.ui.ipo.CuratedListIpoAccessInstrumentCard$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CuratedListIpoAccessInstrumentCard.bindWithIpoAccessItem$lambda$4$lambda$2(this.f$0);
                }
            }, new Function0() { // from class: com.robinhood.android.lists.ui.ipo.CuratedListIpoAccessInstrumentCard$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CuratedListIpoAccessInstrumentCard.bindWithIpoAccessItem$lambda$4$lambda$3(this.f$0);
                }
            });
        } else {
            curatedListIpoAccessInstrumentCard.showInstrumentName();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindWithIpoAccessItem$lambda$4$lambda$2(CuratedListIpoAccessInstrumentCard curatedListIpoAccessInstrumentCard) {
        curatedListIpoAccessInstrumentCard.showInstrumentLogo();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindWithIpoAccessItem$lambda$4$lambda$3(CuratedListIpoAccessInstrumentCard curatedListIpoAccessInstrumentCard) {
        curatedListIpoAccessInstrumentCard.showInstrumentName();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.carousel.InstrumentCard
    public String getButtonTitle(CuratedListEligible item) {
        Intrinsics.checkNotNullParameter(item, "item");
        String string2 = item.getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @Override // com.robinhood.android.carousel.InstrumentCard
    public void bindItem(CuratedListEligible item) {
        Intrinsics.checkNotNullParameter(item, "item");
        getInstrumentNameTxt().setText((CharSequence) null);
        getInstrumentSymbolTxt().setText((CharSequence) null);
        getInstrumentChangeTxt().setText(null, false);
        this.listItemRelay.accept(item);
    }

    @Override // com.robinhood.android.carousel.InstrumentCard
    public void onClicked(final CuratedListEligible item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Single singleFirstOrError = ObservablesKt.toOptionals(getIpoAccessItemStore().stream(item.getId())).firstOrError();
        Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
        ViewDisposerKt.bindTo(SinglesAndroid.observeOnMainThread(singleFirstOrError), this).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lists.ui.ipo.CuratedListIpoAccessInstrumentCard$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListIpoAccessInstrumentCard.onClicked$lambda$5(this.f$0, item, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClicked$lambda$5(CuratedListIpoAccessInstrumentCard curatedListIpoAccessInstrumentCard, CuratedListEligible curatedListEligible, Optional optional) {
        IpoAccessItem ipoAccessItem = (IpoAccessItem) optional.component1();
        if (ipoAccessItem == null) {
            curatedListIpoAccessInstrumentCard.callbacks.onIpoAccessInstrumentClicked(curatedListEligible);
        } else {
            GenericAction action = ipoAccessItem.getAction();
            if (action instanceof GenericAction.DeeplinkAction) {
                Navigator navigator = curatedListIpoAccessInstrumentCard.getNavigator();
                Context context = curatedListIpoAccessInstrumentCard.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                Navigator.DefaultImpls.handleDeepLink$default(navigator, context, ((GenericAction.DeeplinkAction) action).getUri(), null, null, false, null, 60, null);
            } else if (!(action instanceof GenericAction.ButtonsAction) && !(action instanceof GenericAction.ClaimPspAction) && !(action instanceof GenericAction.DismissAction) && !(action instanceof GenericAction.GoldDowngradeAction) && !(action instanceof GenericAction.InfoAlertAction) && !(action instanceof GenericAction.OrderCheckAction) && !(action instanceof GenericAction.ShareSnapshotAction) && !(action instanceof GenericAction.CancelCryptoPendingOrdersAction) && !(action instanceof GenericAction.DisableMarginWithdrawalAction) && action != null) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return Unit.INSTANCE;
    }

    private final void showInstrumentLogo() {
        this.instrumentLogoImg.setVisibility(0);
        getInstrumentNameTxt().setVisibility(8);
    }

    private final void showInstrumentName() {
        this.instrumentLogoImg.setVisibility(8);
        getInstrumentNameTxt().setVisibility(0);
    }

    private final ResourceReferences4<Integer> toResourceReference(ThemedColor themedColor) {
        ResourceReferences4<Integer> resourceReferences4MapDayNightSelectorServerColor = ServerToBentoColorMapper.INSTANCE.mapDayNightSelectorServerColor(themedColor.getLight(), themedColor.getDark());
        return resourceReferences4MapDayNightSelectorServerColor == null ? new ThemedResourceReference(ResourceType.COLOR.INSTANCE, C20690R.attr.colorForeground1) : resourceReferences4MapDayNightSelectorServerColor;
    }
}

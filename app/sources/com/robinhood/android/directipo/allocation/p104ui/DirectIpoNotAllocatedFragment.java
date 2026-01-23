package com.robinhood.android.directipo.allocation.p104ui;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.directipo.allocation.C14171R;
import com.robinhood.android.directipo.allocation.databinding.FragmentDirectIpoNotAllocatedBinding;
import com.robinhood.android.directipo.allocation.p104ui.DirectIpoNotAllocatedFragment;
import com.robinhood.android.directipo.p106ui.allocation.DirectIpoAllocationClarityCardHookView;
import com.robinhood.android.regiongate.IpoAccessRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView;
import com.robinhood.directipo.models.p292db.IpoAnnouncementCardHook;
import com.robinhood.directipo.models.p293ui.UiDirectIpoAllocation;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.ImageSource;
import com.robinhood.models.serverdriven.p347db.ServerDrivenButton;
import com.robinhood.models.serverdriven.p347db.ThemedImageSource;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.recyclerview.CompositeAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.SingleItemAdapter;
import io.noties.markwon.Markwon;
import io.reactivex.Observable;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import okhttp3.HttpUrl;

/* compiled from: DirectIpoNotAllocatedFragment.kt */
@Metadata(m3635d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 N2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002MNB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010BH\u0016J\b\u0010C\u001a\u00020>H\u0016J\u0010\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020:H\u0016J\t\u0010G\u001a\u00020EH\u0096\u0001R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010!\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b#\u0010$R&\u0010&\u001a\u001a\u0012\u0004\u0012\u00020(\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)0'X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010,\u001a\u001a\u0012\u0004\u0012\u00020-\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/0)0'X\u0082\u0004¢\u0006\u0002\n\u0000R&\u00100\u001a\u001a\u0012\u0004\u0012\u00020-\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/0)0'X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00101\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020402X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00105\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u0002070'X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00108\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020:02X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020<X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010H\u001a\b\u0012\u0004\u0012\u00020J0IX\u0096\u0005¢\u0006\u0006\u001a\u0004\bK\u0010L¨\u0006O"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/ui/DirectIpoNotAllocatedFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/serverclientcomponents/actionbutton/ClientComponentButtonView$Callbacks;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "screenDescription", "", "getScreenDescription", "()Ljava/lang/String;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "callbacks", "Lcom/robinhood/android/directipo/allocation/ui/DirectIpoNotAllocatedFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/directipo/allocation/ui/DirectIpoNotAllocatedFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bindings", "Lcom/robinhood/android/directipo/allocation/databinding/FragmentDirectIpoNotAllocatedBinding;", "getBindings", "()Lcom/robinhood/android/directipo/allocation/databinding/FragmentDirectIpoNotAllocatedBinding;", "bindings$delegate", "headerImageAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/SingleItemAdapter;", "Landroid/widget/ImageView;", "Lkotlin/Pair;", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "Lcom/robinhood/models/serverdriven/db/ThemedImageSource;", "titleAdapter", "Landroid/widget/TextView;", "", "", "descriptionAdapter", "rowsAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "Lcom/robinhood/directipo/models/ui/UiDirectIpoAllocation$NotAllocated$Row;", "hookAdapter", "Lcom/robinhood/android/directipo/ui/allocation/DirectIpoAllocationClarityCardHookView;", "Lcom/robinhood/directipo/models/db/IpoAnnouncementCardHook;", "buttonAdapter", "Lcom/robinhood/android/serverclientcomponents/actionbutton/ClientComponentButtonView;", "Lcom/robinhood/models/serverdriven/db/ServerDrivenButton;", "compositeAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/CompositeAdapter;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onActionClicked", "", "button", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Companion", "feature-direct-ipo-allocation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class DirectIpoNotAllocatedFragment extends BaseFragment implements RegionGated, ClientComponentButtonView.Callbacks, AutoLoggableFragment {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: bindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 bindings;
    private final GenericListAdapter<ClientComponentButtonView, ServerDrivenButton> buttonAdapter;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    private final CompositeAdapter compositeAdapter;
    private final SingleItemAdapter<TextView, Tuples2<CharSequence, Integer>> descriptionAdapter;
    private final SingleItemAdapter<ImageView, Tuples2<DayNightOverlay, ThemedImageSource>> headerImageAdapter;
    private final SingleItemAdapter<DirectIpoAllocationClarityCardHookView, IpoAnnouncementCardHook> hookAdapter;
    public ImageLoader imageLoader;
    public Markwon markwon;
    private final GenericListAdapter<RdsRowView, UiDirectIpoAllocation.NotAllocated.Row> rowsAdapter;
    private final SingleItemAdapter<TextView, Tuples2<CharSequence, Integer>> titleAdapter;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DirectIpoNotAllocatedFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/directipo/allocation/ui/DirectIpoNotAllocatedFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(DirectIpoNotAllocatedFragment.class, "bindings", "getBindings()Lcom/robinhood/android/directipo/allocation/databinding/FragmentDirectIpoNotAllocatedBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DirectIpoNotAllocatedFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/ui/DirectIpoNotAllocatedFragment$Callbacks;", "", "onAllocationComplete", "", "feature-direct-ipo-allocation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAllocationComplete();
    }

    /* compiled from: DirectIpoNotAllocatedFragment.kt */
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

    public DirectIpoNotAllocatedFragment() {
        super(C14171R.layout.fragment_direct_ipo_not_allocated);
        this.$$delegate_0 = new RegionGated2(IpoAccessRegionGate.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.directipo.allocation.ui.DirectIpoNotAllocatedFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (android.content.Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof DirectIpoNotAllocatedFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.bindings = ViewBinding5.viewBinding(this, DirectIpoNotAllocatedFragment2.INSTANCE);
        SingleItemAdapter.Companion companion = SingleItemAdapter.INSTANCE;
        SingleItemAdapter<ImageView, Tuples2<DayNightOverlay, ThemedImageSource>> singleItemAdapterOf$default = SingleItemAdapter.Companion.of$default(companion, C14171R.layout.include_direct_ipo_not_allocated_header_image, (DiffUtil.ItemCallback) null, new Function2() { // from class: com.robinhood.android.directipo.allocation.ui.DirectIpoNotAllocatedFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DirectIpoNotAllocatedFragment.headerImageAdapter$lambda$0(this.f$0, (ImageView) obj, (Tuples2) obj2);
            }
        }, 2, (Object) null);
        this.headerImageAdapter = singleItemAdapterOf$default;
        SingleItemAdapter<TextView, Tuples2<CharSequence, Integer>> singleItemAdapterOf$default2 = SingleItemAdapter.Companion.of$default(companion, C14171R.layout.include_direct_ipo_title_text, (DiffUtil.ItemCallback) null, new Function2() { // from class: com.robinhood.android.directipo.allocation.ui.DirectIpoNotAllocatedFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DirectIpoNotAllocatedFragment.titleAdapter$lambda$1((TextView) obj, (Tuples2) obj2);
            }
        }, 2, (Object) null);
        this.titleAdapter = singleItemAdapterOf$default2;
        SingleItemAdapter<TextView, Tuples2<CharSequence, Integer>> singleItemAdapterOf$default3 = SingleItemAdapter.Companion.of$default(companion, C14171R.layout.include_direct_ipo_description_text, (DiffUtil.ItemCallback) null, new Function2() { // from class: com.robinhood.android.directipo.allocation.ui.DirectIpoNotAllocatedFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DirectIpoNotAllocatedFragment.descriptionAdapter$lambda$2((TextView) obj, (Tuples2) obj2);
            }
        }, 2, (Object) null);
        this.descriptionAdapter = singleItemAdapterOf$default3;
        GenericListAdapter.Companion companion2 = GenericListAdapter.INSTANCE;
        RdsRowView.ValuePropRowInflater valuePropRowInflater = RdsRowView.ValuePropRowInflater.INSTANCE;
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        DiffCallbacks.Equality equality = DiffCallbacks.Equality.INSTANCE;
        GenericListAdapter<RdsRowView, UiDirectIpoAllocation.NotAllocated.Row> genericListAdapterM2987of = companion2.m2987of(valuePropRowInflater, equality, new Function2() { // from class: com.robinhood.android.directipo.allocation.ui.DirectIpoNotAllocatedFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DirectIpoNotAllocatedFragment.rowsAdapter$lambda$3(this.f$0, (RdsRowView) obj, (UiDirectIpoAllocation.NotAllocated.Row) obj2);
            }
        });
        this.rowsAdapter = genericListAdapterM2987of;
        SingleItemAdapter<DirectIpoAllocationClarityCardHookView, IpoAnnouncementCardHook> singleItemAdapterOf$default4 = SingleItemAdapter.Companion.of$default(companion, DirectIpoAllocationClarityCardHookView.INSTANCE, (DiffUtil.ItemCallback) null, new Function2() { // from class: com.robinhood.android.directipo.allocation.ui.DirectIpoNotAllocatedFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DirectIpoNotAllocatedFragment.hookAdapter$lambda$4((DirectIpoAllocationClarityCardHookView) obj, (IpoAnnouncementCardHook) obj2);
            }
        }, 2, (Object) null);
        this.hookAdapter = singleItemAdapterOf$default4;
        this.buttonAdapter = companion2.m2987of(ClientComponentButtonView.INSTANCE, equality, new Function2() { // from class: com.robinhood.android.directipo.allocation.ui.DirectIpoNotAllocatedFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DirectIpoNotAllocatedFragment.buttonAdapter$lambda$5(this.f$0, (ClientComponentButtonView) obj, (ServerDrivenButton) obj2);
            }
        });
        this.compositeAdapter = new CompositeAdapter((RecyclerView.Adapter<?>[]) new RecyclerView.Adapter[]{singleItemAdapterOf$default, singleItemAdapterOf$default2, singleItemAdapterOf$default3, genericListAdapterM2987of, singleItemAdapterOf$default4});
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenDescription() {
        String string2 = ((UiDirectIpoAllocation.NotAllocated) INSTANCE.getArgs((Fragment) this)).getInstrumentId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        Screen.Name name = Screen.Name.IPOA_NOT_ALLOCATED;
        String string2 = ((UiDirectIpoAllocation.NotAllocated) INSTANCE.getArgs((Fragment) this)).getInstrumentId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new Screen(name, null, string2, null, 10, null);
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final FragmentDirectIpoNotAllocatedBinding getBindings() {
        Object value = this.bindings.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentDirectIpoNotAllocatedBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit headerImageAdapter$lambda$0(DirectIpoNotAllocatedFragment directIpoNotAllocatedFragment, ImageView of, Tuples2 tuples2) {
        HttpUrl imageUrl;
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        DayNightOverlay dayNightOverlay = (DayNightOverlay) tuples2.component1();
        ThemedImageSource themedImageSource = (ThemedImageSource) tuples2.component2();
        int i = WhenMappings.$EnumSwitchMapping$0[dayNightOverlay.ordinal()];
        if (i == 1) {
            ImageSource light = themedImageSource.getLight();
            android.content.Context contextRequireContext = directIpoNotAllocatedFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            imageUrl = light.toImageUrl(contextRequireContext);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ImageSource dark = themedImageSource.getDark();
            android.content.Context contextRequireContext2 = directIpoNotAllocatedFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            imageUrl = dark.toImageUrl(contextRequireContext2);
        }
        ImageLoader.ImageRequest.DefaultImpls.into$default(directIpoNotAllocatedFragment.getImageLoader().load(imageUrl), of, null, null, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit titleAdapter$lambda$1(TextView of, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        CharSequence charSequence = (CharSequence) tuples2.component1();
        of.setGravity(((Number) tuples2.component2()).intValue());
        of.setText(charSequence);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit descriptionAdapter$lambda$2(TextView of, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        CharSequence charSequence = (CharSequence) tuples2.component1();
        of.setGravity(((Number) tuples2.component2()).intValue());
        of.setText(charSequence);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rowsAdapter$lambda$3(DirectIpoNotAllocatedFragment directIpoNotAllocatedFragment, RdsRowView of, UiDirectIpoAllocation.NotAllocated.Row item) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(item, "item");
        of.setLeadingIconDrawable(ViewsKt.getDrawable(of, item.getIcon().getResourceId()));
        of.setPrimaryText(item.getTitle());
        of.setSecondaryText(directIpoNotAllocatedFragment.getMarkwon().toMarkdown(item.getDetailMarkdown()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit hookAdapter$lambda$4(DirectIpoAllocationClarityCardHookView of, IpoAnnouncementCardHook item) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(item, "item");
        DirectIpoAllocationClarityCardHookView.bind$default(of, item, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buttonAdapter$lambda$5(DirectIpoNotAllocatedFragment directIpoNotAllocatedFragment, ClientComponentButtonView of, ServerDrivenButton it) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(it, "it");
        of.setCallbacks(directIpoNotAllocatedFragment);
        of.bind(it);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getBindings().fragmentDirectIpoNotAllocatedRecyclerView.setAdapter(this.compositeAdapter);
        getBindings().fragmentDirectIpoNotAllocatedButtonRecyclerView.setAdapter(this.buttonAdapter);
        RecyclerView fragmentDirectIpoNotAllocatedButtonRecyclerView = getBindings().fragmentDirectIpoNotAllocatedButtonRecyclerView;
        Intrinsics.checkNotNullExpressionValue(fragmentDirectIpoNotAllocatedButtonRecyclerView, "fragmentDirectIpoNotAllocatedButtonRecyclerView");
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(fragmentDirectIpoNotAllocatedButtonRecyclerView, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        Companion companion = INSTANCE;
        int i = ((UiDirectIpoAllocation.NotAllocated) companion.getArgs((Fragment) this)).getIsV2() ? 17 : 8388611;
        this.titleAdapter.setData(Tuples4.m3642to(((UiDirectIpoAllocation.NotAllocated) companion.getArgs((Fragment) this)).getTitle(), Integer.valueOf(i)));
        this.descriptionAdapter.setData(Tuples4.m3642to(getMarkwon().toMarkdown(((UiDirectIpoAllocation.NotAllocated) companion.getArgs((Fragment) this)).getDetailMarkdown()), Integer.valueOf(i)));
        GenericListAdapter<RdsRowView, UiDirectIpoAllocation.NotAllocated.Row> genericListAdapter = this.rowsAdapter;
        List<UiDirectIpoAllocation.NotAllocated.Row> rows = ((UiDirectIpoAllocation.NotAllocated) companion.getArgs((Fragment) this)).getRows();
        if (rows == null) {
            rows = CollectionsKt.emptyList();
        }
        genericListAdapter.submitList(rows);
        this.hookAdapter.setData(((UiDirectIpoAllocation.NotAllocated) companion.getArgs((Fragment) this)).getCardHook());
        this.buttonAdapter.submitList(((UiDirectIpoAllocation.NotAllocated) companion.getArgs((Fragment) this)).getFooterButtons());
        IdlingResourceCounters2.setBusy(IdlingResourceType.ORDER_DETAIL_EXPLANATION, false);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        final ThemedImageSource headerImage = ((UiDirectIpoAllocation.NotAllocated) INSTANCE.getArgs((Fragment) this)).getHeaderImage();
        if (headerImage != null) {
            Observable<DayNightOverlay> observableDistinctUntilChanged = requireBaseActivity().getDayNightStyleChanges().distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
            LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.directipo.allocation.ui.DirectIpoNotAllocatedFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DirectIpoNotAllocatedFragment.onStart$lambda$7$lambda$6(this.f$0, headerImage, (DayNightOverlay) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$7$lambda$6(DirectIpoNotAllocatedFragment directIpoNotAllocatedFragment, ThemedImageSource themedImageSource, DayNightOverlay dayNightOverlay) {
        directIpoNotAllocatedFragment.headerImageAdapter.setData(Tuples4.m3642to(dayNightOverlay, themedImageSource));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView.Callbacks
    public boolean onActionClicked(ServerDrivenButton button) {
        Intrinsics.checkNotNullParameter(button, "button");
        if (!Intrinsics.areEqual(button.getTypedAction(), GenericAction.DismissAction.INSTANCE)) {
            return false;
        }
        getCallbacks().onAllocationComplete();
        return true;
    }

    /* compiled from: DirectIpoNotAllocatedFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/ui/DirectIpoNotAllocatedFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/directipo/allocation/ui/DirectIpoNotAllocatedFragment;", "Lcom/robinhood/directipo/models/ui/UiDirectIpoAllocation$NotAllocated;", "<init>", "()V", "feature-direct-ipo-allocation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DirectIpoNotAllocatedFragment, UiDirectIpoAllocation.NotAllocated> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public UiDirectIpoAllocation.NotAllocated getArgs(DirectIpoNotAllocatedFragment directIpoNotAllocatedFragment) {
            return (UiDirectIpoAllocation.NotAllocated) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, directIpoNotAllocatedFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DirectIpoNotAllocatedFragment newInstance(UiDirectIpoAllocation.NotAllocated notAllocated) {
            return (DirectIpoNotAllocatedFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, notAllocated);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DirectIpoNotAllocatedFragment directIpoNotAllocatedFragment, UiDirectIpoAllocation.NotAllocated notAllocated) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, directIpoNotAllocatedFragment, notAllocated);
        }
    }
}

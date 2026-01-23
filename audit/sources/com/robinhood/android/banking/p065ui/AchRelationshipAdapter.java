package com.robinhood.android.banking.p065ui;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.ach.format.BankAccountTypes;
import com.robinhood.android.banking.lib.C9631R;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.style.ThemeAttributes;
import com.robinhood.android.designsystem.text.ThemableColorSpans3;
import com.robinhood.models.api.ApiAchRelationship;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.ResourceReferences5;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.GenericViewHolder;
import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AchRelationshipAdapter.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0016\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u001fB\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u0013\u001a\u00020\u00142\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u001e\u0010\u001a\u001a\u00020\u00142\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u001c\u001a\u00020\u0019H\u0016J\b\u0010\u001d\u001a\u00020\u0019H\u0016J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0019H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000R4\u0010\u000b\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n \u000e*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\r0\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\r0\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/banking/ui/AchRelationshipAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/robinhood/utils/ui/view/recyclerview/GenericViewHolder;", "Landroid/view/View;", "showFooter", "", "<init>", "(Z)V", "achRelationships", "", "Lcom/robinhood/models/db/AchRelationship;", "achRelationshipRowClicksSubject", "Lio/reactivex/subjects/PublishSubject;", "Lkotlin/Pair;", "kotlin.jvm.PlatformType", "achRelationshipClicksObservable", "Lio/reactivex/Observable;", "getAchRelationshipClicksObservable", "()Lio/reactivex/Observable;", "setAchRelationships", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "holder", "position", "getItemCount", "getItemViewType", "ViewType", "feature-lib-banking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public class AchRelationshipAdapter extends RecyclerView.Adapter<GenericViewHolder<? extends View>> {
    private final PublishSubject<Tuples2<View, AchRelationship>> achRelationshipRowClicksSubject;
    private List<AchRelationship> achRelationships;
    private final boolean showFooter;

    /* compiled from: AchRelationshipAdapter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ViewType.values().length];
            try {
                iArr[ViewType.ACH_RELATIONSHIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ViewType.FOOTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AchRelationshipAdapter() {
        this(false, 1, null);
    }

    public /* synthetic */ AchRelationshipAdapter(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public AchRelationshipAdapter(boolean z) {
        this.showFooter = z;
        this.achRelationships = CollectionsKt.emptyList();
        PublishSubject<Tuples2<View, AchRelationship>> publishSubjectCreate = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create(...)");
        this.achRelationshipRowClicksSubject = publishSubjectCreate;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AchRelationshipAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/banking/ui/AchRelationshipAdapter$ViewType;", "", "<init>", "(Ljava/lang/String;I)V", "ACH_RELATIONSHIP", "FOOTER", "feature-lib-banking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ViewType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ViewType[] $VALUES;
        public static final ViewType ACH_RELATIONSHIP = new ViewType("ACH_RELATIONSHIP", 0);
        public static final ViewType FOOTER = new ViewType("FOOTER", 1);

        private static final /* synthetic */ ViewType[] $values() {
            return new ViewType[]{ACH_RELATIONSHIP, FOOTER};
        }

        public static EnumEntries<ViewType> getEntries() {
            return $ENTRIES;
        }

        private ViewType(String str, int i) {
        }

        static {
            ViewType[] viewTypeArr$values = $values();
            $VALUES = viewTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(viewTypeArr$values);
        }

        public static ViewType valueOf(String str) {
            return (ViewType) Enum.valueOf(ViewType.class, str);
        }

        public static ViewType[] values() {
            return (ViewType[]) $VALUES.clone();
        }
    }

    public final Observable<Tuples2<View, AchRelationship>> getAchRelationshipClicksObservable() {
        return this.achRelationshipRowClicksSubject;
    }

    public final void setAchRelationships(List<AchRelationship> achRelationships) {
        Intrinsics.checkNotNullParameter(achRelationships, "achRelationships");
        this.achRelationships = achRelationships;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public GenericViewHolder<View> onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        int i = WhenMappings.$EnumSwitchMapping$0[ViewType.values()[viewType].ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(C9631R.layout.ach_list_footer, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            return new GenericViewHolder<>(viewInflate);
        }
        final GenericViewHolder<View> genericViewHolder = new GenericViewHolder<>(RdsRowView.INSTANCE.inflate(parent));
        View itemView = genericViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        OnClickListeners.onClickView(itemView, new Function1() { // from class: com.robinhood.android.banking.ui.AchRelationshipAdapter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AchRelationshipAdapter.onCreateViewHolder$lambda$1$lambda$0(this.f$0, genericViewHolder, (View) obj);
            }
        });
        return genericViewHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreateViewHolder$lambda$1$lambda$0(AchRelationshipAdapter achRelationshipAdapter, GenericViewHolder genericViewHolder, View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        achRelationshipAdapter.achRelationshipRowClicksSubject.onNext(new Tuples2<>(v, achRelationshipAdapter.achRelationships.get(genericViewHolder.getAdapterPosition())));
        return Unit.INSTANCE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(GenericViewHolder<? extends View> holder, int position) {
        Tuples2 tuples2M3642to;
        Intrinsics.checkNotNullParameter(holder, "holder");
        int i = WhenMappings.$EnumSwitchMapping$0[ViewType.values()[getItemViewType(position)].ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        AchRelationship achRelationship = this.achRelationships.get(position);
        View view = holder.getView();
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.designsystem.row.RdsRowView");
        RdsRowView rdsRowView = (RdsRowView) view;
        rdsRowView.setPrimaryText(achRelationship.getBankAccountNickname());
        ApiAchRelationship.BankAccountType bankAccountType = achRelationship.getBankAccountType();
        Resources resources = rdsRowView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rdsRowView.setSecondaryText(BankAccountTypes.getTypeAndLastFourDisplayString(bankAccountType, resources, achRelationship.getBankAccountNumber()));
        if (achRelationship.getState() == ApiAchRelationship.State.NEEDS_APPROVAL) {
            tuples2M3642to = Tuples4.m3642to(Integer.valueOf(C9631R.string.ach_relationship_needs_approval_label), ResourceReferences5.toColor(ThemeAttributes.INSTANCE.getCOLOR_NEGATIVE()));
        } else if (achRelationship.getVerified()) {
            tuples2M3642to = Tuples4.m3642to(Integer.valueOf(C9631R.string.ach_relationship_verified_label), ResourceReferences5.toColor(ThemeAttributes.INSTANCE.getCOLOR_POSITIVE()));
        } else {
            tuples2M3642to = Tuples4.m3642to(Integer.valueOf(C9631R.string.ach_relationship_unverified_label), ResourceReferences5.toColor(ThemeAttributes.INSTANCE.getCOLOR_NEGATIVE()));
        }
        int iIntValue = ((Number) tuples2M3642to.component1()).intValue();
        ResourceReferences4 resourceReferences4 = (ResourceReferences4) tuples2M3642to.component2();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ThemableColorSpans3 themableColorSpans3 = new ThemableColorSpans3(resourceReferences4);
        int length = spannableStringBuilder.length();
        StyleSpan styleSpan = new StyleSpan(1);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) ViewsKt.getString(rdsRowView, iIntValue));
        spannableStringBuilder.setSpan(styleSpan, length2, spannableStringBuilder.length(), 17);
        spannableStringBuilder.setSpan(themableColorSpans3, length, spannableStringBuilder.length(), 17);
        rdsRowView.setMetadataPrimaryText(new SpannedString(spannableStringBuilder));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: getItemCount */
    public int getSize() {
        return this.achRelationships.size() + (this.showFooter ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        ViewType viewType;
        if (position < this.achRelationships.size()) {
            viewType = ViewType.ACH_RELATIONSHIP;
        } else {
            viewType = ViewType.FOOTER;
        }
        return viewType.ordinal();
    }
}

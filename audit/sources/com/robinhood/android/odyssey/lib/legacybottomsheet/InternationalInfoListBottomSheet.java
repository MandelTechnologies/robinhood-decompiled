package com.robinhood.android.odyssey.lib.legacybottomsheet;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.util.InternationalInfo;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.odyssey.lib.SdComponentManager;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InternationalInfoListBottomSheet.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0002\u0016\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/legacybottomsheet/InternationalInfoListBottomSheet;", "Lcom/robinhood/android/odyssey/lib/legacybottomsheet/BaseSdListBottomSheet;", "<init>", "()V", "sdComponentManager", "Lcom/robinhood/android/odyssey/lib/SdComponentManager;", "getSdComponentManager", "()Lcom/robinhood/android/odyssey/lib/SdComponentManager;", "setSdComponentManager", "(Lcom/robinhood/android/odyssey/lib/SdComponentManager;)V", "prohibitedCountrySpannableString", "Landroid/text/SpannedString;", "getProhibitedCountrySpannableString", "()Landroid/text/SpannedString;", "prohibitedCountrySpannableString$delegate", "Lkotlin/Lazy;", "adapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "Lcom/robinhood/android/odyssey/lib/legacybottomsheet/InternationalInfoData;", "configBottomSheet", "", "Args", "Companion", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class InternationalInfoListBottomSheet extends BaseSdListBottomSheet {
    private final GenericListAdapter<RdsRowView, InternationalInfoData> adapter;

    /* renamed from: prohibitedCountrySpannableString$delegate, reason: from kotlin metadata */
    private final Lazy prohibitedCountrySpannableString;
    public SdComponentManager sdComponentManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public InternationalInfoListBottomSheet() {
        super(true);
        this.prohibitedCountrySpannableString = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.odyssey.lib.legacybottomsheet.InternationalInfoListBottomSheet$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InternationalInfoListBottomSheet.prohibitedCountrySpannableString_delegate$lambda$2(this.f$0);
            }
        });
        GenericListAdapter.Companion companion = GenericListAdapter.INSTANCE;
        int i = C20335R.layout.row_bottomsheet_list;
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        this.adapter = companion.m2985of(i, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.odyssey.lib.legacybottomsheet.InternationalInfoListBottomSheet$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return InternationalInfoListBottomSheet.adapter$lambda$4(this.f$0, (RdsRowView) obj, (InternationalInfoData) obj2);
            }
        });
    }

    public final SdComponentManager getSdComponentManager() {
        SdComponentManager sdComponentManager = this.sdComponentManager;
        if (sdComponentManager != null) {
            return sdComponentManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sdComponentManager");
        return null;
    }

    public final void setSdComponentManager(SdComponentManager sdComponentManager) {
        Intrinsics.checkNotNullParameter(sdComponentManager, "<set-?>");
        this.sdComponentManager = sdComponentManager;
    }

    private final SpannedString getProhibitedCountrySpannableString() {
        return (SpannedString) this.prohibitedCountrySpannableString.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$4(final InternationalInfoListBottomSheet internationalInfoListBottomSheet, RdsRowView of, final InternationalInfoData data) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(data, "data");
        RdsRowView.bind$default(of, data.getInfo().getDisplayCountry() + " (" + data.getInfo().getDisplayCountryPhoneCode() + ")", data.isProhibited() ? internationalInfoListBottomSheet.getProhibitedCountrySpannableString() : null, null, null, null, 28, null);
        of.setEnabled(!data.isProhibited());
        OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.odyssey.lib.legacybottomsheet.InternationalInfoListBottomSheet$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InternationalInfoListBottomSheet.adapter$lambda$4$lambda$3(data, internationalInfoListBottomSheet);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SpannedString prohibitedCountrySpannableString_delegate$lambda$2(InternationalInfoListBottomSheet internationalInfoListBottomSheet) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(ContextCompat.getColor(internationalInfoListBottomSheet.requireContext(), C20690R.color.mobius_uv_day));
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) internationalInfoListBottomSheet.getString(C20335R.string.international_bottom_sheet_prohibited_code_hint));
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        return new SpannedString(spannableStringBuilder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$4$lambda$3(InternationalInfoData internationalInfoData, InternationalInfoListBottomSheet internationalInfoListBottomSheet) {
        if (!internationalInfoData.isProhibited()) {
            internationalInfoListBottomSheet.getSdComponentManager().setSelectedInformationalInfo(internationalInfoData.getInfo());
            internationalInfoListBottomSheet.dismiss();
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.odyssey.lib.legacybottomsheet.BaseSdListBottomSheet
    protected void configBottomSheet() {
        List<InternationalInfo> mutableList;
        getTitleText().setText(C20335R.string.bottom_sheet_phone_number_change_country_code_title);
        bindAdapter(getRecyclerView(), this.adapter);
        if (((Args) INSTANCE.getArgs((Fragment) this)).getDefaultCountryCode() == null) {
            mutableList = getSdComponentManager().getInformationalInfoList();
        } else {
            mutableList = CollectionsKt.toMutableList((Collection) getSdComponentManager().getInformationalInfoList());
            if (mutableList.size() > 1) {
                CollectionsKt.sortWith(mutableList, new Comparator() { // from class: com.robinhood.android.odyssey.lib.legacybottomsheet.InternationalInfoListBottomSheet$configBottomSheet$lambda$7$$inlined$sortBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(((InternationalInfo) t).getDisplayCountry(), ((InternationalInfo) t2).getDisplayCountry());
                    }
                });
            }
            for (InternationalInfo internationalInfo : mutableList) {
                if (Intrinsics.areEqual(internationalInfo.getCountryCode().getIso3166CountryCode(), ((Args) INSTANCE.getArgs((Fragment) this)).getDefaultCountryCode())) {
                    if (mutableList.remove(internationalInfo)) {
                        mutableList.add(0, internationalInfo);
                    }
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        List<InternationalInfo> list = mutableList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (InternationalInfo internationalInfo2 : list) {
            List<String> prohibitedCountryCodes = ((Args) INSTANCE.getArgs((Fragment) this)).getProhibitedCountryCodes();
            arrayList.add(new InternationalInfoData(internationalInfo2, prohibitedCountryCodes != null ? prohibitedCountryCodes.contains(internationalInfo2.getCountryCode().getIso3166CountryCode()) : false));
        }
        this.adapter.submitList(arrayList);
    }

    /* compiled from: InternationalInfoListBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/legacybottomsheet/InternationalInfoListBottomSheet$Args;", "Landroid/os/Parcelable;", "defaultCountryCode", "", "prohibitedCountryCodes", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getDefaultCountryCode", "()Ljava/lang/String;", "getProhibitedCountryCodes", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String defaultCountryCode;
        private final List<String> prohibitedCountryCodes;

        /* compiled from: InternationalInfoListBottomSheet.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), parcel.createStringArrayList());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Args() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Args copy$default(Args args, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.defaultCountryCode;
            }
            if ((i & 2) != 0) {
                list = args.prohibitedCountryCodes;
            }
            return args.copy(str, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDefaultCountryCode() {
            return this.defaultCountryCode;
        }

        public final List<String> component2() {
            return this.prohibitedCountryCodes;
        }

        public final Args copy(String defaultCountryCode, List<String> prohibitedCountryCodes) {
            return new Args(defaultCountryCode, prohibitedCountryCodes);
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
            return Intrinsics.areEqual(this.defaultCountryCode, args.defaultCountryCode) && Intrinsics.areEqual(this.prohibitedCountryCodes, args.prohibitedCountryCodes);
        }

        public int hashCode() {
            String str = this.defaultCountryCode;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<String> list = this.prohibitedCountryCodes;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "Args(defaultCountryCode=" + this.defaultCountryCode + ", prohibitedCountryCodes=" + this.prohibitedCountryCodes + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.defaultCountryCode);
            dest.writeStringList(this.prohibitedCountryCodes);
        }

        public Args(String str, List<String> list) {
            this.defaultCountryCode = str;
            this.prohibitedCountryCodes = list;
        }

        public /* synthetic */ Args(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
        }

        public final String getDefaultCountryCode() {
            return this.defaultCountryCode;
        }

        public final List<String> getProhibitedCountryCodes() {
            return this.prohibitedCountryCodes;
        }
    }

    /* compiled from: InternationalInfoListBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/legacybottomsheet/InternationalInfoListBottomSheet$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/odyssey/lib/legacybottomsheet/InternationalInfoListBottomSheet;", "Lcom/robinhood/android/odyssey/lib/legacybottomsheet/InternationalInfoListBottomSheet$Args;", "<init>", "()V", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<InternationalInfoListBottomSheet, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(InternationalInfoListBottomSheet internationalInfoListBottomSheet) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, internationalInfoListBottomSheet);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public InternationalInfoListBottomSheet newInstance(Args args) {
            return (InternationalInfoListBottomSheet) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(InternationalInfoListBottomSheet internationalInfoListBottomSheet, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, internationalInfoListBottomSheet, args);
        }
    }
}

package com.stripe.android.view;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.TextView;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.singular.sdk.internal.Constants;
import com.stripe.android.core.model.Country;
import com.stripe.android.core.model.CountryCode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: CountryAdapter.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00016B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u001d\u0010(\u001a\u00020%2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0000¢\u0006\u0004\b&\u0010'R(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001c\u00102\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010)R\u0014\u00105\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00067"}, m3636d2 = {"Lcom/stripe/android/view/CountryAdapter;", "Landroid/widget/ArrayAdapter;", "Lcom/stripe/android/core/model/Country;", "Landroid/content/Context;", "context", "", "unfilteredCountries", "", "itemLayoutId", "Lkotlin/Function1;", "Landroid/view/ViewGroup;", "Landroid/widget/TextView;", "textViewFactory", "<init>", "(Landroid/content/Context;Ljava/util/List;ILkotlin/jvm/functions/Function1;)V", "getCount", "()I", Constants.RequestParamsKeys.PACKAGE_NAME_KEY, "getItem", "(I)Lcom/stripe/android/core/model/Country;", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "getPosition", "(Lcom/stripe/android/core/model/Country;)I", "", "getItemId", "(I)J", "Landroid/view/View;", "view", "viewGroup", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/widget/Filter;", "getFilter", "()Landroid/widget/Filter;", "", "", "allowedCountryCodes", "", "updateUnfilteredCountries$payments_core_release", "(Ljava/util/Set;)Z", "updateUnfilteredCountries", "Ljava/util/List;", "getUnfilteredCountries$payments_core_release", "()Ljava/util/List;", "setUnfilteredCountries$payments_core_release", "(Ljava/util/List;)V", "Lkotlin/jvm/functions/Function1;", "Lcom/stripe/android/view/CountryAdapter$CountryFilter;", "countryFilter", "Lcom/stripe/android/view/CountryAdapter$CountryFilter;", "suggestions", "getFirstItem$payments_core_release", "()Lcom/stripe/android/core/model/Country;", "firstItem", "CountryFilter", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class CountryAdapter extends ArrayAdapter<Country> {
    private final CountryFilter countryFilter;
    private List<Country> suggestions;
    private final Function1<ViewGroup, TextView> textViewFactory;
    private List<Country> unfilteredCountries;

    public final List<Country> getUnfilteredCountries$payments_core_release() {
        return this.unfilteredCountries;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CountryAdapter(Context context, List<Country> unfilteredCountries, int i, Function1<? super ViewGroup, ? extends TextView> textViewFactory) {
        super(context, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(unfilteredCountries, "unfilteredCountries");
        Intrinsics.checkNotNullParameter(textViewFactory, "textViewFactory");
        this.unfilteredCountries = unfilteredCountries;
        this.textViewFactory = textViewFactory;
        this.countryFilter = new CountryFilter(this.unfilteredCountries, this, context instanceof Activity ? (Activity) context : null);
        this.suggestions = this.unfilteredCountries;
    }

    public final /* synthetic */ Country getFirstItem$payments_core_release() {
        return getItem(0);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        return this.suggestions.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public Country getItem(int i) {
        return this.suggestions.get(i);
    }

    @Override // android.widget.ArrayAdapter
    public int getPosition(Country item) {
        return CollectionsKt.indexOf((List<? extends Country>) this.suggestions, item);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public long getItemId(int i) {
        return getItem(i).hashCode();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        TextView textViewInvoke = view instanceof TextView ? (TextView) view : this.textViewFactory.invoke(viewGroup);
        textViewInvoke.setText(getItem(i).getName());
        return textViewInvoke;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public Filter getFilter() {
        return this.countryFilter;
    }

    public final boolean updateUnfilteredCountries$payments_core_release(Set<String> allowedCountryCodes) {
        Intrinsics.checkNotNullParameter(allowedCountryCodes, "allowedCountryCodes");
        if (allowedCountryCodes.isEmpty()) {
            return false;
        }
        List<Country> list = this.unfilteredCountries;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            CountryCode code = ((Country) obj).getCode();
            Set<String> set = allowedCountryCodes;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (StringsKt.equals((String) it.next(), code.getValue(), true)) {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
        }
        this.unfilteredCountries = arrayList;
        this.countryFilter.setUnfilteredCountries(arrayList);
        this.suggestions = this.unfilteredCountries;
        notifyDataSetChanged();
        return true;
    }

    /* compiled from: CountryAdapter.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ'\u0010\u0012\u001a\u00020\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\u00172\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001b\u001a\u00020\u00142\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0017H\u0014¢\u0006\u0004\b\u001b\u0010\u001cR(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, m3636d2 = {"Lcom/stripe/android/view/CountryAdapter$CountryFilter;", "Landroid/widget/Filter;", "", "Lcom/stripe/android/core/model/Country;", "unfilteredCountries", "Lcom/stripe/android/view/CountryAdapter;", "adapter", "Landroid/app/Activity;", "activity", "<init>", "(Ljava/util/List;Lcom/stripe/android/view/CountryAdapter;Landroid/app/Activity;)V", "", "constraint", "filteredSuggestedCountries", "(Ljava/lang/CharSequence;)Ljava/util/List;", "getSuggestedCountries", "countries", "", "isMatch", "(Ljava/util/List;Ljava/lang/CharSequence;)Z", "", "hideKeyboard", "(Landroid/app/Activity;)V", "Landroid/widget/Filter$FilterResults;", "performFiltering", "(Ljava/lang/CharSequence;)Landroid/widget/Filter$FilterResults;", "filterResults", "publishResults", "(Ljava/lang/CharSequence;Landroid/widget/Filter$FilterResults;)V", "Ljava/util/List;", "getUnfilteredCountries", "()Ljava/util/List;", "setUnfilteredCountries", "(Ljava/util/List;)V", "Lcom/stripe/android/view/CountryAdapter;", "Ljava/lang/ref/WeakReference;", "activityRef", "Ljava/lang/ref/WeakReference;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    private static final class CountryFilter extends Filter {
        private final WeakReference<Activity> activityRef;
        private final CountryAdapter adapter;
        private List<Country> unfilteredCountries;

        public final void setUnfilteredCountries(List<Country> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.unfilteredCountries = list;
        }

        public CountryFilter(List<Country> unfilteredCountries, CountryAdapter adapter, Activity activity) {
            Intrinsics.checkNotNullParameter(unfilteredCountries, "unfilteredCountries");
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            this.unfilteredCountries = unfilteredCountries;
            this.adapter = adapter;
            this.activityRef = new WeakReference<>(activity);
        }

        @Override // android.widget.Filter
        protected Filter.FilterResults performFiltering(CharSequence constraint) {
            List<Country> listFilteredSuggestedCountries;
            Filter.FilterResults filterResults = new Filter.FilterResults();
            if (constraint == null || (listFilteredSuggestedCountries = filteredSuggestedCountries(constraint)) == null) {
                listFilteredSuggestedCountries = this.unfilteredCountries;
            }
            filterResults.values = listFilteredSuggestedCountries;
            return filterResults;
        }

        @Override // android.widget.Filter
        protected void publishResults(CharSequence constraint, Filter.FilterResults filterResults) {
            Object obj = filterResults != null ? filterResults.values : null;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<com.stripe.android.core.model.Country>");
            List list = (List) obj;
            Activity activity = this.activityRef.get();
            if (activity != null) {
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (Intrinsics.areEqual(((Country) it.next()).getName(), constraint)) {
                            hideKeyboard(activity);
                            break;
                        }
                    }
                }
            }
            this.adapter.suggestions = list;
            this.adapter.notifyDataSetChanged();
        }

        private final List<Country> filteredSuggestedCountries(CharSequence constraint) {
            List<Country> suggestedCountries = getSuggestedCountries(constraint);
            return (suggestedCountries.isEmpty() || isMatch(suggestedCountries, constraint)) ? this.unfilteredCountries : suggestedCountries;
        }

        private final List<Country> getSuggestedCountries(CharSequence constraint) {
            List<Country> list = this.unfilteredCountries;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                String name = ((Country) obj).getName();
                Locale locale = Locale.ROOT;
                String lowerCase = name.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                String lowerCase2 = String.valueOf(constraint).toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                if (StringsKt.startsWith$default(lowerCase, lowerCase2, false, 2, (Object) null)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }

        private final boolean isMatch(List<Country> countries, CharSequence constraint) {
            return countries.size() == 1 && Intrinsics.areEqual(countries.get(0).getName(), String.valueOf(constraint));
        }

        private final void hideKeyboard(Activity activity) {
            Object systemService = activity.getSystemService("input_method");
            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
            if (inputMethodManager == null || !inputMethodManager.isAcceptingText()) {
                return;
            }
            View currentFocus = activity.getCurrentFocus();
            inputMethodManager.hideSoftInputFromWindow(currentFocus != null ? currentFocus.getWindowToken() : null, 0);
        }
    }
}

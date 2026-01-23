package com.robinhood.android.educationtour.extensions;

import android.view.View;
import android.view.ViewGroup;
import com.robinhood.android.educationtour.C14469R;
import com.robinhood.android.util.extensions.ViewTags;
import com.robinhood.compose.app.GenericComposeView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: Views.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\"3\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u00032\b\u0010\u0000\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\"3\u0010\n\u001a\u0004\u0018\u00010\u0001*\u00020\u000b2\b\u0010\u0000\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\t\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\"?\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011*\u00020\u00132\u000e\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00118F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m3636d2 = {"<set-?>", "", "educationTourId", "Landroid/view/View;", "getEducationTourId", "(Landroid/view/View;)Ljava/lang/String;", "setEducationTourId", "(Landroid/view/View;Ljava/lang/String;)V", "educationTourId$delegate", "Lkotlin/properties/ReadWriteProperty;", "educationTourScreenName", "Landroid/view/ViewGroup;", "getEducationTourScreenName", "(Landroid/view/ViewGroup;)Ljava/lang/String;", "setEducationTourScreenName", "(Landroid/view/ViewGroup;Ljava/lang/String;)V", "educationTourScreenName$delegate", "", "educationTourIds", "Lcom/robinhood/compose/app/GenericComposeView;", "getEducationTourIds", "(Lcom/robinhood/compose/app/GenericComposeView;)Ljava/util/List;", "setEducationTourIds", "(Lcom/robinhood/compose/app/GenericComposeView;Ljava/util/List;)V", "educationTourIds$delegate", "lib-education-tour_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class ViewsKt {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(ViewsKt.class, "educationTourId", "getEducationTourId(Landroid/view/View;)Ljava/lang/String;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ViewsKt.class, "educationTourScreenName", "getEducationTourScreenName(Landroid/view/ViewGroup;)Ljava/lang/String;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ViewsKt.class, "educationTourIds", "getEducationTourIds(Lcom/robinhood/compose/app/GenericComposeView;)Ljava/util/List;", 1))};
    private static final Interfaces3 educationTourId$delegate;
    private static final Interfaces3 educationTourIds$delegate;
    private static final Interfaces3 educationTourScreenName$delegate;

    static {
        ViewTags viewTags = ViewTags.INSTANCE;
        educationTourId$delegate = viewTags.property(C14469R.id.tag_education_tour_element_id);
        educationTourScreenName$delegate = viewTags.property(C14469R.id.tag_education_tour_screen_id);
        educationTourIds$delegate = viewTags.property(C14469R.id.tag_education_tour_compose_view_element_ids);
    }

    public static final String getEducationTourId(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (String) educationTourId$delegate.getValue(view, $$delegatedProperties[0]);
    }

    public static final void setEducationTourId(View view, String str) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        educationTourId$delegate.setValue(view, $$delegatedProperties[0], str);
    }

    public static final String getEducationTourScreenName(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        return (String) educationTourScreenName$delegate.getValue(viewGroup, $$delegatedProperties[1]);
    }

    public static final void setEducationTourScreenName(ViewGroup viewGroup, String str) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        educationTourScreenName$delegate.setValue(viewGroup, $$delegatedProperties[1], str);
    }

    public static final List<String> getEducationTourIds(GenericComposeView genericComposeView) {
        Intrinsics.checkNotNullParameter(genericComposeView, "<this>");
        return (List) educationTourIds$delegate.getValue(genericComposeView, $$delegatedProperties[2]);
    }

    public static final void setEducationTourIds(GenericComposeView genericComposeView, List<String> list) {
        Intrinsics.checkNotNullParameter(genericComposeView, "<this>");
        educationTourIds$delegate.setValue(genericComposeView, $$delegatedProperties[2], list);
    }
}

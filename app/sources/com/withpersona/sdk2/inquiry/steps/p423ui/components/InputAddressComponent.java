package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.Json;
import com.squareup.workflow1.p415ui.TextController;
import com.squareup.workflow1.p415ui.TextController3;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputAddress;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.utils.TwoStateViewController;
import com.withpersona.sdk2.inquiry.steps.p423ui.network.AddressAutocompleteResponse3;
import com.withpersona.sdk2.inquiry.steps.p423ui.view.AssociatedHideableView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InputAddressComponent.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\"\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u008d\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0018B\u0019\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u001bJ\u0019\u0010\u001d\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010 \u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\"\u0010!J\u0019\u0010#\u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b#\u0010!J\u0019\u0010$\u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b$\u0010!J\u0019\u0010%\u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b%\u0010!J\u0019\u0010&\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b&\u0010!J\u001f\u0010'\u001a\u00020\u00002\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0016¢\u0006\u0004\b'\u0010(J\u0019\u0010*\u001a\u00020\u00002\b\u0010)\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b*\u0010!J\u0019\u0010+\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b+\u0010\u001eJ\u001d\u00101\u001a\u0002002\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020.¢\u0006\u0004\b3\u00104J¦\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020.HÖ\u0001¢\u0006\u0004\b9\u00104J\u001a\u0010<\u001a\u00020\u00142\b\u0010;\u001a\u0004\u0018\u00010:HÖ\u0003¢\u0006\u0004\b<\u0010=R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010>\u001a\u0004\b?\u00108R\"\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010>\u001a\u0004\b@\u00108\"\u0004\bA\u0010BR\"\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010>\u001a\u0004\bC\u00108\"\u0004\bD\u0010BR\"\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010>\u001a\u0004\bE\u00108\"\u0004\bF\u0010BR\"\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010>\u001a\u0004\bG\u00108\"\u0004\bH\u0010BR\"\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010>\u001a\u0004\bI\u00108\"\u0004\bJ\u0010BR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010K\u001a\u0004\bL\u0010MR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010K\u001a\u0004\bN\u0010MR$\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010>\u001a\u0004\bO\u00108\"\u0004\bP\u0010BR*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR$\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010>\u001a\u0004\bV\u00108\"\u0004\bW\u0010BR$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010X\u001a\u0004\b\u0015\u0010Y\"\u0004\bZ\u0010[R$\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010X\u001a\u0004\b\u0016\u0010Y\"\u0004\b\\\u0010[R&\u0010_\u001a\b\u0012\u0004\u0012\u00020^0]8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b_\u0010Q\u0012\u0004\ba\u0010b\u001a\u0004\b`\u0010SR(\u0010d\u001a\u00020c8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\bd\u0010e\u0012\u0004\bi\u0010b\u001a\u0004\bd\u0010f\"\u0004\bg\u0010hR(\u0010k\u001a\u00020j8\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\bk\u0010l\u0012\u0004\bq\u0010b\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR(\u0010r\u001a\u00020j8\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\br\u0010l\u0012\u0004\bu\u0010b\u001a\u0004\bs\u0010n\"\u0004\bt\u0010pR(\u0010v\u001a\u00020j8\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\bv\u0010l\u0012\u0004\by\u0010b\u001a\u0004\bw\u0010n\"\u0004\bx\u0010pR(\u0010z\u001a\u00020j8\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\bz\u0010l\u0012\u0004\b}\u0010b\u001a\u0004\b{\u0010n\"\u0004\b|\u0010pR*\u0010~\u001a\u00020j8\u0016@\u0016X\u0097\u000e¢\u0006\u001a\n\u0004\b~\u0010l\u0012\u0005\b\u0081\u0001\u0010b\u001a\u0004\b\u007f\u0010n\"\u0005\b\u0080\u0001\u0010p¨\u0006\u0082\u0001"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/AddressValueComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/DisableableComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/HideableComponent;", "", "name", "street1", "street2", "city", "subdivision", "postalCode", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", "searchQuery", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/network/Suggestion;", "searchResults", "selectedSearchResultId", "", "isAddressAutocompleteLoading", "isAddressComponentsCollapsed", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;", "config", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;Z)V", "newState", "updateCollapsedState", "(Ljava/lang/Boolean;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "newString", "updateAddressStreet1", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "updateAddressStreet2", "updateAddressCity", "updateAddressSubdivision", "updateAddressPostalCode", "updateSearchQuery", "updateSearchResults", "(Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "resultId", "updateSelectedSearchResultId", "updateIsAddressAutocompleteLoading", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getStreet1", "setStreet1", "(Ljava/lang/String;)V", "getStreet2", "setStreet2", "getCity", "setCity", "getSubdivision", "setSubdivision", "getPostalCode", "setPostalCode", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "getSearchQuery", "setSearchQuery", "Ljava/util/List;", "getSearchResults", "()Ljava/util/List;", "setSearchResults", "(Ljava/util/List;)V", "getSelectedSearchResultId", "setSelectedSearchResultId", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "setAddressAutocompleteLoading", "(Ljava/lang/Boolean;)V", "setAddressComponentsCollapsed", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/view/AssociatedHideableView;", "associatedViews", "getAssociatedViews", "getAssociatedViews$annotations", "()V", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/TwoStateViewController;", "isAddressFieldCollapsed", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/TwoStateViewController;", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/TwoStateViewController;", "setAddressFieldCollapsed", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/TwoStateViewController;)V", "isAddressFieldCollapsed$annotations", "Lcom/squareup/workflow1/ui/TextController;", "textControllerForAddressStreet1", "Lcom/squareup/workflow1/ui/TextController;", "getTextControllerForAddressStreet1", "()Lcom/squareup/workflow1/ui/TextController;", "setTextControllerForAddressStreet1", "(Lcom/squareup/workflow1/ui/TextController;)V", "getTextControllerForAddressStreet1$annotations", "textControllerForAddressStreet2", "getTextControllerForAddressStreet2", "setTextControllerForAddressStreet2", "getTextControllerForAddressStreet2$annotations", "textControllerForAddressCity", "getTextControllerForAddressCity", "setTextControllerForAddressCity", "getTextControllerForAddressCity$annotations", "textControllerForAddressSubdivision", "getTextControllerForAddressSubdivision", "setTextControllerForAddressSubdivision", "getTextControllerForAddressSubdivision$annotations", "textControllerForAddressPostalCode", "getTextControllerForAddressPostalCode", "setTextControllerForAddressPostalCode", "getTextControllerForAddressPostalCode$annotations", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class InputAddressComponent implements UiComponent, AddressValueComponent, UiComponentAttributes2, UiComponentAttributes3 {
    public static final Parcelable.Creator<InputAddressComponent> CREATOR = new Creator();
    private final List<AssociatedHideableView> associatedViews;
    private String city;
    private final JsonLogicBoolean disabled;
    private final JsonLogicBoolean hidden;
    private Boolean isAddressAutocompleteLoading;
    private Boolean isAddressComponentsCollapsed;
    private TwoStateViewController isAddressFieldCollapsed;
    private final String name;
    private String postalCode;
    private String searchQuery;
    private List<AddressAutocompleteResponse3> searchResults;
    private String selectedSearchResultId;
    private String street1;
    private String street2;
    private String subdivision;
    private TextController textControllerForAddressCity;
    private TextController textControllerForAddressPostalCode;
    private TextController textControllerForAddressStreet1;
    private TextController textControllerForAddressStreet2;
    private TextController textControllerForAddressSubdivision;

    /* compiled from: InputAddressComponent.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<InputAddressComponent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputAddressComponent createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            JsonLogicBoolean jsonLogicBoolean = (JsonLogicBoolean) parcel.readParcelable(InputAddressComponent.class.getClassLoader());
            JsonLogicBoolean jsonLogicBoolean2 = (JsonLogicBoolean) parcel.readParcelable(InputAddressComponent.class.getClassLoader());
            String string8 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(AddressAutocompleteResponse3.CREATOR.createFromParcel(parcel));
                }
            }
            return new InputAddressComponent(string2, string3, string4, string5, string6, string7, jsonLogicBoolean, jsonLogicBoolean2, string8, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputAddressComponent[] newArray(int i) {
            return new InputAddressComponent[i];
        }
    }

    public static /* synthetic */ InputAddressComponent copy$default(InputAddressComponent inputAddressComponent, String str, String str2, String str3, String str4, String str5, String str6, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, String str7, List list, String str8, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inputAddressComponent.name;
        }
        return inputAddressComponent.copy(str, (i & 2) != 0 ? inputAddressComponent.street1 : str2, (i & 4) != 0 ? inputAddressComponent.street2 : str3, (i & 8) != 0 ? inputAddressComponent.city : str4, (i & 16) != 0 ? inputAddressComponent.subdivision : str5, (i & 32) != 0 ? inputAddressComponent.postalCode : str6, (i & 64) != 0 ? inputAddressComponent.hidden : jsonLogicBoolean, (i & 128) != 0 ? inputAddressComponent.disabled : jsonLogicBoolean2, (i & 256) != 0 ? inputAddressComponent.searchQuery : str7, (i & 512) != 0 ? inputAddressComponent.searchResults : list, (i & 1024) != 0 ? inputAddressComponent.selectedSearchResultId : str8, (i & 2048) != 0 ? inputAddressComponent.isAddressAutocompleteLoading : bool, (i & 4096) != 0 ? inputAddressComponent.isAddressComponentsCollapsed : bool2);
    }

    @Json(ignore = true)
    public static /* synthetic */ void getTextControllerForAddressCity$annotations() {
    }

    @Json(ignore = true)
    public static /* synthetic */ void getTextControllerForAddressPostalCode$annotations() {
    }

    @Json(ignore = true)
    public static /* synthetic */ void getTextControllerForAddressStreet1$annotations() {
    }

    @Json(ignore = true)
    public static /* synthetic */ void getTextControllerForAddressStreet2$annotations() {
    }

    @Json(ignore = true)
    public static /* synthetic */ void getTextControllerForAddressSubdivision$annotations() {
    }

    public final InputAddressComponent copy(String name, String street1, String street2, String city, String subdivision, String postalCode, JsonLogicBoolean hidden, JsonLogicBoolean disabled, String searchQuery, List<AddressAutocompleteResponse3> searchResults, String selectedSearchResultId, Boolean isAddressAutocompleteLoading, Boolean isAddressComponentsCollapsed) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(street1, "street1");
        Intrinsics.checkNotNullParameter(street2, "street2");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(subdivision, "subdivision");
        Intrinsics.checkNotNullParameter(postalCode, "postalCode");
        return new InputAddressComponent(name, street1, street2, city, subdivision, postalCode, hidden, disabled, searchQuery, searchResults, selectedSearchResultId, isAddressAutocompleteLoading, isAddressComponentsCollapsed);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputAddressComponent)) {
            return false;
        }
        InputAddressComponent inputAddressComponent = (InputAddressComponent) other;
        return Intrinsics.areEqual(this.name, inputAddressComponent.name) && Intrinsics.areEqual(this.street1, inputAddressComponent.street1) && Intrinsics.areEqual(this.street2, inputAddressComponent.street2) && Intrinsics.areEqual(this.city, inputAddressComponent.city) && Intrinsics.areEqual(this.subdivision, inputAddressComponent.subdivision) && Intrinsics.areEqual(this.postalCode, inputAddressComponent.postalCode) && Intrinsics.areEqual(this.hidden, inputAddressComponent.hidden) && Intrinsics.areEqual(this.disabled, inputAddressComponent.disabled) && Intrinsics.areEqual(this.searchQuery, inputAddressComponent.searchQuery) && Intrinsics.areEqual(this.searchResults, inputAddressComponent.searchResults) && Intrinsics.areEqual(this.selectedSearchResultId, inputAddressComponent.selectedSearchResultId) && Intrinsics.areEqual(this.isAddressAutocompleteLoading, inputAddressComponent.isAddressAutocompleteLoading) && Intrinsics.areEqual(this.isAddressComponentsCollapsed, inputAddressComponent.isAddressComponentsCollapsed);
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.name.hashCode() * 31) + this.street1.hashCode()) * 31) + this.street2.hashCode()) * 31) + this.city.hashCode()) * 31) + this.subdivision.hashCode()) * 31) + this.postalCode.hashCode()) * 31;
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int iHashCode2 = (iHashCode + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        int iHashCode3 = (iHashCode2 + (jsonLogicBoolean2 == null ? 0 : jsonLogicBoolean2.hashCode())) * 31;
        String str = this.searchQuery;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List<AddressAutocompleteResponse3> list = this.searchResults;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.selectedSearchResultId;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isAddressAutocompleteLoading;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isAddressComponentsCollapsed;
        return iHashCode7 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        return "InputAddressComponent(name=" + this.name + ", street1=" + this.street1 + ", street2=" + this.street2 + ", city=" + this.city + ", subdivision=" + this.subdivision + ", postalCode=" + this.postalCode + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ", searchQuery=" + this.searchQuery + ", searchResults=" + this.searchResults + ", selectedSearchResultId=" + this.selectedSearchResultId + ", isAddressAutocompleteLoading=" + this.isAddressAutocompleteLoading + ", isAddressComponentsCollapsed=" + this.isAddressComponentsCollapsed + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        dest.writeString(this.street1);
        dest.writeString(this.street2);
        dest.writeString(this.city);
        dest.writeString(this.subdivision);
        dest.writeString(this.postalCode);
        dest.writeParcelable(this.hidden, flags);
        dest.writeParcelable(this.disabled, flags);
        dest.writeString(this.searchQuery);
        List<AddressAutocompleteResponse3> list = this.searchResults;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<AddressAutocompleteResponse3> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        dest.writeString(this.selectedSearchResultId);
        Boolean bool = this.isAddressAutocompleteLoading;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.isAddressComponentsCollapsed;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    public InputAddressComponent(String name, String street1, String street2, String city, String subdivision, String postalCode, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, String str, List<AddressAutocompleteResponse3> list, String str2, Boolean bool, Boolean bool2) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(street1, "street1");
        Intrinsics.checkNotNullParameter(street2, "street2");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(subdivision, "subdivision");
        Intrinsics.checkNotNullParameter(postalCode, "postalCode");
        this.name = name;
        this.street1 = street1;
        this.street2 = street2;
        this.city = city;
        this.subdivision = subdivision;
        this.postalCode = postalCode;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.searchQuery = str;
        this.searchResults = list;
        this.selectedSearchResultId = str2;
        this.isAddressAutocompleteLoading = bool;
        this.isAddressComponentsCollapsed = bool2;
        this.associatedViews = new ArrayList();
        this.isAddressFieldCollapsed = new TwoStateViewController(true);
        this.textControllerForAddressStreet1 = TextController3.TextController(this.street1);
        this.textControllerForAddressStreet2 = TextController3.TextController(this.street2);
        this.textControllerForAddressCity = TextController3.TextController(this.city);
        this.textControllerForAddressSubdivision = TextController3.TextController(this.subdivision);
        this.textControllerForAddressPostalCode = TextController3.TextController(this.postalCode);
    }

    public /* synthetic */ InputAddressComponent(String str, String str2, String str3, String str4, String str5, String str6, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, String str7, List list, String str8, Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, jsonLogicBoolean, jsonLogicBoolean2, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : list, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : bool, (i & 4096) != 0 ? null : bool2);
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponent
    public String getName() {
        return this.name;
    }

    public final String getStreet1() {
        return this.street1;
    }

    public final String getStreet2() {
        return this.street2;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getSubdivision() {
        return this.subdivision;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponentAttributes3
    public JsonLogicBoolean getHidden() {
        return this.hidden;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponentAttributes2
    public JsonLogicBoolean getDisabled() {
        return this.disabled;
    }

    public final String getSearchQuery() {
        return this.searchQuery;
    }

    public final List<AddressAutocompleteResponse3> getSearchResults() {
        return this.searchResults;
    }

    public final String getSelectedSearchResultId() {
        return this.selectedSearchResultId;
    }

    /* renamed from: isAddressAutocompleteLoading, reason: from getter */
    public final Boolean getIsAddressAutocompleteLoading() {
        return this.isAddressAutocompleteLoading;
    }

    /* renamed from: isAddressComponentsCollapsed, reason: from getter */
    public final Boolean getIsAddressComponentsCollapsed() {
        return this.isAddressComponentsCollapsed;
    }

    public final void setAddressComponentsCollapsed(Boolean bool) {
        this.isAddressComponentsCollapsed = bool;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public InputAddressComponent(InputAddress config, boolean z) {
        Intrinsics.checkNotNullParameter(config, "config");
        String name = config.getName();
        InputAddress.Attributes attributes = config.getAttributes();
        String prefillAddressStreet1 = (attributes == null || (prefillAddressStreet1 = attributes.getPrefillAddressStreet1()) == null) ? "" : prefillAddressStreet1;
        InputAddress.Attributes attributes2 = config.getAttributes();
        String prefillAddressStreet2 = (attributes2 == null || (prefillAddressStreet2 = attributes2.getPrefillAddressStreet2()) == null) ? "" : prefillAddressStreet2;
        InputAddress.Attributes attributes3 = config.getAttributes();
        String prefillAddressCity = (attributes3 == null || (prefillAddressCity = attributes3.getPrefillAddressCity()) == null) ? "" : prefillAddressCity;
        InputAddress.Attributes attributes4 = config.getAttributes();
        String prefillAddressSubdivision = (attributes4 == null || (prefillAddressSubdivision = attributes4.getPrefillAddressSubdivision()) == null) ? "" : prefillAddressSubdivision;
        InputAddress.Attributes attributes5 = config.getAttributes();
        String prefillAddressPostalCode = (attributes5 == null || (prefillAddressPostalCode = attributes5.getPrefillAddressPostalCode()) == null) ? "" : prefillAddressPostalCode;
        InputAddress.Attributes attributes6 = config.getAttributes();
        JsonLogicBoolean hidden = attributes6 != null ? attributes6.getHidden() : null;
        InputAddress.Attributes attributes7 = config.getAttributes();
        this(name, prefillAddressStreet1, prefillAddressStreet2, prefillAddressCity, prefillAddressSubdivision, prefillAddressPostalCode, hidden, attributes7 != null ? attributes7.getDisabled() : null, null, null, null, null, Boolean.valueOf(z), 3840, null);
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponentAttributes3
    public List<AssociatedHideableView> getAssociatedViews() {
        return this.associatedViews;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.AddressValueComponent
    /* renamed from: isAddressFieldCollapsed, reason: from getter */
    public TwoStateViewController getIsAddressFieldCollapsed() {
        return this.isAddressFieldCollapsed;
    }

    public void setAddressFieldCollapsed(TwoStateViewController twoStateViewController) {
        Intrinsics.checkNotNullParameter(twoStateViewController, "<set-?>");
        this.isAddressFieldCollapsed = twoStateViewController;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.AddressValueComponent
    public TextController getTextControllerForAddressStreet1() {
        return this.textControllerForAddressStreet1;
    }

    public void setTextControllerForAddressStreet1(TextController textController) {
        Intrinsics.checkNotNullParameter(textController, "<set-?>");
        this.textControllerForAddressStreet1 = textController;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.AddressValueComponent
    public TextController getTextControllerForAddressStreet2() {
        return this.textControllerForAddressStreet2;
    }

    public void setTextControllerForAddressStreet2(TextController textController) {
        Intrinsics.checkNotNullParameter(textController, "<set-?>");
        this.textControllerForAddressStreet2 = textController;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.AddressValueComponent
    public TextController getTextControllerForAddressCity() {
        return this.textControllerForAddressCity;
    }

    public void setTextControllerForAddressCity(TextController textController) {
        Intrinsics.checkNotNullParameter(textController, "<set-?>");
        this.textControllerForAddressCity = textController;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.AddressValueComponent
    public TextController getTextControllerForAddressSubdivision() {
        return this.textControllerForAddressSubdivision;
    }

    public void setTextControllerForAddressSubdivision(TextController textController) {
        Intrinsics.checkNotNullParameter(textController, "<set-?>");
        this.textControllerForAddressSubdivision = textController;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.AddressValueComponent
    public TextController getTextControllerForAddressPostalCode() {
        return this.textControllerForAddressPostalCode;
    }

    public void setTextControllerForAddressPostalCode(TextController textController) {
        Intrinsics.checkNotNullParameter(textController, "<set-?>");
        this.textControllerForAddressPostalCode = textController;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.AddressValueComponent
    public InputAddressComponent updateCollapsedState(Boolean newState) {
        return InputAddressComponent2.copyControllers(copy$default(this, null, null, null, null, null, null, null, null, null, null, null, null, newState, 4095, null), this);
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.AddressValueComponent
    public InputAddressComponent updateAddressStreet1(String newString) {
        return InputAddressComponent2.copyControllers(copy$default(this, null, newString == null ? "" : newString, null, null, null, null, null, null, null, null, null, null, null, 8189, null), this);
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.AddressValueComponent
    public InputAddressComponent updateAddressStreet2(String newString) {
        return InputAddressComponent2.copyControllers(copy$default(this, null, null, newString == null ? "" : newString, null, null, null, null, null, null, null, null, null, null, 8187, null), this);
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.AddressValueComponent
    public InputAddressComponent updateAddressCity(String newString) {
        return InputAddressComponent2.copyControllers(copy$default(this, null, null, null, newString == null ? "" : newString, null, null, null, null, null, null, null, null, null, 8183, null), this);
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.AddressValueComponent
    public InputAddressComponent updateAddressSubdivision(String newString) {
        return InputAddressComponent2.copyControllers(copy$default(this, null, null, null, null, newString == null ? "" : newString, null, null, null, null, null, null, null, null, 8175, null), this);
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.AddressValueComponent
    public InputAddressComponent updateAddressPostalCode(String newString) {
        return InputAddressComponent2.copyControllers(copy$default(this, null, null, null, null, null, newString == null ? "" : newString, null, null, null, null, null, null, null, 8159, null), this);
    }

    public InputAddressComponent updateSearchQuery(String searchQuery) {
        return InputAddressComponent2.copyControllers(copy$default(this, null, null, null, null, null, null, null, null, searchQuery, null, null, null, null, 7935, null), this);
    }

    public InputAddressComponent updateSearchResults(List<AddressAutocompleteResponse3> searchResults) {
        return InputAddressComponent2.copyControllers(copy$default(this, null, null, null, null, null, null, null, null, null, searchResults, null, null, null, 7679, null), this);
    }

    public InputAddressComponent updateSelectedSearchResultId(String resultId) {
        return InputAddressComponent2.copyControllers(copy$default(this, null, null, null, null, null, null, null, null, null, null, resultId, null, null, 7167, null), this);
    }

    public InputAddressComponent updateIsAddressAutocompleteLoading(Boolean isAddressAutocompleteLoading) {
        return InputAddressComponent2.copyControllers(copy$default(this, null, null, null, null, null, null, null, null, null, null, null, isAddressAutocompleteLoading, null, 6143, null), this);
    }
}

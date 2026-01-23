package com.stripe.android.stripe3ds2.databinding;

import android.view.View;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.stripe.android.stripe3ds2.R$id;
import com.stripe.android.stripe3ds2.views.BrandZoneView;
import com.stripe.android.stripe3ds2.views.ChallengeZoneView;
import com.stripe.android.stripe3ds2.views.InformationZoneView;

/* loaded from: classes26.dex */
public final class StripeChallengeFragmentBinding implements ViewBinding {
    public final BrandZoneView caBrandZone;
    public final ChallengeZoneView caChallengeZone;
    public final InformationZoneView caInformationZone;
    private final ScrollView rootView;

    private StripeChallengeFragmentBinding(ScrollView scrollView, BrandZoneView brandZoneView, ChallengeZoneView challengeZoneView, InformationZoneView informationZoneView) {
        this.rootView = scrollView;
        this.caBrandZone = brandZoneView;
        this.caChallengeZone = challengeZoneView;
        this.caInformationZone = informationZoneView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ScrollView getRoot() {
        return this.rootView;
    }

    public static StripeChallengeFragmentBinding bind(View view) {
        int i = R$id.ca_brand_zone;
        BrandZoneView brandZoneView = (BrandZoneView) ViewBindings.findChildViewById(view, i);
        if (brandZoneView != null) {
            i = R$id.ca_challenge_zone;
            ChallengeZoneView challengeZoneView = (ChallengeZoneView) ViewBindings.findChildViewById(view, i);
            if (challengeZoneView != null) {
                i = R$id.ca_information_zone;
                InformationZoneView informationZoneView = (InformationZoneView) ViewBindings.findChildViewById(view, i);
                if (informationZoneView != null) {
                    return new StripeChallengeFragmentBinding((ScrollView) view, brandZoneView, challengeZoneView, informationZoneView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}

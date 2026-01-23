package com.google.android.libraries.places.internal;

import com.adjust.sdk.Constants;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.utils.extensions.ResourceTypes;
import com.singular.sdk.internal.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: com.google.android.libraries.places:places@@3.5.0 */
/* loaded from: classes27.dex */
public final class zzsa {
    private static final zzob zza = zzob.zzp("applet", "base", "embed", "math", Constants.REFERRER_API_META, "object", "svg", "template");
    private static final zzob zzb = zzob.zzl("script");
    private static final zzob zzc = zzob.zzl(ResourceTypes.STYLE);
    private static final zzob zzd = zzob.zzp("area", "br", "col", "hr", "img", "input", "link", "param", "source", "track", "wbr");
    private static final zzob zze = zzob.zzl("input");
    private static final zzob zzf = zzob.zzl("form");
    private static final zzob zzg = zzob.zzl("script");
    private static final zzob zzh = zzob.zzm("button", "input");
    private static final zzob zzi = zzob.zzm("button", "input");
    private static final zzob zzj = zzob.zzm(Constants.RequestParamsKeys.DEVELOPER_API_KEY, "area");
    private static final zzob zzk = zzob.zzp("alternate", "author", "bookmark", "canonical", "cite", "help", "icon", "license", "next", "prefetch", "dns-prefetch", "prerender", "preconnect", "preload", "prev", "search", "subresource");
    private static final zzob zzl = zzob.zzl("form");
    private static final zzob zzm = zzob.zzl("input");
    private static final zzob zzn = zzob.zzm("input", "textarea");
    private static final zzob zzo = zzob.zzo("audio", "img", "input", "source", "video");
    private static final zzob zzp = zzob.zzl("iframe");
    private final String zzq;
    private final Map zzr = new LinkedHashMap();
    private final List zzs = new ArrayList();

    public zzsa(String str) {
        if (!Constants.RequestParamsKeys.DEVELOPER_API_KEY.matches("[a-z0-9-]+")) {
            throw new IllegalArgumentException("Invalid element name \"a\". Only lowercase letters, numbers and '-' allowed.");
        }
        if (zza.contains(Constants.RequestParamsKeys.DEVELOPER_API_KEY)) {
            throw new IllegalArgumentException("Element \"a\" is not supported.");
        }
        this.zzq = Constants.RequestParamsKeys.DEVELOPER_API_KEY;
    }

    public final zzrz zza() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(this.zzq);
        for (Map.Entry entry : this.zzr.entrySet()) {
            sb.append(PlaceholderUtils.XXShortPlaceholderText);
            sb.append((String) entry.getKey());
            sb.append("=\"");
            sb.append(zzrw.zza((String) entry.getValue()));
            sb.append("\"");
        }
        boolean zContains = zzd.contains(this.zzq);
        sb.append(">");
        if (!zContains) {
            Iterator it = this.zzs.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
            }
            sb.append("</");
            sb.append(this.zzq);
            sb.append(">");
        }
        return new zzrz(sb.toString());
    }

    public final zzsa zzb(String str) {
        Iterator it = Arrays.asList(new zzrz(zzrw.zza(zzakj.zza(str, 65533)))).iterator();
        zzmt.zzr(!zzd.contains(this.zzq), "Element \"%s\" is a void element and so cannot have content.", this.zzq);
        zzmt.zzr(!zzb.contains(this.zzq), "Element \"%s\" requires SafeScript contents, not SafeHTML or text.", this.zzq);
        zzmt.zzr(!zzc.contains(this.zzq), "Element \"%s\" requires SafeStyleSheet contents, not SafeHTML or text.", this.zzq);
        while (it.hasNext()) {
            this.zzs.add(((zzrz) it.next()).zza());
        }
        return this;
    }

    public final zzsa zzc(zzsb zzsbVar) {
        String str;
        zzob zzobVar = zzj;
        if (!zzobVar.contains(this.zzq) && !this.zzq.equals("link")) {
            throw new IllegalArgumentException("Attribute \"href\" with a SafeUrl value can only be used by one of the following elements: ".concat(String.valueOf(zzobVar)));
        }
        if (!this.zzq.equals("link") || (str = (String) this.zzr.get("rel")) == null || zzk.contains(str.toLowerCase(Locale.ENGLISH))) {
            this.zzr.put("href", zzakj.zza(zzsbVar.zza(), 65533));
            return this;
        }
        throw new IllegalArgumentException("SafeUrl values for the href attribute are not allowed on <link rel=" + str + ">. Did you intend to use a TrustedResourceUrl?");
    }
}

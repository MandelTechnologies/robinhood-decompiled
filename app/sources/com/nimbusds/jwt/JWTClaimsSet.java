package com.nimbusds.jwt;

import com.nimbusds.jose.util.JSONArrayUtils;
import com.nimbusds.jose.util.JSONObjectUtils;
import com.nimbusds.jwt.util.DateUtils;
import io.jsonwebtoken.Claims;
import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes27.dex */
public final class JWTClaimsSet implements Serializable {
    private static final Set<String> REGISTERED_CLAIM_NAMES;
    private final Map<String, Object> claims;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(Claims.ISSUER);
        hashSet.add(Claims.SUBJECT);
        hashSet.add(Claims.AUDIENCE);
        hashSet.add(Claims.EXPIRATION);
        hashSet.add(Claims.NOT_BEFORE);
        hashSet.add(Claims.ISSUED_AT);
        hashSet.add(Claims.f6577ID);
        REGISTERED_CLAIM_NAMES = Collections.unmodifiableSet(hashSet);
    }

    public static class Builder {
        private final Map<String, Object> claims = new LinkedHashMap();

        public Builder issuer(String str) {
            this.claims.put(Claims.ISSUER, str);
            return this;
        }

        public Builder subject(String str) {
            this.claims.put(Claims.SUBJECT, str);
            return this;
        }

        public Builder audience(List<String> list) {
            this.claims.put(Claims.AUDIENCE, list);
            return this;
        }

        public Builder audience(String str) {
            if (str == null) {
                this.claims.put(Claims.AUDIENCE, null);
                return this;
            }
            this.claims.put(Claims.AUDIENCE, Collections.singletonList(str));
            return this;
        }

        public Builder expirationTime(Date date) {
            this.claims.put(Claims.EXPIRATION, date);
            return this;
        }

        public Builder notBeforeTime(Date date) {
            this.claims.put(Claims.NOT_BEFORE, date);
            return this;
        }

        public Builder issueTime(Date date) {
            this.claims.put(Claims.ISSUED_AT, date);
            return this;
        }

        public Builder jwtID(String str) {
            this.claims.put(Claims.f6577ID, str);
            return this;
        }

        public Builder claim(String str, Object obj) {
            this.claims.put(str, obj);
            return this;
        }

        public JWTClaimsSet build() {
            return new JWTClaimsSet(this.claims);
        }
    }

    private JWTClaimsSet(Map<String, Object> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.claims = linkedHashMap;
        linkedHashMap.putAll(map);
    }

    public List<String> getAudience() {
        Object claim = getClaim(Claims.AUDIENCE);
        if (claim instanceof String) {
            return Collections.singletonList((String) claim);
        }
        try {
            List<String> stringListClaim = getStringListClaim(Claims.AUDIENCE);
            return stringListClaim != null ? stringListClaim : Collections.EMPTY_LIST;
        } catch (ParseException unused) {
            return Collections.EMPTY_LIST;
        }
    }

    public Object getClaim(String str) {
        return this.claims.get(str);
    }

    public String[] getStringArrayClaim(String str) throws ParseException {
        if (getClaim(str) == null) {
            return null;
        }
        try {
            List list = (List) getClaim(str);
            int size = list.size();
            String[] strArr = new String[size];
            for (int i = 0; i < size; i++) {
                try {
                    strArr[i] = (String) list.get(i);
                } catch (ClassCastException unused) {
                    throw new ParseException("The " + str + " claim is not a list / JSON array of strings", 0);
                }
            }
            return strArr;
        } catch (ClassCastException unused2) {
            throw new ParseException("The " + str + " claim is not a list / JSON array", 0);
        }
    }

    public List<String> getStringListClaim(String str) throws ParseException {
        String[] stringArrayClaim = getStringArrayClaim(str);
        if (stringArrayClaim == null) {
            return null;
        }
        return Collections.unmodifiableList(Arrays.asList(stringArrayClaim));
    }

    public Map<String, Object> toJSONObject() {
        return toJSONObject(false);
    }

    public Map<String, Object> toJSONObject(boolean z) {
        Map<String, Object> mapNewJSONObject = JSONObjectUtils.newJSONObject();
        for (Map.Entry<String, Object> entry : this.claims.entrySet()) {
            if (entry.getValue() instanceof Date) {
                mapNewJSONObject.put(entry.getKey(), Long.valueOf(DateUtils.toSecondsSinceEpoch((Date) entry.getValue())));
            } else if (Claims.AUDIENCE.equals(entry.getKey())) {
                List<String> audience = getAudience();
                if (audience == null || audience.isEmpty()) {
                    if (z) {
                        mapNewJSONObject.put(Claims.AUDIENCE, null);
                    }
                } else if (audience.size() == 1) {
                    mapNewJSONObject.put(Claims.AUDIENCE, audience.get(0));
                } else {
                    List<Object> listNewJSONArray = JSONArrayUtils.newJSONArray();
                    listNewJSONArray.addAll(audience);
                    mapNewJSONObject.put(Claims.AUDIENCE, listNewJSONArray);
                }
            } else if (entry.getValue() != null) {
                mapNewJSONObject.put(entry.getKey(), entry.getValue());
            } else if (z) {
                mapNewJSONObject.put(entry.getKey(), null);
            }
        }
        return mapNewJSONObject;
    }

    public String toString() {
        return JSONObjectUtils.toJSONString(toJSONObject());
    }

    public static JWTClaimsSet parse(Map<String, Object> map) throws ParseException {
        Builder builder = new Builder();
        for (String str : map.keySet()) {
            str.getClass();
            switch (str) {
                case "aud":
                    Object obj = map.get(Claims.AUDIENCE);
                    if (obj instanceof String) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(JSONObjectUtils.getString(map, Claims.AUDIENCE));
                        builder.audience(arrayList);
                        break;
                    } else if (obj instanceof List) {
                        builder.audience(JSONObjectUtils.getStringList(map, Claims.AUDIENCE));
                        break;
                    } else if (obj == null) {
                        builder.audience((String) null);
                        break;
                    } else {
                        break;
                    }
                case "exp":
                    builder.expirationTime(new Date(JSONObjectUtils.getLong(map, Claims.EXPIRATION) * 1000));
                    break;
                case "iat":
                    builder.issueTime(new Date(JSONObjectUtils.getLong(map, Claims.ISSUED_AT) * 1000));
                    break;
                case "iss":
                    builder.issuer(JSONObjectUtils.getString(map, Claims.ISSUER));
                    break;
                case "jti":
                    builder.jwtID(JSONObjectUtils.getString(map, Claims.f6577ID));
                    break;
                case "nbf":
                    builder.notBeforeTime(new Date(JSONObjectUtils.getLong(map, Claims.NOT_BEFORE) * 1000));
                    break;
                case "sub":
                    builder.subject(JSONObjectUtils.getString(map, Claims.SUBJECT));
                    break;
                default:
                    builder.claim(str, map.get(str));
                    break;
            }
        }
        return builder.build();
    }

    public static JWTClaimsSet parse(String str) throws ParseException {
        return parse(JSONObjectUtils.parse(str));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof JWTClaimsSet) {
            return Objects.equals(this.claims, ((JWTClaimsSet) obj).claims);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.claims);
    }
}

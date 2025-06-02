{
  "cleaners": [
    {
      "name": "Cache",
      "path": "$Cache",
      "title": "Cache Cleaner",
      "runTitle": "Cleaning Cache"
    },
    {
      "name": "Logs",
      "path": "$Logs",
      "title": "Logs Cleaner",
      "runTitle": "Cleaning Logs"
    },
    {
      "name": "Trash",
      "path": "$Trash",
      "title": "Trash Cleaner",
      "runTitle": "Cleaning Trash"
    }
  ]
}



```java

String input = "{ \"cleaners\": [ { \"name\": \"Cache\", \"path\": \"$Cache\", \"title\": \"Cache Cleaner\", \"runTitle\": \"Cleaning Cache\" }, { \"name\": \"Logs\", \"path\": \"$Logs\", \"title\": \"Logs Cleaner\", \"runTitle\": \"Cleaning Logs\" }, { \"name\": \"Trash\", \"path\": \"$Trash\", \"title\": \"Trash Cleaner\", \"runTitle\": \"Cleaning Trash\" } ] }";

String selectedPath = "";
String selectedTitle = "";
String selectedRunTitle = "";

try {
    JSONObject root = new JSONObject(input);
    JSONArray cleaners = root.getJSONArray("cleaners");

    radioGroup1.removeAllViews();

    for (int i = 0; i < cleaners.length(); i++) {
        JSONObject item = cleaners.getJSONObject(i);
        String name = item.getString("name");

        RadioButton rb = new RadioButton(this);
        rb.setText(name);
        rb.setId(i);

        radioGroup1.addView(rb);
    }

    radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            try {
                JSONObject selected = root.getJSONArray("cleaners").getJSONObject(checkedId);
                selectedPath = selected.getString("path");
                selectedTitle = selected.getString("title");
                selectedRunTitle = selected.getString("runTitle");
                // Use these variables as needed
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    });

} catch (JSONException e) {
    e.printStackTrace();
}

```